package antlr.example1;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.junit.Assert;
import org.junit.Test;

public class Example1TestCases {
  public static void testExample1(final String testName, final String input) {
    System.out.println("*** Example1 (" + testName + ") ***");
    try {
      final ANTLRStringStream ss = new ANTLRStringStream(input);
      final Example1Lexer e1l = new Example1Lexer(ss);
      final CommonTokenStream cts = new CommonTokenStream(e1l);
      final Example1Parser e1p = new Example1Parser(cts);
      e1p.start();
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(false);
    }
    System.out.println();
    System.out.flush();
  }

  @Test
  public void testExample1_T1() throws Exception {
    Example1TestCases.testExample1("T1", "4");
  }

  @Test
  public void testExample1_T2() throws Exception {
    Example1TestCases.testExample1("T2", "* 4");
  }

  @Test
  public void testExample1_T3() throws Exception {
    Example1TestCases.testExample1("T3", "4 * 4");
  }

  @Test
  public void testExample1_T4() throws Exception {
    Example1TestCases.testExample1("T4", "3 + 4 * 4");
  }
}
