// $ANTLR 3.5 /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g 2013-07-08 17:50:23

package antlr.astexample;

import java.util.HashMap;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.RewriteEarlyExitException;
import org.antlr.runtime.tree.RewriteRuleSubtreeStream;
import org.antlr.runtime.tree.RewriteRuleTokenStream;
import org.antlr.runtime.tree.TreeAdaptor;

@SuppressWarnings("all")
public class ASTRewriteParser extends Parser {
  public static class atom_return extends ParserRuleReturnScope {
    Object tree;

    @Override
    public Object getTree() {
      return this.tree;
    }
  }

  public static class expr_return extends ParserRuleReturnScope {
    Object tree;

    @Override
    public Object getTree() {
      return this.tree;
    }
  }

  public static class mexpr_return extends ParserRuleReturnScope {
    Object tree;

    @Override
    public Object getTree() {
      return this.tree;
    }
  }

  public static class start_return extends ParserRuleReturnScope {
    Object tree;

    @Override
    public Object getTree() {
      return this.tree;
    }
  }

  public static final String[] tokenNames = new String[] { "<invalid>",
      "<EOR>", "<DOWN>", "<UP>", "INT", "WS", "'('", "')'", "'*'", "'+'", "'-'" };
  public static final int EOF = -1;
  public static final int T__6 = 6;
  public static final int T__7 = 7;
  public static final int T__8 = 8;

  public static final int T__9 = 9;

  // delegators

  public static final int T__10 = 10;
  public static final int INT = 4;

  public static final int WS = 5;

  protected TreeAdaptor adaptor = new CommonTreeAdaptor();
  public static final BitSet FOLLOW_expr_in_start46 = new BitSet(
      new long[] { 0x0000000000000000L });
  public static final BitSet FOLLOW_EOF_in_start48 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_mexpr_in_expr64 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_mexpr_in_expr73 = new BitSet(
      new long[] { 0x0000000000000200L });;

  public static final BitSet FOLLOW_9_in_expr77 = new BitSet(
      new long[] { 0x0000000000000050L });

  public static final BitSet FOLLOW_mexpr_in_expr79 = new BitSet(
      new long[] { 0x0000000000000202L });;

  public static final BitSet FOLLOW_mexpr_in_expr96 = new BitSet(
      new long[] { 0x0000000000000400L });

  public static final BitSet FOLLOW_10_in_expr100 = new BitSet(
      new long[] { 0x0000000000000050L });;

  public static final BitSet FOLLOW_mexpr_in_expr102 = new BitSet(
      new long[] { 0x0000000000000402L });

  public static final BitSet FOLLOW_atom_in_mexpr132 = new BitSet(
      new long[] { 0x0000000000000002L });;

  public static final BitSet FOLLOW_atom_in_mexpr141 = new BitSet(
      new long[] { 0x0000000000000100L });

  public static final BitSet FOLLOW_8_in_mexpr144 = new BitSet(
      new long[] { 0x0000000000000050L });

  public static final BitSet FOLLOW_atom_in_mexpr146 = new BitSet(
      new long[] { 0x0000000000000102L });

  public static final BitSet FOLLOW_INT_in_atom172 = new BitSet(
      new long[] { 0x0000000000000002L });

  // Delegated rules

  public static final BitSet FOLLOW_6_in_atom181 = new BitSet(
      new long[] { 0x0000000000000050L });
  public static final BitSet FOLLOW_expr_in_atom183 = new BitSet(
      new long[] { 0x0000000000000080L });
  public static final BitSet FOLLOW_7_in_atom185 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_mexpr_in_synpred1_ASTRewrite64 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_mexpr_in_synpred3_ASTRewrite73 = new BitSet(
      new long[] { 0x0000000000000200L });
  public static final BitSet FOLLOW_9_in_synpred3_ASTRewrite77 = new BitSet(
      new long[] { 0x0000000000000050L });
  public static final BitSet FOLLOW_mexpr_in_synpred3_ASTRewrite79 = new BitSet(
      new long[] { 0x0000000000000202L });
  public static final BitSet FOLLOW_atom_in_synpred5_ASTRewrite132 = new BitSet(
      new long[] { 0x0000000000000002L });

