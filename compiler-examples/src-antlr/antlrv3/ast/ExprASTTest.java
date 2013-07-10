package antlrv3.ast;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

public class ExprASTTest {

  public static void main(final String[] args) {
    ExprASTLexer lex = null;
    try {
      lex = new ExprASTLexer(new ANTLRFileStream(args[0]));
    } catch (final IOException e) {
      e.printStackTrace();
    }
    final CommonTokenStream tokens = new CommonTokenStream(lex);

    final ExprASTParser parser = new ExprASTParser(tokens); // created from T.g
    ExprASTParser.start_return r = null;
    try {
      r = parser.start();
    } catch (final RecognitionException e) {
      e.printStackTrace();
    } // launch parsing
    if (r != null) {
      System.out.println(((CommonTree) r.tree).toStringTree());
      System.out.println(((ExprASTTree) r.tree).value());
    }

  }
}
