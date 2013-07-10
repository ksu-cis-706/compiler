package sjc.util;

import java.util.Collection;
import java.util.Map;

import sjc.annotation.NonNull;
import sjc.annotation.PossiblyNull;

/**
 * This class contains some utility methods for the StaticJava compiler.
 * 
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class Util {
  /**
   * Checks whether a {@link Collection} is non-null and all its elements are
   * also non-null.
   * 
   * @param c
   *          The {@link Collection}.
   * @return True, if the {@link Collection} is non-null and all its elements
   *         are also non-null.
   */
  public static boolean checkNonNullElements(
      @SuppressWarnings("rawtypes") @PossiblyNull final Collection c) {
    if (c == null) {
      return false;
    }
    for (final Object o : c) {
      if (o == null) {
        return false;
      }
    }
    return true;
  }

  /**
   * Checks whether a {@link Map} is non-null and all its keys and values are
   * also non-null.
   * 
   * @param m
   *          The {@link Map}.
   * @return True, if the {@link Map} is non-null and all its keys and values
   *         are also non-null.
   */
  public static boolean checkNonNullElements(
      @SuppressWarnings("rawtypes") @PossiblyNull final Map m) {
    if (m == null) {
      return false;
    }
    if (!Util.checkNonNullElements(m.keySet())) {
      return false;
    }
    if (!Util.checkNonNullElements(m.values())) {
      return false;
    }
    return true;
  }

  /**
   * Checks whether an array is non-null and all its elements are also non-null.
   * 
   * @param a
   *          The array.
   * @return True, if the array is non-null and all its elements are also
   *         non-null.
   */
  public static boolean checkNonNullElements(@PossiblyNull final Object[] a) {
    if (a == null) {
      return false;
    }
    for (final Object o : a) {
      if (o == null) {
        return false;
      }
    }
    return true;
  }

  /**
   * Returns the first line of an object's {@link String} representation
   * 
   * @param o
   *          The object.
   * @return The first line of the given object's {@link String} representation
   */
  public static @NonNull
  String getFirstLine(@NonNull final Object o) {
    assert o != null;
    final String nText = o.toString();
    final int index = nText.indexOf('\n');
    final String result = index >= 0 ? nText.substring(0, index) : nText;
    return result;
  }
}
