header
{
package antlr.example3.variant2;

import java.io.Reader;
}

class Example3Variant2Parser extends Parser;

options 
{
	defaultErrorHandler=false;
}

{
	public static void parse(Reader r) throws RecognitionException, TokenStreamException
	{
		new Example3Variant2Parser(new Example3Variant2Lexer(r)).start();
	}
}

start
	: e EOF
	;
	
e	: (t PLUS) => t PLUS e
	| t
	;

t	: (INT TIMES) => INT TIMES t
    | INT
	| LPAREN e RPAREN
	;

class Example3Variant2Lexer extends Lexer;

LPAREN	: '(' ;
RPAREN	: ')' ;
PLUS	: '+' ;
TIMES	: '*' ;
INT		: '0' |	('1'..'9') ('0'..'9')* ;

// Whitespace -- ignored
WS				:	( ' ' | '\t' | '\f'
						// handle newlines
						|	( options {generateAmbigWarnings=false;}
							:	"\r\n" | '\r' | '\n'
							)
							{ newline(); }
					)+
					// tell ANTLR to skip this WS token
					{ _ttype = Token.SKIP; }	;
