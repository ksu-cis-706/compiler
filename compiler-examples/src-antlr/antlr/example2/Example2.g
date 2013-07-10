grammar Example2;

options { backtrack=true; }

@header
{
package antlr.example2;
}

@lexer::header
{ 
package antlr.example2;
}


start	: e EOF
	;

e	: t '+' e
	| t
	;

t	: INT
	| INT '*' t
	| '(' e ')'
	;

INT	: ( '0' |	('1'..'9') ('0'..'9')* )	  
	;

// Whitespace -- ignored
WS	: (' '|'\r'|'\t'|'\u000C'|'\n') { $channel=HIDDEN; }
	; 
