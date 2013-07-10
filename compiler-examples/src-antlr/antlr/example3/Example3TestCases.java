package antlr.example3;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.junit.Assert;
import org.junit.Test;

public class Example3TestCases {
  public static void testExample3(final String testName, final String input) {
    System.out.println("*** Example3 (" + testName + ") ***");
    try {
      final ANTLRStringStream ss = new ANTLRStringStream(input);
      final Example3Lexer e3l = new Example3Lexer(ss);
      final CommonTokenStream cts = new CommonTokenStream(e3l);
      final Example3Parser e3p = new Example3Parser(cts);
      e3p.start();
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(false);
    }
    System.out.println();
    System.out.flush();
  }

  @Test
  public void testExample3_T1() throws Exception {
    Example3TestCases.testExample3("T1", "4");
  }

  @Test
  public void testExample3_T2() throws Exception {
    Example3TestCases.testExample3("T2", "4 * 4");
  }

  @Test
  public void testExample3_T3() throws Exception {
    Example3TestCases.testExample3("T3", "3 + 4");
  }

  @Test
  public void testExample3_T4() throws Exception {
    Example3TestCases.testExample3("T4", "3 + 4 * 4");
  }
}
