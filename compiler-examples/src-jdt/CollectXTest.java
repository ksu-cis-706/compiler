import junit.framework.TestCase;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.junit.Assert;

import sjc.parser.StaticJavaASTLexer;
import sjc.parser.StaticJavaASTParser;

/**
 * Test cases for {@link CollectInt}.
 */
public class CollectXTest extends TestCase {
  public static void testPass(final String filename) {
    try {
      final ANTLRFileStream afs = new ANTLRFileStream(filename);
      final StaticJavaASTLexer sjal = new StaticJavaASTLexer(afs);
      final CommonTokenStream cts = new CommonTokenStream(sjal);
      final StaticJavaASTParser sjap = new StaticJavaASTParser(cts);
      final CompilationUnit cu = sjap.compilationUnit();
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

  public void testFactorial() {
    CollectXTest.testPass("src-sjc/Factorial.java");
  }

  public void testPower() {
    CollectXTest.testPass("src-sjc/Power.java");
  }

}
