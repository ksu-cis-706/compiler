package ast;

public abstract class Exp {
  protected abstract <T> T accept(ExpVisitor<T> ev);
}
