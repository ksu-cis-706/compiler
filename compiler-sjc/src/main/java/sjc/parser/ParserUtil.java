package sjc.parser;

import java.io.FileReader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import sjc.parser.StaticJavaV4Parser.CompilationUnitContext;

/**
 * This class provides a helper method to call the StaticJava ANTLR v4 parser.
 *
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class ParserUtil {
  /**
   * Builds parse tree using the StaticJavaV4 parser.
   *
   * @param path
   *          The path for the input file to parse.
   * @return The ANTLR4 parse tree for the input file.
   * @throws Exception
   *           When an error occurred when parsing (e.g., file not found, I/O
   *           error, and parsing error).
   */
  public static CompilationUnitContext parse(final String path)
      throws Exception {
    final ANTLRInputStream input = new ANTLRInputStream(new FileReader(path));
    final StaticJavaV4Lexer lexer = new StaticJavaV4Lexer(input);
    final org.antlr.v4.runtime.CommonTokenStream tokens = new org.antlr.v4.runtime.CommonTokenStream(
        lexer);
    final StaticJavaV4Parser parser = new StaticJavaV4Parser(tokens);
    parser.removeErrorListeners();
    parser.addErrorListener(new BaseErrorListener() {
      @Override
      public void syntaxError(final Recognizer<?, ?> recognizer,
          final Object offendingSymbol, final int line,
          final int charPositionInLine, final String msg,
          final RecognitionException e) {
        throw new RuntimeException("Parse Error in " + path + ": [" + line
            + ", " + charPositionInLine + "] " + msg);
      }
    });
    return parser.compilationUnit();
  }

  // ANTLR v3 helper methods (obsolete)
  //
  //  /**
  //   * Builds JDT AST using the StaticJavaASTAlt parser and
  //   * {@link StaticJavaAST2JDT}.
  //   *
  //   * @param path
  //   *          The path for the input file to parse.
  //   * @return The JDT compilation unit for the input file.
  //   * @throws Exception
  //   *           When an error occurred when parsing (e.g., file not found, I/O
  //   *           error, and parsing error).
  //   */
  //  public static CompilationUnit parseASTAltV3(final String path)
  //      throws Exception {
  //    final ANTLRFileStream afs = new ANTLRFileStream(path);
  //    final StaticJavaASTAltLexer sjal = new StaticJavaASTAltLexer(afs);
  //    final org.antlr.runtime.CommonTokenStream cts = new org.antlr.runtime.CommonTokenStream(
  //        sjal);
  //    final StaticJavaASTAltParser sjap = new StaticJavaASTAltParser(cts);
  //    final org.antlr.runtime.tree.Tree cuTree = (org.antlr.runtime.tree.Tree) sjap
  //        .compilationUnit().getTree();
  //    return StaticJavaAST2JDT.builds(cuTree, CompilationUnit.class);
  //  }

  //  /**
  //   * Builds JDT AST using the StaticJavaAST parser.
  //   *
  //   * @param path
  //   *          The path for the input file to parse.
  //   * @return The JDT compilation unit for the input file.
  //   * @throws Exception
  //   *           When an error occurred when parsing (e.g., file not found, I/O
  //   *           error, and parsing error).
  //   */
  //  public static CompilationUnit parseASTV3(final String path) throws Exception {
  //    final ANTLRFileStream afs = new ANTLRFileStream(path);
  //    final StaticJavaASTLexer sjal = new StaticJavaASTLexer(afs);
  //    final org.antlr.runtime.CommonTokenStream cts = new org.antlr.runtime.CommonTokenStream(
  //        sjal);
  //    final StaticJavaASTParser sjap = new StaticJavaASTParser(cts);
  //    return sjap.compilationUnit();
  //  }

  //  /**
  //   * Parses using the StaticJava parser.
  //   *
  //   * @param path
  //   *          The path for the input file to parse.
  //   * @throws Exception
  //   *           When an error occurred when parsing (e.g., file not found, I/O
  //   *           error, and parsing error).
  //   */
  //  public static void parseV3(final String path) throws Exception {
  //    final ANTLRFileStream afs = new ANTLRFileStream(path);
  //    final StaticJavaLexer sjl = new StaticJavaLexer(afs);
  //    final org.antlr.runtime.CommonTokenStream cts = new org.antlr.runtime.CommonTokenStream(
  //        sjl);
  //    final StaticJavaParser sjp = new StaticJavaParser(cts);
  //    sjp.compilationUnit();
  //  }
}
