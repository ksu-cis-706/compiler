package sjc.type.checker;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;

import sjc.annotation.NonNull;
import sjc.annotation.NonNullElements;
import sjc.annotation.ReadOnlyElements;
import sjc.type.Type;
import sjc.util.Pair;
import sjc.util.Util;

/**
 * This class is used to hold the result of the {@link TypeChecker} (when the
 * type checking is successful).
 * 
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class TypeTable {
  /**
   * Holds mappings of
   * <ul>
   * <li>{@link Expression} to its {@link Type},</li>
   * <li>{@link VariableDeclarationStatement} to its {@link Type},</li>
   * <li>{@link SingleVariableDeclaration} to its {@link Type},</li>
   * <li>{@link org.eclipse.jdt.core.dom.FieldDeclaration} to its {@link Type},
   * and</li>
   * <li>{@link org.eclipse.jdt.core.dom.TypeDeclaration} to its {@link Type}.</li>
   * </ul>
   */
  public final @NonNullElements
  @ReadOnlyElements
  Map<ASTNode, Type> typeMap;

  /**
   * Holds the mappings of {@link MethodDeclaration} or
   * {@link java.lang.reflect.Method} to its return {@link Type} and its
   * parameter {@link Type}s.
   */
  public final @NonNullElements
  @ReadOnlyElements
  Map<Object, Pair<Type, List<Type>>> methodTypeMap;

  /**
   * Constructs a type table with the given {@link ASTNode} to its {@link Type}
   * map.
   * 
   * @param typeMap
   *          The mapping of {@link ASTNode} to its {@link Type} map of this
   *          type table.
   * @param methodTypeMap
   *          The mapping of {@link MethodDeclaration} to its return type and
   *          its parameter types.
   */
  protected TypeTable(@NonNullElements final Map<ASTNode, Type> typeMap,
      @NonNullElements final Map<Object, Pair<Type, List<Type>>> methodTypeMap) {
    assert Util.checkNonNullElements(typeMap)
        && Util.checkNonNullElements(methodTypeMap);
    this.typeMap = typeMap;
    this.methodTypeMap = methodTypeMap;
  }

  /**
   * Returns the {@link String} representation of this type table.
   * 
   * @return The String representation of this type table.
   */
  @Override
  public @NonNull
  String toString() {
    final String lineSep = System.getProperty("line.separator");
    final StringBuilder sb = new StringBuilder();
    final TreeSet<String> set = new TreeSet<>();
    for (final ASTNode n : this.typeMap.keySet()) {
      set.add("\"" + Util.getFirstLine(n) + "\" in \""
          + Util.getFirstLine(n.getParent()) + "\": "
          + Util.getFirstLine(this.typeMap.get(n)));
    }
    for (final String s : set) {
      sb.append(s);
      sb.append(lineSep);
    }
    return sb.toString();
  }
}
