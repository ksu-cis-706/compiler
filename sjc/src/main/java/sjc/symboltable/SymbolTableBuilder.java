package sjc.symboltable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;

import sjc.annotation.NonNull;
import sjc.annotation.ReadOnly;

/**
 * This class is used to build symbol table for a StaticJava
 * {@link CompilationUnit}. Note that the algorithm assumes that the JDT AST
 * tree was built using the {@link sjc.parser.StaticJavaASTParser} or
 * {@link sjc.parser.StaticJavaASTAltParser}. That is, it assumes certain
 * structures on the AST, e.g., a class does not have an instance method.
 * 
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class SymbolTableBuilder {
  /**
   * This class is used to signal an error in the process of building a symbol
   * table. It contains the {@link ASTNode} that causes the error.
   * 
   * @author <a href="mailto:robby@ksu.edu">Robby</a>
   */
  public static class Error extends RuntimeException {
    private static final long serialVersionUID = 7425398360365890486L;

    /**
     * Holds the {@link ASTNode} that causes this error.
     */
    public final @NonNull
    @ReadOnly
    ASTNode node;

    /**
     * Constructs an error from a symbol table.
     * 
     * @param node
     *          The {@link ASTNode} that causes this error.
     * @param msg
     *          The message that indicates the cause of this error.
     */
    public Error(@NonNull final ASTNode node, @NonNull final String msg) {
      super(msg);
      assert (msg != null) && (node != null);
      this.node = node;
    }
  }

  /**
   * The visitor for {@link ASTNode} to resolve symbols.
   * 
   * @author <a href="mailto:robby@ksu.edu">Robby</a>
   */
  protected static class Visitor extends ASTVisitor {
    public @NonNull
    Map<ASTNode, Object> result = new HashMap<>();

    /**
     * Holds the map of:
     * <ul>
     * <li>a field's simple name to its {@link FieldDeclaration},</li>
     * <li>a method parameter's simple name to its
     * {@link SingleVariableDeclaration}, and</li>
     * <li>a local variable's simple name to its
     * {@link VariableDeclarationStatement}</li>
     * </ul>
     */
    protected @NonNull
    Map<String, ASTNode> nameMap = new HashMap<>();

    /**
     * Holds the map of a method's simple name to its {@link MethodDeclaration}.
     */
    protected @NonNull
    Map<String, MethodDeclaration> methodMap = new HashMap<>();

    /**
     * Holds the local variable names for a method.
     */
    protected @NonNull
    Set<String> localNames = new HashSet<>();

    protected String className;

    /**
     * Unlink references and clear maps/collections.
     */
    protected void dispose() {
      this.result = null;
      if (this.nameMap != null) {
        this.nameMap.clear();
        this.nameMap = null;
      }
      if (this.methodMap != null) {
        this.methodMap.clear();
        this.methodMap = null;
      }
      this.className = null;
    }

    @Override
    public boolean visit(final FieldDeclaration node) {
      final VariableDeclarationFragment vdf = (VariableDeclarationFragment) node
          .fragments().get(0);
      final String name = vdf.getName().getIdentifier();
      if (this.nameMap.containsKey(name)) {
        throw new Error(node, "Error in field declaration '" + name
            + "' : the field name has been used in:\n" + this.nameMap.get(name));
      }
      this.nameMap.put(name, node);
      return false;
    }

    @Override
    public boolean visit(final MethodDeclaration node) {
      for (final Object o : node.parameters()) {
        final SingleVariableDeclaration svd = (SingleVariableDeclaration) o;
        final String name = svd.getName().getIdentifier();
        if (this.nameMap.containsKey(name)) {
          throw new Error(node, "Error in method parameter declaration of '"
              + node.getName().getIdentifier() + "' : variable name '" + name
              + "' has been used in:\n" + this.nameMap.get(name));
        }

        this.localNames.add(name);
        this.nameMap.put(name, svd);
      }
      node.getBody().accept(this);

      for (final String name : this.localNames) {
        this.nameMap.remove(name);
      }
      this.localNames.clear();
      return false;
    }

    @Override
    public boolean visit(final MethodInvocation node) {
      // Note that we don't visit the MethodInvocation's simple name
      // because we want visit(SimpleName) to resolve variable references
      // instead of method names.
      final String methodName = node.getName().getIdentifier();

      if ((node.getExpression() == null)
          || this.className.equals(node.getExpression().toString())) {
        if (this.methodMap.containsKey(methodName)) {
          this.result.put(node, this.methodMap.get(methodName));
        } else {
          throw new Error(node, "Cannot resolve method '" + methodName
              + "' in\n:" + node);
        }
      } else {
        // lib call, delay until type checking phase
      }
      for (final Object e : node.arguments()) {
        ((Expression) e).accept(this);
      }
      return false;
    }

    @Override
    public boolean visit(final SimpleName node) {
      final String varName = node.getIdentifier();
      final ASTNode parent = node.getParent();

      // Note that we have to make sure that at this point, the node
      // only corresponds to a variable reference
      if ((parent instanceof Expression) || (parent instanceof Statement)) {
        if (this.nameMap.containsKey(varName)) {
          this.result.put(node, this.nameMap.get(varName));
        } else {
          throw new Error(node, "Cannot resolve symbol '" + varName + "' in:\n"
              + parent);
        }
      }
      return false;
    }

    @Override
    public boolean visit(final TypeDeclaration node) {
      // remembers the class name
      this.className = node.getName().getIdentifier();

      if ("java.lang.String".equals(this.className)) {
        throw new Error(node, "Cannot redeclare the String class");
      }

      // visit field declarations and process method names first
      // because we want to be able to resolve field and method names
      // in the method bodies later on
      for (final Object o : node.bodyDeclarations()) {
        if (o instanceof FieldDeclaration) {
          ((ASTNode) o).accept(this);
        } else if (o instanceof MethodDeclaration) {
          final MethodDeclaration md = (MethodDeclaration) o;
          final String methodName = md.getName().getIdentifier();
          if (this.methodMap.containsKey(methodName)) {
            throw new Error(md, "Error in method declaration '" + methodName
                + "' : the method name has been used in:\n"
                + this.methodMap.get(methodName));
          }
          this.methodMap.put(methodName, md);
        } else {
          throw new Error((ASTNode) o,
              "Unexpected TypeDeclaration's member: \'" + node + "\'");
        }
      }

      // visit method declarations
      for (final Object o : node.bodyDeclarations()) {
        if (o instanceof MethodDeclaration) {
          ((ASTNode) o).accept(this);
        }
      }
      return false;
    }

    @Override
    public boolean visit(final VariableDeclarationStatement node) {
      final VariableDeclarationFragment vdf = (VariableDeclarationFragment) node
          .fragments().get(0);
      final String name = vdf.getName().getIdentifier();
      if (this.nameMap.containsKey(name)) {
        throw new Error(node, "Error in local variable declaration '" + name
            + "' : the variable name has been used in:\n"
            + this.nameMap.get(name));
      }
      this.localNames.add(name);
      this.nameMap.put(name, node);
      return false;
    }
  }

  /**
   * Builds a {@link SymbolTable} for the given StaticJava
   * {@link CompilationUnit}.
   * 
   * @param cu
   *          The {@link CompilationUnit}.
   * @return The {@link SymbolTable} for the given {@link CompilationUnit}.
   * @throws SymbolTableBuilder.Error
   *           If the builder encounter unresolvable symbol.
   */
  public static @NonNull
  SymbolTable build(@NonNull final CompilationUnit cu)
      throws SymbolTableBuilder.Error {
    assert cu != null;

    final Visitor v = new Visitor();
    cu.accept(v);
    final Map<ASTNode, Object> result = v.result;
    v.dispose();
    return new SymbolTable(result);
  }

  /**
   * Declared as protected to disallow creation of this object outside from the
   * methods of this class.
   */
  protected SymbolTableBuilder() {
  }
}
