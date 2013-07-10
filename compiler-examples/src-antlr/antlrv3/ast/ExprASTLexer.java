// $ANTLR 3.5 /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g 2013-07-08 18:21:12

package antlrv3.ast;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExprASTLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int INT=4;
	public static final int WS=5;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ExprASTLexer() {} 
	public ExprASTLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprASTLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/compiler-examples/src-antlr/antlrv3/ast/ExprAST.g"; }

	// $ANTLR start "T__6"
	public final void mT__6() throws RecognitionException {
		try {
			int _type = T__6;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:6:6: ( '(' )
			// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:6:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__6"

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:7:6: ( ')' )
			// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:7:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__7"

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:8:6: ( '*' )
			// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:8:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:9:6: ( '+' )
			// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:9:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:10:7: ( '-' )
			// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:10:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:42:8: ( ( '0' .. '9' )+ )
			// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:42:10: ( '0' .. '9' )+
			{
			// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:42:10: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:45:8: ( ( ' ' | '\\r' '\\n' | '\\n' | '\\t' ) )
			// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:45:10: ( ' ' | '\\r' '\\n' | '\\n' | '\\t' )
			{
			// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:45:10: ( ' ' | '\\r' '\\n' | '\\n' | '\\t' )
			int alt2=4;
			switch ( input.LA(1) ) {
			case ' ':
				{
				alt2=1;
				}
				break;
			case '\r':
				{
				alt2=2;
				}
				break;
			case '\n':
				{
				alt2=3;
				}
				break;
			case '\t':
				{
				alt2=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:45:12: ' '
					{
					match(' '); 
					}
					break;
				case 2 :
					// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:45:18: '\\r' '\\n'
					{
					match('\r'); 
					match('\n'); 
					}
					break;
				case 3 :
					// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:45:30: '\\n'
					{
					match('\n'); 
					}
					break;
				case 4 :
					// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:45:37: '\\t'
					{
					match('\t'); 
					}
					break;

			}

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:1:8: ( T__6 | T__7 | T__8 | T__9 | T__10 | INT | WS )
		int alt3=7;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt3=1;
			}
			break;
		case ')':
			{
			alt3=2;
			}
			break;
		case '*':
			{
			alt3=3;
			}
			break;
		case '+':
			{
			alt3=4;
			}
			break;
		case '-':
			{
			alt3=5;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt3=6;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt3=7;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 3, 0, input);
			throw nvae;
		}
		switch (alt3) {
			case 1 :
				// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:1:10: T__6
				{
				mT__6(); 

				}
				break;
			case 2 :
				// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:1:15: T__7
				{
				mT__7(); 

				}
				break;
			case 3 :
				// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:1:20: T__8
				{
				mT__8(); 

				}
				break;
			case 4 :
				// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:1:25: T__9
				{
				mT__9(); 

				}
				break;
			case 5 :
				// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:1:30: T__10
				{
				mT__10(); 

				}
				break;
			case 6 :
				// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:1:36: INT
				{
				mINT(); 

				}
				break;
			case 7 :
				// /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:1:40: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
