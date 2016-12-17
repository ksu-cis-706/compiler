package sjc.type;

/**
 * This class represents the null type in StaticJava.
 * 
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class NullType extends NonBaseType
    implements NonPrimitiveType {
  /**
   * Constructs a null type.
   */
  protected NullType() {
    super("null");
  }
}
