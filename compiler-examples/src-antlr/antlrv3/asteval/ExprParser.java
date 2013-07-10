// $ANTLR 3.5 /compiler-examples/src-antlr/antlrv3/asteval/Expr.g 2013-07-08 18:03:51

package antlrv3.asteval;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;

@SuppressWarnings("all")
public class ExprParser extends Parser {
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

  // delegates
  public Parser[] getDelegates() {
    return new Parser[] {};
  }

  // delegators

  public ExprParser(TokenStream input) {
    this(input, new RecognizerSharedState());
  }

  public ExprParser(TokenStream input, RecognizerSharedState state) {
    super(input, state);
  }

  protected TreeAdaptor adaptor = new CommonTreeAdaptor();

  public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
  }

  public TreeAdaptor getTreeAdaptor() {
    return adaptor;
  }

  @Override
  public String[] getTokenNames() {
    return ExprParser.tokenNames;
  }

  @Override
  public String getGrammarFileName() {
    return "/compiler-examples/src-antlr/antlrv3/asteval/Expr.g";
  }

  public static class start_return extends ParserRuleReturnScope {
    Object tree;

    @Override
    public Object getTree() {
      return tree;
    }
  };

  // $ANTLR start "start"
  // /compiler-examples/src-antlr/antlrv3/asteval/Expr.g:25:1: start : ( expr EOF -> expr ) ;
  public final ExprParser.start_return start() throws RecognitionException {
    ExprParser.start_return retval = new ExprParser.start_return();
    retval.start = input.LT(1);

    Object root_0 = null;

    Token EOF2 = null;
    ParserRuleReturnScope expr1 = null;

    Object EOF2_tree = null;
    RewriteRuleTokenStream stream_EOF = new RewriteRuleTokenStream(adaptor,
        "token EOF");
    RewriteRuleSubtreeStream stream_expr = new RewriteRuleSubtreeStream(
        adaptor, "rule expr");

    try {
      // /compiler-examples/src-antlr/antlrv3/asteval/Expr.g:25:7: ( ( expr EOF -> expr ) )
      // /compiler-examples/src-antlr/antlrv3/asteval/Expr.g:25:9: ( expr EOF -> expr )
      {
        // /compiler-examples/src-antlr/antlrv3/asteval/Expr.g:25:9: ( expr EOF -> expr )
        // /compiler-examples/src-antlr/antlrv3/asteval/Expr.g:25:10: expr EOF
        {
          pushFollow(FOLLOW_expr_in_start40);
          expr1 = expr();
          state._fsp--;

          stream_expr.add(expr1.getTree());
          EOF2 = (Token) match(input, EOF, FOLLOW_EOF_in_start42);
          stream_EOF.add(EOF2);

          // AST REWRITE
          // elements: expr
          // token labels: 
          // rule labels: retval
          // token list labels: 
          // rule list labels: 
          // wildcard labels: 
          retval.tree = root_0;
          RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
              adaptor, "rule retval", retval != null ? retval.getTree() : null);

          root_0 = (Object) adaptor.nil();
          // 25:19: -> expr
          {
            adaptor.addChild(root_0, stream_expr.nextTree());
          }

          retval.tree = root_0;

        }

      }

      retval.stop = input.LT(-1);

      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(
          input,
          retval.start,
          input.LT(-1),
          re);
    } finally {
      // do for sure before leaving
    }
    return retval;
  }

  // $ANTLR end "start"

  public static class expr_return extends ParserRuleReturnScope {
    Object tree;

    @Override
    public Object getTree() {
      return tree;
    }
  };

  // $ANTLR start "expr"
  // /compiler-examples/src-antlr/antlrv3/asteval/Expr.g:28:1: expr : mexpr ( ( '+' ^| '-' ^) mexpr )* ;
  public final ExprParser.expr_return expr() throws RecognitionException {
    ExprParser.expr_return retval = new ExprParser.expr_return();
    retval.start = input.LT(1);

    Object root_0 = null;

    Token char_literal4 = null;
    Token char_literal5 = null;
    ParserRuleReturnScope mexpr3 = null;
    ParserRuleReturnScope mexpr6 = null;

    Object char_literal4_tree = null;
    Object char_literal5_tree = null;

    try {
      // /compiler-examples/src-antlr/antlrv3/asteval/Expr.g:28:6: ( mexpr ( ( '+' ^| '-' ^) mexpr )* )
      // /compiler-examples/src-antlr/antlrv3/asteval/Expr.g:28:8: mexpr ( ( '+' ^| '-' ^) mexpr )*
      {
        root_0 = (Object) adaptor.nil();

        pushFollow(FOLLOW_mexpr_in_expr61);
        mexpr3 = mexpr();
        state._fsp--;

        adaptor.addChild(root_0, mexpr3.getTree());

        // /compiler-examples/src-antlr/antlrv3/asteval/Expr.g:28:14: ( ( '+' ^| '-' ^) mexpr )*
        loop2: while (true) {
          int alt2 = 2;
          int LA2_0 = input.LA(1);
          if (((LA2_0 >= 9 && LA2_0 <= 10))) {
            alt2 = 1;
          }

          switch (alt2) {
            case 1:
            // /compiler-examples/src-antlr/antlrv3/asteval/Expr.g:28:15: ( '+' ^| '-' ^) mexpr
            {
              // /compiler-examples/src-antlr/antlrv3/asteval/Expr.g:28:15: ( '+' ^| '-' ^)
              int alt1 = 2;
              int LA1_0 = input.LA(1);
              if ((LA1_0 == 9)) {
                alt1 = 1;
              } else if ((LA1_0 == 10)) {
                alt1 = 2;
              }

              else {
                NoViableAltException nvae = new NoViableAltException("", 1, 0,
                    input);
                throw nvae;
              }

              switch (alt1) {
                case 1:
                // /compiler-examples/src-antlr/antlrv3/asteval/Expr.g:28:16: '+' ^
                {
                  char_literal4 = (Token) match(input, 9, FOLLOW_9_in_expr65);
                  char_literal4_tree = (Object) adaptor.create(char_literal4);
                  root_0 = (Object) adaptor.becomeRoot(
                      char_literal4_tree,
                      root_0);

                }
                  break;
                case 2:
                // /compiler-examples/src-antlr/antlrv3/asteval/Expr.g:28:21: '-' ^
                {
                  char_literal5 = (Token) match(input, 10, FOLLOW_10_in_expr68);
                  char_literal5_tree = (Object) adaptor.create(char_literal5);
                  root_0 = (Object) adaptor.becomeRoot(
                      char_literal5_tree,
                      root_0);

                }
                  break;

              }

              pushFollow(FOLLOW_mexpr_in_expr72);
              mexpr6 = mexpr();
              state._fsp--;

              adaptor.addChild(root_0, mexpr6.getTree());

            }
              break;

            default:
              break loop2;
          }
        }

      }

      retval.stop = input.LT(-1);

      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(
          input,
          retval.start,
          input.LT(-1),
          re);
    } finally {
      // do for sure before leaving
    }
    return retval;
  }

  // $ANTLR end "expr"

  public static class mexpr_return extends ParserRuleReturnScope {
    Object tree;

    @Override
    public Object getTree() {
      return tree;
    }
  };

  // $ANTLR start "mexpr"
  // /compiler-examples/src-antlr/antlrv3/asteval/Expr.g:31:1: mexpr : atom ( '*' ^ atom )* ;
  public final ExprParser.mexpr_return mexpr() throws RecognitionException {
    ExprParser.mexpr_return retval = new ExprParser.mexpr_return();
    retval.start = input.LT(1);

    Object root_0 = null;

    Token char_literal8 = null;
    ParserRuleReturnScope atom7 = null;
    ParserRuleReturnScope atom9 = null;

    Object char_literal8_tree = null;

    try {
      // /compiler-examples/src-antlr/antlrv3/asteval/Expr.g:31:8: ( atom ( '*' ^ atom )* )
      // /compiler-examples/src-antlr/antlrv3/asteval/Expr.g:31:10: atom ( '*' ^ atom )*
      {
        root_0 = (Object) adaptor.nil();

        pushFollow(FOLLOW_atom_in_mexpr97);
        atom7 = atom();
        state._fsp--;

        adaptor.addChild(root_0, atom7.getTree());

        // /compiler-examples/src-antlr/antlrv3/asteval/Expr.g:31:15: ( '*' ^ atom )*
        loop3: while (true) {
          int alt3 = 2;
          int LA3_0 = input.LA(1);
          if ((LA3_0 == 8)) {
            alt3 = 1;
          }

          switch (alt3) {
            case 1:
            // /compiler-examples/src-antlr/antlrv3/asteval/Expr.g:31:16: '*' ^ atom
            {
              char_literal8 = (Token) match(input, 8, FOLLOW_8_in_mexpr100);
              char_literal8_tree = (Object) adaptor.create(char_literal8);
              root_0 = (Object) adaptor.becomeRoot(char_literal8_tree, root_0);

              pushFollow(FOLLOW_atom_in_mexpr103);
              atom9 = atom();
              state._fsp--;

              adaptor.addChild(root_0, atom9.getTree());

            }
              break;

            default:
              break loop3;
          }
        }

      }

      retval.stop = input.LT(-1);

      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(
          input,
          retval.start,
          input.LT(-1),
          re);
    } finally {
      // do for sure before leaving
    }
    return retval;
  }

  // $ANTLR end "mexpr"

  public static class atom_return extends ParserRuleReturnScope {
    Object tree;

    @Override
    public Object getTree() {
      return tree;
    }
  };

  // $ANTLR start "atom"
  // /compiler-examples/src-antlr/antlrv3/asteval/Expr.g:34:1: atom : ( INT | '(' ! expr ')' !);
  public final ExprParser.atom_return atom() throws RecognitionException {
    ExprParser.atom_return retval = new ExprParser.atom_return();
    retval.start = input.LT(1);

    Object root_0 = null;

    Token INT10 = null;
    Token char_literal11 = null;
    Token char_literal13 = null;
    ParserRuleReturnScope expr12 = null;

    Object INT10_tree = null;
    Object char_literal11_tree = null;
    Object char_literal13_tree = null;

    try {
      // /compiler-examples/src-antlr/antlrv3/asteval/Expr.g:34:8: ( INT | '(' ! expr ')' !)
      int alt4 = 2;
      int LA4_0 = input.LA(1);
      if ((LA4_0 == INT)) {
        alt4 = 1;
      } else if ((LA4_0 == 6)) {
        alt4 = 2;
      }

      else {
        NoViableAltException nvae = new NoViableAltException("", 4, 0, input);
        throw nvae;
      }

      switch (alt4) {
        case 1:
        // /compiler-examples/src-antlr/antlrv3/asteval/Expr.g:34:10: INT
        {
          root_0 = (Object) adaptor.nil();

          INT10 = (Token) match(input, INT, FOLLOW_INT_in_atom127);
          INT10_tree = (Object) adaptor.create(INT10);
          adaptor.addChild(root_0, INT10_tree);

        }
          break;
        case 2:
        // /compiler-examples/src-antlr/antlrv3/asteval/Expr.g:35:4: '(' ! expr ')' !
        {
          root_0 = (Object) adaptor.nil();

          char_literal11 = (Token) match(input, 6, FOLLOW_6_in_atom132);
          pushFollow(FOLLOW_expr_in_atom135);
          expr12 = expr();
          state._fsp--;

          adaptor.addChild(root_0, expr12.getTree());

          char_literal13 = (Token) match(input, 7, FOLLOW_7_in_atom137);
        }
          break;

      }
      retval.stop = input.LT(-1);

      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(
          input,
          retval.start,
          input.LT(-1),
          re);
    } finally {
      // do for sure before leaving
    }
    return retval;
  }

  // $ANTLR end "atom"

  // Delegated rules

  public static final BitSet FOLLOW_expr_in_start40 = new BitSet(
      new long[] { 0x0000000000000000L });
  public static final BitSet FOLLOW_EOF_in_start42 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_mexpr_in_expr61 = new BitSet(
      new long[] { 0x0000000000000602L });
  public static final BitSet FOLLOW_9_in_expr65 = new BitSet(
      new long[] { 0x0000000000000050L });
  public static final BitSet FOLLOW_10_in_expr68 = new BitSet(
      new long[] { 0x0000000000000050L });
  public static final BitSet FOLLOW_mexpr_in_expr72 = new BitSet(
      new long[] { 0x0000000000000602L });
  public static final BitSet FOLLOW_atom_in_mexpr97 = new BitSet(
      new long[] { 0x0000000000000102L });
  public static final BitSet FOLLOW_8_in_mexpr100 = new BitSet(
      new long[] { 0x0000000000000050L });
  public static final BitSet FOLLOW_atom_in_mexpr103 = new BitSet(
      new long[] { 0x0000000000000102L });
  public static final BitSet FOLLOW_INT_in_atom127 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_6_in_atom132 = new BitSet(
      new long[] { 0x0000000000000050L });
  public static final BitSet FOLLOW_expr_in_atom135 = new BitSet(
      new long[] { 0x0000000000000080L });
  public static final BitSet FOLLOW_7_in_atom137 = new BitSet(
      new long[] { 0x0000000000000002L });
}
