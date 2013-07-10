tree grammar ExprSimplifier;

options{
	output=AST;
	tokenVocab=Expr;
	ASTLabelType=CommonTree;
}

@header{
package antlrv3.asteval;
}

/**
 * You need to set an ANTLR command line arguments in order for
 * ANTLR to find the Expr.tokens file.  Do this in preferences
 * under general in the ANTLR options.  Add:
 *
 * -lib .
 *
 * The option tells ANTLR to look in the working directory for
 * the Expr.tokens file.  
 *
 * YOU NEED TO RESTART ANTLR FOR THE CHANGES TO GO LIVE
 *
 * A little more on ASTs and ANTLR:
 *
 * If you have a tree that is (+ 4 (* 3 2)) then what happens is that 
 * ANTLR sends a stream of AST nodes as 
 *    + DOWN 4 * DOWN 3 2 UP UP
 * The key is you are gong to get a value of 4 one the DOWN when you
 * match on INT.  You are then going to traverse DOWN again to get
 * the 3 and the 2 from the INT pattern.  Now ANTLR begins moving
 * UP where it can evaluate the operations having already set
 * the value.
 */
   
expr returns [int value]
	:	^('+' l=expr r=expr) 	{$value = $l.value + $r.value;}
	|	^('-' l=expr r=expr) 	{$value = $l.value - $r.value;}
	|	^('*' l=expr r=expr) 	{$value = $l.value * $r.value;}
	|	INT 			{$value = Integer.parseInt($INT.getText());}
	;
