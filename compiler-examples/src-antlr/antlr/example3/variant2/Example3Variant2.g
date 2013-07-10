grammar Example3Variant2;

options { backtrack=true; memoize=true; }

@header
{
package antlr.example3.variant2;
}

@lexer::header
{ 
package antlr.example3.variant2;
}

start
	: e EOF
	;
	
e
	: t '+' e
	| t
	;

t
	: INT '*' t
  | INT
	| '(' e ')'
	;

INT
	: ( '0' |	('1'..'9') ('0'..'9')* )	  
	;

// Whitespace -- ignored
WS
	: (' '|'\r'|'\t'|'\u000C'|'\n') { $channel=HIDDEN; }
	; 
