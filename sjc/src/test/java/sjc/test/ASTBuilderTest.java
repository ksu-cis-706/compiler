package sjc.test;

import org.junit.Assert;
import org.junit.Test;

import sjc.SJC;
import sjc.ast.ASTUtil;
import sjc.ast.StaticJavaASTBuilder;
import sjc.util.Util;

/**
 * Test cases for {@link StaticJavaASTBuilder}.
 *
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class ASTBuilderTest {
  public static void testPass(final String filename) {
    try {
      System.out.println(ASTUtil.ast(Util.getResource(SJC.class, filename)));
      System.out.flush();

    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(e.getMessage(), false);
    }
  }

  @Test
  public void testFactorial() {
    ASTBuilderTest.testPass("Factorial.java");
  }

  @Test
  public void testPower() {
    ASTBuilderTest.testPass("Power.java");
  }
}
