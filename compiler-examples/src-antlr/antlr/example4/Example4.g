grammar Example4;

options { backtrack=true; memoize=true; }

@header
{
package antlr.example4;
}

@lexer::header
{ 
package antlr.example4;
}

start returns [int result]
	: e EOF { result = $e.result; }
	;

e returns [int result]
	: t { result = $t.result; }
	  ( 
	  	'+'
	  	r=e	{ result = result + $r.result; } 
	  )?
	;

t returns [int result]
	: INT { result = Integer.parseInt($INT.text); }
	  (
	  	'*'
	  	r=t	{ result = result * $r.result; }
	  )?
	| '(' e ')' { result = $e.result; }
	;

INT
	: ( '0' |	('1'..'9') ('0'..'9')* )	  
	;

// Whitespace -- ignored
WS
	: (' '|'\r'|'\t'|'\u000C'|'\n') { $channel=HIDDEN; }
	; 
