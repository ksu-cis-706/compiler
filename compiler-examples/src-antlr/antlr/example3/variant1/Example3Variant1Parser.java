// $ANTLR 3.5 /compiler-examples/src-antlr/antlr/example3/variant1/Example3Variant1.g 2013-07-08 17:52:01

package antlr.example3.variant1;

import java.util.HashMap;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;

@SuppressWarnings("all")
public class Example3Variant1Parser extends Parser {
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
      new long[] { 0x0000000000000202L });

  public static final BitSet FOLLOW_9_in_e58 = new BitSet(
      new long[] { 0x0000000000000050L });
  public static final BitSet FOLLOW_e_in_e60 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_INT_in_t73 = new BitSet(
      new long[] { 0x0000000000000102L });

  public static final BitSet FOLLOW_8_in_t77 = new BitSet(
      new long[] { 0x0000000000000050L });

  public static final BitSet FOLLOW_t_in_t79 = new BitSet(
      new long[] { 0x0000000000000002L });

  // Delegated rules

  public static final BitSet FOLLOW_6_in_t87 = new BitSet(
      new long[] { 0x0000000000000050L });
  public static final BitSet FOLLOW_e_in_t89 = new BitSet(
      new long[] { 0x0000000000000080L });
  public static final BitSet FOLLOW_7_in_t91 = new BitSet(
      new long[] { 0x0000000000000002L });

  public Example3Variant1Parser(final TokenStream input) {
    this(input, new RecognizerSharedState());
  }

  public Example3Variant1Parser(final TokenStream input,
      final RecognizerSharedState state) {
    super(input, state);
    this.state.ruleMemo = new HashMap[6 + 1];

  }

  // $ANTLR start "e"
  // /compiler-examples/src-antlr/antlr/example3/variant1/Example3Variant1.g:20:1: e : t ( '+' e )? ;
  public final void e() throws RecognitionException {
    final int e_StartIndex = this.input.index();

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 2)) {
        return;
      }

      // /compiler-examples/src-antlr/antlr/example3/variant1/Example3Variant1.g:20:3: ( t ( '+' e )? )
      // /compiler-examples/src-antlr/antlr/example3/variant1/Example3Variant1.g:20:5: t ( '+' e )?
      {
        pushFollow(Example3Variant1Parser.FOLLOW_t_in_e54);
        t();
        this.state._fsp--;
        if (this.state.failed) {
          return;
        }
        // /compiler-examples/src-antlr/antlr/example3/variant1/Example3Variant1.g:20:7: ( '+' e )?
        int alt1 = 2;
        final int LA1_0 = this.input.LA(1);
        if ((LA1_0 == 9)) {
          alt1 = 1;
        }
        switch (alt1) {
          case 1:
          // /compiler-examples/src-antlr/antlr/example3/variant1/Example3Variant1.g:20:9: '+' e
          {
            match(this.input, 9, Example3Variant1Parser.FOLLOW_9_in_e58);
            if (this.state.failed) {
              return;
            }
            pushFollow(Example3Variant1Parser.FOLLOW_e_in_e60);
            e();
            this.state._fsp--;
            if (this.state.failed) {
              return;
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
  }

  // $ANTLR end "e"
  // delegates
  public Parser[] getDelegates() {
    return new Parser[] {};
  }

  @Override
  public String getGrammarFileName() {
    return "/compiler-examples/src-antlr/antlr/example3/variant1/Example3Variant1.g";
  }

  @Override
  public String[] getTokenNames() {
    return Example3Variant1Parser.tokenNames;
  }

  // $ANTLR start "start"
  // /compiler-examples/src-antlr/antlr/example3/variant1/Example3Variant1.g:16:1: start : e EOF ;
  public final void start() throws RecognitionException {
    final int start_StartIndex = this.input.index();

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 1)) {
        return;
      }

      // /compiler-examples/src-antlr/antlr/example3/variant1/Example3Variant1.g:17:2: ( e EOF )
      // /compiler-examples/src-antlr/antlr/example3/variant1/Example3Variant1.g:17:4: e EOF
      {
        pushFollow(Example3Variant1Parser.FOLLOW_e_in_start42);
        e();
        this.state._fsp--;
        if (this.state.failed) {
          return;
        }
        match(
            this.input,
            Example3Variant1Parser.EOF,
            Example3Variant1Parser.FOLLOW_EOF_in_start44);
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
  // /compiler-examples/src-antlr/antlr/example3/variant1/Example3Variant1.g:23:1: t : ( INT ( '*' t )? | '(' e ')' );
  public final void t() throws RecognitionException {
    final int t_StartIndex = this.input.index();

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 3)) {
        return;
      }

      // /compiler-examples/src-antlr/antlr/example3/variant1/Example3Variant1.g:23:3: ( INT ( '*' t )? | '(' e ')' )
      int alt3 = 2;
      final int LA3_0 = this.input.LA(1);
      if ((LA3_0 == Example3Variant1Parser.INT)) {
        alt3 = 1;
      } else if ((LA3_0 == 6)) {
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
        // /compiler-examples/src-antlr/antlr/example3/variant1/Example3Variant1.g:23:5: INT ( '*' t )?
        {
          match(
              this.input,
              Example3Variant1Parser.INT,
              Example3Variant1Parser.FOLLOW_INT_in_t73);
          if (this.state.failed) {
            return;
          }
          // /compiler-examples/src-antlr/antlr/example3/variant1/Example3Variant1.g:23:9: ( '*' t )?
          int alt2 = 2;
          final int LA2_0 = this.input.LA(1);
          if ((LA2_0 == 8)) {
            alt2 = 1;
          }
          switch (alt2) {
            case 1:
            // /compiler-examples/src-antlr/antlr/example3/variant1/Example3Variant1.g:23:11: '*' t
            {
              match(this.input, 8, Example3Variant1Parser.FOLLOW_8_in_t77);
              if (this.state.failed) {
                return;
              }
              pushFollow(Example3Variant1Parser.FOLLOW_t_in_t79);
              t();
              this.state._fsp--;
              if (this.state.failed) {
                return;
              }
            }
              break;

          }

        }
          break;
        case 2:
        // /compiler-examples/src-antlr/antlr/example3/variant1/Example3Variant1.g:24:4: '(' e ')'
        {
          match(this.input, 6, Example3Variant1Parser.FOLLOW_6_in_t87);
          if (this.state.failed) {
            return;
          }
          pushFollow(Example3Variant1Parser.FOLLOW_e_in_t89);
          e();
          this.state._fsp--;
          if (this.state.failed) {
            return;
          }
          match(this.input, 7, Example3Variant1Parser.FOLLOW_7_in_t91);
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
