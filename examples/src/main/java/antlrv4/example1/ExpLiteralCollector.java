package antlrv4.example1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import antlrv4.example1.ExpParser.IntLiteralContext;

public class ExpLiteralCollector extends ExpBaseVisitor<Void> {
  public static List<BigInteger> collect(final String exp) throws Exception {
    final ExpLiteralCollector elc = new ExpLiteralCollector();
    elc.visit(ExpParseUtil.parse(exp));
    return elc.literals;
  }

  private final List<BigInteger> literals = new ArrayList<>();

  private ExpLiteralCollector() {

  }

  @Override
  public Void visitIntLiteral(IntLiteralContext ctx) {
    literals.add(new BigInteger(ctx.INT().getText()));
    return null;
  }
}
