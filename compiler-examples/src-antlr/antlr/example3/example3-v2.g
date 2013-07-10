header
{
package antlr.example3;

import java.io.Reader;
}

class Example3Parser extends Parser;

options 
{
	defaultErrorHandler=false;
}

{
	public static void parse(Reader r) throws RecognitionException, TokenStreamException
	{
		new Example3Parser(new Example3Lexer(r)).start();
	}
}

start
	: e EOF
	;

e	: t x
	;

x	: PLUS e
	|
	;

t	: INT y
	| LPAREN e RPAREN
	;

y	: TIMES t
	|
	;

class Example3Lexer extends Lexer;

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
