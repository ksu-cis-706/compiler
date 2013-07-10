package antlr.example3.variant2;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.junit.Assert;
import org.junit.Test;

public class Example3Variant2TestCases {
  public static void testExample3Variant2(final String testName,
      final String input) {
    System.out.println("*** Example3 V2 (" + testName + ") ***");
    try {
      final ANTLRStringStream ss = new ANTLRStringStream(input);
      final Example3Variant2Lexer e3v2l = new Example3Variant2Lexer(ss);
      final CommonTokenStream cts = new CommonTokenStream(e3v2l);
      final Example3Variant2Parser e3v2p = new Example3Variant2Parser(cts);
      e3v2p.start();
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(false);
    }
    System.out.println();
    System.out.flush();
  }

  @Test
  public void testExample3Variant2_T1() throws Exception {
    Example3Variant2TestCases.testExample3Variant2("T1", "4");
  }

  @Test
  public void testExample3Variant2_T2() throws Exception {
    Example3Variant2TestCases.testExample3Variant2("T2", "3 + 4");
  }

  @Test
  public void testExample3Variant2_T3() throws Exception {
    Example3Variant2TestCases.testExample3Variant2("T3", "4 * 4");
  }

  @Test
  public void testExample3Variant2_T4() throws Exception {
    Example3Variant2TestCases.testExample3Variant2("T4", "3 + 4 * 4");
  }
}
