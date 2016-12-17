package sjc.type;

import java.util.HashMap;
import java.util.Map;

import sjc.annotation.NonNullElements;
import sjc.annotation.ReadOnly;

/**
 * This class represents a class type in StaticJava.
 * 
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class ClassType extends BaseType
    implements NonPrimitiveType {
  /**
   * Holds a map of field names to their {@link Type}.
   */
  public final @NonNullElements
  @ReadOnly
  Map<String, Type> fieldTypeMap = new HashMap<>();

  /**
   * Constructs a class type with the given fully-qualified name.
   * 
   * @param name
   *          The fully qualified name of this class type.
   */
  protected ClassType(final String name) {
    super(name);
  }
}
