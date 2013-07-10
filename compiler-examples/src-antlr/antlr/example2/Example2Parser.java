// $ANTLR 3.5 /compiler-examples/src-antlr/antlr/example2/Example2.g 2013-07-08 17:51:45

package antlr.example2;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;

@SuppressWarnings("all")
public class Example2Parser extends Parser {
  public static final String[] tokenNames = new String[] { "<invalid>",
      "<EOR>", "<DOWN>", "<UP>", "INT", "WS", "'('", "')'", "'*'", "'+'" };
  public static final int EOF = -1;
  public static final int T__6 = 6;
  public static final int T__7 = 7;
  public static final int T__8 = 8;
  public static final int T__9 = 9;
  public static final int INT = 4;
  public static final int WS = 5;

  public static final BitSet FOLLOW_e_in_start36 = new BitSet(
      new long[] { 0x0000000000000000L });

  // delegators

  public static final BitSet FOLLOW_EOF_in_start38 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_t_in_e48 = new BitSet(
      new long[] { 0x0000000000000200L });

  public static final BitSet FOLLOW_9_in_e50 = new BitSet(
      new long[] { 0x0000000000000050L });
  public static final BitSet FOLLOW_e_in_e52 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_t_in_e57 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_INT_in_t67 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_INT_in_t72 = new BitSet(
      new long[] { 0x0000000000000100L });

  public static final BitSet FOLLOW_8_in_t74 = new BitSet(
      new long[] { 0x0000000000000050L });

  // Delegated rules

  public static final BitSet FOLLOW_t_in_t76 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_6_in_t81 = new BitSet(
      new long[] { 0x0000000000000050L });
  public static final BitSet FOLLOW_e_in_t83 = new BitSet(
      new long[] { 0x0000000000000080L });
  public static final BitSet FOLLOW_7_in_t85 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_t_in_synpred1_Example248 = new BitSet(
      new long[] { 0x0000000000000200L });
  public static final BitSet FOLLOW_9_in_synpred1_Example250 = new BitSet(
      new long[] { 0x0000000000000050L });
  public static final BitSet FOLLOW_e_in_synpred1_Example252 = new BitSet(
      new long[] { 0x0000000000000002L });

  public Example2Parser(final TokenStream input) {
    this(input, new RecognizerSharedState());
  }

  public Example2Parser(final TokenStream input,
      final RecognizerSharedState state) {
    super(input, state);
  }

