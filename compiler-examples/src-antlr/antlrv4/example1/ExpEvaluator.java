package antlrv4.example1;

import java.math.BigInteger;

import antlrv4.example1.ExpParser.BinaryExpContext;
import antlrv4.example1.ExpParser.IntLiteralContext;
import antlrv4.example1.ExpParser.ParenExpContext;

public class ExpEvaluator extends ExpBaseVisitor<BigInteger> {
  public static BigInteger eval(final String exp) throws Exception {
    return new ExpEvaluator().visit(ExpParseUtil.parse(exp));
  }

  private ExpEvaluator() {
  }

  @Override
  public BigInteger visitBinaryExp(final BinaryExpContext ctx) {
    final BigInteger v1 = visit(ctx.e1);
    final BigInteger v2 = visit(ctx.e2);
    final String op = ctx.op.getText();
    switch (op) {
      case "+":
        return v1.add(v2);
      case "-":
        return v1.subtract(v2);
      case "*":
        return v1.multiply(v2);
      case "/":
        return v1.divide(v2);
      case "%":
        return v1.remainder(v2);
    }
    throw new RuntimeException("Unhandled operator: " + op);
  }

  @Override
  public BigInteger visitIntLiteral(final IntLiteralContext ctx) {
    return new BigInteger(ctx.INT().getText());
  }

  @Override
  public BigInteger visitParenExp(final ParenExpContext ctx) {
    return visit(ctx.exp());
  }
}
