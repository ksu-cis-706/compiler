package ast;

import static ast.BinaryOp.ADD;
import static ast.BinaryOp.MUL;
import static ast.ExpFactory.bin;
import static ast.ExpFactory.id;
import static ast.ExpFactory.lit;

import org.junit.Assert;
import org.junit.Test;

public class ExpAstBuilderTest {

  @Test
  public void test1() {
    testPass(bin(lit(3), MUL, bin(lit(6), ADD, id("x"))), "3 * (6 + x)");
  }

  public void testPass(final Exp expected, final String exp) {
    try {
      final Exp result = AstBuilder.ast(exp);
      Assert.assertEquals(expected.toString(), result.toString());
      Assert.assertEquals(
          ExpPrettyPrinter.print(expected),
          ExpPrettyPrinter.print(result));
      Assert.assertEquals(ExpPrettyPrinter.print(result), ExpPrettyPrinter
          .print(AstBuilder.ast(ExpPrettyPrinter.print(result))));
    } catch (final Exception e) {
      Assert.assertTrue(false);
    }
  }
}
