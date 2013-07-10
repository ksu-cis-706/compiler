package sjc.test;

import java.io.File;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.junit.Assert;
import org.junit.Test;

import sjc.SJC;
import sjc.parser.StaticJavaASTLexer;
import sjc.parser.StaticJavaASTParser;

/**
 * Test cases for {@link StaticJavaASTParser}.
 * 
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class ASTParserTest {
  public static void testPass(final String filename) {
    try {
      final ANTLRFileStream afs = new ANTLRFileStream(new File(SJC.class
          .getResource("..").toURI()).getAbsolutePath().replace(
          "/bin",
          "/src/test/resources/" + filename));
      final StaticJavaASTLexer sjal = new StaticJavaASTLexer(afs);
      final CommonTokenStream cts = new CommonTokenStream(sjal);
      final StaticJavaASTParser sjap = new StaticJavaASTParser(cts);
      System.out.println(sjap.compilationUnit().toString());
      System.out.flush();

    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(e.getMessage(), false);
    }
  }

  @Test
  public void testFactorial() {
    ASTParserTest.testPass("Factorial.java");
  }

  @Test
  public void testPower() {
    ASTParserTest.testPass("Power.java");
  }
}
