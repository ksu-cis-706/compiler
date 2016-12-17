// $ANTLR 3.5 /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g 2013-07-08 18:13:04

package sjc.parser;

/**
 * StaticJava lexer.
 *
 * @author robby
 */

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;

@SuppressWarnings("all")
public class StaticJavaASTLexer extends Lexer {
  protected class DFA4 extends DFA {

    public DFA4(final BaseRecognizer recognizer) {
      this.recognizer = recognizer;
      this.decisionNumber = 4;
      this.eot = StaticJavaASTLexer.DFA4_eot;
      this.eof = StaticJavaASTLexer.DFA4_eof;
      this.min = StaticJavaASTLexer.DFA4_min;
      this.max = StaticJavaASTLexer.DFA4_max;
      this.accept = StaticJavaASTLexer.DFA4_accept;
      this.special = StaticJavaASTLexer.DFA4_special;
      this.transition = StaticJavaASTLexer.DFA4_transition;
    }

    @Override
    public String getDescription() {
      return "1:1: Tokens : ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | ID | NUM_INT | WS );";
    }
  }

  public static final int EOF = -1;
  public static final int T__7 = 7;
  public static final int T__8 = 8;
  public static final int T__9 = 9;
  public static final int T__10 = 10;
  public static final int T__11 = 11;
  public static final int T__12 = 12;
  public static final int T__13 = 13;
  public static final int T__14 = 14;
  public static final int T__15 = 15;
  public static final int T__16 = 16;
  public static final int T__17 = 17;
  public static final int T__18 = 18;
  public static final int T__19 = 19;
  public static final int T__20 = 20;
  public static final int T__21 = 21;
  public static final int T__22 = 22;
  public static final int T__23 = 23;
  public static final int T__24 = 24;
  public static final int T__25 = 25;
  public static final int T__26 = 26;
  public static final int T__27 = 27;
  public static final int T__28 = 28;
  public static final int T__29 = 29;
  public static final int T__30 = 30;
  public static final int T__31 = 31;
  public static final int T__32 = 32;
  public static final int T__33 = 33;
  public static final int T__34 = 34;
  public static final int T__35 = 35;
  public static final int T__36 = 36;
  public static final int T__37 = 37;
  public static final int T__38 = 38;
  public static final int T__39 = 39;
  public static final int T__40 = 40;
  public static final int T__41 = 41;
  public static final int T__42 = 42;
  public static final int ID = 4;
  public static final int NUM_INT = 5;

  public static final int WS = 6;

  protected DFA4 dfa4 = new DFA4(this);
  static final String DFA4_eotS = "\1\uffff\1\44\13\uffff\1\46\1\50\1\52\2\uffff\13\40\16\uffff\4\40\1\73"
      + "\13\40\1\uffff\1\107\10\40\1\120\1\40\1\uffff\3\40\1\125\1\126\2\40\1"
      + "\131\1\uffff\1\132\3\40\2\uffff\1\136\1\40\2\uffff\1\140\1\141\1\142\1"
      + "\uffff\1\143\4\uffff";
  static final String DFA4_eofS = "\144\uffff";
  static final String DFA4_minS = "\1\11\1\75\13\uffff\3\75\2\uffff\1\157\2\154\1\141\1\146\1\165\1\145\1"
      + "\164\1\162\1\157\1\150\16\uffff\1\157\1\141\1\163\1\154\1\44\1\164\1\142"
      + "\1\164\1\141\1\165\2\151\1\154\1\163\1\145\1\163\1\uffff\1\44\1\154\1"
      + "\165\1\164\1\145\1\144\1\154\1\145\1\163\1\44\1\145\1\uffff\1\151\1\162"
      + "\1\151\2\44\1\145\1\141\1\44\1\uffff\1\44\1\143\1\156\1\143\2\uffff\1"
      + "\44\1\156\2\uffff\3\44\1\uffff\1\44\4\uffff";

  static final String DFA4_maxS = "\1\175\1\75\13\uffff\3\75\2\uffff\1\157\2\154\1\141\1\156\1\165\1\145"
      + "\1\164\1\162\1\157\1\150\16\uffff\1\157\1\141\1\163\1\154\1\172\1\164"
      + "\1\142\1\164\1\141\1\165\2\151\1\154\1\163\1\145\1\163\1\uffff\1\172\1"
      + "\154\1\165\1\164\1\145\1\144\1\154\1\145\1\163\1\172\1\145\1\uffff\1\151"
      + "\1\162\1\151\2\172\1\145\1\141\1\172\1\uffff\1\172\1\143\1\156\1\143\2"
      + "\uffff\1\172\1\156\2\uffff\3\172\1\uffff\1\172\4\uffff";

