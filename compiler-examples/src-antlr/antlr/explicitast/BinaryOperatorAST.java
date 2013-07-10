package antlr.explicitast;

public abstract class BinaryOperatorAST extends ExprAST {
  ExprAST left;
  ExprAST right;
  char operator;

  BinaryOperatorAST(final ExprAST l, final ExprAST r, final char op) {
    this.left = l;
    this.right = r;
    this.operator = op;
  }

  public ExprAST left() {
    return this.left;
  }

  public ExprAST right() {
    return this.right;
  }
}
