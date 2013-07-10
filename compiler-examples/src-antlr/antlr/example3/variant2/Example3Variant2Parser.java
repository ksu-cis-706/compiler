// $ANTLR 3.5 /compiler-examples/src-antlr/antlr/example3/variant2/Example3Variant2.g 2013-07-08 17:52:08

package antlr.example3.variant2;

import java.util.HashMap;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;

@SuppressWarnings("all")
public class Example3Variant2Parser extends Parser {
  public static final String[] tokenNames = new String[] { "<invalid>",
      "<EOR>", "<DOWN>", "<UP>", "INT", "WS", "'('", "')'", "'*'", "'+'" };
  public static final int EOF = -1;
  public static final int T__6 = 6;
  public static final int T__7 = 7;
  public static final int T__8 = 8;
  public static final int T__9 = 9;
  public static final int INT = 4;
  public static final int WS = 5;

  public static final BitSet FOLLOW_e_in_start41 = new BitSet(
      new long[] { 0x0000000000000000L });

  // delegators

  public static final BitSet FOLLOW_EOF_in_start43 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_t_in_e55 = new BitSet(
      new long[] { 0x0000000000000200L });

  public static final BitSet FOLLOW_9_in_e57 = new BitSet(
      new long[] { 0x0000000000000050L });
  public static final BitSet FOLLOW_e_in_e59 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_t_in_e64 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_INT_in_t75 = new BitSet(
      new long[] { 0x0000000000000100L });

  public static final BitSet FOLLOW_8_in_t77 = new BitSet(
      new long[] { 0x0000000000000050L });

  public static final BitSet FOLLOW_t_in_t79 = new BitSet(
      new long[] { 0x0000000000000002L });

  // Delegated rules

  public static final BitSet FOLLOW_INT_in_t85 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_6_in_t90 = new BitSet(
      new long[] { 0x0000000000000050L });
  public static final BitSet FOLLOW_e_in_t92 = new BitSet(
      new long[] { 0x0000000000000080L });
  public static final BitSet FOLLOW_7_in_t94 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_t_in_synpred1_Example3Variant255 = new BitSet(
      new long[] { 0x0000000000000200L });
  public static final BitSet FOLLOW_9_in_synpred1_Example3Variant257 = new BitSet(
      new long[] { 0x0000000000000050L });
  public static final BitSet FOLLOW_e_in_synpred1_Example3Variant259 = new BitSet(
      new long[] { 0x0000000000000002L });

  public Example3Variant2Parser(final TokenStream input) {
    this(input, new RecognizerSharedState());
  }

  public Example3Variant2Parser(final TokenStream input,
      final RecognizerSharedState state) {
    super(input, state);
    this.state.ruleMemo = new HashMap[6 + 1];

  }

