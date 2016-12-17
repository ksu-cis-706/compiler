package jdt;

import java.util.ArrayList;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.NumberLiteral;

import sjc.annotation.NonNull;

public class CollectInt {
  /**
   * The visitor for {@link ASTNode} to collect Integer Literals.
   */
  protected static class Visitor extends ASTVisitor {
    public @NonNull
    ArrayList<Integer> result = new ArrayList<>();

    @Override
    public boolean visit(final NumberLiteral node) {
      this.result.add(Integer.parseInt(node.getToken()));
      return false;
    }

  }

  public static @NonNull
  ArrayList<Integer> collect(@NonNull final CompilationUnit cu) {
    assert cu != null;
    final Visitor v = new Visitor();
    final ArrayList<Integer> r = v.result;
    cu.accept(v);
    return r;
  }

  /**
   * Declared as protected to disallow creation of this object outside from the
   * methods of this class.
   */
  protected CollectInt() {
  }
}
