// $ANTLR 3.5 /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g 2013-07-08 18:21:12

package antlrv3.ast;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.RewriteRuleSubtreeStream;
import org.antlr.runtime.tree.RewriteRuleTokenStream;
import org.antlr.runtime.tree.TreeAdaptor;

@SuppressWarnings("all")
public class ExprASTParser extends Parser {
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
  public static final BitSet FOLLOW_expr_in_start34 = new BitSet(
      new long[] { 0x0000000000000000L });
  public static final BitSet FOLLOW_EOF_in_start36 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_mexpr_in_expr58 = new BitSet(
      new long[] { 0x0000000000000602L });

  public static final BitSet FOLLOW_9_in_expr95 = new BitSet(
      new long[] { 0x0000000000000050L });;

  public static final BitSet FOLLOW_mexpr_in_expr99 = new BitSet(
      new long[] { 0x0000000000000602L });

  public static final BitSet FOLLOW_10_in_expr165 = new BitSet(
      new long[] { 0x0000000000000050L });;

  public static final BitSet FOLLOW_mexpr_in_expr169 = new BitSet(
      new long[] { 0x0000000000000602L });

  public static final BitSet FOLLOW_atom_in_mexpr235 = new BitSet(
      new long[] { 0x0000000000000102L });;

  public static final BitSet FOLLOW_8_in_mexpr253 = new BitSet(
      new long[] { 0x0000000000000050L });

  public static final BitSet FOLLOW_atom_in_mexpr257 = new BitSet(
      new long[] { 0x0000000000000102L });;

  public static final BitSet FOLLOW_INT_in_atom315 = new BitSet(
      new long[] { 0x0000000000000002L });

  // Delegated rules

  public static final BitSet FOLLOW_6_in_atom333 = new BitSet(
      new long[] { 0x0000000000000050L });
  public static final BitSet FOLLOW_expr_in_atom337 = new BitSet(
      new long[] { 0x0000000000000080L });
  public static final BitSet FOLLOW_7_in_atom339 = new BitSet(
      new long[] { 0x0000000000000002L });

  public ExprASTParser(final TokenStream input) {
    this(input, new RecognizerSharedState());
  }

  public ExprASTParser(final TokenStream input,
      final RecognizerSharedState state) {
    super(input, state);
  }

