package antlrv4.example1;

import antlrv4.example1.ExpParser.BinaryExpContext;
import antlrv4.example1.ExpParser.IntLiteralContext;
import antlrv4.example1.ExpParser.ParenExpContext;

public class ExpPrettyPrinter extends ExpBaseVisitor<String> {
  public static String print(final String exp) throws Exception {
    return new ExpPrettyPrinter().visit(ExpParseUtil.parse(exp));
  }

  private ExpPrettyPrinter() {
  }

  @Override
  public String visitBinaryExp(final BinaryExpContext ctx) {
    final String v1 = visit(ctx.e1);
    final String v2 = visit(ctx.e2);
    final String op = ctx.op.getText();
    return v1 + " " + op + " " + v2;
  }

  @Override
  public String visitIntLiteral(final IntLiteralContext ctx) {
    return ctx.INT().getText();
  }

  @Override
  public String visitParenExp(final ParenExpContext ctx) {
    return "(" + visit(ctx.exp()) + ")";
  }
}
