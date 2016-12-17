package sjc.type;

import java.util.HashMap;
import java.util.Map;

import sjc.annotation.NonNull;
import sjc.annotation.NonNullElements;
import sjc.annotation.ReadOnly;

/**
 * This class is used to build {@link Type}s in StaticJava.
 * 
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class TypeFactory {
  /**
   * Holds the {@link BooleanType} of this type factory.
   */
  public final @NonNull
  @ReadOnly
  BooleanType Boolean = new BooleanType();

  /**
   * Holds the {@link IntType} of this type factory.
   */
  public final @NonNull
  @ReadOnly
  IntType Int = new IntType();

  /**
   * Holds the {@link VoidType} of this type factory.
   */
  public final @NonNull
  @ReadOnly
  VoidType Void = new VoidType();

  /**
   * Holds the {@link NullType} of this type factory.
   */
  public final @NonNull
  @ReadOnly
  NullType Null = new NullType();

  /**
   * Holds the type cache of this type factory. It maps the type's name to its
   * {@link Type} instance.
   */
  public final @NonNullElements
  @ReadOnly
  Map<String, Type> typeMap = new HashMap<>();

  /**
   * Constructs a type factory. The type factory cache is filled with the
   * {@link BooleanType}, {@link IntType}, and {@link VoidType}.
   */
  public TypeFactory() {
    this.typeMap.put(this.Boolean.name, this.Boolean);
    this.typeMap.put(this.Int.name, this.Int);
    this.typeMap.put(this.Void.name, this.Void);
  }

  /**
   * Returns a one-dimensional {@link ArrayType} with the given {@link BaseType}
   * .
   * 
   * @param bt
   *          The {@link BaseType} of the {@link ArrayType}.
   * @return The one-dimensional {@link ArrayType} with the given
   *         {@link BaseType}.
   */
  public @NonNull
  ArrayType getArrayType(@NonNull final BaseType bt) {
    assert bt != null;
    final String name = bt.name + "[]";
    Type result = this.typeMap.computeIfAbsent(name, k -> new ArrayType(bt));
    assert result instanceof ArrayType;
    return (ArrayType) result;
  }

  /**
   * Returns a {@link ClassType} with the given fully-qualified name.
   * 
   * @param name
   *          The fully-qualified name of the {@link ClassType}. It must not
   *          equal to "boolean", "int", or "void".
   * @return The {@link ClassType} that corresponds to the given fully-qualified
   *         name.
   */
  public @NonNull
  ClassType getClassType(@NonNull final String name) {
    assert (name != null) && !this.Boolean.name.equals(name)
        && !this.Int.name.equals(name) && !this.Void.name.equals(name);
    Type result = this.typeMap.computeIfAbsent(name, k -> new ClassType(name));
    assert result instanceof ClassType;
    return (ClassType) result;
  }
}
