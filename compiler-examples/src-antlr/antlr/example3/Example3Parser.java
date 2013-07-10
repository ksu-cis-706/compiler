// $ANTLR 3.5 /compiler-examples/src-antlr/antlr/example3/Example3.g 2013-07-08 17:51:52

package antlr.example3;

import java.util.HashMap;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;

@SuppressWarnings("all")
public class Example3Parser extends Parser {
  public static final String[] tokenNames = new String[] { "<invalid>",
      "<EOR>", "<DOWN>", "<UP>", "INT", "WS", "'('", "')'", "'*'", "'+'" };
  public static final int EOF = -1;
  public static final int T__6 = 6;
  public static final int T__7 = 7;
  public static final int T__8 = 8;
  public static final int T__9 = 9;
  public static final int INT = 4;
  public static final int WS = 5;

  public static final BitSet FOLLOW_e_in_start42 = new BitSet(
      new long[] { 0x0000000000000000L });

  // delegators

  public static final BitSet FOLLOW_EOF_in_start44 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_t_in_e54 = new BitSet(
      new long[] { 0x0000000000000200L });

  public static final BitSet FOLLOW_x_in_e56 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_9_in_x66 = new BitSet(
      new long[] { 0x0000000000000050L });

  public static final BitSet FOLLOW_e_in_x68 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_INT_in_t81 = new BitSet(
      new long[] { 0x0000000000000100L });

  public static final BitSet FOLLOW_y_in_t83 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_6_in_t88 = new BitSet(
      new long[] { 0x0000000000000050L });

  public static final BitSet FOLLOW_e_in_t90 = new BitSet(
      new long[] { 0x0000000000000080L });

  // Delegated rules

  public static final BitSet FOLLOW_7_in_t92 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_8_in_y102 = new BitSet(
      new long[] { 0x0000000000000050L });
  public static final BitSet FOLLOW_t_in_y104 = new BitSet(
      new long[] { 0x0000000000000002L });

  public Example3Parser(final TokenStream input) {
    this(input, new RecognizerSharedState());
  }

  public Example3Parser(final TokenStream input,
      final RecognizerSharedState state) {
    super(input, state);
    this.state.ruleMemo = new HashMap[8 + 1];

  }

