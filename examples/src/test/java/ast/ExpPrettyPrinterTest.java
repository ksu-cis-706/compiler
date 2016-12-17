package ast;

import org.junit.Assert;
import org.junit.Test;

public class ExpPrettyPrinterTest {

  @Test
  public void test1() {
    testPass("3 * 6 + 4", "3*6+4");
  }

  @Test
  public void test2() {
    testPass("3 * (6 + 4)", "3*(6+4)");
  }

  @Test
  public void test3() {
    testPass("3 * (6 + 4 * x)", "3*(6+4 * x)");
  }

  public void testPass(final String expected, final String exp) {
    try {
      final String result = ExpPrettyPrinter.print(AstBuilder.ast(exp));
      Assert.assertEquals(expected, result);
    } catch (final Exception e) {
      Assert.assertTrue(false);
    }
  }
}
