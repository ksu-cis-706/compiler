package antlr.example2;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.junit.Assert;
import org.junit.Test;

public class Example2TestCases {
  public static void testExample2(final String testName, final String input) {
    System.out.println("*** Example2 (" + testName + ") ***");
    try {
      final ANTLRStringStream ss = new ANTLRStringStream(input);
      final Example2Lexer e2l = new Example2Lexer(ss);
      final CommonTokenStream cts = new CommonTokenStream(e2l);
      final Example2Parser e2p = new Example2Parser(cts);
      e2p.start();
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(false);
    }
    System.out.println();
    System.out.flush();
  }

  @Test
  public void testExample1_T4() throws Exception {
    Example2TestCases.testExample2("T4", "3 + 4 * 4");
  }

  @Test
  public void testExample2_T1() throws Exception {
    Example2TestCases.testExample2("T1", "4");
  }

  @Test
  public void testExample2_T2() throws Exception {
    Example2TestCases.testExample2("T2", "4 * 4");
  }

  @Test
  public void testExample2_T3() throws Exception {
    Example2TestCases.testExample2("T3", "3 + 4");
  }
}
