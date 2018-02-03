package antlrv4.example2;

import java.io.StringReader;

import org.antlr.v4.runtime.*;

import antlrv4.example2.Exp2Parser.ExpContext;

public class Exp2ParseUtil {
  public static ExpContext parse(final String exp) throws Exception {
    final CodePointCharStream input = CharStreams.fromReader(new StringReader(exp));
    final Exp2Lexer lexer = new Exp2Lexer(input);
    final CommonTokenStream tokens = new CommonTokenStream(lexer);
    final Exp2Parser parser = new Exp2Parser(tokens);
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
}
