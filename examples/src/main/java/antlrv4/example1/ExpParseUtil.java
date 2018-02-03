package antlrv4.example1;

import java.io.StringReader;

import org.antlr.v4.runtime.*;

import antlrv4.example1.ExpParser.ExpContext;

public class ExpParseUtil {
  public static ExpContext parse(final String exp) throws Exception {
    final CodePointCharStream input = CharStreams.fromReader(new StringReader(exp));
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
}
