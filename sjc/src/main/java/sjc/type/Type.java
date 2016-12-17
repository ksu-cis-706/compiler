package sjc.type;

import sjc.annotation.NonNull;
import sjc.annotation.PossiblyNull;
import sjc.annotation.ReadOnly;

/**
 * This class represents a type in StaticJava.
 * 
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public abstract class Type {
  /**
   * Holds this type's name.
   */
  public final @NonNull
  @ReadOnly
  String name;

  /**
   * Constructs a type with the given name.
   * 
   * @param name
   *          The name of this type.
   */
  protected Type(@NonNull final String name) {
    assert name != null;
    this.name = name;
  }

  /**
   * Determines whether a given object is equal to this type.
   * 
   * @param o
   *          The other object for comparison.
   * @return True, if the o object is a type with the same name as this type's.
   */
  @Override
  public boolean equals(@PossiblyNull final Object o) {
    return o instanceof Type && toString().equals(o.toString());
  }

  /**
   * Returns the hash code of this type. Type with the same names have the same
   * hash code.
   * 
   * @return The hash code of this type.
   */
  @Override
  public int hashCode() {
    return toString().hashCode();
  }

  /**
   * Returns the {@link String} representation of this type, i.e., its name.
   * 
   * @return The {@link String} representation of this type, i.e., its name.
   */
  @Override
  public @NonNull
  String toString() {
    return this.name;
  }
}
