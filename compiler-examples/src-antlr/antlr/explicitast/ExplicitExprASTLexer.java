// $ANTLR 3.5 /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g 2013-07-08 17:52:23

package antlr.explicitast;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;

@SuppressWarnings("all")
public class ExplicitExprASTLexer extends Lexer {
  public static final int EOF = -1;
  public static final int T__6 = 6;
  public static final int T__7 = 7;
  public static final int T__8 = 8;
  public static final int T__9 = 9;
  public static final int T__10 = 10;
  public static final int INT = 4;
  public static final int WS = 5;

  public ExplicitExprASTLexer() {
  }

  public ExplicitExprASTLexer(final CharStream input) {
    this(input, new RecognizerSharedState());
  }

  public ExplicitExprASTLexer(final CharStream input,
      final RecognizerSharedState state) {
    super(input, state);
  }

  // delegates
  // delegators
  public Lexer[] getDelegates() {
    return new Lexer[] {};
  }

  @Override
  public String getGrammarFileName() {
    return "/compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g";
  }

  // $ANTLR start "INT"
  public final void mINT() throws RecognitionException {
    try {
      final int _type = ExplicitExprASTLexer.INT;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:40:7: ( ( '0' .. '9' )+ )
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:40:9: ( '0' .. '9' )+
      {
        // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:40:9: ( '0' .. '9' )+
        int cnt1 = 0;
        loop1: while (true) {
          int alt1 = 2;
          final int LA1_0 = this.input.LA(1);
          if ((((LA1_0 >= '0') && (LA1_0 <= '9')))) {
            alt1 = 1;
          }

          switch (alt1) {
            case 1:
            // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:
            {
              if (((this.input.LA(1) >= '0') && (this.input.LA(1) <= '9'))) {
                this.input.consume();
              } else {
                final MismatchedSetException mse = new MismatchedSetException(
                    null, this.input);
                recover(mse);
                throw mse;
              }
            }
              break;

            default:
              if (cnt1 >= 1) {
                break loop1;
              }
              final EarlyExitException eee = new EarlyExitException(1,
                  this.input);
              throw eee;
          }
          cnt1++;
        }

      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "INT"

  // $ANTLR start "T__10"
  public final void mT__10() throws RecognitionException {
    try {
      final int _type = ExplicitExprASTLexer.T__10;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:10:7: ( '-' )
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:10:9: '-'
      {
        match('-');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__10"

  // $ANTLR start "T__6"
  public final void mT__6() throws RecognitionException {
    try {
      final int _type = ExplicitExprASTLexer.T__6;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:6:6: ( '(' )
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:6:8: '('
      {
        match('(');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__6"

  // $ANTLR start "T__7"
  public final void mT__7() throws RecognitionException {
    try {
      final int _type = ExplicitExprASTLexer.T__7;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:7:6: ( ')' )
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:7:8: ')'
      {
        match(')');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__7"

  // $ANTLR start "T__8"
  public final void mT__8() throws RecognitionException {
    try {
      final int _type = ExplicitExprASTLexer.T__8;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:8:6: ( '*' )
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:8:8: '*'
      {
        match('*');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__8"

  // $ANTLR start "T__9"
  public final void mT__9() throws RecognitionException {
    try {
      final int _type = ExplicitExprASTLexer.T__9;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:9:6: ( '+' )
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:9:8: '+'
      {
        match('+');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__9"

  @Override
  public void mTokens() throws RecognitionException {
    // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:1:8: ( T__6 | T__7 | T__8 | T__9 | T__10 | INT | WS )
    int alt3 = 7;
    switch (this.input.LA(1)) {
      case '(': {
        alt3 = 1;
      }
        break;
      case ')': {
        alt3 = 2;
      }
        break;
      case '*': {
        alt3 = 3;
      }
        break;
      case '+': {
        alt3 = 4;
      }
        break;
      case '-': {
        alt3 = 5;
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
      case '9': {
        alt3 = 6;
      }
        break;
      case '\t':
      case '\n':
      case '\r':
      case ' ': {
        alt3 = 7;
      }
        break;
      default:
        final NoViableAltException nvae = new NoViableAltException("", 3, 0,
            this.input);
        throw nvae;
    }
    switch (alt3) {
      case 1:
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:1:10: T__6
      {
        mT__6();

      }
        break;
      case 2:
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:1:15: T__7
      {
        mT__7();

      }
        break;
      case 3:
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:1:20: T__8
      {
        mT__8();

      }
        break;
      case 4:
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:1:25: T__9
      {
        mT__9();

      }
        break;
      case 5:
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:1:30: T__10
      {
        mT__10();

      }
        break;
      case 6:
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:1:36: INT
      {
        mINT();

      }
        break;
      case 7:
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:1:40: WS
      {
        mWS();

      }
        break;

    }
  }

  // $ANTLR start "WS"
  public final void mWS() throws RecognitionException {
    try {
      final int _type = ExplicitExprASTLexer.WS;
      int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:43:7: ( ( ' ' | '\\r' '\\n' | '\\n' | '\\t' ) )
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:43:9: ( ' ' | '\\r' '\\n' | '\\n' | '\\t' )
      {
        // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:43:9: ( ' ' | '\\r' '\\n' | '\\n' | '\\t' )
        int alt2 = 4;
        switch (this.input.LA(1)) {
          case ' ': {
            alt2 = 1;
          }
            break;
          case '\r': {
            alt2 = 2;
          }
            break;
          case '\n': {
            alt2 = 3;
          }
            break;
          case '\t': {
            alt2 = 4;
          }
            break;
          default:
            final NoViableAltException nvae = new NoViableAltException("", 2,
                0, this.input);
            throw nvae;
        }
        switch (alt2) {
          case 1:
          // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:43:11: ' '
          {
            match(' ');
          }
            break;
          case 2:
          // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:43:17: '\\r' '\\n'
          {
            match('\r');
            match('\n');
          }
            break;
          case 3:
          // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:43:29: '\\n'
          {
            match('\n');
          }
            break;
          case 4:
          // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:43:36: '\\t'
          {
            match('\t');
          }
            break;

        }

        _channel = BaseRecognizer.HIDDEN;
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "WS"

}
