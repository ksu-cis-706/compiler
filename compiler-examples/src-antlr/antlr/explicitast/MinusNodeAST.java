package antlr.explicitast;

public class MinusNodeAST extends BinaryOperatorAST {

  MinusNodeAST(final ExprAST l, final ExprAST r) {
    super(l, r, '-');
  }

  @Override
  public String pretty() {
    return "(" + left().pretty() + " - " + right().pretty() + ")";
  }

  @Override
  public String toString() {
    return " -";
  }

  @Override
  public int value() {
    return left().value() - right().value();
  }

}
