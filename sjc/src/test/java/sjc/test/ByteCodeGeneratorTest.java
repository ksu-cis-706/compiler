package sjc.test;

import java.io.PrintWriter;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.junit.Assert;
import org.junit.Test;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.util.TraceClassVisitor;

import sjc.SJC;
import sjc.ast.ASTUtil;
import sjc.codegen.ByteCodeGenerator;
import sjc.codegen.ClassByteCodes;
import sjc.symboltable.SymbolTable;
import sjc.symboltable.SymbolTableBuilder;
import sjc.type.TypeFactory;
import sjc.type.checker.TypeChecker;
import sjc.type.checker.TypeTable;
import sjc.util.Util;

/**
 * Test cases for {@link ByteCodeGenerator}.
 *
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class ByteCodeGeneratorTest {
  @SuppressWarnings("rawtypes")
  static class CustomClassLoader extends ClassLoader {
    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
      return getClass().getClassLoader().loadClass(name);
    }

    public Class loadClass(final String name, final byte[] bytecodes) {
      return defineClass(name, bytecodes, 0, bytecodes.length);
    }
  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
  public static void testPass(final String filename, final Object[] args) {
    try {
      final CompilationUnit cu = ASTUtil.ast(Util.getResource(
          SJC.class,
          filename));
      final SymbolTable st = SymbolTableBuilder.build(cu);
      final TypeTable tt = TypeChecker.check(new TypeFactory(), cu, st);
      final ClassByteCodes cbc = ByteCodeGenerator.generate(cu, st, tt);
      final ClassReader cr = new ClassReader(cbc.mainClassBytes);
      final TraceClassVisitor tcv = new TraceClassVisitor(new PrintWriter(
          System.out));
      cr.accept(tcv, 0);
      System.out.flush();

      final CustomClassLoader ccl = new CustomClassLoader();
      final Class c = ccl.loadClass(cbc.mainClassName, cbc.mainClassBytes);
      c.getMethod("main", new Class[] { String[].class }).invoke(null, args);
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(e.getMessage(), false);
      throw new RuntimeException();
    }
  }

  @Test
  public void testFactorial3() {
    ByteCodeGeneratorTest.testPass(
        "Factorial.java",
        new Object[] { new String[] { "3" } });
  }

  @Test
  public void testPower2To2() {
    ByteCodeGeneratorTest.testPass("Power.java", new Object[] { new String[] {
        "2", "2" } });
  }
}
