grammar StaticJavaAST;

@header
{
package sjc.parser;

import org.eclipse.jdt.core.dom.*;

import java.math.BigInteger;

import java.util.ArrayList;

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

@rulecatch { 
 /**
  * Eliminate rule error recovery so that all parse errors 
  * cause exceptions to propogate out of the top-level parse
  * method.  
  */
} 

@members {
	protected AST ast = AST.newAST(AST.JLS4);

  @Override
  public void reportError(RecognitionException arg0) {
    throw new RuntimeException(arg0);
  }
}

compilationUnit returns [CompilationUnit result = ast.newCompilationUnit()]
	:	td=classDefinition				              { result.types().add($td.result); }
		EOF
	;
 
classDefinition returns [TypeDeclaration result = ast.newTypeDeclaration()]
	:	'public'							                  { result.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD)); }
		'class' ID '{'                          { result.setName(ast.newSimpleName($ID.text)); } 
		md=mainMethodDeclaration			          { result.bodyDeclarations().add($md.result); }
		(	fd=fieldDeclaration                   { result.bodyDeclarations().add($fd.result); }
		| md=methodDeclaration                  { result.bodyDeclarations().add($md.result); } 
		)*
		'}'
	;


mainMethodDeclaration returns [MethodDeclaration result = ast.newMethodDeclaration()]
@init {
	SingleVariableDeclaration svd = ast.newSingleVariableDeclaration();
}
	:	'public'                                { result.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD)); }
		'static'                                { result.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD)); }
		'void'                                  { result.setReturnType2(ast.newPrimitiveType(PrimitiveType.VOID)); }
		id1=ID {"main".equals($id1.text)}? 	    { result.setName(ast.newSimpleName("main")); } 
		'(' 
		id2=ID {"String".equals($id2.text)}?    { svd.setType(ast.newArrayType(ast.newSimpleType(ast.newSimpleName("String")))); }
		'[' ']' id3=ID                          { svd.setName(ast.newSimpleName($id3.text));
		                                          result.parameters().add(svd); }
		')' '{' b=methodBody '}'                { result.setBody($b.result); }
	;


fieldDeclaration returns [FieldDeclaration result = null]
@init {
	VariableDeclarationFragment vdf = ast.newVariableDeclarationFragment();;
	result = ast.newFieldDeclaration(vdf);
}
	:	'static'                                { result.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD)); } 
		fieldType=type                          { result.setType($fieldType.result); }	
		ID                                      { vdf.setName(ast.newSimpleName($ID.getText())); }
		';'
	;
	
methodDeclaration returns [MethodDeclaration result = ast.newMethodDeclaration()]
	:	'static'                                { result.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD)); } 
		retType=returnType                      { result.setReturnType2($retType.result); }
		ID '(' 					                        { result.setName(ast.newSimpleName($ID.text)); }
		( 
			sdvs=params                           { result.parameters().addAll($sdvs.result); }
		)?
		')' '{' b=methodBody '}'                { result.setBody($b.result); }
	;
	
type returns [Type result = null]
	:	'boolean'                               { result = ast.newPrimitiveType(PrimitiveType.BOOLEAN); }
	|	'int'                                   { result = ast.newPrimitiveType(PrimitiveType.INT); }
	;
	
returnType returns [Type result = null]
	:	'void' 					                        { result = ast.newPrimitiveType(PrimitiveType.VOID); } 	
	|	t=type                                  { result = $t.result; }
	;
	
params returns [ArrayList<SingleVariableDeclaration> result = new ArrayList<SingleVariableDeclaration>()]
	:	svd=param                               { result.add($svd.result); } 
		(	',' svd=param                         { result.add($svd.result); }
		)*
	;
	
param returns [SingleVariableDeclaration result = ast.newSingleVariableDeclaration()]
	:	paramType=type                          { result.setType($paramType.result); }
		ID                                      { result.setName(ast.newSimpleName($ID.text)); }
	;
	
methodBody returns [Block result = ast.newBlock()]
	:	
		(	l=localDeclaration                    { result.statements().add($l.result); }
		)*
		(	s=statement                           { result.statements().add($s.result); }
		)*
	;

