package sjc.ast;

import org.eclipse.jdt.core.dom.CompilationUnit;

import sjc.parser.ParserUtil;

/**
 * This class provides a helper method to call the StaticJava ANTLR v4 
 * parser and JDT AST builder.
 *
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class ASTUtil {
  /**
   * Builds JDT AST using the StaticJavaV4 parser and
   * {@link StaticJavaASTBuilder}.
   *
   * @param path
   *          The path for the input file to parse.
   * @return The JDT compilation unit for the input file.
   * @throws Exception
   *           When an error occurred when parsing (e.g., file not found, I/O
   *           error, and parsing error).
   */
  public static CompilationUnit ast(final String path) throws Exception {
    return StaticJavaASTBuilder.ast(ParserUtil.parse(path));
  }
}
