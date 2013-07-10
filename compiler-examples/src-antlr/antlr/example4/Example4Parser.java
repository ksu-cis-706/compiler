// $ANTLR 3.5 /compiler-examples/src-antlr/antlr/example4/Example4.g 2013-07-08 17:52:15

package antlr.example4;

import java.util.HashMap;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

@SuppressWarnings("all")
public class Example4Parser extends Parser {
  public static final String[] tokenNames = new String[] { "<invalid>",
      "<EOR>", "<DOWN>", "<UP>", "INT", "WS", "'('", "')'", "'*'", "'+'" };
  public static final int EOF = -1;
  public static final int T__6 = 6;
  public static final int T__7 = 7;
  public static final int T__8 = 8;
  public static final int T__9 = 9;
  public static final int INT = 4;
  public static final int WS = 5;

  public static final BitSet FOLLOW_e_in_start45 = new BitSet(
      new long[] { 0x0000000000000000L });

  // delegators

  public static final BitSet FOLLOW_EOF_in_start47 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_t_in_e64 = new BitSet(
      new long[] { 0x0000000000000202L });

  public static final BitSet FOLLOW_9_in_e78 = new BitSet(
      new long[] { 0x0000000000000050L });
  public static final BitSet FOLLOW_e_in_e86 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_INT_in_t110 = new BitSet(
      new long[] { 0x0000000000000102L });

  public static final BitSet FOLLOW_8_in_t123 = new BitSet(
      new long[] { 0x0000000000000050L });

  public static final BitSet FOLLOW_t_in_t131 = new BitSet(
      new long[] { 0x0000000000000002L });

  // Delegated rules

  public static final BitSet FOLLOW_6_in_t144 = new BitSet(
      new long[] { 0x0000000000000050L });
  public static final BitSet FOLLOW_e_in_t146 = new BitSet(
      new long[] { 0x0000000000000080L });
  public static final BitSet FOLLOW_7_in_t148 = new BitSet(
      new long[] { 0x0000000000000002L });

  public Example4Parser(final TokenStream input) {
    this(input, new RecognizerSharedState());
  }

  public Example4Parser(final TokenStream input,
      final RecognizerSharedState state) {
    super(input, state);
    this.state.ruleMemo = new HashMap[6 + 1];

  }

