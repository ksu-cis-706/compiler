package ast;

public class IdExp extends Exp {
  public final String id;

  IdExp(final String id) {
    this.id = id;
  }

  @Override
  protected <T> T accept(final ExpVisitor<T> ev) {
    return ev.visitIdExp(this);
  }

  @Override
  public String toString() {
    return "id(\"" + this.id + "\")";
  }
}
