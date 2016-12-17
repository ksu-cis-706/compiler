package sjc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.jdt.core.dom.CompilationUnit;

import sjc.ast.ASTUtil;
import sjc.codegen.ByteCodeGenerator;
import sjc.codegen.ClassByteCodes;
import sjc.symboltable.SymbolTable;
import sjc.symboltable.SymbolTableBuilder;
import sjc.type.TypeFactory;
import sjc.type.checker.TypeChecker;
import sjc.type.checker.TypeTable;

/**
 * This class is the main class of the StaticJava compiler; it provides a
 * command-line interface (CLI) for the compiler.
 *
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class SJC {
  public static void main(final String[] args) {
    if (args.length != 1) {
      System.out.println("Usage: sjc <static-java-filename>");
      System.out.flush();
      return;
    }

    final String filename = args[0];

    if (!filename.endsWith(".java")) {
      System.out.println("Filename must have .java extension");
      System.out.flush();
      return;
    }

    final File file = new File(filename);
    String className = file.getName();
    className = className.substring(0, className.length() - 5);
    String classFilename = "??";

    try {

      final CompilationUnit cu = ASTUtil.ast(filename);
      final SymbolTable st = SymbolTableBuilder.build(cu);
      final TypeTable tt = TypeChecker.check(new TypeFactory(), cu, st);
      final ClassByteCodes cbc = ByteCodeGenerator.generate(cu, st, tt);

      if (!className.equals(cbc.mainClassName)) {
        System.out
            .println("The main class should be defined in its own Java file");
        System.out.flush();
        return;
      }

      classFilename = filename.substring(0, filename.length() - 5) + ".class";
      final FileOutputStream fos = new FileOutputStream(classFilename);
      fos.write(cbc.mainClassBytes);
      fos.close();
    } catch (final IOException e) {
      System.out.println("Unable to access file \'" + classFilename + "\'");
      System.out.flush();
    } catch (final Exception re) {
      System.out.println("Parse error: " + re.getMessage());
    }
  }

  protected SJC() {
  }
}
