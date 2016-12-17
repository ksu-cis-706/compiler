package ast;

public class BinaryExp extends Exp {
  public final Exp e1;
  public final BinaryOp op;
  public final Exp e2;

  BinaryExp(final Exp e1, final BinaryOp op, final Exp e2) {
    this.e1 = e1;
    this.op = op;
    this.e2 = e2;
  }

  @Override
  protected <T> T accept(final ExpVisitor<T> ev) {
    return ev.visitBinaryExp(this);
  }

  @Override
  public String toString() {
    String opText = "?";
    switch (this.op) {
      case ADD:
        opText = "ADD";
        break;
      case SUB:
        opText = "SUB";
        break;
      case MUL:
        opText = "MUL";
        break;
      case DIV:
        opText = "DIV";
        break;
      case REM:
        opText = "REM";
        break;
    }
    return "bin(" + this.e1 + ", " + opText + ", " + this.e2 + ")";
  }
}
