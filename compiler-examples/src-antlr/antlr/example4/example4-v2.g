header
{
package antlr.example4;

import java.io.Reader;
}

class Example4Parser extends Parser;

options 
{
	defaultErrorHandler=false;
}

{
	public static int parse(Reader r) throws RecognitionException, TokenStreamException
	{
		return new Example4Parser(new Example4Lexer(r)).start();
	}
}

start returns [int result]
	: result=e EOF
	;

e returns [int result]
{
	int eResult;
}
	: result=t
	  ( 
	  	PLUS
	  	eResult=e						{
	  										result += eResult;
	  									} 
	  )?
	;

t returns [int result = 0]
{
	int tResult;
	int eResult;
}
	: n:INT								{
											result = Integer.parseInt(n.getText());
										}
	  (
	  	TIMES
	  	tResult=t						{
	  										result *= tResult;
	  									}
	  )?
	| LPAREN result=e RPAREN
	;

class Example4Lexer extends Lexer;

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