  public ASTRewriteParser(final TokenStream input) {
    this(input, new RecognizerSharedState());
  }

  public ASTRewriteParser(final TokenStream input,
      final RecognizerSharedState state) {
    super(input, state);
    this.state.ruleMemo = new HashMap[11 + 1];

  }

  // $ANTLR start "atom"
  // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:30:1: atom : ( INT -> INT | '(' expr ')' -> expr );
  public final ASTRewriteParser.atom_return atom() throws RecognitionException {
    final ASTRewriteParser.atom_return retval = new ASTRewriteParser.atom_return();
    retval.start = this.input.LT(1);
    final int atom_StartIndex = this.input.index();

    Object root_0 = null;

    Token INT14 = null;
    Token char_literal15 = null;
    Token char_literal17 = null;
    ParserRuleReturnScope expr16 = null;

    final RewriteRuleTokenStream stream_7 = new RewriteRuleTokenStream(
        this.adaptor, "token 7");
    final RewriteRuleTokenStream stream_INT = new RewriteRuleTokenStream(
        this.adaptor, "token INT");
    final RewriteRuleTokenStream stream_6 = new RewriteRuleTokenStream(
        this.adaptor, "token 6");
    final RewriteRuleSubtreeStream stream_expr = new RewriteRuleSubtreeStream(
        this.adaptor, "rule expr");

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 4)) {
        return retval;
      }

      // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:31:2: ( INT -> INT | '(' expr ')' -> expr )
      int alt6 = 2;
      final int LA6_0 = this.input.LA(1);
      if ((LA6_0 == ASTRewriteParser.INT)) {
        alt6 = 1;
      } else if ((LA6_0 == 6)) {
        alt6 = 2;
      }

      else {
        if (this.state.backtracking > 0) {
          this.state.failed = true;
          return retval;
        }
        final NoViableAltException nvae = new NoViableAltException("", 6, 0,
            this.input);
        throw nvae;
      }

      switch (alt6) {
        case 1:
        // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:31:4: INT
        {
          INT14 = (Token) match(
              this.input,
              ASTRewriteParser.INT,
              ASTRewriteParser.FOLLOW_INT_in_atom172);
          if (this.state.failed) {
            return retval;
          }
          if (this.state.backtracking == 0) {
            stream_INT.add(INT14);
          }

          // AST REWRITE
          // elements: INT
          // token labels: 
          // rule labels: retval
          // token list labels: 
          // rule list labels: 
          // wildcard labels: 
          if (this.state.backtracking == 0) {
            retval.tree = root_0;
            new RewriteRuleSubtreeStream(this.adaptor, "rule retval",
                retval != null ? retval.getTree() : null);

            root_0 = this.adaptor.nil();
            // 31:8: -> INT
            {
              this.adaptor.addChild(root_0, stream_INT.nextNode());
            }

            retval.tree = root_0;
          }

        }
          break;
        case 2:
        // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:32:4: '(' expr ')'
        {
          char_literal15 = (Token) match(
              this.input,
              6,
              ASTRewriteParser.FOLLOW_6_in_atom181);
          if (this.state.failed) {
            return retval;
          }
          if (this.state.backtracking == 0) {
            stream_6.add(char_literal15);
          }

          pushFollow(ASTRewriteParser.FOLLOW_expr_in_atom183);
          expr16 = expr();
          this.state._fsp--;
          if (this.state.failed) {
            return retval;
          }
          if (this.state.backtracking == 0) {
            stream_expr.add(expr16.getTree());
          }
          char_literal17 = (Token) match(
              this.input,
              7,
              ASTRewriteParser.FOLLOW_7_in_atom185);
          if (this.state.failed) {
            return retval;
          }
          if (this.state.backtracking == 0) {
            stream_7.add(char_literal17);
          }

          // AST REWRITE
          // elements: expr
          // token labels: 
          // rule labels: retval
          // token list labels: 
          // rule list labels: 
          // wildcard labels: 
          if (this.state.backtracking == 0) {
            retval.tree = root_0;
            new RewriteRuleSubtreeStream(this.adaptor, "rule retval",
                retval != null ? retval.getTree() : null);

            root_0 = this.adaptor.nil();
            // 32:17: -> expr
            {
              this.adaptor.addChild(root_0, stream_expr.nextTree());
            }

            retval.tree = root_0;
          }

        }
          break;

      }
      retval.stop = this.input.LT(-1);

      if (this.state.backtracking == 0) {
        retval.tree = this.adaptor.rulePostProcessing(root_0);
        this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      }
    } catch (final RecognitionException re) {
      reportError(re);
      recover(this.input, re);
      retval.tree = this.adaptor.errorNode(
          this.input,
          retval.start,
          this.input.LT(-1),
          re);
    } finally {
      // do for sure before leaving
      if (this.state.backtracking > 0) {
        memoize(this.input, 4, atom_StartIndex);
      }

    }
    return retval;
  }

  // $ANTLR end "atom"
  // $ANTLR start "expr"
  // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:19:1: expr : ( mexpr -> mexpr | mexpr ( '+' mexpr )+ -> ^( '+' ( mexpr )+ ) | mexpr ( '-' mexpr )+ -> ^( '-' ( mexpr )+ ) );
  public final ASTRewriteParser.expr_return expr() throws RecognitionException {
    final ASTRewriteParser.expr_return retval = new ASTRewriteParser.expr_return();
    retval.start = this.input.LT(1);
    final int expr_StartIndex = this.input.index();

    Object root_0 = null;

    Token char_literal5 = null;
    Token char_literal8 = null;
    ParserRuleReturnScope mexpr3 = null;
    ParserRuleReturnScope mexpr4 = null;
    ParserRuleReturnScope mexpr6 = null;
    ParserRuleReturnScope mexpr7 = null;
    ParserRuleReturnScope mexpr9 = null;

    final RewriteRuleTokenStream stream_10 = new RewriteRuleTokenStream(
        this.adaptor, "token 10");
    final RewriteRuleTokenStream stream_9 = new RewriteRuleTokenStream(
        this.adaptor, "token 9");
    final RewriteRuleSubtreeStream stream_mexpr = new RewriteRuleSubtreeStream(
        this.adaptor, "rule mexpr");

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 2)) {
        return retval;
      }

      // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:20:2: ( mexpr -> mexpr | mexpr ( '+' mexpr )+ -> ^( '+' ( mexpr )+ ) | mexpr ( '-' mexpr )+ -> ^( '-' ( mexpr )+ ) )
      int alt3 = 3;
      final int LA3_0 = this.input.LA(1);
      if ((LA3_0 == ASTRewriteParser.INT)) {
        this.input.LA(2);
        if ((synpred1_ASTRewrite())) {
          alt3 = 1;
        } else if ((synpred3_ASTRewrite())) {
          alt3 = 2;
        } else if ((true)) {
          alt3 = 3;
        }

      } else if ((LA3_0 == 6)) {
        this.input.LA(2);
        if ((synpred1_ASTRewrite())) {
          alt3 = 1;
        } else if ((synpred3_ASTRewrite())) {
          alt3 = 2;
        } else if ((true)) {
          alt3 = 3;
        }

      }

      else {
        if (this.state.backtracking > 0) {
          this.state.failed = true;
          return retval;
        }
        final NoViableAltException nvae = new NoViableAltException("", 3, 0,
            this.input);
        throw nvae;
      }

      switch (alt3) {
        case 1:
        // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:20:4: mexpr
        {
          pushFollow(ASTRewriteParser.FOLLOW_mexpr_in_expr64);
          mexpr3 = mexpr();
          this.state._fsp--;
          if (this.state.failed) {
            return retval;
          }
          if (this.state.backtracking == 0) {
            stream_mexpr.add(mexpr3.getTree());
          }
          // AST REWRITE
          // elements: mexpr
          // token labels: 
          // rule labels: retval
          // token list labels: 
          // rule list labels: 
          // wildcard labels: 
          if (this.state.backtracking == 0) {
            retval.tree = root_0;
            new RewriteRuleSubtreeStream(this.adaptor, "rule retval",
                retval != null ? retval.getTree() : null);

            root_0 = this.adaptor.nil();
            // 20:10: -> mexpr
            {
              this.adaptor.addChild(root_0, stream_mexpr.nextTree());
            }

            retval.tree = root_0;
          }

        }
          break;
        case 2:
        // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:21:4: mexpr ( '+' mexpr )+
        {
          pushFollow(ASTRewriteParser.FOLLOW_mexpr_in_expr73);
          mexpr4 = mexpr();
          this.state._fsp--;
          if (this.state.failed) {
            return retval;
          }
          if (this.state.backtracking == 0) {
            stream_mexpr.add(mexpr4.getTree());
          }
          // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:21:10: ( '+' mexpr )+
          int cnt1 = 0;
          loop1: while (true) {
            int alt1 = 2;
            final int LA1_0 = this.input.LA(1);
            if ((LA1_0 == 9)) {
              alt1 = 1;
            }

            switch (alt1) {
              case 1:
              // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:21:12: '+' mexpr
              {
                char_literal5 = (Token) match(
                    this.input,
                    9,
                    ASTRewriteParser.FOLLOW_9_in_expr77);
                if (this.state.failed) {
                  return retval;
                }
                if (this.state.backtracking == 0) {
                  stream_9.add(char_literal5);
                }

                pushFollow(ASTRewriteParser.FOLLOW_mexpr_in_expr79);
                mexpr6 = mexpr();
                this.state._fsp--;
                if (this.state.failed) {
                  return retval;
                }
                if (this.state.backtracking == 0) {
                  stream_mexpr.add(mexpr6.getTree());
                }
              }
                break;

              default:
                if (cnt1 >= 1) {
                  break loop1;
                }
                if (this.state.backtracking > 0) {
                  this.state.failed = true;
                  return retval;
                }
                final EarlyExitException eee = new EarlyExitException(1,
                    this.input);
                throw eee;
            }
            cnt1++;
          }

          // AST REWRITE
          // elements: mexpr, 9
          // token labels: 
          // rule labels: retval
          // token list labels: 
          // rule list labels: 
          // wildcard labels: 
          if (this.state.backtracking == 0) {
            retval.tree = root_0;
            new RewriteRuleSubtreeStream(this.adaptor, "rule retval",
                retval != null ? retval.getTree() : null);

            root_0 = this.adaptor.nil();
            // 21:25: -> ^( '+' ( mexpr )+ )
            {
              // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:21:28: ^( '+' ( mexpr )+ )
              {
                Object root_1 = this.adaptor.nil();
                root_1 = this.adaptor.becomeRoot(stream_9.nextNode(), root_1);
                if (!(stream_mexpr.hasNext())) {
                  throw new RewriteEarlyExitException();
                }
                while (stream_mexpr.hasNext()) {
                  this.adaptor.addChild(root_1, stream_mexpr.nextTree());
                }
                stream_mexpr.reset();

                this.adaptor.addChild(root_0, root_1);
              }

            }

            retval.tree = root_0;
          }

        }
          break;
        case 3:
        // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:22:4: mexpr ( '-' mexpr )+
        {
          pushFollow(ASTRewriteParser.FOLLOW_mexpr_in_expr96);
          mexpr7 = mexpr();
          this.state._fsp--;
          if (this.state.failed) {
            return retval;
          }
          if (this.state.backtracking == 0) {
            stream_mexpr.add(mexpr7.getTree());
          }
          // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:22:10: ( '-' mexpr )+
          int cnt2 = 0;
          loop2: while (true) {
            int alt2 = 2;
            final int LA2_0 = this.input.LA(1);
            if ((LA2_0 == 10)) {
              alt2 = 1;
            }

            switch (alt2) {
              case 1:
              // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:22:12: '-' mexpr
              {
                char_literal8 = (Token) match(
                    this.input,
                    10,
                    ASTRewriteParser.FOLLOW_10_in_expr100);
                if (this.state.failed) {
                  return retval;
                }
                if (this.state.backtracking == 0) {
                  stream_10.add(char_literal8);
                }

                pushFollow(ASTRewriteParser.FOLLOW_mexpr_in_expr102);
                mexpr9 = mexpr();
                this.state._fsp--;
                if (this.state.failed) {
                  return retval;
                }
                if (this.state.backtracking == 0) {
                  stream_mexpr.add(mexpr9.getTree());
                }
              }
                break;

              default:
                if (cnt2 >= 1) {
                  break loop2;
                }
                if (this.state.backtracking > 0) {
                  this.state.failed = true;
                  return retval;
                }
                final EarlyExitException eee = new EarlyExitException(2,
                    this.input);
                throw eee;
            }
            cnt2++;
          }

          // AST REWRITE
          // elements: 10, mexpr
          // token labels: 
          // rule labels: retval
          // token list labels: 
          // rule list labels: 
          // wildcard labels: 
          if (this.state.backtracking == 0) {
            retval.tree = root_0;
            new RewriteRuleSubtreeStream(this.adaptor, "rule retval",
                retval != null ? retval.getTree() : null);

            root_0 = this.adaptor.nil();
            // 22:25: -> ^( '-' ( mexpr )+ )
            {
              // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:22:28: ^( '-' ( mexpr )+ )
              {
                Object root_1 = this.adaptor.nil();
                root_1 = this.adaptor.becomeRoot(stream_10.nextNode(), root_1);
                if (!(stream_mexpr.hasNext())) {
                  throw new RewriteEarlyExitException();
                }
                while (stream_mexpr.hasNext()) {
                  this.adaptor.addChild(root_1, stream_mexpr.nextTree());
                }
                stream_mexpr.reset();

                this.adaptor.addChild(root_0, root_1);
              }

            }

            retval.tree = root_0;
          }

        }
          break;

      }
      retval.stop = this.input.LT(-1);

      if (this.state.backtracking == 0) {
        retval.tree = this.adaptor.rulePostProcessing(root_0);
        this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      }
    } catch (final RecognitionException re) {
      reportError(re);
      recover(this.input, re);
      retval.tree = this.adaptor.errorNode(
          this.input,
          retval.start,
          this.input.LT(-1),
          re);
    } finally {
      // do for sure before leaving
      if (this.state.backtracking > 0) {
        memoize(this.input, 2, expr_StartIndex);
      }

    }
    return retval;
  }

  // $ANTLR end "expr"
  // delegates
  public Parser[] getDelegates() {
    return new Parser[] {};
  }

  @Override
  public String getGrammarFileName() {
    return "/compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g";
  }

  @Override
  public String[] getTokenNames() {
    return ASTRewriteParser.tokenNames;
  }

  public TreeAdaptor getTreeAdaptor() {
    return this.adaptor;
  }

  // $ANTLR start "mexpr"
  // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:25:1: mexpr : ( atom -> atom | atom ( '*' atom )+ -> ^( '*' ( atom )+ ) );
  public final ASTRewriteParser.mexpr_return mexpr()
      throws RecognitionException {
    final ASTRewriteParser.mexpr_return retval = new ASTRewriteParser.mexpr_return();
    retval.start = this.input.LT(1);
    final int mexpr_StartIndex = this.input.index();

    Object root_0 = null;

    Token char_literal12 = null;
    ParserRuleReturnScope atom10 = null;
    ParserRuleReturnScope atom11 = null;
    ParserRuleReturnScope atom13 = null;

    final RewriteRuleTokenStream stream_8 = new RewriteRuleTokenStream(
        this.adaptor, "token 8");
    final RewriteRuleSubtreeStream stream_atom = new RewriteRuleSubtreeStream(
        this.adaptor, "rule atom");

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 3)) {
        return retval;
      }

      // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:26:2: ( atom -> atom | atom ( '*' atom )+ -> ^( '*' ( atom )+ ) )
      int alt5 = 2;
      final int LA5_0 = this.input.LA(1);
      if ((LA5_0 == ASTRewriteParser.INT)) {
        this.input.LA(2);
        if ((synpred5_ASTRewrite())) {
          alt5 = 1;
        } else if ((true)) {
          alt5 = 2;
        }

      } else if ((LA5_0 == 6)) {
        this.input.LA(2);
        if ((synpred5_ASTRewrite())) {
          alt5 = 1;
        } else if ((true)) {
          alt5 = 2;
        }

      }

      else {
        if (this.state.backtracking > 0) {
          this.state.failed = true;
          return retval;
        }
        final NoViableAltException nvae = new NoViableAltException("", 5, 0,
            this.input);
        throw nvae;
      }

      switch (alt5) {
        case 1:
        // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:26:4: atom
        {
          pushFollow(ASTRewriteParser.FOLLOW_atom_in_mexpr132);
          atom10 = atom();
          this.state._fsp--;
          if (this.state.failed) {
            return retval;
          }
          if (this.state.backtracking == 0) {
            stream_atom.add(atom10.getTree());
          }
          // AST REWRITE
          // elements: atom
          // token labels: 
          // rule labels: retval
          // token list labels: 
          // rule list labels: 
          // wildcard labels: 
          if (this.state.backtracking == 0) {
            retval.tree = root_0;
            new RewriteRuleSubtreeStream(this.adaptor, "rule retval",
                retval != null ? retval.getTree() : null);

            root_0 = this.adaptor.nil();
            // 26:9: -> atom
            {
              this.adaptor.addChild(root_0, stream_atom.nextTree());
            }

            retval.tree = root_0;
          }

        }
          break;
        case 2:
        // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:27:4: atom ( '*' atom )+
        {
          pushFollow(ASTRewriteParser.FOLLOW_atom_in_mexpr141);
          atom11 = atom();
          this.state._fsp--;
          if (this.state.failed) {
            return retval;
          }
          if (this.state.backtracking == 0) {
            stream_atom.add(atom11.getTree());
          }
          // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:27:9: ( '*' atom )+
          int cnt4 = 0;
          loop4: while (true) {
            int alt4 = 2;
            final int LA4_0 = this.input.LA(1);
            if ((LA4_0 == 8)) {
              alt4 = 1;
            }

            switch (alt4) {
              case 1:
              // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:27:10: '*' atom
              {
                char_literal12 = (Token) match(
                    this.input,
                    8,
                    ASTRewriteParser.FOLLOW_8_in_mexpr144);
                if (this.state.failed) {
                  return retval;
                }
                if (this.state.backtracking == 0) {
                  stream_8.add(char_literal12);
                }

                pushFollow(ASTRewriteParser.FOLLOW_atom_in_mexpr146);
                atom13 = atom();
                this.state._fsp--;
                if (this.state.failed) {
                  return retval;
                }
                if (this.state.backtracking == 0) {
                  stream_atom.add(atom13.getTree());
                }
              }
                break;

              default:
                if (cnt4 >= 1) {
                  break loop4;
                }
                if (this.state.backtracking > 0) {
                  this.state.failed = true;
                  return retval;
                }
                final EarlyExitException eee = new EarlyExitException(4,
                    this.input);
                throw eee;
            }
            cnt4++;
          }

          // AST REWRITE
          // elements: 8, atom
          // token labels: 
          // rule labels: retval
          // token list labels: 
          // rule list labels: 
          // wildcard labels: 
          if (this.state.backtracking == 0) {
            retval.tree = root_0;
            new RewriteRuleSubtreeStream(this.adaptor, "rule retval",
                retval != null ? retval.getTree() : null);

            root_0 = this.adaptor.nil();
            // 27:21: -> ^( '*' ( atom )+ )
            {
              // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:27:24: ^( '*' ( atom )+ )
              {
                Object root_1 = this.adaptor.nil();
                root_1 = this.adaptor.becomeRoot(stream_8.nextNode(), root_1);
                if (!(stream_atom.hasNext())) {
                  throw new RewriteEarlyExitException();
                }
                while (stream_atom.hasNext()) {
                  this.adaptor.addChild(root_1, stream_atom.nextTree());
                }
                stream_atom.reset();

                this.adaptor.addChild(root_0, root_1);
              }

            }

            retval.tree = root_0;
          }

        }
          break;

      }
      retval.stop = this.input.LT(-1);

      if (this.state.backtracking == 0) {
        retval.tree = this.adaptor.rulePostProcessing(root_0);
        this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      }
    } catch (final RecognitionException re) {
      reportError(re);
      recover(this.input, re);
      retval.tree = this.adaptor.errorNode(
          this.input,
          retval.start,
          this.input.LT(-1),
          re);
    } finally {
      // do for sure before leaving
      if (this.state.backtracking > 0) {
        memoize(this.input, 3, mexpr_StartIndex);
      }

    }
    return retval;
  }

  // $ANTLR end "mexpr"
  public void setTreeAdaptor(final TreeAdaptor adaptor) {
    this.adaptor = adaptor;
  }

  // $ANTLR start "start"
  // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:15:1: start : expr EOF -> expr ;
  public final ASTRewriteParser.start_return start()
      throws RecognitionException {
    final ASTRewriteParser.start_return retval = new ASTRewriteParser.start_return();
    retval.start = this.input.LT(1);
    final int start_StartIndex = this.input.index();

    Object root_0 = null;

    Token EOF2 = null;
    ParserRuleReturnScope expr1 = null;

    final RewriteRuleTokenStream stream_EOF = new RewriteRuleTokenStream(
        this.adaptor, "token EOF");
    final RewriteRuleSubtreeStream stream_expr = new RewriteRuleSubtreeStream(
        this.adaptor, "rule expr");

    try {
      if ((this.state.backtracking > 0) && alreadyParsedRule(this.input, 1)) {
        return retval;
      }

      // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:16:2: ( expr EOF -> expr )
      // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:16:4: expr EOF
      {
        pushFollow(ASTRewriteParser.FOLLOW_expr_in_start46);
        expr1 = expr();
        this.state._fsp--;
        if (this.state.failed) {
          return retval;
        }
        if (this.state.backtracking == 0) {
          stream_expr.add(expr1.getTree());
        }
        EOF2 = (Token) match(
            this.input,
            ASTRewriteParser.EOF,
            ASTRewriteParser.FOLLOW_EOF_in_start48);
        if (this.state.failed) {
          return retval;
        }
        if (this.state.backtracking == 0) {
          stream_EOF.add(EOF2);
        }

        // AST REWRITE
        // elements: expr
        // token labels: 
        // rule labels: retval
        // token list labels: 
        // rule list labels: 
        // wildcard labels: 
        if (this.state.backtracking == 0) {
          retval.tree = root_0;
          new RewriteRuleSubtreeStream(this.adaptor, "rule retval",
              retval != null ? retval.getTree() : null);

          root_0 = this.adaptor.nil();
          // 16:13: -> expr
          {
            this.adaptor.addChild(root_0, stream_expr.nextTree());
          }

          retval.tree = root_0;
        }

      }

      retval.stop = this.input.LT(-1);

      if (this.state.backtracking == 0) {
        retval.tree = this.adaptor.rulePostProcessing(root_0);
        this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      }
    } catch (final RecognitionException re) {
      reportError(re);
      recover(this.input, re);
      retval.tree = this.adaptor.errorNode(
          this.input,
          retval.start,
          this.input.LT(-1),
          re);
    } finally {
      // do for sure before leaving
      if (this.state.backtracking > 0) {
        memoize(this.input, 1, start_StartIndex);
      }

    }
    return retval;
  }

  // $ANTLR end "start"
  public final boolean synpred1_ASTRewrite() {
    this.state.backtracking++;
    final int start = this.input.mark();
    try {
      synpred1_ASTRewrite_fragment(); // can never throw exception
    } catch (final RecognitionException re) {
      System.err.println("impossible: " + re);
    }
    final boolean success = !this.state.failed;
    this.input.rewind(start);
    this.state.backtracking--;
    this.state.failed = false;
    return success;
  }

  // $ANTLR start synpred1_ASTRewrite
  public final void synpred1_ASTRewrite_fragment() throws RecognitionException {
    // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:20:4: ( mexpr )
    // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:20:4: mexpr
    {
      pushFollow(ASTRewriteParser.FOLLOW_mexpr_in_synpred1_ASTRewrite64);
      mexpr();
      this.state._fsp--;
      if (this.state.failed) {
        return;
      }

    }

  }

  // $ANTLR end synpred1_ASTRewrite
  public final boolean synpred3_ASTRewrite() {
    this.state.backtracking++;
    final int start = this.input.mark();
    try {
      synpred3_ASTRewrite_fragment(); // can never throw exception
    } catch (final RecognitionException re) {
      System.err.println("impossible: " + re);
    }
    final boolean success = !this.state.failed;
    this.input.rewind(start);
    this.state.backtracking--;
    this.state.failed = false;
    return success;
  }

  // $ANTLR start synpred3_ASTRewrite
  public final void synpred3_ASTRewrite_fragment() throws RecognitionException {
    // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:21:4: ( mexpr ( '+' mexpr )+ )
    // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:21:4: mexpr ( '+' mexpr )+
    {
      pushFollow(ASTRewriteParser.FOLLOW_mexpr_in_synpred3_ASTRewrite73);
      mexpr();
      this.state._fsp--;
      if (this.state.failed) {
        return;
      }

      // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:21:10: ( '+' mexpr )+
      int cnt7 = 0;
      loop7: while (true) {
        int alt7 = 2;
        final int LA7_0 = this.input.LA(1);
        if ((LA7_0 == 9)) {
          alt7 = 1;
        }

        switch (alt7) {
          case 1:
          // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:21:12: '+' mexpr
          {
            match(
                this.input,
                9,
                ASTRewriteParser.FOLLOW_9_in_synpred3_ASTRewrite77);
            if (this.state.failed) {
              return;
            }

            pushFollow(ASTRewriteParser.FOLLOW_mexpr_in_synpred3_ASTRewrite79);
            mexpr();
            this.state._fsp--;
            if (this.state.failed) {
              return;
            }

          }
            break;

          default:
            if (cnt7 >= 1) {
              break loop7;
            }
            if (this.state.backtracking > 0) {
              this.state.failed = true;
              return;
            }
            final EarlyExitException eee = new EarlyExitException(7, this.input);
            throw eee;
        }
        cnt7++;
      }

    }

  }

  // $ANTLR end synpred3_ASTRewrite
  public final boolean synpred5_ASTRewrite() {
    this.state.backtracking++;
    final int start = this.input.mark();
    try {
      synpred5_ASTRewrite_fragment(); // can never throw exception
    } catch (final RecognitionException re) {
      System.err.println("impossible: " + re);
    }
    final boolean success = !this.state.failed;
    this.input.rewind(start);
    this.state.backtracking--;
    this.state.failed = false;
    return success;
  }

  // $ANTLR start synpred5_ASTRewrite
  public final void synpred5_ASTRewrite_fragment() throws RecognitionException {
    // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:26:4: ( atom )
    // /compiler-examples/src-antlr/antlr/astexample/ASTRewrite.g:26:4: atom
    {
      pushFollow(ASTRewriteParser.FOLLOW_atom_in_synpred5_ASTRewrite132);
      atom();
      this.state._fsp--;
      if (this.state.failed) {
        return;
      }

    }

  }
  // $ANTLR end synpred5_ASTRewrite
}
