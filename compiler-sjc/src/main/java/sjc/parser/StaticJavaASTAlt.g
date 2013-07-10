grammar StaticJavaASTAlt;

options { output = AST; }

tokens
{
  OPTION;
  LIST;
  END;
  COMP_UNIT;
  CLASS_DEF;
  MAIN_DECL;
  FIELD_DECL;
  METHOD_DECL;
  TYPE;
  PARAM;
  BODY;
  LOCAL_DECL;
  ASSIGN_STMT;
  IF_STMT;
  WHILE_STMT;
  RETURN_STMT;
  INVOKE_STMT;
  INVOKE_EXP;
  BINARY_EXP;
  UNARY_EXP;
  VAR_REF_EXP;
  PAREN_EXP;
  TRUE_LIT;
  FALSE_LIT;
  INT_LIT;
  BOOLEAN;
  INT;
  VOID;
}

@header
{
package sjc.parser;

import java.math.BigInteger;

/**
 * StaticJava parser.
 *
 * @author robby
 */
}

@lexer::header
{ 
package sjc.parser;

/**
 * StaticJava lexer.
 *
 * @author robby
 */
}

@members
{
    @Override
    public void reportError(RecognitionException arg0) {
      throw new RuntimeException(arg0);
    }
}

@rulecatch { 
 /**
  * Eliminate rule error recovery so that all parse errors 
  * cause exceptions to propogate out of the top-level parse
  * method.  
  */
} 

compilationUnit
	:	classDefinition
		EOF                                  -> ^(COMP_UNIT classDefinition)
	;

classDefinition
	:	tb='public' 'class' ID '{'
		mainMethodDeclaration
		( fieldDeclaration
		|	methodDeclaration )*               
		te='}'                               -> ^(CLASS_DEF[$tb] ID 
		                                            mainMethodDeclaration
		                                            ^(LIST fieldDeclaration*)
		                                            ^(LIST methodDeclaration*)
		                                          END[$te])
	;

mainMethodDeclaration
	:	tb='public' 'static' 'void'
	    id1=ID
	    { "main".equals(id1.getText()) }? 
	    '(' id2=ID '[' ']' 
	    { "String".equals(id2.getText()) }?
	    id3=ID
	    ')' '{' methodBody te='}'         -> ^(MAIN_DECL[$tb] $id3 
	                                             methodBody
	                                           END[$te])
	;
	
fieldDeclaration
	:	tb='static' type ID te=';'          -> ^(FIELD_DECL[$tb] type ID END[$te])
	;
	
methodDeclaration
	:	tb='static' returnType ID
		'(' ( params )? ')'
		'{' methodBody te='}'               -> ^(METHOD_DECL[$tb] returnType ID
		                                           ^(LIST params?) methodBody
	                                           END[$te])        
	;
	
type
	: t='boolean'                         -> BOOLEAN[$t]
	| t='int'                             -> INT[$t]
	;
	
returnType
	:	t='void'                            -> VOID[$t]
	| type
	;
	
params
	:	param ( ',' param )*                -> param+
	;
	
param
	:	type ID                             -> ^(PARAM type ID)
	;

methodBody
	:	localDeclaration*
		statement*                          -> ^(BODY ^(LIST localDeclaration*) 
		                                           ^(LIST statement*))
	;

localDeclaration
	:	type ID te=';'                      -> ^(LOCAL_DECL type ID END[$te])
	;
	
statement
	:	(	assignStatement
		|	ifStatement
		|	whileStatement
		|	invokeExpStatement
		|	returnStatement
		)
	;
	
assignStatement
	:	ID '=' exp te=';'                   -> ^(ASSIGN_STMT ID exp END[$te])
	;
	
ifStatement
	:	tb='if' '(' exp ')'
		ifThen ifElse                       -> ^(IF_STMT[$tb] exp ifThen ifElse)
	;

ifThen
	: '{' ( statement )* te='}'           -> ^(LIST statement*) 
	;

ifElse
  :	( 'else' '{' ( statement )* '}' )?  -> ^(LIST statement*)
  ;
	
whileStatement
	:	tb='while'	'(' exp ')'
		'{' ( statement )* te='}'           -> ^(WHILE_STMT[$tb] exp
		                                            ^(LIST statement*)
		                                          END[$te])
	;
	
invokeExpStatement
	:	invokeExp te=';'                    -> ^(INVOKE_STMT invokeExp END[$te])
	;
	
returnStatement
	:	tb='return' ( exp )? te=';'         -> ^(RETURN_STMT ^(OPTION exp?) END[$te])
	;
	
exp
	:	logicalOrExp
	;
	
logicalOrExp
	:	( e1=logicalAndExp                  -> $e1
	  ) ( t='||' e2=logicalAndExp         -> ^(BINARY_EXP $logicalOrExp $t $e2)
	    )*           
	;
	
logicalAndExp
	:	( e1=equalityExp                    -> $e1
	  ) ( t='&&' e2=equalityExp           -> ^(BINARY_EXP $logicalAndExp $t $e2)
	    )*
	;
	
equalityExp
	:	( e1=relationalExp                  -> $e1
	  ) ( (t='!=' | t='==') 
	      e2=relationalExp                -> ^(BINARY_EXP $equalityExp $t $e2)
	    )*
	;
	
relationalExp
	:	( e1=additiveExp                    -> $e1
	  ) ( ( t='<' | t='>' 
	      | t='<=' | t='>=' ) 
 	      e2=additiveExp                  -> ^(BINARY_EXP $relationalExp $t $e2)
	    )*
	;
	
additiveExp
	:	( e1=multiplicativeExp              -> $e1
	  ) ( ( t='+' | t='-' ) 
	      e2=multiplicativeExp            -> ^(BINARY_EXP $additiveExp $t $e2)
	    )*
	;
	
multiplicativeExp
	:	( e1=unaryExp                       -> $e1
	  ) ( ( t='*' | t='/' | t='%' )
	      e2=unaryExp                     -> ^(BINARY_EXP $multiplicativeExp $t $e2)
	    )*
	;
	
unaryExp
	:	( t='-' | t='+' ) unaryExp          -> ^(UNARY_EXP $t unaryExp)
	|	unaryExpNotPlusMinus
	;
	
unaryExpNotPlusMinus
	:	t='!' unaryExp                      -> ^(UNARY_EXP $t unaryExp)
	|	primaryExp
	;
	
primaryExp
	:	n=NUM_INT
		{ new BigInteger(n.getText()).bitLength() < 32 }?
		                                    -> ^(INT_LIT $n)
	|	t='true'                            -> ^(TRUE_LIT[$t])
	|	t='false'                           -> ^(FALSE_LIT[$t])
	|	tb='(' exp te=')'                   -> ^(PAREN_EXP[$tb] exp END[$te])
	|	invokeExp
	|	ID                                  -> ^(VAR_REF_EXP ID)
	;
	
invokeExp
	:	( cid=ID '.' )?
		mid=ID '(' ( args )? te=')'         -> ^(INVOKE_EXP 
		                                           ^(OPTION $cid?)
		                                           $mid ^(LIST args?)
		                                         END[$te])
	;
	
args
	:	exp ( ',' exp )*                    -> exp+
	;

ID
	:	( 'a'..'z' | 'A'..'Z' | '_' | '$' ) 
	  ( 'a'..'z' | 'A'..'Z' | '_' | '0'..'9' | '$' )*
	;
	
NUM_INT
	: ( '0' |	('1'..'9') ('0'..'9')* )
	;

// Whitespace -- ignored
WS
	: (' '|'\r'|'\t'|'\u000C'|'\n') { $channel=HIDDEN; }
	; 
