package antlr.explicitast;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.junit.Assert;
import org.junit.Test;

public class ExprTreeTest {
  public static void testPass(final String input, final int result,
      final String pretty) {
    try {
      final ANTLRStringStream afs = new ANTLRStringStream(input);
      final ExplicitExprASTLexer sjl = new ExplicitExprASTLexer(afs);
      final CommonTokenStream cts = new CommonTokenStream(sjl);
      final ExplicitExprASTParser eeap = new ExplicitExprASTParser(cts);

      final ExprAST rootExpr = eeap.expr();

      final int v = rootExpr.value();
      Assert.assertTrue(v == result);

      final String s = rootExpr.pretty();
      System.out.println(s);
      Assert.assertTrue(s.equals(pretty));
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(e.getMessage(), false);
    }
  }

  @Test
  public void testMixed() {
    ExprTreeTest.testPass("1 - 2 + 3 - 4", -2, "(((1 - 2) + 3) - 4)");
  }

  @Test
  public void testMul() {
    ExprTreeTest.testPass("2 * 2 * 2", 8, "((2 * 2) * 2)");
  }

  @Test
  public void testNestedParens() {
    ExprTreeTest.testPass(
        "(((1)) + (2 * (((3) + 1)))) - 1",
        8,
        "((1 + (2 * (3 + 1))) - 1)");
  }

  @Test
  public void testNoParen() {
    ExprTreeTest.testPass("1 + 3 * 2", 7, "(1 + (3 * 2))");
  }

  @Test
  public void testParen() {
    ExprTreeTest.testPass("(1 + 3) * 2", 8, "((1 + 3) * 2)");
  }

  @Test
  public void testPlus() {
    ExprTreeTest.testPass("1 + 2 + 3 + 4", 10, "(((1 + 2) + 3) + 4)");
  }
}
