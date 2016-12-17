import sjc.annotation.NonNullElements;
import sjc.util.Util;

/**
 * The StaticJava Library.
 * 
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class StaticJavaLib {
  /**
   * Asserts a given value to be true.
   * 
   * @param b
   *          The boolean value to assert.
   */
  public static void assertTrue(final boolean b) {
    assert b;
  }

  /**
   * Returns the boolean value of a string from a string array
   * 
   * @param args
   *          The string array. Must be non-null.
   * @param i
   *          The index of the string in the string array. The value of i must
   *          be equal or greater than 0, and less than the length of the string
   *          array.
   * @return The boolean value of args[i]
   */
  public static boolean getBooleanArgument(
      @NonNullElements final String[] args, final int i) {
    assert Util.checkNonNullElements(args) && (i >= 0) && (i < args.length);
    return Boolean.valueOf(args[i]);
  }

  /**
   * Returns the int value of a string from a string array
   * 
   * @param args
   *          The string array.
   * @param i
   *          The index of the string in the string array. The value of i must
   *          be equal or greater than 0, and less than the length of the string
   *          array.
   * @return The int value of args[i]
   */
  public static int getIntArgument(@NonNullElements final String[] args,
      final int i) {
    assert Util.checkNonNullElements(args) && (i >= 0) && (i < args.length);
    return Integer.parseInt(args[i]);
  }

  /**
   * Prints a boolean value to the standard console output.
   * 
   * @param b
   *          The boolean value to print.
   */
  public static void print(final boolean b) {
    System.out.print(b);
    System.out.flush();
  }

  /**
   * Prints an int value to the standard console output.
   * 
   * @param i
   *          The integer to print.
   */
  public static void print(final int i) {
    System.out.print(i);
    System.out.flush();
  }

  /**
   * Prints a new line to the standard console output.
   */
  public static void println() {
    System.out.println();
    System.out.flush();
  }

  /**
   * Prints a boolean value and a new line to the standard console output.
   * 
   * @param b
   *          The boolean value to print.
   */
  public static void println(final boolean b) {
    System.out.println(b);
    System.out.flush();
  }

  /**
   * Prints an int value and a new line to the standard console output.
   * 
   * @param i
   *          The integer to print.
   */
  public static void println(final int i) {
    System.out.println(i);
    System.out.flush();
  }
}
