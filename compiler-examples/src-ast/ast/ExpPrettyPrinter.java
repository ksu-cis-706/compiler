package ast;

public class ExpPrettyPrinter extends ExpBaseVisitor<String> {

  public static String print(final Exp e) {
    return new ExpPrettyPrinter().visit(e);
  }

  private int parenPrecendenceLevel = 1; // lower number is higher precedence

  private ExpPrettyPrinter() {
  }

  private int precedenceLevel(final BinaryOp op) {
    switch (op) {
      case ADD:
      case SUB:
        return 1;
      default:
        return 0;
    }
  }

  @Override
  public String visitBinaryExp(final BinaryExp e) {
    final int pppl = this.parenPrecendenceLevel;
    this.parenPrecendenceLevel = precedenceLevel(e.op);
    String result = visit(e.e1) + " " + e.op + " " + visit(e.e2);
    if (pppl < this.parenPrecendenceLevel) {
      result = "(" + result + ")";
    }
    this.parenPrecendenceLevel = pppl;
    return result;
  }

  @Override
  public String visitIdExp(final IdExp e) {
    return e.id;
  }

  @Override
  public String visitIntLiteral(final IntLiteral e) {
    return e.value.toString();
  }
}
