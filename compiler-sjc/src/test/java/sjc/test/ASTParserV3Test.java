package sjc.test;

import org.junit.Assert;
import org.junit.Test;

import sjc.SJC;
import sjc.parser.ParserUtil;
import sjc.parser.StaticJavaASTParser;

/**
 * Test cases for {@link StaticJavaASTParser}.
 *
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class ASTParserV3Test {
  public static void testPass(final String filename) {
    try {
      System.out.println(ParserUtil.parseASTV3(Util.getResource(
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
    ASTParserV3Test.testPass("Factorial.java");
  }

  @Test
  public void testPower() {
    ASTParserV3Test.testPass("Power.java");
  }
}
