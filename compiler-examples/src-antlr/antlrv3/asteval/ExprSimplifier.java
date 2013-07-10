// $ANTLR 3.5 /compiler-examples/src-antlr/antlrv3/asteval/ExprSimplifier.g 2013-07-08 18:01:48

package antlrv3.asteval;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.runtime.tree.TreeParser;
import org.antlr.runtime.tree.TreeRuleReturnScope;

@SuppressWarnings("all")
public class ExprSimplifier extends TreeParser {
  public static class expr_return extends TreeRuleReturnScope {
    public int value;
    CommonTree tree;

    @Override
    public CommonTree getTree() {
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
  public static final int T__10 = 10;
  public static final int INT = 4;

  public static final int WS = 5;

  // delegators

  protected TreeAdaptor adaptor = new CommonTreeAdaptor();
  public static final BitSet FOLLOW_9_in_expr52 = new BitSet(
      new long[] { 0x0000000000000004L });

  public static final BitSet FOLLOW_expr_in_expr56 = new BitSet(
      new long[] { 0x0000000000000710L });

  public static final BitSet FOLLOW_expr_in_expr60 = new BitSet(
      new long[] { 0x0000000000000008L });
  public static final BitSet FOLLOW_10_in_expr70 = new BitSet(
      new long[] { 0x0000000000000004L });
  public static final BitSet FOLLOW_expr_in_expr74 = new BitSet(
      new long[] { 0x0000000000000710L });
  public static final BitSet FOLLOW_expr_in_expr78 = new BitSet(
      new long[] { 0x0000000000000008L });

  public static final BitSet FOLLOW_8_in_expr88 = new BitSet(
      new long[] { 0x0000000000000004L });;

  public static final BitSet FOLLOW_expr_in_expr92 = new BitSet(
      new long[] { 0x0000000000000710L });

  // Delegated rules

  public static final BitSet FOLLOW_expr_in_expr96 = new BitSet(
      new long[] { 0x0000000000000008L });
  public static final BitSet FOLLOW_INT_in_expr105 = new BitSet(
      new long[] { 0x0000000000000002L });

  public ExprSimplifier(final TreeNodeStream input) {
    this(input, new RecognizerSharedState());
  }

  public ExprSimplifier(final TreeNodeStream input,
      final RecognizerSharedState state) {
    super(input, state);
  }

  // $ANTLR start "expr"
  // /compiler-examples/src-antlr/antlrv3/asteval/ExprSimplifier.g:37:1: expr returns [int value] : ( ^( '+' l= expr r= expr ) | ^( '-' l= expr r= expr ) | ^( '*' l= expr r= expr ) | INT );
  public final ExprSimplifier.expr_return expr() throws RecognitionException {
    final ExprSimplifier.expr_return retval = new ExprSimplifier.expr_return();
    retval.start = this.input.LT(1);

    CommonTree root_0 = null;

    CommonTree _last = null;

    CommonTree char_literal1 = null;
    CommonTree char_literal2 = null;
    CommonTree char_literal3 = null;
    CommonTree INT4 = null;
    TreeRuleReturnScope l = null;
    TreeRuleReturnScope r = null;

    CommonTree char_literal1_tree = null;
    CommonTree char_literal2_tree = null;
    CommonTree char_literal3_tree = null;
    CommonTree INT4_tree = null;

    try {
      // /compiler-examples/src-antlr/antlrv3/asteval/ExprSimplifier.g:38:2: ( ^( '+' l= expr r= expr ) | ^( '-' l= expr r= expr ) | ^( '*' l= expr r= expr ) | INT )
      int alt1 = 4;
      switch (this.input.LA(1)) {
        case 9: {
          alt1 = 1;
        }
          break;
        case 10: {
          alt1 = 2;
        }
          break;
        case 8: {
          alt1 = 3;
        }
          break;
        case INT: {
          alt1 = 4;
        }
          break;
        default:
          final NoViableAltException nvae = new NoViableAltException("", 1, 0,
              this.input);
          throw nvae;
      }
      switch (alt1) {
        case 1:
        // /compiler-examples/src-antlr/antlrv3/asteval/ExprSimplifier.g:38:4: ^( '+' l= expr r= expr )
        {
          root_0 = (CommonTree) this.adaptor.nil();

          _last = (CommonTree) this.input.LT(1);
          {
            final CommonTree _save_last_1 = _last;
            CommonTree root_1 = (CommonTree) this.adaptor.nil();
            _last = (CommonTree) this.input.LT(1);
            char_literal1 = (CommonTree) match(
                this.input,
                9,
                ExprSimplifier.FOLLOW_9_in_expr52);
            char_literal1_tree = (CommonTree) this.adaptor
                .dupNode(char_literal1);

            root_1 = (CommonTree) this.adaptor.becomeRoot(
                char_literal1_tree,
                root_1);

            match(this.input, Token.DOWN, null);
            _last = (CommonTree) this.input.LT(1);
            pushFollow(ExprSimplifier.FOLLOW_expr_in_expr56);
            l = expr();
            this.state._fsp--;

            this.adaptor.addChild(root_1, l.getTree());

            _last = (CommonTree) this.input.LT(1);
            pushFollow(ExprSimplifier.FOLLOW_expr_in_expr60);
            r = expr();
            this.state._fsp--;

            this.adaptor.addChild(root_1, r.getTree());

            match(this.input, Token.UP, null);
            this.adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
          }

          retval.value = (l != null ? ((ExprSimplifier.expr_return) l).value
              : 0) + (r != null ? ((ExprSimplifier.expr_return) r).value : 0);
        }
          break;
        case 2:
        // /compiler-examples/src-antlr/antlrv3/asteval/ExprSimplifier.g:39:4: ^( '-' l= expr r= expr )
        {
          root_0 = (CommonTree) this.adaptor.nil();

          _last = (CommonTree) this.input.LT(1);
          {
            final CommonTree _save_last_1 = _last;
            CommonTree root_1 = (CommonTree) this.adaptor.nil();
            _last = (CommonTree) this.input.LT(1);
            char_literal2 = (CommonTree) match(
                this.input,
                10,
                ExprSimplifier.FOLLOW_10_in_expr70);
            char_literal2_tree = (CommonTree) this.adaptor
                .dupNode(char_literal2);

            root_1 = (CommonTree) this.adaptor.becomeRoot(
                char_literal2_tree,
                root_1);

            match(this.input, Token.DOWN, null);
            _last = (CommonTree) this.input.LT(1);
            pushFollow(ExprSimplifier.FOLLOW_expr_in_expr74);
            l = expr();
            this.state._fsp--;

            this.adaptor.addChild(root_1, l.getTree());

            _last = (CommonTree) this.input.LT(1);
            pushFollow(ExprSimplifier.FOLLOW_expr_in_expr78);
            r = expr();
            this.state._fsp--;

            this.adaptor.addChild(root_1, r.getTree());

            match(this.input, Token.UP, null);
            this.adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
          }

          retval.value = (l != null ? ((ExprSimplifier.expr_return) l).value
              : 0) - (r != null ? ((ExprSimplifier.expr_return) r).value : 0);
        }
          break;
        case 3:
        // /compiler-examples/src-antlr/antlrv3/asteval/ExprSimplifier.g:40:4: ^( '*' l= expr r= expr )
        {
          root_0 = (CommonTree) this.adaptor.nil();

          _last = (CommonTree) this.input.LT(1);
          {
            final CommonTree _save_last_1 = _last;
            CommonTree root_1 = (CommonTree) this.adaptor.nil();
            _last = (CommonTree) this.input.LT(1);
            char_literal3 = (CommonTree) match(
                this.input,
                8,
                ExprSimplifier.FOLLOW_8_in_expr88);
            char_literal3_tree = (CommonTree) this.adaptor
                .dupNode(char_literal3);

            root_1 = (CommonTree) this.adaptor.becomeRoot(
                char_literal3_tree,
                root_1);

            match(this.input, Token.DOWN, null);
            _last = (CommonTree) this.input.LT(1);
            pushFollow(ExprSimplifier.FOLLOW_expr_in_expr92);
            l = expr();
            this.state._fsp--;

            this.adaptor.addChild(root_1, l.getTree());

            _last = (CommonTree) this.input.LT(1);
            pushFollow(ExprSimplifier.FOLLOW_expr_in_expr96);
            r = expr();
            this.state._fsp--;

            this.adaptor.addChild(root_1, r.getTree());

            match(this.input, Token.UP, null);
            this.adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
          }

          retval.value = (l != null ? ((ExprSimplifier.expr_return) l).value
              : 0) * (r != null ? ((ExprSimplifier.expr_return) r).value : 0);
        }
          break;
        case 4:
        // /compiler-examples/src-antlr/antlrv3/asteval/ExprSimplifier.g:41:4: INT
        {
          root_0 = (CommonTree) this.adaptor.nil();

          _last = (CommonTree) this.input.LT(1);
          INT4 = (CommonTree) match(
              this.input,
              ExprSimplifier.INT,
              ExprSimplifier.FOLLOW_INT_in_expr105);
          INT4_tree = (CommonTree) this.adaptor.dupNode(INT4);

          this.adaptor.addChild(root_0, INT4_tree);

          retval.value = Integer.parseInt(INT4.getText());
        }
          break;

      }
      retval.tree = (CommonTree) this.adaptor.rulePostProcessing(root_0);

    } catch (final RecognitionException re) {
      reportError(re);
      recover(this.input, re);
    } finally {
      // do for sure before leaving
    }
    return retval;
  }

  // $ANTLR end "expr"
  // delegates
  public TreeParser[] getDelegates() {
    return new TreeParser[] {};
  }

  @Override
  public String getGrammarFileName() {
    return "/compiler-examples/src-antlr/antlrv3/asteval/ExprSimplifier.g";
  }

  @Override
  public String[] getTokenNames() {
    return ExprSimplifier.tokenNames;
  }

  public TreeAdaptor getTreeAdaptor() {
    return this.adaptor;
  }

  public void setTreeAdaptor(final TreeAdaptor adaptor) {
    this.adaptor = adaptor;
  }
}
