package antlr.example4;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.junit.Assert;
import org.junit.Test;

public class Example4TestCases {
  public static void testExample4(final String testName, final String input) {
    System.out.println("*** Example4 (" + testName + ") ***");
    try {
      final ANTLRStringStream ss = new ANTLRStringStream(input);
      final Example4Lexer e4l = new Example4Lexer(ss);
      final CommonTokenStream cts = new CommonTokenStream(e4l);
      final Example4Parser e4p = new Example4Parser(cts);
      System.out.println(e4p.start());
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(false);
    }
    System.out.println();
    System.out.flush();
  }

  @Test
  public void testExample4_T1() throws Exception {
    Example4TestCases.testExample4("T1", "4");
  }

  @Test
  public void testExample4_T2() throws Exception {
    Example4TestCases.testExample4("T2", "4 * 4");
  }

  @Test
  public void testExample4_T3() throws Exception {
    Example4TestCases.testExample4("T3", "3 + 4");
  }

  @Test
  public void testExample4_T4() throws Exception {
    Example4TestCases.testExample4("T4", "3 + 4 * 4");
  }
}
