package ast;

import static ast.ExpFactory.bin;
import static ast.ExpFactory.lit;

import java.math.BigInteger;

public class ExpSimplifier extends ExpBaseVisitor<Exp> {
  private static class DivZeroException extends RuntimeException {
    private static final long serialVersionUID = -7680272942576776648L;

    final BinaryOp op;

    DivZeroException(final BinaryOp op) {
      this.op = op;
    }
  }

  public static Exp simplify(final Exp e) {
    try {
      return new ExpSimplifier().visit(e);
    } catch (final DivZeroException ex) {
      return bin(lit(ExpSimplifier.ZERO), ex.op, lit(ExpSimplifier.ZERO));
    }
  }

  private static final BigInteger ZERO = new BigInteger("0");

  private ExpSimplifier() {
  }

  @Override
  public Exp visitBinaryExp(final BinaryExp e) {
    final Exp e1 = visit(e.e1);
    final Exp e2 = visit(e.e2);
    if ((e1 instanceof IntLiteral) && (e2 instanceof IntLiteral)) {
      final BigInteger v1 = ((IntLiteral) e1).value;
      final BigInteger v2 = ((IntLiteral) e2).value;
      switch (e.op) {
        case ADD:
          return lit(v1.add(v2));
        case SUB:
          return lit(v1.subtract(v2));
        case MUL:
          return lit(v1.multiply(v2));
        case DIV:
          if (ExpSimplifier.ZERO.equals(v2)) {
            throw new DivZeroException(BinaryOp.DIV);
          } else {
            return lit(v1.divide(v2));
          }
        case REM:
          if (ExpSimplifier.ZERO.equals(v2)) {
            throw new DivZeroException(BinaryOp.REM);
          } else {
            return lit(v1.remainder(v2));
          }
        default:
          return e;
      }
    } else if ((e1 != e.e1) || (e2 != e.e2)) {
      return bin(e1, e.op, e2);
    } else {
      return e;
    }
  }

  @Override
  public Exp visitIdExp(final IdExp e) {
    return e;
  }

  @Override
  public Exp visitIntLiteral(final IntLiteral e) {
    return e;
  }
}
