package antlrv3.ast;

import org.antlr.runtime.Token;

public class BinaryOperatorNode extends ExprASTTree {

  public BinaryOperatorNode(final Token op2) {
    super(op2);
  }

  public ExprASTTree left() {
    assert getChildCount() == 2;
    return (ExprASTTree) getChild(0);
  }

  public ExprASTTree right() {
    assert getChildCount() == 2;
    return (ExprASTTree) getChild(1);
  }

}
