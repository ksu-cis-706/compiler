package sjc.type;

import sjc.annotation.NonNull;
import sjc.annotation.ReadOnly;

/**
 * This class represents a one-dimensional array type in StaticJava.
 * 
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class ArrayType extends NonBaseType
    implements NonPrimitiveType {
  /**
   * Holds the {@link BaseType} of this array type.
   */
  public final @NonNull
  @ReadOnly
  BaseType baseType;

  /**
   * Constructs a one-dimensional array type with the given {@link BaseType}.
   * 
   * @param baseType
   *          The {@link BaseType} of this type.
   */
  protected ArrayType(@NonNull final BaseType baseType) {
    super(baseType.name + "[]");
    assert baseType != null;
    this.baseType = baseType;
  }
}
