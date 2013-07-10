grammar Example3;

options { backtrack=true; memoize=true; }

@header
{
package antlr.example3;
}

@lexer::header
{ 
package antlr.example3;
}


start
	: e EOF
	;

e	: t x
	;

x	: '+' e
	|
	;

t	: INT y
	| '(' e ')'
	;

y	: '*' t
	|
	;

INT
	: ( '0' |	('1'..'9') ('0'..'9')* )	  
	;

// Whitespace -- ignored
WS
	: (' '|'\r'|'\t'|'\u000C'|'\n') { $channel=HIDDEN; }
	; 
