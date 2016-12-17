package ast;

import org.junit.Assert;
import org.junit.Test;

public class ExpSimplifierTest {

  @Test
  public void test1() {
    testPass("22", "3 * 6 + 4");
  }

  @Test
  public void test2() {
    testPass("30", "3 * (6 + 4)");
  }

  @Test
  public void test3() {
    testPass("24 * x", "4 * 6 * x");
  }

  @Test
  public void test4() {
    testPass("24 + x", "4 * 6 + x");
  }

  @Test
  public void test5() {
    testPass("3 * (24 + x)", "3 * (6 * 4 + x)");
  }

  @Test
  public void test6() {
    testPass("3 * (6 + 4 * x)", "3 * (6 + 4 * x)");
  }

  public void testPass(final String expected, final String exp) {
    try {
      final String result = ExpPrettyPrinter.print(ExpSimplifier
          .simplify(AstBuilder.ast(exp)));
      Assert.assertEquals(expected, result);
    } catch (final Exception e) {
      Assert.assertTrue(false);
    }
  }
}
