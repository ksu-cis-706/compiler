// $ANTLR 3.5 /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g 2013-07-08 17:52:23

package antlr.explicitast;

import java.util.HashMap;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

@SuppressWarnings("all")
public class ExplicitExprASTParser extends Parser {
  public static final String[] tokenNames = new String[] { "<invalid>",
      "<EOR>", "<DOWN>", "<UP>", "INT", "WS", "'('", "')'", "'*'", "'+'", "'-'" };
  public static final int EOF = -1;
  public static final int T__6 = 6;
  public static final int T__7 = 7;
  public static final int T__8 = 8;
  public static final int T__9 = 9;
  public static final int T__10 = 10;
  public static final int INT = 4;
  public static final int WS = 5;

  public static final BitSet FOLLOW_mexpr_in_expr57 = new BitSet(
      new long[] { 0x0000000000000602L });

  // delegators

  public static final BitSet FOLLOW_9_in_expr82 = new BitSet(
      new long[] { 0x0000000000000050L });
  public static final BitSet FOLLOW_10_in_expr88 = new BitSet(
      new long[] { 0x0000000000000050L });

  public static final BitSet FOLLOW_mexpr_in_expr106 = new BitSet(
      new long[] { 0x0000000000000602L });
  public static final BitSet FOLLOW_atom_in_mexpr160 = new BitSet(
      new long[] { 0x0000000000000102L });

  public static final BitSet FOLLOW_8_in_mexpr173 = new BitSet(
      new long[] { 0x0000000000000050L });

  public static final BitSet FOLLOW_atom_in_mexpr177 = new BitSet(
      new long[] { 0x0000000000000102L });

  public static final BitSet FOLLOW_INT_in_atom211 = new BitSet(
      new long[] { 0x0000000000000002L });

  // Delegated rules

  public static final BitSet FOLLOW_6_in_atom223 = new BitSet(
      new long[] { 0x0000000000000050L });
  public static final BitSet FOLLOW_expr_in_atom227 = new BitSet(
      new long[] { 0x0000000000000080L });
  public static final BitSet FOLLOW_7_in_atom229 = new BitSet(
      new long[] { 0x0000000000000002L });

  public ExplicitExprASTParser(final TokenStream input) {
    this(input, new RecognizerSharedState());
  }

  public ExplicitExprASTParser(final TokenStream input,
      final RecognizerSharedState state) {
    super(input, state);
    this.state.ruleMemo = new HashMap[7 + 1];

  }

