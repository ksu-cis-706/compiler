package sjc.test;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.Tree;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.junit.Assert;
import org.junit.Test;

import sjc.SJC;
import sjc.analysis.CFG;
import sjc.parser.StaticJavaAST2JDT;
import sjc.parser.StaticJavaASTAltLexer;
import sjc.parser.StaticJavaASTAltParser;

/**
 * Test cases for {@link CFG}.
 * 
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class CFGTest {
  public static void testPass(final String filename) {
    try {
      final ANTLRFileStream afs = new ANTLRFileStream(Util.getResource(
          SJC.class,
          filename));
      final StaticJavaASTAltLexer sjal = new StaticJavaASTAltLexer(afs);
      final CommonTokenStream cts = new CommonTokenStream(sjal);
      final StaticJavaASTAltParser sjap = new StaticJavaASTAltParser(cts);
      final Tree cuTree = (Tree) sjap.compilationUnit().getTree();
      final CompilationUnit cu = StaticJavaAST2JDT.builds(
          cuTree,
          CompilationUnit.class);
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
