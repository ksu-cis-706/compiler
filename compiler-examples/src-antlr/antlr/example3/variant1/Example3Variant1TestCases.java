package antlr.example3.variant1;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.junit.Assert;
import org.junit.Test;

public class Example3Variant1TestCases {
  public static void testExample3Variant1(final String testName,
      final String input) {
    System.out.println("*** Example3 V1 (" + testName + ") ***");
    try {
      final ANTLRStringStream ss = new ANTLRStringStream(input);
      final Example3Variant1Lexer e3v1l = new Example3Variant1Lexer(ss);
      final CommonTokenStream cts = new CommonTokenStream(e3v1l);
      final Example3Variant1Parser e3v1p = new Example3Variant1Parser(cts);
      e3v1p.start();
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(false);
    }
    System.out.println();
    System.out.flush();
  }

  @Test
  public void testExample3Variant1_T1() throws Exception {
    Example3Variant1TestCases.testExample3Variant1("T1", "4");
  }

  @Test
  public void testExample3Variant1_T2() throws Exception {
    Example3Variant1TestCases.testExample3Variant1("T2", "4 * 4");
  }

  @Test
  public void testExample3Variant1_T3() throws Exception {
    Example3Variant1TestCases.testExample3Variant1("T3", "3 + 4");
  }

  @Test
  public void testExample3Variant1_T4() throws Exception {
    Example3Variant1TestCases.testExample3Variant1("T4", "3 + 4 * 4");
  }
}
