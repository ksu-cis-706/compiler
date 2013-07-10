grammar Expr;

options{
	output=AST;
}

@header{
package antlrv3.asteval;
}

@lexer::header {
package antlrv3.asteval;
}

/***
 * The goal of this example is to first write a very clear grammar that is
 * easy to read while creating a simple AST.  We are going to use the
 * AST generated from this grammar as input to another parser that will
 * rewrite (transform) the AST.
 *
 * '^': makes the token preceding the '^' a root node
 * '!': omits the token preceding the '!' in the AST
 */
 
start	:	(expr EOF -> expr)
  	;
  
expr	:	mexpr (('+'^|'-'^) mexpr)*
      	;      

mexpr 	:	atom ('*'^ atom)*
      	;    

atom  	:	INT
	|	'('! expr ')'!
	;

INT   	:	('0'..'9')+ 
      	;

WS    	:	( ' ' | '\r' '\n' | '\n' | '\t')
		{ $channel=HIDDEN; }
      	;    