  // $ANTLR start "atom"
  // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:38:1: atom : ( ( INT -> INT ) | ( '(' e= expr ')' -> $e) );
  public final ExprASTParser.atom_return atom() throws RecognitionException {
    final ExprASTParser.atom_return retval = new ExprASTParser.atom_return();
    retval.start = this.input.LT(1);

    Object root_0 = null;

    Token INT6 = null;
    Token char_literal7 = null;
    Token char_literal8 = null;
    ParserRuleReturnScope e = null;

    final RewriteRuleTokenStream stream_7 = new RewriteRuleTokenStream(
        this.adaptor, "token 7");
    final RewriteRuleTokenStream stream_INT = new RewriteRuleTokenStream(
        this.adaptor, "token INT");
    final RewriteRuleTokenStream stream_6 = new RewriteRuleTokenStream(
        this.adaptor, "token 6");
    final RewriteRuleSubtreeStream stream_expr = new RewriteRuleSubtreeStream(
        this.adaptor, "rule expr");

    try {
      // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:38:8: ( ( INT -> INT ) | ( '(' e= expr ')' -> $e) )
      int alt3 = 2;
      final int LA3_0 = this.input.LA(1);
      if ((LA3_0 == ExprASTParser.INT)) {
        alt3 = 1;
      } else if ((LA3_0 == 6)) {
        alt3 = 2;
      }

      else {
        final NoViableAltException nvae = new NoViableAltException("", 3, 0,
            this.input);
        throw nvae;
      }

      switch (alt3) {
        case 1:
        // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:38:10: ( INT -> INT )
        {
          // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:38:10: ( INT -> INT )
          // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:38:11: INT
          {
            INT6 = (Token) match(
                this.input,
                ExprASTParser.INT,
                ExprASTParser.FOLLOW_INT_in_atom315);
            stream_INT.add(INT6);

            // AST REWRITE
            // elements: INT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            new RewriteRuleSubtreeStream(this.adaptor, "rule retval",
                retval != null ? retval.getTree() : null);

            root_0 = this.adaptor.nil();
            // 38:15: -> INT
            {
              this.adaptor.addChild(
                  root_0,
                  new LiteralNode(stream_INT.nextToken()));
            }

            retval.tree = root_0;

          }

        }
          break;
        case 2:
        // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:39:7: ( '(' e= expr ')' -> $e)
        {
          // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:39:7: ( '(' e= expr ')' -> $e)
          // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:39:8: '(' e= expr ')'
          {
            char_literal7 = (Token) match(
                this.input,
                6,
                ExprASTParser.FOLLOW_6_in_atom333);
            stream_6.add(char_literal7);

            pushFollow(ExprASTParser.FOLLOW_expr_in_atom337);
            e = expr();
            this.state._fsp--;

            stream_expr.add(e.getTree());
            char_literal8 = (Token) match(
                this.input,
                7,
                ExprASTParser.FOLLOW_7_in_atom339);
            stream_7.add(char_literal8);

            // AST REWRITE
            // elements: e
            // token labels: 
            // rule labels: retval, e
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            new RewriteRuleSubtreeStream(this.adaptor, "rule retval",
                retval != null ? retval.getTree() : null);
            final RewriteRuleSubtreeStream stream_e = new RewriteRuleSubtreeStream(
                this.adaptor, "rule e", e != null ? e.getTree() : null);

            root_0 = this.adaptor.nil();
            // 39:23: -> $e
            {
              this.adaptor.addChild(root_0, stream_e.nextTree());
            }

            retval.tree = root_0;

          }

        }
          break;

      }
      retval.stop = this.input.LT(-1);

      retval.tree = this.adaptor.rulePostProcessing(root_0);
      this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    }
    return retval;
  }

  // $ANTLR end "atom"
  // $ANTLR start "expr"
  // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:16:1: expr : (l= mexpr -> $l) ( ( '+' r= mexpr -> ^( '+' $expr $r) ) | ( '-' r= mexpr -> ^( '-' $expr $r) ) )* ;
  public final ExprASTParser.expr_return expr() throws RecognitionException {
    final ExprASTParser.expr_return retval = new ExprASTParser.expr_return();
    retval.start = this.input.LT(1);

    Object root_0 = null;

    Token char_literal3 = null;
    Token char_literal4 = null;
    ParserRuleReturnScope l = null;
    ParserRuleReturnScope r = null;

    final RewriteRuleTokenStream stream_10 = new RewriteRuleTokenStream(
        this.adaptor, "token 10");
    final RewriteRuleTokenStream stream_9 = new RewriteRuleTokenStream(
        this.adaptor, "token 9");
    final RewriteRuleSubtreeStream stream_mexpr = new RewriteRuleSubtreeStream(
        this.adaptor, "rule mexpr");

    try {
      // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:16:6: ( (l= mexpr -> $l) ( ( '+' r= mexpr -> ^( '+' $expr $r) ) | ( '-' r= mexpr -> ^( '-' $expr $r) ) )* )
      // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:16:8: (l= mexpr -> $l) ( ( '+' r= mexpr -> ^( '+' $expr $r) ) | ( '-' r= mexpr -> ^( '-' $expr $r) ) )*
      {
        // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:16:8: (l= mexpr -> $l)
        // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:16:9: l= mexpr
        {
          pushFollow(ExprASTParser.FOLLOW_mexpr_in_expr58);
          l = mexpr();
          this.state._fsp--;

          stream_mexpr.add(l.getTree());
          // AST REWRITE
          // elements: l
          // token labels: 
          // rule labels: retval, l
          // token list labels: 
          // rule list labels: 
          // wildcard labels: 
          retval.tree = root_0;
          new RewriteRuleSubtreeStream(this.adaptor, "rule retval",
              retval != null ? retval.getTree() : null);
          final RewriteRuleSubtreeStream stream_l = new RewriteRuleSubtreeStream(
              this.adaptor, "rule l", l != null ? l.getTree() : null);

          root_0 = this.adaptor.nil();
          // 16:17: -> $l
          {
            this.adaptor.addChild(root_0, stream_l.nextTree());
          }

          retval.tree = root_0;

        }

        // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:17:6: ( ( '+' r= mexpr -> ^( '+' $expr $r) ) | ( '-' r= mexpr -> ^( '-' $expr $r) ) )*
        loop1: while (true) {
          int alt1 = 3;
          final int LA1_0 = this.input.LA(1);
          if ((LA1_0 == 9)) {
            alt1 = 1;
          } else if ((LA1_0 == 10)) {
            alt1 = 2;
          }

          switch (alt1) {
            case 1:
            // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:18:9: ( '+' r= mexpr -> ^( '+' $expr $r) )
            {
              // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:18:9: ( '+' r= mexpr -> ^( '+' $expr $r) )
              // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:19:12: '+' r= mexpr
              {
                char_literal3 = (Token) match(
                    this.input,
                    9,
                    ExprASTParser.FOLLOW_9_in_expr95);
                stream_9.add(char_literal3);

                pushFollow(ExprASTParser.FOLLOW_mexpr_in_expr99);
                r = mexpr();
                this.state._fsp--;

                stream_mexpr.add(r.getTree());
                // AST REWRITE
                // elements: expr, r, 9
                // token labels: 
                // rule labels: retval, r
                // token list labels: 
                // rule list labels: 
                // wildcard labels: 
                retval.tree = root_0;
                final RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                    this.adaptor, "rule retval",
                    retval != null ? retval.getTree() : null);
                final RewriteRuleSubtreeStream stream_r = new RewriteRuleSubtreeStream(
                    this.adaptor, "rule r", r != null ? r.getTree() : null);

                root_0 = this.adaptor.nil();
                // 20:8: -> ^( '+' $expr $r)
                {
                  // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:20:11: ^( '+' $expr $r)
                  {
                    Object root_1 = this.adaptor.nil();
                    root_1 = this.adaptor.becomeRoot(new PlusOperatorNode(
                        stream_9.nextToken()), root_1);
                    this.adaptor.addChild(root_1, stream_retval.nextTree());
                    this.adaptor.addChild(root_1, stream_r.nextTree());
                    this.adaptor.addChild(root_0, root_1);
                  }

                }

                retval.tree = root_0;

              }

            }
              break;
            case 2:
            // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:23:9: ( '-' r= mexpr -> ^( '-' $expr $r) )
            {
              // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:23:9: ( '-' r= mexpr -> ^( '-' $expr $r) )
              // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:24:12: '-' r= mexpr
              {
                char_literal4 = (Token) match(
                    this.input,
                    10,
                    ExprASTParser.FOLLOW_10_in_expr165);
                stream_10.add(char_literal4);

                pushFollow(ExprASTParser.FOLLOW_mexpr_in_expr169);
                r = mexpr();
                this.state._fsp--;

                stream_mexpr.add(r.getTree());
                // AST REWRITE
                // elements: expr, r, 10
                // token labels: 
                // rule labels: retval, r
                // token list labels: 
                // rule list labels: 
                // wildcard labels: 
                retval.tree = root_0;
                final RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                    this.adaptor, "rule retval",
                    retval != null ? retval.getTree() : null);
                final RewriteRuleSubtreeStream stream_r = new RewriteRuleSubtreeStream(
                    this.adaptor, "rule r", r != null ? r.getTree() : null);

                root_0 = this.adaptor.nil();
                // 25:8: -> ^( '-' $expr $r)
                {
                  // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:25:11: ^( '-' $expr $r)
                  {
                    Object root_1 = this.adaptor.nil();
                    root_1 = this.adaptor.becomeRoot(new MinusOperatorNode(
                        stream_10.nextToken()), root_1);
                    this.adaptor.addChild(root_1, stream_retval.nextTree());
                    this.adaptor.addChild(root_1, stream_r.nextTree());
                    this.adaptor.addChild(root_0, root_1);
                  }

                }

                retval.tree = root_0;

              }

            }
              break;

            default:
              break loop1;
          }
        }

      }

      retval.stop = this.input.LT(-1);

      retval.tree = this.adaptor.rulePostProcessing(root_0);
      this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    return "/compiler-examples/src-antlr/antlrv3/ast/ExprAST.g";
  }

  @Override
  public String[] getTokenNames() {
    return ExprASTParser.tokenNames;
  }

  public TreeAdaptor getTreeAdaptor() {
    return this.adaptor;
  }

  // $ANTLR start "mexpr"
  // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:30:1: mexpr : (l= atom -> $l) ( ( '*' r= atom -> ^( '*' $mexpr $r) ) )* ;
  public final ExprASTParser.mexpr_return mexpr() throws RecognitionException {
    final ExprASTParser.mexpr_return retval = new ExprASTParser.mexpr_return();
    retval.start = this.input.LT(1);

    Object root_0 = null;

    Token char_literal5 = null;
    ParserRuleReturnScope l = null;
    ParserRuleReturnScope r = null;

    final RewriteRuleTokenStream stream_8 = new RewriteRuleTokenStream(
        this.adaptor, "token 8");
    final RewriteRuleSubtreeStream stream_atom = new RewriteRuleSubtreeStream(
        this.adaptor, "rule atom");

    try {
      // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:30:8: ( (l= atom -> $l) ( ( '*' r= atom -> ^( '*' $mexpr $r) ) )* )
      // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:30:10: (l= atom -> $l) ( ( '*' r= atom -> ^( '*' $mexpr $r) ) )*
      {
        // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:30:10: (l= atom -> $l)
        // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:30:11: l= atom
        {
          pushFollow(ExprASTParser.FOLLOW_atom_in_mexpr235);
          l = atom();
          this.state._fsp--;

          stream_atom.add(l.getTree());
          // AST REWRITE
          // elements: l
          // token labels: 
          // rule labels: retval, l
          // token list labels: 
          // rule list labels: 
          // wildcard labels: 
          retval.tree = root_0;
          new RewriteRuleSubtreeStream(this.adaptor, "rule retval",
              retval != null ? retval.getTree() : null);
          final RewriteRuleSubtreeStream stream_l = new RewriteRuleSubtreeStream(
              this.adaptor, "rule l", l != null ? l.getTree() : null);

          root_0 = this.adaptor.nil();
          // 30:18: -> $l
          {
            this.adaptor.addChild(root_0, stream_l.nextTree());
          }

          retval.tree = root_0;

        }

        // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:31:3: ( ( '*' r= atom -> ^( '*' $mexpr $r) ) )*
        loop2: while (true) {
          int alt2 = 2;
          final int LA2_0 = this.input.LA(1);
          if ((LA2_0 == 8)) {
            alt2 = 1;
          }

          switch (alt2) {
            case 1:
            // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:32:6: ( '*' r= atom -> ^( '*' $mexpr $r) )
            {
              // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:32:6: ( '*' r= atom -> ^( '*' $mexpr $r) )
              // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:32:7: '*' r= atom
              {
                char_literal5 = (Token) match(
                    this.input,
                    8,
                    ExprASTParser.FOLLOW_8_in_mexpr253);
                stream_8.add(char_literal5);

                pushFollow(ExprASTParser.FOLLOW_atom_in_mexpr257);
                r = atom();
                this.state._fsp--;

                stream_atom.add(r.getTree());
                // AST REWRITE
                // elements: 8, r, mexpr
                // token labels: 
                // rule labels: retval, r
                // token list labels: 
                // rule list labels: 
                // wildcard labels: 
                retval.tree = root_0;
                final RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                    this.adaptor, "rule retval",
                    retval != null ? retval.getTree() : null);
                final RewriteRuleSubtreeStream stream_r = new RewriteRuleSubtreeStream(
                    this.adaptor, "rule r", r != null ? r.getTree() : null);

                root_0 = this.adaptor.nil();
                // 33:9: -> ^( '*' $mexpr $r)
                {
                  // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:33:12: ^( '*' $mexpr $r)
                  {
                    Object root_1 = this.adaptor.nil();
                    root_1 = this.adaptor.becomeRoot(new MultOperatorNode(
                        stream_8.nextToken()), root_1);
                    this.adaptor.addChild(root_1, stream_retval.nextTree());
                    this.adaptor.addChild(root_1, stream_r.nextTree());
                    this.adaptor.addChild(root_0, root_1);
                  }

                }

                retval.tree = root_0;

              }

            }
              break;

            default:
              break loop2;
          }
        }

      }

      retval.stop = this.input.LT(-1);

      retval.tree = this.adaptor.rulePostProcessing(root_0);
      this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    }
    return retval;
  }

  // $ANTLR end "mexpr"
  public void setTreeAdaptor(final TreeAdaptor adaptor) {
    this.adaptor = adaptor;
  }

  // $ANTLR start "start"
  // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:13:1: start : ( expr EOF -> expr ) ;
  public final ExprASTParser.start_return start() throws RecognitionException {
    final ExprASTParser.start_return retval = new ExprASTParser.start_return();
    retval.start = this.input.LT(1);

    Object root_0 = null;

    Token EOF2 = null;
    ParserRuleReturnScope expr1 = null;

    final RewriteRuleTokenStream stream_EOF = new RewriteRuleTokenStream(
        this.adaptor, "token EOF");
    final RewriteRuleSubtreeStream stream_expr = new RewriteRuleSubtreeStream(
        this.adaptor, "rule expr");

    try {
      // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:13:7: ( ( expr EOF -> expr ) )
      // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:13:9: ( expr EOF -> expr )
      {
        // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:13:9: ( expr EOF -> expr )
        // /compiler-examples/src-antlr/antlrv3/ast/ExprAST.g:13:10: expr EOF
        {
          pushFollow(ExprASTParser.FOLLOW_expr_in_start34);
          expr1 = expr();
          this.state._fsp--;

          stream_expr.add(expr1.getTree());
          EOF2 = (Token) match(
              this.input,
              ExprASTParser.EOF,
              ExprASTParser.FOLLOW_EOF_in_start36);
          stream_EOF.add(EOF2);

          // AST REWRITE
          // elements: expr
          // token labels: 
          // rule labels: retval
          // token list labels: 
          // rule list labels: 
          // wildcard labels: 
          retval.tree = root_0;
          new RewriteRuleSubtreeStream(this.adaptor, "rule retval",
              retval != null ? retval.getTree() : null);

          root_0 = this.adaptor.nil();
          // 13:19: -> expr
          {
            this.adaptor.addChild(root_0, stream_expr.nextTree());
          }

          retval.tree = root_0;

        }

      }

      retval.stop = this.input.LT(-1);

      retval.tree = this.adaptor.rulePostProcessing(root_0);
      this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    }
    return retval;
  }
  // $ANTLR end "start"
}
