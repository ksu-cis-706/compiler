package ast;

import java.math.BigInteger;

public class IntLiteral extends Exp {
  public final BigInteger value;

  IntLiteral(final BigInteger v) {
    this.value = v;
  }

  @Override
  protected <T> T accept(final ExpVisitor<T> ev) {
    return ev.visitIntLiteral(this);
  }

  @Override
  public String toString() {
    return "lit(" + this.value.toString() + ")";
  }
}