  static final String DFA4_acceptS = "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\3\uffff\1\24"
      + "\1\25\13\uffff\1\42\1\43\1\44\1\45\1\46\1\47\1\2\1\1\1\17\1\16\1\21\1"
      + "\20\1\23\1\22\20\uffff\1\32\13\uffff\1\33\10\uffff\1\30\4\uffff\1\37\1"
      + "\40\2\uffff\1\27\1\31\3\uffff\1\41\1\uffff\1\34\1\35\1\36\1\26";

  static final String DFA4_specialS = "\144\uffff}>";

  static final String[] DFA4_transitionS = {
      "\2\42\1\uffff\2\42\22\uffff\1\42\1\1\2\uffff\1\40\1\2\1\3\1\uffff\1\4"
          + "\1\5\1\6\1\7\1\10\1\11\1\12\1\13\12\41\1\uffff\1\14\1\15\1\16\1\17\2"
          + "\uffff\32\40\1\20\1\uffff\1\21\1\uffff\1\40\1\uffff\1\40\1\22\1\23\1"
          + "\40\1\24\1\25\2\40\1\26\6\40\1\27\1\40\1\30\1\31\1\32\1\40\1\33\1\34"
          + "\3\40\1\35\1\36\1\37", "\1\43", "", "", "", "", "", "", "", "",
      "", "", "", "\1\45", "\1\47", "\1\51", "", "", "\1\53", "\1\54", "\1\55",
      "\1\56", "\1\57\7\uffff\1\60", "\1\61", "\1\62", "\1\63", "\1\64",
      "\1\65", "\1\66", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
      "\1\67", "\1\70", "\1\71", "\1\72",
      "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40", "\1\74",
      "\1\75", "\1\76", "\1\77", "\1\100", "\1\101", "\1\102", "\1\103",
      "\1\104", "\1\105", "\1\106", "",
      "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
      "\1\110", "\1\111", "\1\112", "\1\113", "\1\114", "\1\115", "\1\116",
      "\1\117",
      "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
      "\1\121", "", "\1\122", "\1\123", "\1\124",
      "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
      "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
      "\1\127", "\1\130",
      "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40", "",
      "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
      "\1\133", "\1\134", "\1\135", "", "",
      "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
      "\1\137", "", "",
      "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
      "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
      "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40", "",
      "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40", "", "",
      "", "" };

  static final short[] DFA4_eot = DFA
      .unpackEncodedString(StaticJavaASTLexer.DFA4_eotS);

  static final short[] DFA4_eof = DFA
      .unpackEncodedString(StaticJavaASTLexer.DFA4_eofS);

  static final char[] DFA4_min = DFA
      .unpackEncodedStringToUnsignedChars(StaticJavaASTLexer.DFA4_minS);

  static final char[] DFA4_max = DFA
      .unpackEncodedStringToUnsignedChars(StaticJavaASTLexer.DFA4_maxS);

  static final short[] DFA4_accept = DFA
      .unpackEncodedString(StaticJavaASTLexer.DFA4_acceptS);

  static final short[] DFA4_special = DFA
      .unpackEncodedString(StaticJavaASTLexer.DFA4_specialS);

  static final short[][] DFA4_transition;

  static {
    final int numStates = StaticJavaASTLexer.DFA4_transitionS.length;
    DFA4_transition = new short[numStates][];
    for (int i = 0; i < numStates; i++) {
      StaticJavaASTLexer.DFA4_transition[i] = DFA
          .unpackEncodedString(StaticJavaASTLexer.DFA4_transitionS[i]);
    }
  }

  public StaticJavaASTLexer() {
  }

  public StaticJavaASTLexer(final CharStream input) {
    this(input, new RecognizerSharedState());
  }

  public StaticJavaASTLexer(final CharStream input,
      final RecognizerSharedState state) {
    super(input, state);
  }

  // delegates
  // delegators
  public Lexer[] getDelegates() {
    return new Lexer[] {};
  }

  @Override
  public String getGrammarFileName() {
    return "/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g";
  }

