package sjc.parser;

import java.io.FileReader;

import org.antlr.v4.runtime.*;

import sjc.parser.StaticJavaV4Parser.CompilationUnitContext;

/**
 * This class provides a helper method to call the StaticJava ANTLR v4 parser.
 *
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
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
    final CodePointCharStream input = CharStreams.fromReader(new FileReader(path));
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
}
