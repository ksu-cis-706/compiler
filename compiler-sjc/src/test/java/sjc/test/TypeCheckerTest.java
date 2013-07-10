package sjc.test;

import java.io.File;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.Tree;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.junit.Assert;
import org.junit.Test;

import sjc.SJC;
import sjc.parser.StaticJavaAST2JDT;
import sjc.parser.StaticJavaASTAltLexer;
import sjc.parser.StaticJavaASTAltParser;
import sjc.symboltable.SymbolTable;
import sjc.symboltable.SymbolTableBuilder;
import sjc.type.TypeFactory;
import sjc.type.checker.TypeChecker;

/**
 * Test cases for {@link TypeChecker}.
 * 
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class TypeCheckerTest {
  public static void testPass(final String filename) {
    try {
      final ANTLRFileStream afs = new ANTLRFileStream(new File(SJC.class
          .getResource("..").toURI()).getAbsolutePath().replace(
          "/bin",
          "/src/test/resources/" + filename));
      final StaticJavaASTAltLexer sjal = new StaticJavaASTAltLexer(afs);
      final CommonTokenStream cts = new CommonTokenStream(sjal);
      final StaticJavaASTAltParser sjap = new StaticJavaASTAltParser(cts);
      final Tree cuTree = (Tree) sjap.compilationUnit().getTree();
      final CompilationUnit cu = StaticJavaAST2JDT.builds(
          cuTree,
          CompilationUnit.class);
      final SymbolTable st = SymbolTableBuilder.build(cu);
      System.out.println(st);
      System.out.print(TypeChecker.check(new TypeFactory(), cu, st));
      System.out.flush();
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(e.getMessage(), false);
    }
  }

  @Test
  public void testFactorial() {
    TypeCheckerTest.testPass("Factorial.java");
  }

  @Test
  public void testPower() {
    TypeCheckerTest.testPass("Power.java");
  }
}