  // $ANTLR start "atom"
  // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:35:1: atom returns [ExprAST e = null;] : (i= INT | '(' pe= expr ')' );
  public final ExprAST atom() throws RecognitionException {
    ExprAST e = null;
    ;

    final int atom_StartIndex = this.input.index();

    Token i = null;
    ExprAST pe = null;

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 3)) {
        return e;
      }

      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:36:5: (i= INT | '(' pe= expr ')' )
      int alt4 = 2;
      final int LA4_0 = this.input.LA(1);
      if ((LA4_0 == ExplicitExprASTParser.INT)) {
        alt4 = 1;
      } else if ((LA4_0 == 6)) {
        alt4 = 2;
      }

      else {
        if (this.state.backtracking > 0) {
          this.state.failed = true;
          return e;
        }
        final NoViableAltException nvae = new NoViableAltException("", 4, 0,
            this.input);
        throw nvae;
      }

      switch (alt4) {
        case 1:
        // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:36:9: i= INT
        {
          i = (Token) match(
              this.input,
              ExplicitExprASTParser.INT,
              ExplicitExprASTParser.FOLLOW_INT_in_atom211);
          if (this.state.failed) {
            return e;
          }
          if (this.state.backtracking == 0) {
            e = new LiteralAST((i != null ? i.getText() : null));
          }
        }
          break;
        case 2:
        // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:37:8: '(' pe= expr ')'
        {
          match(this.input, 6, ExplicitExprASTParser.FOLLOW_6_in_atom223);
          if (this.state.failed) {
            return e;
          }
          pushFollow(ExplicitExprASTParser.FOLLOW_expr_in_atom227);
          pe = expr();
          this.state._fsp--;
          if (this.state.failed) {
            return e;
          }
          match(this.input, 7, ExplicitExprASTParser.FOLLOW_7_in_atom229);
          if (this.state.failed) {
            return e;
          }
          if (this.state.backtracking == 0) {
            e = pe;
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
        memoize(this.input, 3, atom_StartIndex);
      }

    }
    return e;
  }

  // $ANTLR end "atom"
  // $ANTLR start "expr"
  // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:13:1: expr returns [ExprAST e = null;] : l= mexpr ( ( '+' | '-' ) r= mexpr )* ;
  public final ExprAST expr() throws RecognitionException {
    ExprAST e = null;
    ;

    final int expr_StartIndex = this.input.index();

    ExprAST l = null;
    ExprAST r = null;

    boolean isPlus = true;

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 1)) {
        return e;
      }

      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:17:5: (l= mexpr ( ( '+' | '-' ) r= mexpr )* )
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:17:9: l= mexpr ( ( '+' | '-' ) r= mexpr )*
      {
        pushFollow(ExplicitExprASTParser.FOLLOW_mexpr_in_expr57);
        l = mexpr();
        this.state._fsp--;
        if (this.state.failed) {
          return e;
        }
        if (this.state.backtracking == 0) {
          e = l;
        }
        // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:18:9: ( ( '+' | '-' ) r= mexpr )*
        loop2: while (true) {
          int alt2 = 2;
          final int LA2_0 = this.input.LA(1);
          if ((((LA2_0 >= 9) && (LA2_0 <= 10)))) {
            alt2 = 1;
          }

          switch (alt2) {
            case 1:
            // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:19:11: ( '+' | '-' ) r= mexpr
            {
              // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:19:11: ( '+' | '-' )
              int alt1 = 2;
              final int LA1_0 = this.input.LA(1);
              if ((LA1_0 == 9)) {
                alt1 = 1;
              } else if ((LA1_0 == 10)) {
                alt1 = 2;
              }

              else {
                if (this.state.backtracking > 0) {
                  this.state.failed = true;
                  return e;
                }
                final NoViableAltException nvae = new NoViableAltException("",
                    1, 0, this.input);
                throw nvae;
              }

              switch (alt1) {
                case 1:
                // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:19:12: '+'
                {
                  match(this.input, 9, ExplicitExprASTParser.FOLLOW_9_in_expr82);
                  if (this.state.failed) {
                    return e;
                  }
                  if (this.state.backtracking == 0) {
                    isPlus = true;
                  }
                }
                  break;
                case 2:
                // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:19:33: '-'
                {
                  match(
                      this.input,
                      10,
                      ExplicitExprASTParser.FOLLOW_10_in_expr88);
                  if (this.state.failed) {
                    return e;
                  }
                  if (this.state.backtracking == 0) {
                    isPlus = false;
                  }
                }
                  break;

              }

              pushFollow(ExplicitExprASTParser.FOLLOW_mexpr_in_expr106);
              r = mexpr();
              this.state._fsp--;
              if (this.state.failed) {
                return e;
              }
              if (this.state.backtracking == 0) {
                if (isPlus) {
                  e = new PlusNodeAST(e, r);
                } else {
                  e = new MinusNodeAST(e, r);
                }
              }
            }
              break;

            default:
              break loop2;
          }
        }

      }

    } catch (final RecognitionException re) {
      reportError(re);
      recover(this.input, re);
    } finally {
      // do for sure before leaving
      if (this.state.backtracking > 0) {
        memoize(this.input, 1, expr_StartIndex);
      }

    }
    return e;
  }

  // $ANTLR end "expr"
  // delegates
  public Parser[] getDelegates() {
    return new Parser[] {};
  }

  @Override
  public String getGrammarFileName() {
    return "/compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g";
  }

  @Override
  public String[] getTokenNames() {
    return ExplicitExprASTParser.tokenNames;
  }

  // $ANTLR start "mexpr"
  // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:30:1: mexpr returns [ExprAST e = null;] : l= atom ( '*' r= atom )* ;
  public final ExprAST mexpr() throws RecognitionException {
    ExprAST e = null;
    ;

    final int mexpr_StartIndex = this.input.index();

    ExprAST l = null;
    ExprAST r = null;

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 2)) {
        return e;
      }

      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:31:5: (l= atom ( '*' r= atom )* )
      // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:31:9: l= atom ( '*' r= atom )*
      {
        pushFollow(ExplicitExprASTParser.FOLLOW_atom_in_mexpr160);
        l = atom();
        this.state._fsp--;
        if (this.state.failed) {
          return e;
        }
        if (this.state.backtracking == 0) {
          e = l;
        }
        // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:32:9: ( '*' r= atom )*
        loop3: while (true) {
          int alt3 = 2;
          final int LA3_0 = this.input.LA(1);
          if ((LA3_0 == 8)) {
            alt3 = 1;
          }

          switch (alt3) {
            case 1:
            // /compiler-examples/src-antlr/antlr/explicitast/ExplicitExprAST.g:32:10: '*' r= atom
            {
              match(this.input, 8, ExplicitExprASTParser.FOLLOW_8_in_mexpr173);
              if (this.state.failed) {
                return e;
              }
              pushFollow(ExplicitExprASTParser.FOLLOW_atom_in_mexpr177);
              r = atom();
              this.state._fsp--;
              if (this.state.failed) {
                return e;
              }
              if (this.state.backtracking == 0) {
                e = new TimesNodeAST(e, r);
              }
            }
              break;

            default:
              break loop3;
          }
        }

      }

    } catch (final RecognitionException re) {
      reportError(re);
      recover(this.input, re);
    } finally {
      // do for sure before leaving
      if (this.state.backtracking > 0) {
        memoize(this.input, 2, mexpr_StartIndex);
      }

    }
    return e;
  }
  // $ANTLR end "mexpr"
}
