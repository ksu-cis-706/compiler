// $ANTLR 3.5 /compiler-examples/src-antlr/antlr/example1/Example1.g 2013-07-08 17:51:06

package antlr.example1;

import java.util.HashMap;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

@SuppressWarnings("all")
public class Example1Parser extends Parser {
  public static final String[] tokenNames = new String[] { "<invalid>",
      "<EOR>", "<DOWN>", "<UP>", "INT", "WS", "'('", "')'", "'*'", "'+'" };
  public static final int EOF = -1;
  public static final int T__6 = 6;
  public static final int T__7 = 7;
  public static final int T__8 = 8;
  public static final int T__9 = 9;
  public static final int INT = 4;
  public static final int WS = 5;

  public static final BitSet FOLLOW_token_in_start52 = new BitSet(
      new long[] { 0x00000000000003D0L });

  // delegators

  public static final BitSet FOLLOW_EOF_in_start55 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_6_in_token66 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_7_in_token73 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_9_in_token81 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_8_in_token88 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_INT_in_token95 = new BitSet(
      new long[] { 0x0000000000000002L });

  static void print(final String s) {
    System.out.println(s);
    System.out.flush();
  }

  // Delegated rules

  public Example1Parser(final TokenStream input) {
    this(input, new RecognizerSharedState());
  }

  public Example1Parser(final TokenStream input,
      final RecognizerSharedState state) {
    super(input, state);
    this.state.ruleMemo = new HashMap[7 + 1];

  }

  // delegates
  public Parser[] getDelegates() {
    return new Parser[] {};
  }

  @Override
  public String getGrammarFileName() {
    return "/compiler-examples/src-antlr/antlr/example1/Example1.g";
  }

  @Override
  public String[] getTokenNames() {
    return Example1Parser.tokenNames;
  }

  // $ANTLR start "start"
  // /compiler-examples/src-antlr/antlr/example1/Example1.g:23:1: start : ( token )* EOF ;
  public final void start() throws RecognitionException {
    final int start_StartIndex = this.input.index();

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 1)) {
        return;
      }

      // /compiler-examples/src-antlr/antlr/example1/Example1.g:24:2: ( ( token )* EOF )
      // /compiler-examples/src-antlr/antlr/example1/Example1.g:24:4: ( token )* EOF
      {
        // /compiler-examples/src-antlr/antlr/example1/Example1.g:24:4: ( token )*
        loop1: while (true) {
          int alt1 = 2;
          final int LA1_0 = this.input.LA(1);
          if (((LA1_0 == Example1Parser.INT) || ((LA1_0 >= 6) && (LA1_0 <= 9)))) {
            alt1 = 1;
          }

          switch (alt1) {
            case 1:
            // /compiler-examples/src-antlr/antlr/example1/Example1.g:24:4: token
            {
              pushFollow(Example1Parser.FOLLOW_token_in_start52);
              token();
              this.state._fsp--;
              if (this.state.failed) {
                return;
              }
            }
              break;

            default:
              break loop1;
          }
        }

        match(
            this.input,
            Example1Parser.EOF,
            Example1Parser.FOLLOW_EOF_in_start55);
        if (this.state.failed) {
          return;
        }
      }

    } catch (final RecognitionException re) {
      reportError(re);
      recover(this.input, re);
    } finally {
      // do for sure before leaving
      if (this.state.backtracking > 0) {
        memoize(this.input, 1, start_StartIndex);
      }

    }
  }

  // $ANTLR end "start"
  // $ANTLR start "token"
  // /compiler-examples/src-antlr/antlr/example1/Example1.g:27:1: token : ( '(' | ')' | '+' | '*' | INT );
  public final void token() throws RecognitionException {
    final int token_StartIndex = this.input.index();

    Token INT1 = null;

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 2)) {
        return;
      }

      // /compiler-examples/src-antlr/antlr/example1/Example1.g:28:2: ( '(' | ')' | '+' | '*' | INT )
      int alt2 = 5;
      switch (this.input.LA(1)) {
        case 6: {
          alt2 = 1;
        }
          break;
        case 7: {
          alt2 = 2;
        }
          break;
        case 9: {
          alt2 = 3;
        }
          break;
        case 8: {
          alt2 = 4;
        }
          break;
        case INT: {
          alt2 = 5;
        }
          break;
        default:
          if (this.state.backtracking > 0) {
            this.state.failed = true;
            return;
          }
          final NoViableAltException nvae = new NoViableAltException("", 2, 0,
              this.input);
          throw nvae;
      }
      switch (alt2) {
        case 1:
        // /compiler-examples/src-antlr/antlr/example1/Example1.g:28:4: '('
        {
          match(this.input, 6, Example1Parser.FOLLOW_6_in_token66);
          if (this.state.failed) {
            return;
          }
          if (this.state.backtracking == 0) {
            print("(");
          }
        }
          break;
        case 2:
        // /compiler-examples/src-antlr/antlr/example1/Example1.g:29:4: ')'
        {
          match(this.input, 7, Example1Parser.FOLLOW_7_in_token73);
          if (this.state.failed) {
            return;
          }
          if (this.state.backtracking == 0) {
            print("(");
          }
        }
          break;
        case 3:
        // /compiler-examples/src-antlr/antlr/example1/Example1.g:30:4: '+'
        {
          match(this.input, 9, Example1Parser.FOLLOW_9_in_token81);
          if (this.state.failed) {
            return;
          }
          if (this.state.backtracking == 0) {
            print("+");
          }
        }
          break;
        case 4:
        // /compiler-examples/src-antlr/antlr/example1/Example1.g:31:4: '*'
        {
          match(this.input, 8, Example1Parser.FOLLOW_8_in_token88);
          if (this.state.failed) {
            return;
          }
          if (this.state.backtracking == 0) {
            print("*");
          }
        }
          break;
        case 5:
        // /compiler-examples/src-antlr/antlr/example1/Example1.g:32:4: INT
        {
          INT1 = (Token) match(
              this.input,
              Example1Parser.INT,
              Example1Parser.FOLLOW_INT_in_token95);
          if (this.state.failed) {
            return;
          }
          if (this.state.backtracking == 0) {
            print((INT1 != null ? INT1.getText() : null));
          }
        }
          break;

      }
    } catch (final RecognitionException re) {
      reportError(re);
      recover(this.input, re);
    } finally {
      // do for sure before leaving
      if (this.state.backtracking > 0) {
        memoize(this.input, 2, token_StartIndex);
      }

    }
  }
  // $ANTLR end "token"
}
