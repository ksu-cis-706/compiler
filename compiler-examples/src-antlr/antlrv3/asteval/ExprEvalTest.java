package antlrv3.asteval;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;

public class ExprEvalTest {

  /**
   * @param args
   */
  public static void main(final String[] args) {

    try {
      CharStream input = null;
      if (args.length > 0) {
        input = new ANTLRFileStream(args[0]);
      } else {
        input = new ANTLRInputStream(System.in);
      }

      // BUILD AST
      final ExprLexer lex = new ExprLexer(input);
      final CommonTokenStream tokens = new CommonTokenStream(lex);
      final ExprParser parser = new ExprParser(tokens);
      final ExprParser.start_return r = parser.start();

      // Simplify
      final CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.tree);
      nodes.setTokenStream(tokens);
      final ExprSimplifier simp = new ExprSimplifier(nodes);
      final ExprSimplifier.expr_return r2 = simp.expr();
      System.out.println(((Tree) r2.tree).toStringTree() + " = " + r2.value);
    } catch (final Exception e) {
      e.printStackTrace();
    }
  }

}