  // $ANTLR start "ID"
  public final void mID() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.ID;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:350:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )* )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:350:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )*
      {
        if ((this.input.LA(1) == '$')
            || ((this.input.LA(1) >= 'A') && (this.input.LA(1) <= 'Z'))
            || (this.input.LA(1) == '_')
            || ((this.input.LA(1) >= 'a') && (this.input.LA(1) <= 'z'))) {
          this.input.consume();
        } else {
          final MismatchedSetException mse = new MismatchedSetException(null,
              this.input);
          recover(mse);
          throw mse;
        }
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:351:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )*
        loop1: while (true) {
          int alt1 = 2;
          final int LA1_0 = this.input.LA(1);
          if (((LA1_0 == '$') || ((LA1_0 >= '0') && (LA1_0 <= '9'))
              || ((LA1_0 >= 'A') && (LA1_0 <= 'Z')) || (LA1_0 == '_') || ((LA1_0 >= 'a') && (LA1_0 <= 'z')))) {
            alt1 = 1;
          }

          switch (alt1) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:
            {
              if ((this.input.LA(1) == '$')
                  || ((this.input.LA(1) >= '0') && (this.input.LA(1) <= '9'))
                  || ((this.input.LA(1) >= 'A') && (this.input.LA(1) <= 'Z'))
                  || (this.input.LA(1) == '_')
                  || ((this.input.LA(1) >= 'a') && (this.input.LA(1) <= 'z'))) {
                this.input.consume();
              } else {
                final MismatchedSetException mse = new MismatchedSetException(
                    null, this.input);
                recover(mse);
                throw mse;
              }
            }
              break;

            default:
              break loop1;
          }
        }

      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "ID"

  // $ANTLR start "NUM_INT"
  public final void mNUM_INT() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.NUM_INT;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:355:2: ( ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* ) )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:355:4: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* )
      {
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:355:4: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* )
        int alt3 = 2;
        final int LA3_0 = this.input.LA(1);
        if ((LA3_0 == '0')) {
          alt3 = 1;
        } else if ((((LA3_0 >= '1') && (LA3_0 <= '9')))) {
          alt3 = 2;
        }

        else {
          final NoViableAltException nvae = new NoViableAltException("", 3, 0,
              this.input);
          throw nvae;
        }

        switch (alt3) {
          case 1:
          // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:355:6: '0'
          {
            match('0');
          }
            break;
          case 2:
          // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:355:12: ( '1' .. '9' ) ( '0' .. '9' )*
          {
            if (((this.input.LA(1) >= '1') && (this.input.LA(1) <= '9'))) {
              this.input.consume();
            } else {
              final MismatchedSetException mse = new MismatchedSetException(
                  null, this.input);
              recover(mse);
              throw mse;
            }
            // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:355:23: ( '0' .. '9' )*
            loop2: while (true) {
              int alt2 = 2;
              final int LA2_0 = this.input.LA(1);
              if ((((LA2_0 >= '0') && (LA2_0 <= '9')))) {
                alt2 = 1;
              }

              switch (alt2) {
                case 1:
                // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:
                {
                  if (((this.input.LA(1) >= '0') && (this.input.LA(1) <= '9'))) {
                    this.input.consume();
                  } else {
                    final MismatchedSetException mse = new MismatchedSetException(
                        null, this.input);
                    recover(mse);
                    throw mse;
                  }
                }
                  break;

                default:
                  break loop2;
              }
            }

          }
            break;

        }

      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "NUM_INT"

  // $ANTLR start "T__10"
  public final void mT__10() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__10;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:15:7: ( '&&' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:15:9: '&&'
      {
        match("&&");

      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__10"

  // $ANTLR start "T__11"
  public final void mT__11() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__11;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:16:7: ( '(' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:16:9: '('
      {
        match('(');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__11"

  // $ANTLR start "T__12"
  public final void mT__12() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__12;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:17:7: ( ')' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:17:9: ')'
      {
        match(')');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__12"

  // $ANTLR start "T__13"
  public final void mT__13() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__13;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:18:7: ( '*' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:18:9: '*'
      {
        match('*');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__13"

  // $ANTLR start "T__14"
  public final void mT__14() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__14;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:19:7: ( '+' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:19:9: '+'
      {
        match('+');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__14"

  // $ANTLR start "T__15"
  public final void mT__15() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__15;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:20:7: ( ',' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:20:9: ','
      {
        match(',');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__15"

  // $ANTLR start "T__16"
  public final void mT__16() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__16;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:21:7: ( '-' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:21:9: '-'
      {
        match('-');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__16"

  // $ANTLR start "T__17"
  public final void mT__17() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__17;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:22:7: ( '.' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:22:9: '.'
      {
        match('.');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__17"

  // $ANTLR start "T__18"
  public final void mT__18() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__18;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:23:7: ( '/' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:23:9: '/'
      {
        match('/');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__18"

  // $ANTLR start "T__19"
  public final void mT__19() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__19;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:24:7: ( ';' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:24:9: ';'
      {
        match(';');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__19"

  // $ANTLR start "T__20"
  public final void mT__20() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__20;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:25:7: ( '<' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:25:9: '<'
      {
        match('<');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__20"

  // $ANTLR start "T__21"
  public final void mT__21() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__21;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:26:7: ( '<=' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:26:9: '<='
      {
        match("<=");

      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__21"

  // $ANTLR start "T__22"
  public final void mT__22() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__22;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:27:7: ( '=' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:27:9: '='
      {
        match('=');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__22"

  // $ANTLR start "T__23"
  public final void mT__23() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__23;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:28:7: ( '==' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:28:9: '=='
      {
        match("==");

      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__23"

  // $ANTLR start "T__24"
  public final void mT__24() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__24;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:29:7: ( '>' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:29:9: '>'
      {
        match('>');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__24"

  // $ANTLR start "T__25"
  public final void mT__25() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__25;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:30:7: ( '>=' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:30:9: '>='
      {
        match(">=");

      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__25"

  // $ANTLR start "T__26"
  public final void mT__26() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__26;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:31:7: ( '[' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:31:9: '['
      {
        match('[');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__26"

  // $ANTLR start "T__27"
  public final void mT__27() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__27;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:32:7: ( ']' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:32:9: ']'
      {
        match(']');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__27"

  // $ANTLR start "T__28"
  public final void mT__28() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__28;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:33:7: ( 'boolean' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:33:9: 'boolean'
      {
        match("boolean");

      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__28"

  // $ANTLR start "T__29"
  public final void mT__29() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__29;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:34:7: ( 'class' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:34:9: 'class'
      {
        match("class");

      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__29"

  // $ANTLR start "T__30"
  public final void mT__30() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__30;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:35:7: ( 'else' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:35:9: 'else'
      {
        match("else");

      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__30"

  // $ANTLR start "T__31"
  public final void mT__31() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__31;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:36:7: ( 'false' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:36:9: 'false'
      {
        match("false");

      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__31"
  // $ANTLR start "T__32"
  public final void mT__32() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__32;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:37:7: ( 'if' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:37:9: 'if'
      {
        match("if");

      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__32"
  // $ANTLR start "T__33"
  public final void mT__33() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__33;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:38:7: ( 'int' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:38:9: 'int'
      {
        match("int");

      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__33"
  // $ANTLR start "T__34"
  public final void mT__34() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__34;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:39:7: ( 'public' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:39:9: 'public'
      {
        match("public");

      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__34"
  // $ANTLR start "T__35"
  public final void mT__35() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__35;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:40:7: ( 'return' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:40:9: 'return'
      {
        match("return");

      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__35"
  // $ANTLR start "T__36"
  public final void mT__36() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__36;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:41:7: ( 'static' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:41:9: 'static'
      {
        match("static");

      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__36"
  // $ANTLR start "T__37"
  public final void mT__37() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__37;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:42:7: ( 'true' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:42:9: 'true'
      {
        match("true");

      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__37"
  // $ANTLR start "T__38"
  public final void mT__38() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__38;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:43:7: ( 'void' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:43:9: 'void'
      {
        match("void");

      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__38"

  // $ANTLR start "T__39"
  public final void mT__39() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__39;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:44:7: ( 'while' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:44:9: 'while'
      {
        match("while");

      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__39"
  // $ANTLR start "T__40"
  public final void mT__40() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__40;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:45:7: ( '{' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:45:9: '{'
      {
        match('{');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__40"
  // $ANTLR start "T__41"
  public final void mT__41() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__41;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:46:7: ( '||' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:46:9: '||'
      {
        match("||");

      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__41"
  // $ANTLR start "T__42"
  public final void mT__42() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__42;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:47:7: ( '}' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:47:9: '}'
      {
        match('}');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__42"
  // $ANTLR start "T__7"
  public final void mT__7() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__7;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:12:6: ( '!' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:12:8: '!'
      {
        match('!');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__7"
  // $ANTLR start "T__8"
  public final void mT__8() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__8;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:13:6: ( '!=' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:13:8: '!='
      {
        match("!=");

      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__8"
  // $ANTLR start "T__9"
  public final void mT__9() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.T__9;
      final int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:14:6: ( '%' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:14:8: '%'
      {
        match('%');
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "T__9"

  @Override
  public void mTokens() throws RecognitionException {
    // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | ID | NUM_INT | WS )
    int alt4 = 39;
    alt4 = this.dfa4.predict(this.input);
    switch (alt4) {
      case 1:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:10: T__7
      {
        mT__7();

      }
        break;
      case 2:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:15: T__8
      {
        mT__8();

      }
        break;
      case 3:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:20: T__9
      {
        mT__9();

      }
        break;
      case 4:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:25: T__10
      {
        mT__10();

      }
        break;
      case 5:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:31: T__11
      {
        mT__11();

      }
        break;
      case 6:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:37: T__12
      {
        mT__12();

      }
        break;
      case 7:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:43: T__13
      {
        mT__13();

      }
        break;
      case 8:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:49: T__14
      {
        mT__14();

      }
        break;
      case 9:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:55: T__15
      {
        mT__15();

      }
        break;
      case 10:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:61: T__16
      {
        mT__16();

      }
        break;
      case 11:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:67: T__17
      {
        mT__17();

      }
        break;
      case 12:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:73: T__18
      {
        mT__18();

      }
        break;
      case 13:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:79: T__19
      {
        mT__19();

      }
        break;
      case 14:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:85: T__20
      {
        mT__20();

      }
        break;
      case 15:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:91: T__21
      {
        mT__21();

      }
        break;
      case 16:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:97: T__22
      {
        mT__22();

      }
        break;
      case 17:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:103: T__23
      {
        mT__23();

      }
        break;
      case 18:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:109: T__24
      {
        mT__24();

      }
        break;
      case 19:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:115: T__25
      {
        mT__25();

      }
        break;
      case 20:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:121: T__26
      {
        mT__26();

      }
        break;
      case 21:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:127: T__27
      {
        mT__27();

      }
        break;
      case 22:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:133: T__28
      {
        mT__28();

      }
        break;
      case 23:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:139: T__29
      {
        mT__29();

      }
        break;
      case 24:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:145: T__30
      {
        mT__30();

      }
        break;
      case 25:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:151: T__31
      {
        mT__31();

      }
        break;
      case 26:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:157: T__32
      {
        mT__32();

      }
        break;
      case 27:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:163: T__33
      {
        mT__33();

      }
        break;
      case 28:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:169: T__34
      {
        mT__34();

      }
        break;
      case 29:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:175: T__35
      {
        mT__35();

      }
        break;
      case 30:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:181: T__36
      {
        mT__36();

      }
        break;
      case 31:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:187: T__37
      {
        mT__37();

      }
        break;
      case 32:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:193: T__38
      {
        mT__38();

      }
        break;
      case 33:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:199: T__39
      {
        mT__39();

      }
        break;
      case 34:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:205: T__40
      {
        mT__40();

      }
        break;
      case 35:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:211: T__41
      {
        mT__41();

      }
        break;
      case 36:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:217: T__42
      {
        mT__42();

      }
        break;
      case 37:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:223: ID
      {
        mID();

      }
        break;
      case 38:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:226: NUM_INT
      {
        mNUM_INT();

      }
        break;
      case 39:
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:1:234: WS
      {
        mWS();

      }
        break;

    }
  }

  // $ANTLR start "WS"
  public final void mWS() throws RecognitionException {
    try {
      final int _type = StaticJavaASTLexer.WS;
      int _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:360:2: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:360:4: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
      {
        if (((this.input.LA(1) >= '\t') && (this.input.LA(1) <= '\n'))
            || ((this.input.LA(1) >= '\f') && (this.input.LA(1) <= '\r'))
            || (this.input.LA(1) == ' ')) {
          this.input.consume();
        } else {
          final MismatchedSetException mse = new MismatchedSetException(null,
              this.input);
          recover(mse);
          throw mse;
        }
        _channel = BaseRecognizer.HIDDEN;
      }

      this.state.type = _type;
      this.state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "WS"

}