  // $ANTLR start "e"
  // /compiler-examples/src-antlr/antlr/example2/Example2.g:19:1: e : ( t '+' e | t );
  public final void e() throws RecognitionException {
    try {
      // /compiler-examples/src-antlr/antlr/example2/Example2.g:19:3: ( t '+' e | t )
      int alt1 = 2;
      final int LA1_0 = this.input.LA(1);
      if ((LA1_0 == Example2Parser.INT)) {
        this.input.LA(2);
        if ((synpred1_Example2())) {
          alt1 = 1;
        } else if ((true)) {
          alt1 = 2;
        }

      } else if ((LA1_0 == 6)) {
        this.input.LA(2);
        if ((synpred1_Example2())) {
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
        // /compiler-examples/src-antlr/antlr/example2/Example2.g:19:5: t '+' e
        {
          pushFollow(Example2Parser.FOLLOW_t_in_e48);
          t();
          this.state._fsp--;
          if (this.state.failed) {
            return;
          }
          match(this.input, 9, Example2Parser.FOLLOW_9_in_e50);
          if (this.state.failed) {
            return;
          }
          pushFollow(Example2Parser.FOLLOW_e_in_e52);
          e();
          this.state._fsp--;
          if (this.state.failed) {
            return;
          }
        }
          break;
        case 2:
        // /compiler-examples/src-antlr/antlr/example2/Example2.g:20:4: t
        {
          pushFollow(Example2Parser.FOLLOW_t_in_e57);
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
    }
  }

  // $ANTLR end "e"
  // delegates
  public Parser[] getDelegates() {
    return new Parser[] {};
  }

  @Override
  public String getGrammarFileName() {
    return "/compiler-examples/src-antlr/antlr/example2/Example2.g";
  }

  @Override
  public String[] getTokenNames() {
    return Example2Parser.tokenNames;
  }

  // $ANTLR start "start"
  // /compiler-examples/src-antlr/antlr/example2/Example2.g:16:1: start : e EOF ;
  public final void start() throws RecognitionException {
    try {
      // /compiler-examples/src-antlr/antlr/example2/Example2.g:16:7: ( e EOF )
      // /compiler-examples/src-antlr/antlr/example2/Example2.g:16:9: e EOF
      {
        pushFollow(Example2Parser.FOLLOW_e_in_start36);
        e();
        this.state._fsp--;
        if (this.state.failed) {
          return;
        }
        match(
            this.input,
            Example2Parser.EOF,
            Example2Parser.FOLLOW_EOF_in_start38);
        if (this.state.failed) {
          return;
        }
      }

    } catch (final RecognitionException re) {
      reportError(re);
      recover(this.input, re);
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "start"
  public final boolean synpred1_Example2() {
    this.state.backtracking++;
    final int start = this.input.mark();
    try {
      synpred1_Example2_fragment(); // can never throw exception
    } catch (final RecognitionException re) {
      System.err.println("impossible: " + re);
    }
    final boolean success = !this.state.failed;
    this.input.rewind(start);
    this.state.backtracking--;
    this.state.failed = false;
    return success;
  }

  // $ANTLR start synpred1_Example2
  public final void synpred1_Example2_fragment() throws RecognitionException {
    // /compiler-examples/src-antlr/antlr/example2/Example2.g:19:5: ( t '+' e )
    // /compiler-examples/src-antlr/antlr/example2/Example2.g:19:5: t '+' e
    {
      pushFollow(Example2Parser.FOLLOW_t_in_synpred1_Example248);
      t();
      this.state._fsp--;
      if (this.state.failed) {
        return;
      }
      match(this.input, 9, Example2Parser.FOLLOW_9_in_synpred1_Example250);
      if (this.state.failed) {
        return;
      }
      pushFollow(Example2Parser.FOLLOW_e_in_synpred1_Example252);
      e();
      this.state._fsp--;
      if (this.state.failed) {
        return;
      }
    }

  }

  // $ANTLR end synpred1_Example2
  // $ANTLR start "t"
  // /compiler-examples/src-antlr/antlr/example2/Example2.g:23:1: t : ( INT | INT '*' t | '(' e ')' );
  public final void t() throws RecognitionException {
    try {
      // /compiler-examples/src-antlr/antlr/example2/Example2.g:23:3: ( INT | INT '*' t | '(' e ')' )
      int alt2 = 3;
      final int LA2_0 = this.input.LA(1);
      if ((LA2_0 == Example2Parser.INT)) {
        final int LA2_1 = this.input.LA(2);
        if ((LA2_1 == 8)) {
          alt2 = 2;
        } else if (((LA2_1 == Example2Parser.EOF) || (LA2_1 == 7) || (LA2_1 == 9))) {
          alt2 = 1;
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
        // /compiler-examples/src-antlr/antlr/example2/Example2.g:23:5: INT
        {
          match(
              this.input,
              Example2Parser.INT,
              Example2Parser.FOLLOW_INT_in_t67);
          if (this.state.failed) {
            return;
          }
        }
          break;
        case 2:
        // /compiler-examples/src-antlr/antlr/example2/Example2.g:24:4: INT '*' t
        {
          match(
              this.input,
              Example2Parser.INT,
              Example2Parser.FOLLOW_INT_in_t72);
          if (this.state.failed) {
            return;
          }
          match(this.input, 8, Example2Parser.FOLLOW_8_in_t74);
          if (this.state.failed) {
            return;
          }
          pushFollow(Example2Parser.FOLLOW_t_in_t76);
          t();
          this.state._fsp--;
          if (this.state.failed) {
            return;
          }
        }
          break;
        case 3:
        // /compiler-examples/src-antlr/antlr/example2/Example2.g:25:4: '(' e ')'
        {
          match(this.input, 6, Example2Parser.FOLLOW_6_in_t81);
          if (this.state.failed) {
            return;
          }
          pushFollow(Example2Parser.FOLLOW_e_in_t83);
          e();
          this.state._fsp--;
          if (this.state.failed) {
            return;
          }
          match(this.input, 7, Example2Parser.FOLLOW_7_in_t85);
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
    }
  }
  // $ANTLR end "t"
}
