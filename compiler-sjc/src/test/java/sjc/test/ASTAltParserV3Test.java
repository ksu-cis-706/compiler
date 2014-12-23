package sjc.test;

import org.junit.Assert;
import org.junit.Test;

import sjc.SJC;
import sjc.parser.ParserUtil;
import sjc.parser.StaticJavaASTAltParser;

/**
 * Test cases for {@link StaticJavaASTAltParser}.
 *
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class ASTAltParserV3Test {
  public static void testPass(final String filename) {
    try {
      System.out.println(ParserUtil.parseASTAltV3(Util.getResource(
          SJC.class,
          filename)));
      System.out.flush();

    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(e.getMessage(), false);
    }
  }

  @Test
  public void testFactorial() {
    testPass("Factorial.java");
  }

  @Test
  public void testPower() {
    testPass("Power.java");
  }
}
