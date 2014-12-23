package antlr.v4.example1;

import java.io.StringReader;
import java.math.BigInteger;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import antlr.v4.example1.ExpParser.BinaryExpContext;
import antlr.v4.example1.ExpParser.ExpContext;
import antlr.v4.example1.ExpParser.IntLiteralContext;
import antlr.v4.example1.ExpParser.ParenExpContext;

public class ExpEvaluator extends ExpBaseVisitor<BigInteger> {
  public static BigInteger eval(final String exp) throws Exception {
    return new ExpEvaluator().visit(parse(exp));
  }

  public static ExpContext parse(final String exp) throws Exception {
    final ANTLRInputStream input = new ANTLRInputStream(new StringReader(exp));
    final ExpLexer lexer = new ExpLexer(input);
    final CommonTokenStream tokens = new CommonTokenStream(lexer);
    final ExpParser parser = new ExpParser(tokens);
    parser.removeErrorListeners();
    parser.addErrorListener(new BaseErrorListener() {
      @Override
      public void syntaxError(final Recognizer<?, ?> recognizer,
          final Object offendingSymbol, final int line,
          final int charPositionInLine, final String msg,
          final RecognitionException e) {
        throw new RuntimeException("Parse Error in " + exp + ": [" + line
            + ", " + charPositionInLine + "] " + msg);
      }
    });
    return parser.start().exp();
  }

  private ExpEvaluator() {
  }

  @Override
  public BigInteger visitBinaryExp(final BinaryExpContext ctx) {
    final BigInteger v1 = visit(ctx.e1);
    final BigInteger v2 = visit(ctx.e2);
    final String op = ctx.op.getText();
    switch (op) {
      case "+":
        return v1.add(v2);
      case "-":
        return v1.subtract(v2);
      case "*":
        return v1.multiply(v2);
      case "/":
        return v1.divide(v2);
      case "%":
        return v1.remainder(v2);
    }
    throw new RuntimeException("Unhandled operator: " + op);
  }

  @Override
  public BigInteger visitParenExp(ParenExpContext ctx) {
    return visit(ctx.exp());
  }

  @Override
  public BigInteger visitIntLiteral(final IntLiteralContext ctx) {
    return new BigInteger(ctx.INT().getText());
  }
}
