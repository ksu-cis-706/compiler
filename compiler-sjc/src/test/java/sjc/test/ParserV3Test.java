package sjc.test;

import org.junit.Assert;
import org.junit.Test;

import sjc.SJC;
import sjc.parser.ParserUtil;
import sjc.parser.StaticJavaParser;

/**
 * Test cases for {@link StaticJavaParser}.
 *
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class ParserV3Test {
  private static void parse(final String filename) throws Exception {
    ParserUtil.parseV3(Util.getResource(SJC.class, filename));
  }

  private static void testFail(final String filename) {
    try {
      parse(filename);
      Assert.assertTrue("Expected Parse Error", false);
    } catch (final Exception e) {
    }
  }

  private static void testPass(final String filename) {
    try {
      parse(filename);
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(e.getMessage(), false);
    }
  }

  @Test
  public void testFactorial() {
    ParserV3Test.testPass("Factorial.java");
  }

  @Test
  public void testParseErrorPass() {
    ParserV3Test.testFail("ParseError.java");
  }

  @Test
  public void testPower() {
    ParserV3Test.testPass("Power.java");
  }
}
