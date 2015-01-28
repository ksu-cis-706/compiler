package ast;

import java.math.BigInteger;

public class ExpFactory {
  public static BinaryExp bin(final Exp e1, final BinaryOp op, final Exp e2) {
    return new BinaryExp(e1, op, e2);
  }

  public static IdExp id(final String id) {
    return new IdExp(id);
  }

  public static IntLiteral lit(final BigInteger v) {
    return new IntLiteral(v);
  }

  public static IntLiteral lit(final long v) {
    return lit(Long.toString(v));
  }

  public static IntLiteral lit(final String s) {
    return lit(new BigInteger(s));
  }
}
