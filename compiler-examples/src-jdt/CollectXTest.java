import org.eclipse.jdt.core.dom.CompilationUnit;
import org.junit.Assert;
import org.junit.Test;

import sjc.parser.ParserUtil;

/**
 * Test cases for {@link CollectInt}.
 */
public class CollectXTest {
  public static void testPass(final String filename) {
    try {
      final CompilationUnit cu = ParserUtil.ast(filename);
      System.out.print("Integer Literals:");
      System.out.println(CollectInt.collect(cu));
      System.out.flush();
      System.out.print("Simple Names:");
      System.out.println(CollectName.collect(cu));
      System.out.flush();
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(e.getMessage(), false);
    }
  }

  @Test
  public void testFactorial() {
    CollectXTest.testPass("src-sjc/Factorial.java");
  }

  @Test
  public void testPower() {
    CollectXTest.testPass("src-sjc/Power.java");
  }

}
