grammar ASTRewrite;

options { backtrack=true; memoize=true; output=AST; }

@header
{
package antlr.astexample;
}

@lexer::header
{ 
package antlr.astexample;
}

start
	: expr EOF -> expr
	;
	
expr
	: mexpr -> mexpr
	| mexpr ( '+' mexpr )+ -> ^('+' mexpr+)
	| mexpr ( '-' mexpr )+ -> ^('-' mexpr+)
  ;      

mexpr
	: atom -> atom
	| atom ('*' atom)+ -> ^('*' atom+)
	;    

atom
	: INT -> INT
	| '(' expr ')' -> expr
	;

INT
	: ( '0' |	('1'..'9') ('0'..'9')* )	  
	;

// Whitespace -- ignored
WS
	: (' '|'\r'|'\t'|'\u000C'|'\n') { $channel=HIDDEN; }
	; 
