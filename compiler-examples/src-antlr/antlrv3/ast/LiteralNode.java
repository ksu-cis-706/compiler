package antlrv3.ast;

import org.antlr.runtime.Token;

public class LiteralNode extends ExprASTTree {

  int v = 0;

  LiteralNode(final Token tok) {
    super(tok);
    this.v = Integer.parseInt(tok.getText());
  }

  @Override
  public int value() {
    return Integer.parseInt(getToken().getText());
  }

}
