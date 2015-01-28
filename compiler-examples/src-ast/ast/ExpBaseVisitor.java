package ast;

public class ExpBaseVisitor<T>
implements ExpVisitor<T> {

  protected T visit(final Exp e) {
    return e.accept(this);
  }

  @Override
  public T visitBinaryExp(final BinaryExp e) {
    visit(e.e1);
    visit(e.e2);
    return null;
  }

  @Override
  public T visitIdExp(final IdExp e) {
    return null;
  }

  @Override
  public T visitIntLiteral(final IntLiteral e) {
    return null;
  }
}
