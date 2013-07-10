package antlr.explicitast;

public class LiteralAST extends ExprAST {
  int v = 0;

  public LiteralAST(final String s) {
    this.v = Integer.parseInt(s);
  }

  @Override
  public String pretty() {
    return "" + this.v;
  }

  @Override
  public String toString() {
    return "" + this.v;
  }

  @Override
  public int value() {
    return this.v;
  }

}