  // $ANTLR start "e"
  // /compiler-examples/src-antlr/antlr/example3/Example3.g:20:1: e : t x ;
  public final void e() throws RecognitionException {
    final int e_StartIndex = this.input.index();

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 2)) {
        return;
      }

      // /compiler-examples/src-antlr/antlr/example3/Example3.g:20:3: ( t x )
      // /compiler-examples/src-antlr/antlr/example3/Example3.g:20:5: t x
      {
        pushFollow(Example3Parser.FOLLOW_t_in_e54);
        t();
        this.state._fsp--;
        if (this.state.failed) {
          return;
        }
        pushFollow(Example3Parser.FOLLOW_x_in_e56);
        x();
        this.state._fsp--;
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
        memoize(this.input, 2, e_StartIndex);
      }

    }
  }

  // $ANTLR end "e"
  // delegates
  public Parser[] getDelegates() {
    return new Parser[] {};
  }

  @Override
  public String getGrammarFileName() {
    return "/compiler-examples/src-antlr/antlr/example3/Example3.g";
  }

  @Override
  public String[] getTokenNames() {
    return Example3Parser.tokenNames;
  }

  // $ANTLR start "start"
  // /compiler-examples/src-antlr/antlr/example3/Example3.g:16:1: start : e EOF ;
  public final void start() throws RecognitionException {
    final int start_StartIndex = this.input.index();

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 1)) {
        return;
      }

      // /compiler-examples/src-antlr/antlr/example3/Example3.g:17:2: ( e EOF )
      // /compiler-examples/src-antlr/antlr/example3/Example3.g:17:4: e EOF
      {
        pushFollow(Example3Parser.FOLLOW_e_in_start42);
        e();
        this.state._fsp--;
        if (this.state.failed) {
          return;
        }
        match(
            this.input,
            Example3Parser.EOF,
            Example3Parser.FOLLOW_EOF_in_start44);
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
  // $ANTLR start "t"
  // /compiler-examples/src-antlr/antlr/example3/Example3.g:27:1: t : ( INT y | '(' e ')' );
  public final void t() throws RecognitionException {
    final int t_StartIndex = this.input.index();

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 4)) {
        return;
      }

      // /compiler-examples/src-antlr/antlr/example3/Example3.g:27:3: ( INT y | '(' e ')' )
      int alt2 = 2;
      final int LA2_0 = this.input.LA(1);
      if ((LA2_0 == Example3Parser.INT)) {
        alt2 = 1;
      } else if ((LA2_0 == 6)) {
        alt2 = 2;
      }

      else {
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
        // /compiler-examples/src-antlr/antlr/example3/Example3.g:27:5: INT y
        {
          match(
              this.input,
              Example3Parser.INT,
              Example3Parser.FOLLOW_INT_in_t81);
          if (this.state.failed) {
            return;
          }
          pushFollow(Example3Parser.FOLLOW_y_in_t83);
          y();
          this.state._fsp--;
          if (this.state.failed) {
            return;
          }
        }
          break;
        case 2:
        // /compiler-examples/src-antlr/antlr/example3/Example3.g:28:4: '(' e ')'
        {
          match(this.input, 6, Example3Parser.FOLLOW_6_in_t88);
          if (this.state.failed) {
            return;
          }
          pushFollow(Example3Parser.FOLLOW_e_in_t90);
          e();
          this.state._fsp--;
          if (this.state.failed) {
            return;
          }
          match(this.input, 7, Example3Parser.FOLLOW_7_in_t92);
          if (this.state.failed) {
            return;
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
        memoize(this.input, 4, t_StartIndex);
      }

    }
  }

  // $ANTLR end "t"
  // $ANTLR start "x"
  // /compiler-examples/src-antlr/antlr/example3/Example3.g:23:1: x : ( '+' e |);
  public final void x() throws RecognitionException {
    final int x_StartIndex = this.input.index();

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 3)) {
        return;
      }

      // /compiler-examples/src-antlr/antlr/example3/Example3.g:23:3: ( '+' e |)
      int alt1 = 2;
      final int LA1_0 = this.input.LA(1);
      if ((LA1_0 == 9)) {
        alt1 = 1;
      } else if (((LA1_0 == Example3Parser.EOF) || (LA1_0 == 7))) {
        alt1 = 2;
      }

      else {
        if (this.state.backtracking > 0) {
          this.state.failed = true;
          return;
        }
        final NoViableAltException nvae = new NoViableAltException("", 1, 0,
            this.input);
        throw nvae;
      }

      switch (alt1) {
        case 1:
        // /compiler-examples/src-antlr/antlr/example3/Example3.g:23:5: '+' e
        {
          match(this.input, 9, Example3Parser.FOLLOW_9_in_x66);
          if (this.state.failed) {
            return;
          }
          pushFollow(Example3Parser.FOLLOW_e_in_x68);
          e();
          this.state._fsp--;
          if (this.state.failed) {
            return;
          }
        }
          break;
        case 2:
        // /compiler-examples/src-antlr/antlr/example3/Example3.g:25:2: 
        {
        }
          break;

      }
    } catch (final RecognitionException re) {
      reportError(re);
      recover(this.input, re);
    } finally {
      // do for sure before leaving
      if (this.state.backtracking > 0) {
        memoize(this.input, 3, x_StartIndex);
      }

    }
  }

  // $ANTLR end "x"
  // $ANTLR start "y"
  // /compiler-examples/src-antlr/antlr/example3/Example3.g:31:1: y : ( '*' t |);
  public final void y() throws RecognitionException {
    final int y_StartIndex = this.input.index();

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 5)) {
        return;
      }

      // /compiler-examples/src-antlr/antlr/example3/Example3.g:31:3: ( '*' t |)
      int alt3 = 2;
      final int LA3_0 = this.input.LA(1);
      if ((LA3_0 == 8)) {
        alt3 = 1;
      } else if (((LA3_0 == Example3Parser.EOF) || (LA3_0 == 7) || (LA3_0 == 9))) {
        alt3 = 2;
      }

      else {
        if (this.state.backtracking > 0) {
          this.state.failed = true;
          return;
        }
        final NoViableAltException nvae = new NoViableAltException("", 3, 0,
            this.input);
        throw nvae;
      }

      switch (alt3) {
        case 1:
        // /compiler-examples/src-antlr/antlr/example3/Example3.g:31:5: '*' t
        {
          match(this.input, 8, Example3Parser.FOLLOW_8_in_y102);
          if (this.state.failed) {
            return;
          }
          pushFollow(Example3Parser.FOLLOW_t_in_y104);
          t();
          this.state._fsp--;
          if (this.state.failed) {
            return;
          }
        }
          break;
        case 2:
        // /compiler-examples/src-antlr/antlr/example3/Example3.g:33:2: 
        {
        }
          break;

      }
    } catch (final RecognitionException re) {
      reportError(re);
      recover(this.input, re);
    } finally {
      // do for sure before leaving
      if (this.state.backtracking > 0) {
        memoize(this.input, 5, y_StartIndex);
      }

    }
  }
  // $ANTLR end "y"
}
