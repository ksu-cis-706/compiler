header
{
package antlr.example2;

import java.io.Reader;
}

class Example2Parser extends Parser;

options 
{
	defaultErrorHandler=false;
}

{
	public static void parse(Reader r) throws RecognitionException, TokenStreamException
	{
		new Example2Parser(new Example2Lexer(r)).e();
	}
}

start
	: e EOF
	;

e	: t PLUS e
	| t
	;

t	: INT
	| INT TIMES t
	| LPAREN e RPAREN
	;

class Example2Lexer extends Lexer;

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
