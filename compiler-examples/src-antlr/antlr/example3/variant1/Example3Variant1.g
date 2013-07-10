grammar Example3Variant1;

options { backtrack=true; memoize=true; }

@header
{
package antlr.example3.variant1;
}

@lexer::header
{ 
package antlr.example3.variant1;
}


start
	: e EOF
	;

e	: t ( '+' e )?
	;

t	: INT ( '*' t )?
	| '(' e ')'
	;

INT
	: ( '0' |	('1'..'9') ('0'..'9')* )	  
	;

// Whitespace -- ignored
WS
	: (' '|'\r'|'\t'|'\u000C'|'\n') { $channel=HIDDEN; }
	; 
