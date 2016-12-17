package sjc.test;

import org.junit.Assert;
import org.junit.Test;

import sjc.SJC;
import sjc.parser.ParserUtil;
import sjc.parser.StaticJavaV4Parser;
import sjc.util.Util;

/**
 * Test cases for {@link StaticJavaV4Parser}.
 *
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class ParserTest {
  private static void parse(final String filename) throws Exception {
    ParserUtil.parse(Util.getResource(SJC.class, filename));
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
