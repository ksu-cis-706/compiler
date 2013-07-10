grammar StaticJava;

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

@members
{
    @Override
    public void reportError(RecognitionException arg0) {
      throw new RuntimeException(arg0);
    }
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

@rulecatch { 
 /**
  * Eliminate rule error recovery so that all parse errors 
  * cause exceptions to propogate out of the top-level parse
  * method.  
  */
} 

compilationUnit
	:	classDefinition
		EOF
	;

classDefinition
	:	'public' 'class' ID '{' 
		mainMethodDeclaration
		( fieldDeclaration
		|	methodDeclaration )*
		'}'
	;

mainMethodDeclaration
	:	'public' 'static' 'void'
	    id1=ID
	    { "main".equals(id1.getText()) }? 
	    '(' id2=ID '[' ']' 
	    { "String".equals(id2.getText()) }?
	    ID
	    ')' '{' methodBody '}'
	;
	
fieldDeclaration
	:	'static' type ID ';'
	;
	
methodDeclaration
	:	'static' returnType ID
		'(' ( params )? ')'
		'{' methodBody '}'
	;
	
type
	: 'boolean' | 'int';
	
returnType
	:	'void' | type
	;
	
params
	:	param ( ',' param )*
	;
	
param
	:	type ID
	;

methodBody
	:	localDeclaration* 
		statement*
	;

localDeclaration
	:	type ID ';'
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
	:	ID '=' exp ';'
	;
	
ifStatement
	:	'if' '(' exp ')'
		'{' ( statement )* '}'
		( 'else' '{' ( statement )*
		'}' )?
	;
	
whileStatement
	:	'while'	'(' exp ')'
		'{' ( statement )* '}'
	;
	
invokeExpStatement
	:	invokeExp ';'
	;
	
returnStatement
	:	'return' ( exp )? ';'
	;
	
exp
	:	logicalOrExp
	;
	
logicalOrExp
	:	logicalAndExp ( '||' logicalAndExp )*
	;
	
logicalAndExp
	:	equalityExp ( '&&' equalityExp )*
	;
	
equalityExp
	:	relationalExp ( ('!=' | '==') relationalExp )*
	;
	
relationalExp
	:	additiveExp ( ( '<' | '>' | '<=' | '>=' ) additiveExp )*
	;
	
additiveExp
	:	multiplicativeExp ( ( '+' | '-' ) multiplicativeExp )*
	;
	
multiplicativeExp
	:	unaryExp ( ( '*' | '/' | '%' ) unaryExp )*
	;
	
unaryExp
	:	'-' unaryExp
	|	'+' unaryExp
	|	unaryExpNotPlusMinus
	;
	
unaryExpNotPlusMinus
	:	'!' unaryExp
	|	primaryExp
	;
	
primaryExp
	:	n=NUM_INT
		{ new BigInteger(n.getText()).bitLength() < 32 }?
	|	'true'
	|	'false'
	|	'null'
	|	'(' exp ')'
	|	invokeExp
	|	ID
	;
	
invokeExp
	:	( ID '.' )?
		ID '(' ( args )? ')'
	;
	
args
	:	exp ( ',' exp )*
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
