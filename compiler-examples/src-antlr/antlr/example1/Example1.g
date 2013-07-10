grammar Example1;

options { backtrack=true; memoize=true; language=Java; }

@header
{
package antlr.example1;
}

@lexer::header
{ 
package antlr.example1;
}

@members
{
  static void print(String s) {
    System.out.println(s);
    System.out.flush();
  }
}

start
	: token* EOF
	;

token
	: '(' { print("("); }
	| ')'  { print("("); }
	| '+' { print("+"); }
	| '*' { print("*"); }
	| INT { print($INT.text); }
	;
		
INT
	: ( '0' |	('1'..'9') ('0'..'9')* )	  
	;

// Whitespace -- ignored
WS
	: (' '|'\r'|'\t'|'\u000C'|'\n') { $channel=HIDDEN; }
	; 