  // $ANTLR start "e"
  // /compiler-examples/src-antlr/antlr/example3/variant2/Example3Variant2.g:19:1: e : ( t '+' e | t );
  public final void e() throws RecognitionException {
    final int e_StartIndex = this.input.index();

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 2)) {
        return;
      }

      // /compiler-examples/src-antlr/antlr/example3/variant2/Example3Variant2.g:20:2: ( t '+' e | t )
      int alt1 = 2;
      final int LA1_0 = this.input.LA(1);
      if ((LA1_0 == Example3Variant2Parser.INT)) {
        this.input.LA(2);
        if ((synpred1_Example3Variant2())) {
          alt1 = 1;
        } else if ((true)) {
          alt1 = 2;
        }

      } else if ((LA1_0 == 6)) {
        this.input.LA(2);
        if ((synpred1_Example3Variant2())) {
          alt1 = 1;
        } else if ((true)) {
          alt1 = 2;
        }

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
        // /compiler-examples/src-antlr/antlr/example3/variant2/Example3Variant2.g:20:4: t '+' e
        {
          pushFollow(Example3Variant2Parser.FOLLOW_t_in_e55);
          t();
          this.state._fsp--;
          if (this.state.failed) {
            return;
          }
          match(this.input, 9, Example3Variant2Parser.FOLLOW_9_in_e57);
          if (this.state.failed) {
            return;
          }
          pushFollow(Example3Variant2Parser.FOLLOW_e_in_e59);
          e();
          this.state._fsp--;
          if (this.state.failed) {
            return;
          }
        }
          break;
        case 2:
        // /compiler-examples/src-antlr/antlr/example3/variant2/Example3Variant2.g:21:4: t
        {
          pushFollow(Example3Variant2Parser.FOLLOW_t_in_e64);
          t();
          this.state._fsp--;
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
    return "/compiler-examples/src-antlr/antlr/example3/variant2/Example3Variant2.g";
  }

  @Override
  public String[] getTokenNames() {
    return Example3Variant2Parser.tokenNames;
  }

  // $ANTLR start "start"
  // /compiler-examples/src-antlr/antlr/example3/variant2/Example3Variant2.g:15:1: start : e EOF ;
  public final void start() throws RecognitionException {
    final int start_StartIndex = this.input.index();

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 1)) {
        return;
      }

      // /compiler-examples/src-antlr/antlr/example3/variant2/Example3Variant2.g:16:2: ( e EOF )
      // /compiler-examples/src-antlr/antlr/example3/variant2/Example3Variant2.g:16:4: e EOF
      {
        pushFollow(Example3Variant2Parser.FOLLOW_e_in_start41);
        e();
        this.state._fsp--;
        if (this.state.failed) {
          return;
        }
        match(
            this.input,
            Example3Variant2Parser.EOF,
            Example3Variant2Parser.FOLLOW_EOF_in_start43);
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
  public final boolean synpred1_Example3Variant2() {
    this.state.backtracking++;
    final int start = this.input.mark();
    try {
      synpred1_Example3Variant2_fragment(); // can never throw exception
    } catch (final RecognitionException re) {
      System.err.println("impossible: " + re);
    }
    final boolean success = !this.state.failed;
    this.input.rewind(start);
    this.state.backtracking--;
    this.state.failed = false;
    return success;
  }

  // $ANTLR start synpred1_Example3Variant2
  public final void synpred1_Example3Variant2_fragment()
      throws RecognitionException {
    // /compiler-examples/src-antlr/antlr/example3/variant2/Example3Variant2.g:20:4: ( t '+' e )
    // /compiler-examples/src-antlr/antlr/example3/variant2/Example3Variant2.g:20:4: t '+' e
    {
      pushFollow(Example3Variant2Parser.FOLLOW_t_in_synpred1_Example3Variant255);
      t();
      this.state._fsp--;
      if (this.state.failed) {
        return;
      }
      match(
          this.input,
          9,
          Example3Variant2Parser.FOLLOW_9_in_synpred1_Example3Variant257);
      if (this.state.failed) {
        return;
      }
      pushFollow(Example3Variant2Parser.FOLLOW_e_in_synpred1_Example3Variant259);
      e();
      this.state._fsp--;
      if (this.state.failed) {
        return;
      }
    }

  }

  // $ANTLR end synpred1_Example3Variant2
  // $ANTLR start "t"
  // /compiler-examples/src-antlr/antlr/example3/variant2/Example3Variant2.g:24:1: t : ( INT '*' t | INT | '(' e ')' );
  public final void t() throws RecognitionException {
    final int t_StartIndex = this.input.index();

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 3)) {
        return;
      }

      // /compiler-examples/src-antlr/antlr/example3/variant2/Example3Variant2.g:25:2: ( INT '*' t | INT | '(' e ')' )
      int alt2 = 3;
      final int LA2_0 = this.input.LA(1);
      if ((LA2_0 == Example3Variant2Parser.INT)) {
        final int LA2_1 = this.input.LA(2);
        if ((LA2_1 == 8)) {
          alt2 = 1;
        } else if (((LA2_1 == Example3Variant2Parser.EOF) || (LA2_1 == 7) || (LA2_1 == 9))) {
          alt2 = 2;
        }

        else {
          if (this.state.backtracking > 0) {
            this.state.failed = true;
            return;
          }
          final int nvaeMark = this.input.mark();
          try {
            this.input.consume();
            final NoViableAltException nvae = new NoViableAltException("", 2,
                1, this.input);
            throw nvae;
          } finally {
            this.input.rewind(nvaeMark);
          }
        }

      } else if ((LA2_0 == 6)) {
        alt2 = 3;
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
        // /compiler-examples/src-antlr/antlr/example3/variant2/Example3Variant2.g:25:4: INT '*' t
        {
          match(
              this.input,
              Example3Variant2Parser.INT,
              Example3Variant2Parser.FOLLOW_INT_in_t75);
          if (this.state.failed) {
            return;
          }
          match(this.input, 8, Example3Variant2Parser.FOLLOW_8_in_t77);
          if (this.state.failed) {
            return;
          }
          pushFollow(Example3Variant2Parser.FOLLOW_t_in_t79);
          t();
          this.state._fsp--;
          if (this.state.failed) {
            return;
          }
        }
          break;
        case 2:
        // /compiler-examples/src-antlr/antlr/example3/variant2/Example3Variant2.g:26:5: INT
        {
          match(
              this.input,
              Example3Variant2Parser.INT,
              Example3Variant2Parser.FOLLOW_INT_in_t85);
          if (this.state.failed) {
            return;
          }
        }
          break;
        case 3:
        // /compiler-examples/src-antlr/antlr/example3/variant2/Example3Variant2.g:27:4: '(' e ')'
        {
          match(this.input, 6, Example3Variant2Parser.FOLLOW_6_in_t90);
          if (this.state.failed) {
            return;
          }
          pushFollow(Example3Variant2Parser.FOLLOW_e_in_t92);
          e();
          this.state._fsp--;
          if (this.state.failed) {
            return;
          }
          match(this.input, 7, Example3Variant2Parser.FOLLOW_7_in_t94);
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
        memoize(this.input, 3, t_StartIndex);
      }

    }
  }
  // $ANTLR end "t"
}
