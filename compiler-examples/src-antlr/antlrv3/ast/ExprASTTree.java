package antlrv3.ast;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class ExprASTTree extends org.antlr.runtime.tree.CommonTree {
  public ExprASTTree() {
    super();
  }

  public ExprASTTree(final CommonTree node) {
    super(node);
  }

  public ExprASTTree(final Token t) {
    super(t);
  }

  public int value() {
    return 0;
  }
}
