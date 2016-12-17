package ast;

import static ast.ExpFactory.bin;
import static ast.ExpFactory.id;
import static ast.ExpFactory.lit;
import antlrv4.example2.Exp2BaseVisitor;
import antlrv4.example2.Exp2ParseUtil;
import antlrv4.example2.Exp2Parser.BinaryExpContext;
import antlrv4.example2.Exp2Parser.IdExpContext;
import antlrv4.example2.Exp2Parser.IntLiteralContext;
import antlrv4.example2.Exp2Parser.ParenExpContext;

public class AstBuilder extends Exp2BaseVisitor<Exp> {
  public static Exp ast(final String exp) throws Exception {
    return new AstBuilder().visit(Exp2ParseUtil.parse(exp));
  }

  private AstBuilder() {
  }

  @Override
  public Exp visitBinaryExp(final BinaryExpContext ctx) {
    BinaryOp op;
    final String opText = ctx.op.getText();
    switch (opText) {
      case "+":
        op = BinaryOp.ADD;
        break;
      case "-":
        op = BinaryOp.SUB;
        break;
      case "*":
        op = BinaryOp.MUL;
        break;
      case "/":
        op = BinaryOp.DIV;
        break;
      case "%":
        op = BinaryOp.MUL;
        break;
      default:
        throw new RuntimeException("Unhandled binary op: " + opText);
    }
    return bin(visit(ctx.e1), op, visit(ctx.e2));
  }

  @Override
  public Exp visitIdExp(final IdExpContext ctx) {
    return id(ctx.ID().getText());
  }

  @Override
  public Exp visitIntLiteral(final IntLiteralContext ctx) {
    return lit(ctx.INT().getText());
  }

  @Override
  public Exp visitParenExp(final ParenExpContext ctx) {
    return visit(ctx.exp());
  }
}
