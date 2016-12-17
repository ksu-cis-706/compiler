package jdt;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.junit.Assert;
import org.junit.Test;

import sjc.ast.ASTUtil;
import sjc.util.Util;

/**
 * Test cases for {@link CollectInt}.
 */
public class CollectXTest {
  public static void testPass(final String filename) {
    try {
      final CompilationUnit cu = ASTUtil.ast(Util.getResource(CollectXTest.class, filename));
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
    CollectXTest.testPass("Factorial.java");
  }

  @Test
  public void testPower() {
    CollectXTest.testPass("Power.java");
  }

}
