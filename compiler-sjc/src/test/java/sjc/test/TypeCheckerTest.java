package sjc.test;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.junit.Assert;
import org.junit.Test;

import sjc.SJC;
import sjc.parser.ParserUtil;
import sjc.symboltable.SymbolTable;
import sjc.symboltable.SymbolTableBuilder;
import sjc.type.TypeFactory;
import sjc.type.checker.TypeChecker;

/**
 * Test cases for {@link TypeChecker}.
 *
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class TypeCheckerTest {
  public static void testPass(final String filename) {
    try {
      final CompilationUnit cu = ParserUtil.ast(Util.getResource(
          SJC.class,
          filename));
      final SymbolTable st = SymbolTableBuilder.build(cu);
      System.out.println(st);
      System.out.print(TypeChecker.check(new TypeFactory(), cu, st));
      System.out.flush();
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(e.getMessage(), false);
    }
  }

  @Test
  public void testFactorial() {
    TypeCheckerTest.testPass("Factorial.java");
  }

  @Test
  public void testPower() {
    TypeCheckerTest.testPass("Power.java");
  }
}