localDeclaration returns [VariableDeclarationStatement result = null]
@init {
	VariableDeclarationFragment vdf = ast.newVariableDeclarationFragment();
	result = ast.newVariableDeclarationStatement(vdf);
}
	:	localType=type                          { result.setType($localType.result); }
		ID ';'                                  { vdf.setName(ast.newSimpleName($ID.text)); }
	;
	
statement returns [Statement result = null]
	:	(	a=assignStatement                     { result = $a.result; }
		|	i=ifStatement                         { result = $i.result; }
		|	w=whileStatement                      { result = $w.result; }
		|	in=invokeExpStatement                 { result = $in.result; }
		|	r=returnStatement                     { result = $r.result; }
		)
	;
	
assignStatement returns [ExpressionStatement result = null]
@init {
	Assignment a = ast.newAssignment();
	result = ast.newExpressionStatement(a);
}
	:	ID                                      { a.setLeftHandSide(ast.newSimpleName($ID.text)); }
		'=' e=exp ';'                           { a.setRightHandSide($e.result); }
	;
	
ifStatement returns [IfStatement result = ast.newIfStatement()]
@init{
	Block thenStatement = ast.newBlock();
	result.setThenStatement(thenStatement);
	Block elseStatement = ast.newBlock();
	result.setElseStatement(elseStatement);
}
	:	'if' '(' condExp=exp ')'                { result.setExpression($condExp.result); }
		'{'
		( 
			s=statement                           { thenStatement.statements().add($s.result); }
		)* 
		'}'
		( 'else' '{' 
			( 
				s=statement                         { elseStatement.statements().add($s.result); }
			)* '}' )?
	;
	
whileStatement returns [WhileStatement result = ast.newWhileStatement()]
@init {
	Block whileBody = ast.newBlock();
	result.setBody(whileBody);
}
	:	'while'	'(' condExp=exp                 { result.setExpression($condExp.result); }
		')' '{' 
		(
			s=statement                           { whileBody.statements().add($s.result); }
		)* '}'
	;
	
invokeExpStatement returns [ExpressionStatement result = null]
	:	mi=invokeExp ';'                        { result = ast.newExpressionStatement($mi.result); }
	;

returnStatement returns [ReturnStatement result = ast.newReturnStatement()]
	:	'return' 
		( 
			e=exp                                 { result.setExpression($e.result); }
		)? ';'
	;
	
exp returns [Expression result = null]
	:	e=logicalOrExp                          { result = $e.result; }
	;

logicalOrExp returns [Expression result = null]
	:	e=logicalAndExp                         { result = $e.result; }			
		( '||'	e=logicalAndExp                 { InfixExpression ie = ast.newInfixExpression();
											                        ie.setLeftOperand(result);
											                        ie.setOperator(InfixExpression.Operator.CONDITIONAL_OR);
											                        ie.setRightOperand($e.result); 
											                        result = ie; }
		)*
	;

logicalAndExp returns [Expression result = null]
	:	e=equalityExp                           { result = $e.result; } 
		( '&&' e=equalityExp                    { InfixExpression ie = ast.newInfixExpression();
                                              ie.setLeftOperand(result);
                                              ie.setOperator(InfixExpression.Operator.CONDITIONAL_AND);
                                              ie.setRightOperand($e.result); 
                                              result = ie; }
		)*
	;

equalityExp returns [Expression result = null]
@init {
	InfixExpression.Operator op = null;
}
	:	e=relationalExp                         { result = $e.result; }
		( 
			(
				'!='                                { op = InfixExpression.Operator.NOT_EQUALS; }
			| '=='                                { op = InfixExpression.Operator.EQUALS; }
			) 
			e=relationalExp                       { InfixExpression ie = ast.newInfixExpression();
											                        ie.setLeftOperand(result);
											                        ie.setOperator(op);
											                        ie.setRightOperand($e.result); 
											                        result = ie; }
		)*
	;

