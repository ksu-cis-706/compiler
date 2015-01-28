package ast;

public interface ExpVisitor<T> {
  T visitBinaryExp(BinaryExp e);

  T visitIdExp(IdExp e);

  T visitIntLiteral(IntLiteral e);
}
