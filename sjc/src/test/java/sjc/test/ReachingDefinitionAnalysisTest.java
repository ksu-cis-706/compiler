package sjc.test;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.junit.Assert;
import org.junit.Test;

import sjc.SJC;
import sjc.analysis.CFG;
import sjc.analysis.ReachingDefinitionAnalysis;
import sjc.ast.ASTUtil;
import sjc.symboltable.SymbolTable;
import sjc.symboltable.SymbolTableBuilder;
import sjc.util.Util;

/**
 * Test cases for {@link ReachingDefinitionAnalysis}.
 *
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class ReachingDefinitionAnalysisTest {
  public static void testPass(final String filename) {
    try {
      final CompilationUnit cu = ASTUtil.ast(Util.getResource(
          SJC.class,
          filename));
      final SymbolTable st = SymbolTableBuilder.build(cu);
      for (final Object o : cu.types()) {
        if (o instanceof TypeDeclaration) {
          for (final Object o2 : ((TypeDeclaration) o).bodyDeclarations()) {
            if (o2 instanceof MethodDeclaration) {
              final MethodDeclaration md = (MethodDeclaration) o2;
              final ReachingDefinitionAnalysis rda = new ReachingDefinitionAnalysis(
                  st, new CFG(md));
              rda.computeFixPoint();
              System.out.println(rda.getResultString());
              System.out.println();
            }
          }
        }
      }
      System.out.flush();
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(e.getMessage(), false);
    }
  }

  @Test
  public void testFactorial() {
    ReachingDefinitionAnalysisTest.testPass("Factorial.java");
  }

  @Test
  public void testPower() {
    ReachingDefinitionAnalysisTest.testPass("Power.java");
  }

}