  // $ANTLR start "e"
  // /compiler-examples/src-antlr/antlr/example4/Example4.g:19:1: e returns [int result] : t ( '+' r= e )? ;
  public final int e() throws RecognitionException {
    int result = 0;

    final int e_StartIndex = this.input.index();

    int r = 0;
    int t2 = 0;

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 2)) {
        return result;
      }

      // /compiler-examples/src-antlr/antlr/example4/Example4.g:20:2: ( t ( '+' r= e )? )
      // /compiler-examples/src-antlr/antlr/example4/Example4.g:20:4: t ( '+' r= e )?
      {
        pushFollow(Example4Parser.FOLLOW_t_in_e64);
        t2 = t();
        this.state._fsp--;
        if (this.state.failed) {
          return result;
        }
        if (this.state.backtracking == 0) {
          result = t2;
        }
        // /compiler-examples/src-antlr/antlr/example4/Example4.g:21:4: ( '+' r= e )?
        int alt1 = 2;
        final int LA1_0 = this.input.LA(1);
        if ((LA1_0 == 9)) {
          alt1 = 1;
        }
        switch (alt1) {
          case 1:
          // /compiler-examples/src-antlr/antlr/example4/Example4.g:22:5: '+' r= e
          {
            match(this.input, 9, Example4Parser.FOLLOW_9_in_e78);
            if (this.state.failed) {
              return result;
            }
            pushFollow(Example4Parser.FOLLOW_e_in_e86);
            r = e();
            this.state._fsp--;
            if (this.state.failed) {
              return result;
            }
            if (this.state.backtracking == 0) {
              result = result + r;
            }
          }
            break;

        }

      }

    } catch (final RecognitionException re) {
      reportError(re);
      recover(this.input, re);
    } finally {
      // do for sure before leaving
      if (this.state.backtracking > 0) {
        memoize(this.input, 2, e_StartIndex);
      }

    }
    return result;
  }

  // $ANTLR end "e"
  // delegates
  public Parser[] getDelegates() {
    return new Parser[] {};
  }

  @Override
  public String getGrammarFileName() {
    return "/compiler-examples/src-antlr/antlr/example4/Example4.g";
  }

  @Override
  public String[] getTokenNames() {
    return Example4Parser.tokenNames;
  }

  // $ANTLR start "start"
  // /compiler-examples/src-antlr/antlr/example4/Example4.g:15:1: start returns [int result] : e EOF ;
  public final int start() throws RecognitionException {
    int result = 0;

    final int start_StartIndex = this.input.index();

    int e1 = 0;

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 1)) {
        return result;
      }

      // /compiler-examples/src-antlr/antlr/example4/Example4.g:16:2: ( e EOF )
      // /compiler-examples/src-antlr/antlr/example4/Example4.g:16:4: e EOF
      {
        pushFollow(Example4Parser.FOLLOW_e_in_start45);
        e1 = e();
        this.state._fsp--;
        if (this.state.failed) {
          return result;
        }
        match(
            this.input,
            Example4Parser.EOF,
            Example4Parser.FOLLOW_EOF_in_start47);
        if (this.state.failed) {
          return result;
        }
        if (this.state.backtracking == 0) {
          result = e1;
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
    return result;
  }

  // $ANTLR end "start"
  // $ANTLR start "t"
  // /compiler-examples/src-antlr/antlr/example4/Example4.g:27:1: t returns [int result] : ( INT ( '*' r= t )? | '(' e ')' );
  public final int t() throws RecognitionException {
    int result = 0;

    final int t_StartIndex = this.input.index();

    Token INT3 = null;
    int r = 0;
    int e4 = 0;

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 3)) {
        return result;
      }

      // /compiler-examples/src-antlr/antlr/example4/Example4.g:28:2: ( INT ( '*' r= t )? | '(' e ')' )
      int alt3 = 2;
      final int LA3_0 = this.input.LA(1);
      if ((LA3_0 == Example4Parser.INT)) {
        alt3 = 1;
      } else if ((LA3_0 == 6)) {
        alt3 = 2;
      }

      else {
        if (this.state.backtracking > 0) {
          this.state.failed = true;
          return result;
        }
        final NoViableAltException nvae = new NoViableAltException("", 3, 0,
            this.input);
        throw nvae;
      }

      switch (alt3) {
        case 1:
        // /compiler-examples/src-antlr/antlr/example4/Example4.g:28:4: INT ( '*' r= t )?
        {
          INT3 = (Token) match(
              this.input,
              Example4Parser.INT,
              Example4Parser.FOLLOW_INT_in_t110);
          if (this.state.failed) {
            return result;
          }
          if (this.state.backtracking == 0) {
            result = Integer.parseInt((INT3 != null ? INT3.getText() : null));
          }
          // /compiler-examples/src-antlr/antlr/example4/Example4.g:29:4: ( '*' r= t )?
          int alt2 = 2;
          final int LA2_0 = this.input.LA(1);
          if ((LA2_0 == 8)) {
            alt2 = 1;
          }
          switch (alt2) {
            case 1:
            // /compiler-examples/src-antlr/antlr/example4/Example4.g:30:5: '*' r= t
            {
              match(this.input, 8, Example4Parser.FOLLOW_8_in_t123);
              if (this.state.failed) {
                return result;
              }
              pushFollow(Example4Parser.FOLLOW_t_in_t131);
              r = t();
              this.state._fsp--;
              if (this.state.failed) {
                return result;
              }
              if (this.state.backtracking == 0) {
                result = result * r;
              }
            }
              break;

          }

        }
          break;
        case 2:
        // /compiler-examples/src-antlr/antlr/example4/Example4.g:33:4: '(' e ')'
        {
          match(this.input, 6, Example4Parser.FOLLOW_6_in_t144);
          if (this.state.failed) {
            return result;
          }
          pushFollow(Example4Parser.FOLLOW_e_in_t146);
          e4 = e();
          this.state._fsp--;
          if (this.state.failed) {
            return result;
          }
          match(this.input, 7, Example4Parser.FOLLOW_7_in_t148);
          if (this.state.failed) {
            return result;
          }
          if (this.state.backtracking == 0) {
            result = e4;
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
        memoize(this.input, 3, t_StartIndex);
      }

    }
    return result;
  }
  // $ANTLR end "t"
}
