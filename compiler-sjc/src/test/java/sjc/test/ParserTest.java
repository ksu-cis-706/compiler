package sjc.test;

import java.io.File;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.junit.Assert;
import org.junit.Test;

import sjc.SJC;
import sjc.parser.StaticJavaLexer;
import sjc.parser.StaticJavaParser;

/**
 * Test cases for {@link StaticJavaParser}.
 * 
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class ParserTest {
  public static void testFail(final String filename) {
    try {
      final ANTLRFileStream afs = new ANTLRFileStream(filename);
      final StaticJavaLexer sjl = new StaticJavaLexer(afs);
      final CommonTokenStream cts = new CommonTokenStream(sjl);
      final StaticJavaParser sjp = new StaticJavaParser(cts);
      sjp.compilationUnit();
      Assert.assertTrue("Expected Parse Error", false);
    } catch (final Exception e) {
    }
  }

  public static void testPass(final String filename) {
    try {
      final ANTLRFileStream afs = new ANTLRFileStream(new File(SJC.class
          .getResource("..").toURI()).getAbsolutePath().replace(
          "/bin",
          "/src/test/resources/" + filename));
      final StaticJavaLexer sjl = new StaticJavaLexer(afs);
      final CommonTokenStream cts = new CommonTokenStream(sjl);
      final StaticJavaParser sjp = new StaticJavaParser(cts);
      sjp.compilationUnit();
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(e.getMessage(), false);
    }
  }

  @Test
  public void testFactorial() {
    ParserTest.testPass("Factorial.java");
  }

  @Test
  public void testParseErrorPass() {
    ParserTest.testFail("ParseError.java");
  }

  @Test
  public void testPower() {
    ParserTest.testPass("Power.java");
  }
}
