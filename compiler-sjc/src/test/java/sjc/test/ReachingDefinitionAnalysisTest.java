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
import sjc.analysis.ReachingDefinitionAnalysis;
import sjc.parser.StaticJavaAST2JDT;
import sjc.parser.StaticJavaASTAltLexer;
import sjc.parser.StaticJavaASTAltParser;
import sjc.symboltable.SymbolTable;
import sjc.symboltable.SymbolTableBuilder;

/**
 * Test cases for {@link ReachingDefinitionAnalysis}.
 * 
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class ReachingDefinitionAnalysisTest {
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
