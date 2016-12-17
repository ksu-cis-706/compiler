package sjc.test;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.junit.Assert;
import org.junit.Test;

import sjc.SJC;
import sjc.analysis.CFG;
import sjc.ast.ASTUtil;
import sjc.util.Util;

/**
 * Test cases for {@link CFG}.
 *
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class CFGTest {
  public static void testPass(final String filename) {
    try {
      final CompilationUnit cu = ASTUtil.ast(Util.getResource(
          SJC.class,
          filename));
      for (final Object o : cu.types()) {
        if (o instanceof TypeDeclaration) {
          for (final Object o2 : ((TypeDeclaration) o).bodyDeclarations()) {
            if (o2 instanceof MethodDeclaration) {
              System.out.println(new CFG((MethodDeclaration) o2));
              System.out.println();
            }
          }
        }
      }
      System.out.println();
      System.out.flush();
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(e.getMessage(), false);
    }
  }

  @Test
  public void testFactorial() {
    CFGTest.testPass("Factorial.java");
  }

  @Test
  public void testPower() {
    CFGTest.testPass("Power.java");
  }
}
