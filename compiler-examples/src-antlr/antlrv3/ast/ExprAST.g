grammar ExprAST;

options { output=AST; }

@lexer::header{
package antlrv3.ast;
}

@header{
package antlrv3.ast;
}

start	:	(expr EOF -> expr)
  	;
  
expr	:	(l=mexpr -> $l)
		   (
		      ( 
		         '+' r=mexpr
			    -> ^('+'<PlusOperatorNode> $expr $r)
		      )
		      |
		      ( 
		         '-' r=mexpr
			    -> ^('-'<MinusOperatorNode> $expr $r)
		      )
		   )*
      	;      

mexpr 	:	(l=atom -> $l)
		(
		   ('*' r=atom
		      -> ^('*'<MultOperatorNode> $mexpr $r)
		   )
		)*
      	;    

atom  	:	(INT -> INT<LiteralNode>) 
				|	('(' e=expr ')' -> $e)
      	;

INT   	: ('0'..'9')+ 
      	;

WS    	: ( ' ' | '\r' '\n' | '\n' | '\t')
	{ $channel=HIDDEN; }
      	;    