relationalExp returns [Expression result = null]
@init {
	InfixExpression.Operator op = null;
}	
	:	e=additiveExp                           { result = $e.result; } 
		(
			(	'<'                                 { op = InfixExpression.Operator.LESS; }
			|	'>'                                 { op = InfixExpression.Operator.GREATER; }
			|	'<='                                { op = InfixExpression.Operator.LESS_EQUALS; }
			|	'>='                                { op = InfixExpression.Operator.GREATER_EQUALS; }
			) 
			e=additiveExp                         { InfixExpression ie = ast.newInfixExpression();
											                        ie.setLeftOperand(result);
											                        ie.setOperator(op);
											                        ie.setRightOperand($e.result);
											                        result = ie; }
		)*
	;
	
additiveExp returns [Expression result = null]
@init {
	InfixExpression.Operator op = null;
}
	:	e=multiplicativeExp                     { result = $e.result; }
		(
			(	'+'                                 { op = InfixExpression.Operator.PLUS; }
			|	'-'                                 { op = InfixExpression.Operator.MINUS; }
			) 
			e=multiplicativeExp                   { InfixExpression ie = ast.newInfixExpression();
			                                        ie.setLeftOperand(result);
											                        ie.setOperator(op);
											                        ie.setRightOperand($e.result); 
											                        result = ie; }
		)*
	;
	
multiplicativeExp returns [Expression result = null]
@init {
	InfixExpression.Operator op = null;
}
	:	e=unaryExp                              { result = $e.result; }
		(
			(	'*'                                 { op = InfixExpression.Operator.TIMES; }
			|	'/'                                 { op = InfixExpression.Operator.DIVIDE; }
			|	'%'                                 { op = InfixExpression.Operator.REMAINDER; }
			)
			e=unaryExp                            { InfixExpression ie = ast.newInfixExpression();
											                        ie.setLeftOperand(result);
											                        ie.setOperator(op);
											                        ie.setRightOperand($e.result); 
											                        result = ie; }
		)*
	;
	
unaryExp returns [Expression result = null]
	:	'-' e=unaryExp                          { PrefixExpression pe = ast.newPrefixExpression();
											                        pe.setOperator(PrefixExpression.Operator.MINUS);
											                        pe.setOperand($e.result);
											                        result = pe; }
	|	'+' e=unaryExp                          { PrefixExpression pe = ast.newPrefixExpression();
											                        pe.setOperator(PrefixExpression.Operator.PLUS);
											                        pe.setOperand($e.result);
											                        result = pe;
										                        }
	|	e=unaryExpNotPlusMinus                  { result = $e.result; }
	;
	
unaryExpNotPlusMinus returns [Expression result = null]
	:	'!' e=unaryExp                          { PrefixExpression pe = ast.newPrefixExpression();
											                        pe.setOperator(PrefixExpression.Operator.NOT);
											                        pe.setOperand($e.result);
                                              result = pe; }
	|	e=primaryExp                            { result = $e.result; }
	;
	
primaryExp returns [Expression result = null]
	:	n=NUM_INT						
		{ new BigInteger(n.getText()).bitLength() < 32 }?
										                        { NumberLiteral nl = ast.newNumberLiteral();
											                        nl.setToken($n.text);
											                        result = nl; }
	|	'true'                                  { result = ast.newBooleanLiteral(true); }
	|	'false'                                 { result = ast.newBooleanLiteral(false); }
	|	'(' e=exp ')'                           { ParenthesizedExpression pe = ast.newParenthesizedExpression();
                                              pe.setExpression($e.result);
                                              result = pe; }
	|	i=invokeExp                             { result = $i.result; }
	|	ID                                      { result = ast.newSimpleName($ID.text); }
	;
	

invokeExp returns [MethodInvocation result = ast.newMethodInvocation()]
	:	( 
			id1=ID                                { result.setExpression(ast.newSimpleName($id1.text)); }
			'.' 
		)? 								
		id2=ID                                  { result.setName(ast.newSimpleName($id2.text)); }
		'(' ( es=args                           { result.arguments().addAll($es.result); }
		)? ')'			
	;
	
args returns [ArrayList<Expression> result = new ArrayList<Expression>()]
	:	e=exp                                   { result.add($e.result); }
		(
			',' e=exp                             { result.add($e.result); }
		)*
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
