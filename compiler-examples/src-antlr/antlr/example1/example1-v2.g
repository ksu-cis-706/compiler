header
{
package antlr.example1;

import java.io.Reader;
}

class Example1Lexer extends Lexer;

options
{
	defaultErrorHandler=false;
}

{
	public static void lex(Reader r) throws TokenStreamException
	{
		new Example1Lexer(r).nextToken();		 
	}
}

LPAREN	: '('							{
											$setType(Token.SKIP); 
			 								System.out.println("LPAREN");
			 								System.out.flush();
			 							}
		;

RPAREN	: ')'							{
											$setType(Token.SKIP); 
			 								System.out.println("RPAREN");
			 								System.out.flush();
			 							}
		;
		
PLUS	: '+'							{
											$setType(Token.SKIP); 
			 								System.out.println("PLUS");
			 								System.out.flush();
			 							}
		;
		
TIMES	: '*'							{
											$setType(Token.SKIP); 
			 								System.out.println("TIMES");
			 								System.out.flush();
			 							}
		;
		
INT		: '0' |	('1'..'9') ('0'..'9')*	{
											$setType(Token.SKIP); 
											System.out.println("INT : "+ Integer.valueOf($getText));
			 								System.out.flush();
										}
		;

// Whitespace -- ignored
WS				:	( ' ' | '\t' | '\f'
						// handle newlines
						|	( options {generateAmbigWarnings=false;}
							:	"\r\n" | '\r' | '\n'
							)
							{ newline(); }
					)+					{
											$setType(Token.SKIP); 
        	 								System.out.println("WS length :" + $getText.length());
        	 							};
