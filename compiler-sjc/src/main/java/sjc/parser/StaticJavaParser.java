// $ANTLR 3.5 /compiler-sjc/src-sjc/sjc/parser/StaticJava.g 2013-07-08 18:25:41

package sjc.parser;

import java.math.BigInteger;
/**
 * StaticJava parser.
 *
 * @author robby
 */
import org.antlr.runtime.BitSet;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

@SuppressWarnings("all")
public class StaticJavaParser extends Parser {
  public static final String[] tokenNames = new String[] { "<invalid>",
      "<EOR>", "<DOWN>", "<UP>", "ID", "NUM_INT", "WS", "'!'", "'!='", "'%'",
      "'&&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "';'",
      "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'['", "']'", "'boolean'",
      "'class'", "'else'", "'false'", "'if'", "'int'", "'null'", "'public'",
      "'return'", "'static'", "'true'", "'void'", "'while'", "'{'", "'||'",
      "'}'" };
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
  public static final int T__43 = 43;
  public static final int ID = 4;
  public static final int NUM_INT = 5;
  public static final int WS = 6;

  public static final BitSet FOLLOW_classDefinition_in_compilationUnit39 = new BitSet(
      new long[] { 0x0000000000000000L });

  // delegators

  public static final BitSet FOLLOW_EOF_in_compilationUnit43 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_35_in_classDefinition54 = new BitSet(
      new long[] { 0x0000000020000000L });

  public static final BitSet FOLLOW_29_in_classDefinition56 = new BitSet(
      new long[] { 0x0000000000000010L });
  public static final BitSet FOLLOW_ID_in_classDefinition58 = new BitSet(
      new long[] { 0x0000020000000000L });

  public static final BitSet FOLLOW_41_in_classDefinition60 = new BitSet(
      new long[] { 0x0000000800000000L });

  public static final BitSet FOLLOW_mainMethodDeclaration_in_classDefinition65 = new BitSet(
      new long[] { 0x0000082000000000L });

  public static final BitSet FOLLOW_fieldDeclaration_in_classDefinition71 = new BitSet(
      new long[] { 0x0000082000000000L });

  public static final BitSet FOLLOW_methodDeclaration_in_classDefinition77 = new BitSet(
      new long[] { 0x0000082000000000L });

  public static final BitSet FOLLOW_43_in_classDefinition84 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_35_in_mainMethodDeclaration95 = new BitSet(
      new long[] { 0x0000002000000000L });

  public static final BitSet FOLLOW_37_in_mainMethodDeclaration97 = new BitSet(
      new long[] { 0x0000008000000000L });

  public static final BitSet FOLLOW_39_in_mainMethodDeclaration99 = new BitSet(
      new long[] { 0x0000000000000010L });

  public static final BitSet FOLLOW_ID_in_mainMethodDeclaration108 = new BitSet(
      new long[] { 0x0000000000000800L });

  public static final BitSet FOLLOW_11_in_mainMethodDeclaration123 = new BitSet(
      new long[] { 0x0000000000000010L });

  public static final BitSet FOLLOW_ID_in_mainMethodDeclaration127 = new BitSet(
      new long[] { 0x0000000004000000L });

  public static final BitSet FOLLOW_26_in_mainMethodDeclaration129 = new BitSet(
      new long[] { 0x0000000008000000L });

  public static final BitSet FOLLOW_27_in_mainMethodDeclaration131 = new BitSet(
      new long[] { 0x0000000000000010L });

  public static final BitSet FOLLOW_ID_in_mainMethodDeclaration146 = new BitSet(
      new long[] { 0x0000000000001000L });

  public static final BitSet FOLLOW_12_in_mainMethodDeclaration153 = new BitSet(
      new long[] { 0x0000020000000000L });

  public static final BitSet FOLLOW_41_in_mainMethodDeclaration155 = new BitSet(
      new long[] { 0x0000091310000010L });

  public static final BitSet FOLLOW_methodBody_in_mainMethodDeclaration157 = new BitSet(
      new long[] { 0x0000080000000000L });

  public static final BitSet FOLLOW_43_in_mainMethodDeclaration159 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_37_in_fieldDeclaration171 = new BitSet(
      new long[] { 0x0000000210000000L });

  public static final BitSet FOLLOW_type_in_fieldDeclaration173 = new BitSet(
      new long[] { 0x0000000000000010L });

  public static final BitSet FOLLOW_ID_in_fieldDeclaration175 = new BitSet(
      new long[] { 0x0000000000080000L });

  public static final BitSet FOLLOW_19_in_fieldDeclaration177 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_37_in_methodDeclaration189 = new BitSet(
      new long[] { 0x0000008210000000L });

  public static final BitSet FOLLOW_returnType_in_methodDeclaration191 = new BitSet(
      new long[] { 0x0000000000000010L });

  public static final BitSet FOLLOW_ID_in_methodDeclaration193 = new BitSet(
      new long[] { 0x0000000000000800L });

  public static final BitSet FOLLOW_11_in_methodDeclaration197 = new BitSet(
      new long[] { 0x0000000210001000L });

  public static final BitSet FOLLOW_params_in_methodDeclaration201 = new BitSet(
      new long[] { 0x0000000000001000L });

  public static final BitSet FOLLOW_12_in_methodDeclaration206 = new BitSet(
      new long[] { 0x0000020000000000L });

  public static final BitSet FOLLOW_41_in_methodDeclaration210 = new BitSet(
      new long[] { 0x0000091310000010L });

  public static final BitSet FOLLOW_methodBody_in_methodDeclaration212 = new BitSet(
      new long[] { 0x0000080000000000L });

  // Delegated rules

  public static final BitSet FOLLOW_43_in_methodDeclaration214 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_39_in_returnType240 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_type_in_returnType244 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_param_in_params256 = new BitSet(
      new long[] { 0x0000000000008002L });
  public static final BitSet FOLLOW_15_in_params260 = new BitSet(
      new long[] { 0x0000000210000000L });
  public static final BitSet FOLLOW_param_in_params262 = new BitSet(
      new long[] { 0x0000000000008002L });
  public static final BitSet FOLLOW_type_in_param277 = new BitSet(
      new long[] { 0x0000000000000010L });
  public static final BitSet FOLLOW_ID_in_param279 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_localDeclaration_in_methodBody290 = new BitSet(
      new long[] { 0x0000011310000012L });
  public static final BitSet FOLLOW_statement_in_methodBody296 = new BitSet(
      new long[] { 0x0000011100000012L });
  public static final BitSet FOLLOW_type_in_localDeclaration308 = new BitSet(
      new long[] { 0x0000000000000010L });
  public static final BitSet FOLLOW_ID_in_localDeclaration310 = new BitSet(
      new long[] { 0x0000000000080000L });
  public static final BitSet FOLLOW_19_in_localDeclaration312 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_assignStatement_in_statement326 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_ifStatement_in_statement332 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_whileStatement_in_statement338 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_invokeExpStatement_in_statement344 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_returnStatement_in_statement350 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_ID_in_assignStatement366 = new BitSet(
      new long[] { 0x0000000000400000L });
  public static final BitSet FOLLOW_22_in_assignStatement368 = new BitSet(
      new long[] { 0x00000044800148B0L });
  public static final BitSet FOLLOW_exp_in_assignStatement370 = new BitSet(
      new long[] { 0x0000000000080000L });
  public static final BitSet FOLLOW_19_in_assignStatement372 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_32_in_ifStatement384 = new BitSet(
      new long[] { 0x0000000000000800L });
  public static final BitSet FOLLOW_11_in_ifStatement386 = new BitSet(
      new long[] { 0x00000044800148B0L });
  public static final BitSet FOLLOW_exp_in_ifStatement388 = new BitSet(
      new long[] { 0x0000000000001000L });
  public static final BitSet FOLLOW_12_in_ifStatement390 = new BitSet(
      new long[] { 0x0000020000000000L });
  public static final BitSet FOLLOW_41_in_ifStatement394 = new BitSet(
      new long[] { 0x0000091100000010L });
  public static final BitSet FOLLOW_statement_in_ifStatement398 = new BitSet(
      new long[] { 0x0000091100000010L });
  public static final BitSet FOLLOW_43_in_ifStatement403 = new BitSet(
      new long[] { 0x0000000040000002L });
  public static final BitSet FOLLOW_30_in_ifStatement409 = new BitSet(
      new long[] { 0x0000020000000000L });
  public static final BitSet FOLLOW_41_in_ifStatement411 = new BitSet(
      new long[] { 0x0000091100000010L });
  public static final BitSet FOLLOW_statement_in_ifStatement415 = new BitSet(
      new long[] { 0x0000091100000010L });
  public static final BitSet FOLLOW_43_in_ifStatement422 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_40_in_whileStatement437 = new BitSet(
      new long[] { 0x0000000000000800L });
  public static final BitSet FOLLOW_11_in_whileStatement439 = new BitSet(
      new long[] { 0x00000044800148B0L });
  public static final BitSet FOLLOW_exp_in_whileStatement441 = new BitSet(
      new long[] { 0x0000000000001000L });
  public static final BitSet FOLLOW_12_in_whileStatement443 = new BitSet(
      new long[] { 0x0000020000000000L });
  public static final BitSet FOLLOW_41_in_whileStatement447 = new BitSet(
      new long[] { 0x0000091100000010L });
  public static final BitSet FOLLOW_statement_in_whileStatement451 = new BitSet(
      new long[] { 0x0000091100000010L });
  public static final BitSet FOLLOW_43_in_whileStatement456 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_invokeExp_in_invokeExpStatement468 = new BitSet(
      new long[] { 0x0000000000080000L });
  public static final BitSet FOLLOW_19_in_invokeExpStatement470 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_36_in_returnStatement482 = new BitSet(
      new long[] { 0x00000044800948B0L });
  public static final BitSet FOLLOW_exp_in_returnStatement486 = new BitSet(
      new long[] { 0x0000000000080000L });
  public static final BitSet FOLLOW_19_in_returnStatement491 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_logicalOrExp_in_exp503 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_logicalAndExp_in_logicalOrExp515 = new BitSet(
      new long[] { 0x0000040000000002L });
  public static final BitSet FOLLOW_42_in_logicalOrExp519 = new BitSet(
      new long[] { 0x00000044800148B0L });
  public static final BitSet FOLLOW_logicalAndExp_in_logicalOrExp521 = new BitSet(
      new long[] { 0x0000040000000002L });
  public static final BitSet FOLLOW_equalityExp_in_logicalAndExp536 = new BitSet(
      new long[] { 0x0000000000000402L });
  public static final BitSet FOLLOW_10_in_logicalAndExp540 = new BitSet(
      new long[] { 0x00000044800148B0L });
  public static final BitSet FOLLOW_equalityExp_in_logicalAndExp542 = new BitSet(
      new long[] { 0x0000000000000402L });
  public static final BitSet FOLLOW_relationalExp_in_equalityExp557 = new BitSet(
      new long[] { 0x0000000000800102L });
  public static final BitSet FOLLOW_set_in_equalityExp561 = new BitSet(
      new long[] { 0x00000044800148B0L });
  public static final BitSet FOLLOW_relationalExp_in_equalityExp569 = new BitSet(
      new long[] { 0x0000000000800102L });
  public static final BitSet FOLLOW_additiveExp_in_relationalExp584 = new BitSet(
      new long[] { 0x0000000003300002L });
  public static final BitSet FOLLOW_set_in_relationalExp588 = new BitSet(
      new long[] { 0x00000044800148B0L });
  public static final BitSet FOLLOW_additiveExp_in_relationalExp606 = new BitSet(
      new long[] { 0x0000000003300002L });
  public static final BitSet FOLLOW_multiplicativeExp_in_additiveExp621 = new BitSet(
      new long[] { 0x0000000000014002L });
  public static final BitSet FOLLOW_set_in_additiveExp625 = new BitSet(
      new long[] { 0x00000044800148B0L });
  public static final BitSet FOLLOW_multiplicativeExp_in_additiveExp635 = new BitSet(
      new long[] { 0x0000000000014002L });
  public static final BitSet FOLLOW_unaryExp_in_multiplicativeExp650 = new BitSet(
      new long[] { 0x0000000000042202L });
  public static final BitSet FOLLOW_set_in_multiplicativeExp654 = new BitSet(
      new long[] { 0x00000044800148B0L });
  public static final BitSet FOLLOW_unaryExp_in_multiplicativeExp668 = new BitSet(
      new long[] { 0x0000000000042202L });
  public static final BitSet FOLLOW_16_in_unaryExp683 = new BitSet(
      new long[] { 0x00000044800148B0L });
  public static final BitSet FOLLOW_unaryExp_in_unaryExp685 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_14_in_unaryExp690 = new BitSet(
      new long[] { 0x00000044800148B0L });
  public static final BitSet FOLLOW_unaryExp_in_unaryExp692 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_unaryExpNotPlusMinus_in_unaryExp697 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_7_in_unaryExpNotPlusMinus709 = new BitSet(
      new long[] { 0x00000044800148B0L });
  public static final BitSet FOLLOW_unaryExp_in_unaryExpNotPlusMinus711 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_primaryExp_in_unaryExpNotPlusMinus716 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_NUM_INT_in_primaryExp730 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_38_in_primaryExp739 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_31_in_primaryExp744 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_34_in_primaryExp749 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_11_in_primaryExp754 = new BitSet(
      new long[] { 0x00000044800148B0L });
  public static final BitSet FOLLOW_exp_in_primaryExp756 = new BitSet(
      new long[] { 0x0000000000001000L });
  public static final BitSet FOLLOW_12_in_primaryExp758 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_invokeExp_in_primaryExp763 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_ID_in_primaryExp768 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_ID_in_invokeExp782 = new BitSet(
      new long[] { 0x0000000000020000L });
  public static final BitSet FOLLOW_17_in_invokeExp784 = new BitSet(
      new long[] { 0x0000000000000010L });
  public static final BitSet FOLLOW_ID_in_invokeExp791 = new BitSet(
      new long[] { 0x0000000000000800L });
  public static final BitSet FOLLOW_11_in_invokeExp793 = new BitSet(
      new long[] { 0x00000044800158B0L });
  public static final BitSet FOLLOW_args_in_invokeExp797 = new BitSet(
      new long[] { 0x0000000000001000L });
  public static final BitSet FOLLOW_12_in_invokeExp802 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_exp_in_args814 = new BitSet(
      new long[] { 0x0000000000008002L });
  public static final BitSet FOLLOW_15_in_args818 = new BitSet(
      new long[] { 0x00000044800148B0L });
  public static final BitSet FOLLOW_exp_in_args820 = new BitSet(
      new long[] { 0x0000000000008002L });

  public StaticJavaParser(final TokenStream input) {
    this(input, new RecognizerSharedState());
  }

  public StaticJavaParser(final TokenStream input,
      final RecognizerSharedState state) {
    super(input, state);
  }

  // $ANTLR start "additiveExp"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:153:1: additiveExp : multiplicativeExp ( ( '+' | '-' ) multiplicativeExp )* ;
  public final void additiveExp() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:154:2: ( multiplicativeExp ( ( '+' | '-' ) multiplicativeExp )* )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:154:4: multiplicativeExp ( ( '+' | '-' ) multiplicativeExp )*
      {
        pushFollow(StaticJavaParser.FOLLOW_multiplicativeExp_in_additiveExp621);
        multiplicativeExp();
        this.state._fsp--;

        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:154:22: ( ( '+' | '-' ) multiplicativeExp )*
        loop17: while (true) {
          int alt17 = 2;
          final int LA17_0 = this.input.LA(1);
          if (((LA17_0 == 14) || (LA17_0 == 16))) {
            alt17 = 1;
          }

          switch (alt17) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:154:24: ( '+' | '-' ) multiplicativeExp
            {
              if ((this.input.LA(1) == 14) || (this.input.LA(1) == 16)) {
                this.input.consume();
                this.state.errorRecovery = false;
              } else {
                final MismatchedSetException mse = new MismatchedSetException(
                    null, this.input);
                throw mse;
              }
              pushFollow(StaticJavaParser.FOLLOW_multiplicativeExp_in_additiveExp635);
              multiplicativeExp();
              this.state._fsp--;

            }
              break;

            default:
              break loop17;
          }
        }

      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "additiveExp"
  // $ANTLR start "args"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:188:1: args : exp ( ',' exp )* ;
  public final void args() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:189:2: ( exp ( ',' exp )* )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:189:4: exp ( ',' exp )*
      {
        pushFollow(StaticJavaParser.FOLLOW_exp_in_args814);
        exp();
        this.state._fsp--;

        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:189:8: ( ',' exp )*
        loop24: while (true) {
          int alt24 = 2;
          final int LA24_0 = this.input.LA(1);
          if ((LA24_0 == 15)) {
            alt24 = 1;
          }

          switch (alt24) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:189:10: ',' exp
            {
              match(this.input, 15, StaticJavaParser.FOLLOW_15_in_args818);
              pushFollow(StaticJavaParser.FOLLOW_exp_in_args820);
              exp();
              this.state._fsp--;

            }
              break;

            default:
              break loop24;
          }
        }

      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "args"
  // $ANTLR start "assignStatement"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:109:1: assignStatement : ID '=' exp ';' ;
  public final void assignStatement() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:110:2: ( ID '=' exp ';' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:110:4: ID '=' exp ';'
      {
        match(
            this.input,
            StaticJavaParser.ID,
            StaticJavaParser.FOLLOW_ID_in_assignStatement366);
        match(this.input, 22, StaticJavaParser.FOLLOW_22_in_assignStatement368);
        pushFollow(StaticJavaParser.FOLLOW_exp_in_assignStatement370);
        exp();
        this.state._fsp--;

        match(this.input, 19, StaticJavaParser.FOLLOW_19_in_assignStatement372);
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "assignStatement"
  // $ANTLR start "classDefinition"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:48:1: classDefinition : 'public' 'class' ID '{' mainMethodDeclaration ( fieldDeclaration | methodDeclaration )* '}' ;
  public final void classDefinition() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:49:2: ( 'public' 'class' ID '{' mainMethodDeclaration ( fieldDeclaration | methodDeclaration )* '}' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:49:4: 'public' 'class' ID '{' mainMethodDeclaration ( fieldDeclaration | methodDeclaration )* '}'
      {
        match(this.input, 35, StaticJavaParser.FOLLOW_35_in_classDefinition54);
        match(this.input, 29, StaticJavaParser.FOLLOW_29_in_classDefinition56);
        match(
            this.input,
            StaticJavaParser.ID,
            StaticJavaParser.FOLLOW_ID_in_classDefinition58);
        match(this.input, 41, StaticJavaParser.FOLLOW_41_in_classDefinition60);
        pushFollow(StaticJavaParser.FOLLOW_mainMethodDeclaration_in_classDefinition65);
        mainMethodDeclaration();
        this.state._fsp--;

        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:51:3: ( fieldDeclaration | methodDeclaration )*
        loop1: while (true) {
          int alt1 = 3;
          final int LA1_0 = this.input.LA(1);
          if ((LA1_0 == 37)) {
            final int LA1_2 = this.input.LA(2);
            if (((LA1_2 == 28) || (LA1_2 == 33))) {
              final int LA1_3 = this.input.LA(3);
              if ((LA1_3 == StaticJavaParser.ID)) {
                final int LA1_5 = this.input.LA(4);
                if ((LA1_5 == 19)) {
                  alt1 = 1;
                } else if ((LA1_5 == 11)) {
                  alt1 = 2;
                }

              }

            } else if ((LA1_2 == 39)) {
              alt1 = 2;
            }

          }

          switch (alt1) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:51:5: fieldDeclaration
            {
              pushFollow(StaticJavaParser.FOLLOW_fieldDeclaration_in_classDefinition71);
              fieldDeclaration();
              this.state._fsp--;

            }
              break;
            case 2:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:52:5: methodDeclaration
            {
              pushFollow(StaticJavaParser.FOLLOW_methodDeclaration_in_classDefinition77);
              methodDeclaration();
              this.state._fsp--;

            }
              break;

            default:
              break loop1;
          }
        }

        match(this.input, 43, StaticJavaParser.FOLLOW_43_in_classDefinition84);
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "classDefinition"
  // $ANTLR start "compilationUnit"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:43:1: compilationUnit : classDefinition EOF ;
  public final void compilationUnit() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:44:2: ( classDefinition EOF )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:44:4: classDefinition EOF
      {
        pushFollow(StaticJavaParser.FOLLOW_classDefinition_in_compilationUnit39);
        classDefinition();
        this.state._fsp--;

        match(
            this.input,
            StaticJavaParser.EOF,
            StaticJavaParser.FOLLOW_EOF_in_compilationUnit43);
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "compilationUnit"
  // $ANTLR start "equalityExp"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:145:1: equalityExp : relationalExp ( ( '!=' | '==' ) relationalExp )* ;
  public final void equalityExp() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:146:2: ( relationalExp ( ( '!=' | '==' ) relationalExp )* )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:146:4: relationalExp ( ( '!=' | '==' ) relationalExp )*
      {
        pushFollow(StaticJavaParser.FOLLOW_relationalExp_in_equalityExp557);
        relationalExp();
        this.state._fsp--;

        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:146:18: ( ( '!=' | '==' ) relationalExp )*
        loop15: while (true) {
          int alt15 = 2;
          final int LA15_0 = this.input.LA(1);
          if (((LA15_0 == 8) || (LA15_0 == 23))) {
            alt15 = 1;
          }

          switch (alt15) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:146:20: ( '!=' | '==' ) relationalExp
            {
              if ((this.input.LA(1) == 8) || (this.input.LA(1) == 23)) {
                this.input.consume();
                this.state.errorRecovery = false;
              } else {
                final MismatchedSetException mse = new MismatchedSetException(
                    null, this.input);
                throw mse;
              }
              pushFollow(StaticJavaParser.FOLLOW_relationalExp_in_equalityExp569);
              relationalExp();
              this.state._fsp--;

            }
              break;

            default:
              break loop15;
          }
        }

      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "equalityExp"
  // $ANTLR start "exp"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:133:1: exp : logicalOrExp ;
  public final void exp() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:134:2: ( logicalOrExp )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:134:4: logicalOrExp
      {
        pushFollow(StaticJavaParser.FOLLOW_logicalOrExp_in_exp503);
        logicalOrExp();
        this.state._fsp--;

      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "exp"
  // $ANTLR start "fieldDeclaration"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:66:1: fieldDeclaration : 'static' type ID ';' ;
  public final void fieldDeclaration() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:67:2: ( 'static' type ID ';' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:67:4: 'static' type ID ';'
      {
        match(this.input, 37, StaticJavaParser.FOLLOW_37_in_fieldDeclaration171);
        pushFollow(StaticJavaParser.FOLLOW_type_in_fieldDeclaration173);
        type();
        this.state._fsp--;

        match(
            this.input,
            StaticJavaParser.ID,
            StaticJavaParser.FOLLOW_ID_in_fieldDeclaration175);
        match(this.input, 19, StaticJavaParser.FOLLOW_19_in_fieldDeclaration177);
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "fieldDeclaration"
  // delegates
  public Parser[] getDelegates() {
    return new Parser[] {};
  }

  @Override
  public String getGrammarFileName() {
    return "/compiler-sjc/src-sjc/sjc/parser/StaticJava.g";
  }

  @Override
  public String[] getTokenNames() {
    return StaticJavaParser.tokenNames;
  }

  // $ANTLR start "ifStatement"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:113:1: ifStatement : 'if' '(' exp ')' '{' ( statement )* '}' ( 'else' '{' ( statement )* '}' )? ;
  public final void ifStatement() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:114:2: ( 'if' '(' exp ')' '{' ( statement )* '}' ( 'else' '{' ( statement )* '}' )? )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:114:4: 'if' '(' exp ')' '{' ( statement )* '}' ( 'else' '{' ( statement )* '}' )?
      {
        match(this.input, 32, StaticJavaParser.FOLLOW_32_in_ifStatement384);
        match(this.input, 11, StaticJavaParser.FOLLOW_11_in_ifStatement386);
        pushFollow(StaticJavaParser.FOLLOW_exp_in_ifStatement388);
        exp();
        this.state._fsp--;

        match(this.input, 12, StaticJavaParser.FOLLOW_12_in_ifStatement390);
        match(this.input, 41, StaticJavaParser.FOLLOW_41_in_ifStatement394);
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:115:7: ( statement )*
        loop8: while (true) {
          int alt8 = 2;
          final int LA8_0 = this.input.LA(1);
          if (((LA8_0 == StaticJavaParser.ID) || (LA8_0 == 32) || (LA8_0 == 36) || (LA8_0 == 40))) {
            alt8 = 1;
          }

          switch (alt8) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:115:9: statement
            {
              pushFollow(StaticJavaParser.FOLLOW_statement_in_ifStatement398);
              statement();
              this.state._fsp--;

            }
              break;

            default:
              break loop8;
          }
        }

        match(this.input, 43, StaticJavaParser.FOLLOW_43_in_ifStatement403);
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:116:3: ( 'else' '{' ( statement )* '}' )?
        int alt10 = 2;
        final int LA10_0 = this.input.LA(1);
        if ((LA10_0 == 30)) {
          alt10 = 1;
        }
        switch (alt10) {
          case 1:
          // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:116:5: 'else' '{' ( statement )* '}'
          {
            match(this.input, 30, StaticJavaParser.FOLLOW_30_in_ifStatement409);
            match(this.input, 41, StaticJavaParser.FOLLOW_41_in_ifStatement411);
            // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:116:16: ( statement )*
            loop9: while (true) {
              int alt9 = 2;
              final int LA9_0 = this.input.LA(1);
              if (((LA9_0 == StaticJavaParser.ID) || (LA9_0 == 32)
                  || (LA9_0 == 36) || (LA9_0 == 40))) {
                alt9 = 1;
              }

              switch (alt9) {
                case 1:
                // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:116:18: statement
                {
                  pushFollow(StaticJavaParser.FOLLOW_statement_in_ifStatement415);
                  statement();
                  this.state._fsp--;

                }
                  break;

                default:
                  break loop9;
              }
            }

            match(this.input, 43, StaticJavaParser.FOLLOW_43_in_ifStatement422);
          }
            break;

        }

      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "ifStatement"
  // $ANTLR start "invokeExp"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:183:1: invokeExp : ( ID '.' )? ID '(' ( args )? ')' ;
  public final void invokeExp() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:184:2: ( ( ID '.' )? ID '(' ( args )? ')' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:184:4: ( ID '.' )? ID '(' ( args )? ')'
      {
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:184:4: ( ID '.' )?
        int alt22 = 2;
        final int LA22_0 = this.input.LA(1);
        if ((LA22_0 == StaticJavaParser.ID)) {
          final int LA22_1 = this.input.LA(2);
          if ((LA22_1 == 17)) {
            alt22 = 1;
          }
        }
        switch (alt22) {
          case 1:
          // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:184:6: ID '.'
          {
            match(
                this.input,
                StaticJavaParser.ID,
                StaticJavaParser.FOLLOW_ID_in_invokeExp782);
            match(this.input, 17, StaticJavaParser.FOLLOW_17_in_invokeExp784);
          }
            break;

        }

        match(
            this.input,
            StaticJavaParser.ID,
            StaticJavaParser.FOLLOW_ID_in_invokeExp791);
        match(this.input, 11, StaticJavaParser.FOLLOW_11_in_invokeExp793);
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:185:10: ( args )?
        int alt23 = 2;
        final int LA23_0 = this.input.LA(1);
        if ((((LA23_0 >= StaticJavaParser.ID) && (LA23_0 <= StaticJavaParser.NUM_INT))
            || (LA23_0 == 7)
            || (LA23_0 == 11)
            || (LA23_0 == 14)
            || (LA23_0 == 16) || (LA23_0 == 31) || (LA23_0 == 34) || (LA23_0 == 38))) {
          alt23 = 1;
        }
        switch (alt23) {
          case 1:
          // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:185:12: args
          {
            pushFollow(StaticJavaParser.FOLLOW_args_in_invokeExp797);
            args();
            this.state._fsp--;

          }
            break;

        }

        match(this.input, 12, StaticJavaParser.FOLLOW_12_in_invokeExp802);
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "invokeExp"
  // $ANTLR start "invokeExpStatement"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:125:1: invokeExpStatement : invokeExp ';' ;
  public final void invokeExpStatement() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:126:2: ( invokeExp ';' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:126:4: invokeExp ';'
      {
        pushFollow(StaticJavaParser.FOLLOW_invokeExp_in_invokeExpStatement468);
        invokeExp();
        this.state._fsp--;

        match(
            this.input,
            19,
            StaticJavaParser.FOLLOW_19_in_invokeExpStatement470);
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "invokeExpStatement"
  // $ANTLR start "localDeclaration"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:96:1: localDeclaration : type ID ';' ;
  public final void localDeclaration() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:97:2: ( type ID ';' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:97:4: type ID ';'
      {
        pushFollow(StaticJavaParser.FOLLOW_type_in_localDeclaration308);
        type();
        this.state._fsp--;

        match(
            this.input,
            StaticJavaParser.ID,
            StaticJavaParser.FOLLOW_ID_in_localDeclaration310);
        match(this.input, 19, StaticJavaParser.FOLLOW_19_in_localDeclaration312);
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "localDeclaration"
  // $ANTLR start "logicalAndExp"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:141:1: logicalAndExp : equalityExp ( '&&' equalityExp )* ;
  public final void logicalAndExp() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:142:2: ( equalityExp ( '&&' equalityExp )* )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:142:4: equalityExp ( '&&' equalityExp )*
      {
        pushFollow(StaticJavaParser.FOLLOW_equalityExp_in_logicalAndExp536);
        equalityExp();
        this.state._fsp--;

        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:142:16: ( '&&' equalityExp )*
        loop14: while (true) {
          int alt14 = 2;
          final int LA14_0 = this.input.LA(1);
          if ((LA14_0 == 10)) {
            alt14 = 1;
          }

          switch (alt14) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:142:18: '&&' equalityExp
            {
              match(
                  this.input,
                  10,
                  StaticJavaParser.FOLLOW_10_in_logicalAndExp540);
              pushFollow(StaticJavaParser.FOLLOW_equalityExp_in_logicalAndExp542);
              equalityExp();
              this.state._fsp--;

            }
              break;

            default:
              break loop14;
          }
        }

      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "logicalAndExp"
  // $ANTLR start "logicalOrExp"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:137:1: logicalOrExp : logicalAndExp ( '||' logicalAndExp )* ;
  public final void logicalOrExp() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:138:2: ( logicalAndExp ( '||' logicalAndExp )* )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:138:4: logicalAndExp ( '||' logicalAndExp )*
      {
        pushFollow(StaticJavaParser.FOLLOW_logicalAndExp_in_logicalOrExp515);
        logicalAndExp();
        this.state._fsp--;

        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:138:18: ( '||' logicalAndExp )*
        loop13: while (true) {
          int alt13 = 2;
          final int LA13_0 = this.input.LA(1);
          if ((LA13_0 == 42)) {
            alt13 = 1;
          }

          switch (alt13) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:138:20: '||' logicalAndExp
            {
              match(
                  this.input,
                  42,
                  StaticJavaParser.FOLLOW_42_in_logicalOrExp519);
              pushFollow(StaticJavaParser.FOLLOW_logicalAndExp_in_logicalOrExp521);
              logicalAndExp();
              this.state._fsp--;

            }
              break;

            default:
              break loop13;
          }
        }

      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "logicalOrExp"
  // $ANTLR start "mainMethodDeclaration"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:56:1: mainMethodDeclaration : 'public' 'static' 'void' id1= ID {...}? '(' id2= ID '[' ']' {...}? ID ')' '{' methodBody '}' ;
  public final void mainMethodDeclaration() throws RecognitionException {
    Token id1 = null;
    Token id2 = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:57:2: ( 'public' 'static' 'void' id1= ID {...}? '(' id2= ID '[' ']' {...}? ID ')' '{' methodBody '}' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:57:4: 'public' 'static' 'void' id1= ID {...}? '(' id2= ID '[' ']' {...}? ID ')' '{' methodBody '}'
      {
        match(
            this.input,
            35,
            StaticJavaParser.FOLLOW_35_in_mainMethodDeclaration95);
        match(
            this.input,
            37,
            StaticJavaParser.FOLLOW_37_in_mainMethodDeclaration97);
        match(
            this.input,
            39,
            StaticJavaParser.FOLLOW_39_in_mainMethodDeclaration99);
        id1 = (Token) match(
            this.input,
            StaticJavaParser.ID,
            StaticJavaParser.FOLLOW_ID_in_mainMethodDeclaration108);
        if (!(("main".equals(id1.getText())))) {
          throw new FailedPredicateException(this.input,
              "mainMethodDeclaration", " \"main\".equals(id1.getText()) ");
        }
        match(
            this.input,
            11,
            StaticJavaParser.FOLLOW_11_in_mainMethodDeclaration123);
        id2 = (Token) match(
            this.input,
            StaticJavaParser.ID,
            StaticJavaParser.FOLLOW_ID_in_mainMethodDeclaration127);
        match(
            this.input,
            26,
            StaticJavaParser.FOLLOW_26_in_mainMethodDeclaration129);
        match(
            this.input,
            27,
            StaticJavaParser.FOLLOW_27_in_mainMethodDeclaration131);
        if (!(("String".equals(id2.getText())))) {
          throw new FailedPredicateException(this.input,
              "mainMethodDeclaration", " \"String\".equals(id2.getText()) ");
        }
        match(
            this.input,
            StaticJavaParser.ID,
            StaticJavaParser.FOLLOW_ID_in_mainMethodDeclaration146);
        match(
            this.input,
            12,
            StaticJavaParser.FOLLOW_12_in_mainMethodDeclaration153);
        match(
            this.input,
            41,
            StaticJavaParser.FOLLOW_41_in_mainMethodDeclaration155);
        pushFollow(StaticJavaParser.FOLLOW_methodBody_in_mainMethodDeclaration157);
        methodBody();
        this.state._fsp--;

        match(
            this.input,
            43,
            StaticJavaParser.FOLLOW_43_in_mainMethodDeclaration159);
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "mainMethodDeclaration"
  // $ANTLR start "methodBody"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:91:1: methodBody : ( localDeclaration )* ( statement )* ;
  public final void methodBody() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:92:2: ( ( localDeclaration )* ( statement )* )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:92:4: ( localDeclaration )* ( statement )*
      {
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:92:4: ( localDeclaration )*
        loop5: while (true) {
          int alt5 = 2;
          final int LA5_0 = this.input.LA(1);
          if (((LA5_0 == 28) || (LA5_0 == 33))) {
            alt5 = 1;
          }

          switch (alt5) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:92:4: localDeclaration
            {
              pushFollow(StaticJavaParser.FOLLOW_localDeclaration_in_methodBody290);
              localDeclaration();
              this.state._fsp--;

            }
              break;

            default:
              break loop5;
          }
        }

        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:93:3: ( statement )*
        loop6: while (true) {
          int alt6 = 2;
          final int LA6_0 = this.input.LA(1);
          if (((LA6_0 == StaticJavaParser.ID) || (LA6_0 == 32) || (LA6_0 == 36) || (LA6_0 == 40))) {
            alt6 = 1;
          }

          switch (alt6) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:93:3: statement
            {
              pushFollow(StaticJavaParser.FOLLOW_statement_in_methodBody296);
              statement();
              this.state._fsp--;

            }
              break;

            default:
              break loop6;
          }
        }

      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "methodBody"
  // $ANTLR start "methodDeclaration"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:70:1: methodDeclaration : 'static' returnType ID '(' ( params )? ')' '{' methodBody '}' ;
  public final void methodDeclaration() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:71:2: ( 'static' returnType ID '(' ( params )? ')' '{' methodBody '}' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:71:4: 'static' returnType ID '(' ( params )? ')' '{' methodBody '}'
      {
        match(
            this.input,
            37,
            StaticJavaParser.FOLLOW_37_in_methodDeclaration189);
        pushFollow(StaticJavaParser.FOLLOW_returnType_in_methodDeclaration191);
        returnType();
        this.state._fsp--;

        match(
            this.input,
            StaticJavaParser.ID,
            StaticJavaParser.FOLLOW_ID_in_methodDeclaration193);
        match(
            this.input,
            11,
            StaticJavaParser.FOLLOW_11_in_methodDeclaration197);
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:72:7: ( params )?
        int alt2 = 2;
        final int LA2_0 = this.input.LA(1);
        if (((LA2_0 == 28) || (LA2_0 == 33))) {
          alt2 = 1;
        }
        switch (alt2) {
          case 1:
          // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:72:9: params
          {
            pushFollow(StaticJavaParser.FOLLOW_params_in_methodDeclaration201);
            params();
            this.state._fsp--;

          }
            break;

        }

        match(
            this.input,
            12,
            StaticJavaParser.FOLLOW_12_in_methodDeclaration206);
        match(
            this.input,
            41,
            StaticJavaParser.FOLLOW_41_in_methodDeclaration210);
        pushFollow(StaticJavaParser.FOLLOW_methodBody_in_methodDeclaration212);
        methodBody();
        this.state._fsp--;

        match(
            this.input,
            43,
            StaticJavaParser.FOLLOW_43_in_methodDeclaration214);
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "methodDeclaration"
  // $ANTLR start "multiplicativeExp"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:157:1: multiplicativeExp : unaryExp ( ( '*' | '/' | '%' ) unaryExp )* ;
  public final void multiplicativeExp() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:158:2: ( unaryExp ( ( '*' | '/' | '%' ) unaryExp )* )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:158:4: unaryExp ( ( '*' | '/' | '%' ) unaryExp )*
      {
        pushFollow(StaticJavaParser.FOLLOW_unaryExp_in_multiplicativeExp650);
        unaryExp();
        this.state._fsp--;

        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:158:13: ( ( '*' | '/' | '%' ) unaryExp )*
        loop18: while (true) {
          int alt18 = 2;
          final int LA18_0 = this.input.LA(1);
          if (((LA18_0 == 9) || (LA18_0 == 13) || (LA18_0 == 18))) {
            alt18 = 1;
          }

          switch (alt18) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:158:15: ( '*' | '/' | '%' ) unaryExp
            {
              if ((this.input.LA(1) == 9) || (this.input.LA(1) == 13)
                  || (this.input.LA(1) == 18)) {
                this.input.consume();
                this.state.errorRecovery = false;
              } else {
                final MismatchedSetException mse = new MismatchedSetException(
                    null, this.input);
                throw mse;
              }
              pushFollow(StaticJavaParser.FOLLOW_unaryExp_in_multiplicativeExp668);
              unaryExp();
              this.state._fsp--;

            }
              break;

            default:
              break loop18;
          }
        }

      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "multiplicativeExp"
  // $ANTLR start "param"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:87:1: param : type ID ;
  public final void param() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:88:2: ( type ID )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:88:4: type ID
      {
        pushFollow(StaticJavaParser.FOLLOW_type_in_param277);
        type();
        this.state._fsp--;

        match(
            this.input,
            StaticJavaParser.ID,
            StaticJavaParser.FOLLOW_ID_in_param279);
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "param"
  // $ANTLR start "params"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:83:1: params : param ( ',' param )* ;
  public final void params() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:84:2: ( param ( ',' param )* )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:84:4: param ( ',' param )*
      {
        pushFollow(StaticJavaParser.FOLLOW_param_in_params256);
        param();
        this.state._fsp--;

        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:84:10: ( ',' param )*
        loop4: while (true) {
          int alt4 = 2;
          final int LA4_0 = this.input.LA(1);
          if ((LA4_0 == 15)) {
            alt4 = 1;
          }

          switch (alt4) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:84:12: ',' param
            {
              match(this.input, 15, StaticJavaParser.FOLLOW_15_in_params260);
              pushFollow(StaticJavaParser.FOLLOW_param_in_params262);
              param();
              this.state._fsp--;

            }
              break;

            default:
              break loop4;
          }
        }

      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "params"
  // $ANTLR start "primaryExp"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:172:1: primaryExp : (n= NUM_INT {...}?| 'true' | 'false' | 'null' | '(' exp ')' | invokeExp | ID );
  public final void primaryExp() throws RecognitionException {
    Token n = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:173:2: (n= NUM_INT {...}?| 'true' | 'false' | 'null' | '(' exp ')' | invokeExp | ID )
      int alt21 = 7;
      switch (this.input.LA(1)) {
        case NUM_INT: {
          alt21 = 1;
        }
          break;
        case 38: {
          alt21 = 2;
        }
          break;
        case 31: {
          alt21 = 3;
        }
          break;
        case 34: {
          alt21 = 4;
        }
          break;
        case 11: {
          alt21 = 5;
        }
          break;
        case ID: {
          final int LA21_6 = this.input.LA(2);
          if (((LA21_6 == 11) || (LA21_6 == 17))) {
            alt21 = 6;
          } else if ((((LA21_6 >= 8) && (LA21_6 <= 10))
              || ((LA21_6 >= 12) && (LA21_6 <= 16))
              || ((LA21_6 >= 18) && (LA21_6 <= 21))
              || ((LA21_6 >= 23) && (LA21_6 <= 25)) || (LA21_6 == 42))) {
            alt21 = 7;
          }

          else {
            final int nvaeMark = this.input.mark();
            try {
              this.input.consume();
              final NoViableAltException nvae = new NoViableAltException("",
                  21, 6, this.input);
              throw nvae;
            } finally {
              this.input.rewind(nvaeMark);
            }
          }

        }
          break;
        default:
          final NoViableAltException nvae = new NoViableAltException("", 21, 0,
              this.input);
          throw nvae;
      }
      switch (alt21) {
        case 1:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:173:4: n= NUM_INT {...}?
        {
          n = (Token) match(
              this.input,
              StaticJavaParser.NUM_INT,
              StaticJavaParser.FOLLOW_NUM_INT_in_primaryExp730);
          if (!((new BigInteger(n.getText()).bitLength() < 32))) {
            throw new FailedPredicateException(this.input, "primaryExp",
                " new BigInteger(n.getText()).bitLength() < 32 ");
          }
        }
          break;
        case 2:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:175:4: 'true'
        {
          match(this.input, 38, StaticJavaParser.FOLLOW_38_in_primaryExp739);
        }
          break;
        case 3:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:176:4: 'false'
        {
          match(this.input, 31, StaticJavaParser.FOLLOW_31_in_primaryExp744);
        }
          break;
        case 4:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:177:4: 'null'
        {
          match(this.input, 34, StaticJavaParser.FOLLOW_34_in_primaryExp749);
        }
          break;
        case 5:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:178:4: '(' exp ')'
        {
          match(this.input, 11, StaticJavaParser.FOLLOW_11_in_primaryExp754);
          pushFollow(StaticJavaParser.FOLLOW_exp_in_primaryExp756);
          exp();
          this.state._fsp--;

          match(this.input, 12, StaticJavaParser.FOLLOW_12_in_primaryExp758);
        }
          break;
        case 6:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:179:4: invokeExp
        {
          pushFollow(StaticJavaParser.FOLLOW_invokeExp_in_primaryExp763);
          invokeExp();
          this.state._fsp--;

        }
          break;
        case 7:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:180:4: ID
        {
          match(
              this.input,
              StaticJavaParser.ID,
              StaticJavaParser.FOLLOW_ID_in_primaryExp768);
        }
          break;

      }
    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "primaryExp"
  // $ANTLR start "relationalExp"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:149:1: relationalExp : additiveExp ( ( '<' | '>' | '<=' | '>=' ) additiveExp )* ;
  public final void relationalExp() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:150:2: ( additiveExp ( ( '<' | '>' | '<=' | '>=' ) additiveExp )* )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:150:4: additiveExp ( ( '<' | '>' | '<=' | '>=' ) additiveExp )*
      {
        pushFollow(StaticJavaParser.FOLLOW_additiveExp_in_relationalExp584);
        additiveExp();
        this.state._fsp--;

        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:150:16: ( ( '<' | '>' | '<=' | '>=' ) additiveExp )*
        loop16: while (true) {
          int alt16 = 2;
          final int LA16_0 = this.input.LA(1);
          if ((((LA16_0 >= 20) && (LA16_0 <= 21)) || ((LA16_0 >= 24) && (LA16_0 <= 25)))) {
            alt16 = 1;
          }

          switch (alt16) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:150:18: ( '<' | '>' | '<=' | '>=' ) additiveExp
            {
              if (((this.input.LA(1) >= 20) && (this.input.LA(1) <= 21))
                  || ((this.input.LA(1) >= 24) && (this.input.LA(1) <= 25))) {
                this.input.consume();
                this.state.errorRecovery = false;
              } else {
                final MismatchedSetException mse = new MismatchedSetException(
                    null, this.input);
                throw mse;
              }
              pushFollow(StaticJavaParser.FOLLOW_additiveExp_in_relationalExp606);
              additiveExp();
              this.state._fsp--;

            }
              break;

            default:
              break loop16;
          }
        }

      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "relationalExp"
  @Override
  public void reportError(final RecognitionException arg0) {
    throw new RuntimeException(arg0);
  }

  // $ANTLR start "returnStatement"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:129:1: returnStatement : 'return' ( exp )? ';' ;
  public final void returnStatement() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:130:2: ( 'return' ( exp )? ';' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:130:4: 'return' ( exp )? ';'
      {
        match(this.input, 36, StaticJavaParser.FOLLOW_36_in_returnStatement482);
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:130:13: ( exp )?
        int alt12 = 2;
        final int LA12_0 = this.input.LA(1);
        if ((((LA12_0 >= StaticJavaParser.ID) && (LA12_0 <= StaticJavaParser.NUM_INT))
            || (LA12_0 == 7)
            || (LA12_0 == 11)
            || (LA12_0 == 14)
            || (LA12_0 == 16) || (LA12_0 == 31) || (LA12_0 == 34) || (LA12_0 == 38))) {
          alt12 = 1;
        }
        switch (alt12) {
          case 1:
          // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:130:15: exp
          {
            pushFollow(StaticJavaParser.FOLLOW_exp_in_returnStatement486);
            exp();
            this.state._fsp--;

          }
            break;

        }

        match(this.input, 19, StaticJavaParser.FOLLOW_19_in_returnStatement491);
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "returnStatement"
  // $ANTLR start "returnType"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:79:1: returnType : ( 'void' | type );
  public final void returnType() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:80:2: ( 'void' | type )
      int alt3 = 2;
      final int LA3_0 = this.input.LA(1);
      if ((LA3_0 == 39)) {
        alt3 = 1;
      } else if (((LA3_0 == 28) || (LA3_0 == 33))) {
        alt3 = 2;
      }

      else {
        final NoViableAltException nvae = new NoViableAltException("", 3, 0,
            this.input);
        throw nvae;
      }

      switch (alt3) {
        case 1:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:80:4: 'void'
        {
          match(this.input, 39, StaticJavaParser.FOLLOW_39_in_returnType240);
        }
          break;
        case 2:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:80:13: type
        {
          pushFollow(StaticJavaParser.FOLLOW_type_in_returnType244);
          type();
          this.state._fsp--;

        }
          break;

      }
    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "returnType"
  // $ANTLR start "statement"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:100:1: statement : ( assignStatement | ifStatement | whileStatement | invokeExpStatement | returnStatement ) ;
  public final void statement() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:101:2: ( ( assignStatement | ifStatement | whileStatement | invokeExpStatement | returnStatement ) )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:101:4: ( assignStatement | ifStatement | whileStatement | invokeExpStatement | returnStatement )
      {
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:101:4: ( assignStatement | ifStatement | whileStatement | invokeExpStatement | returnStatement )
        int alt7 = 5;
        switch (this.input.LA(1)) {
          case ID: {
            final int LA7_1 = this.input.LA(2);
            if ((LA7_1 == 22)) {
              alt7 = 1;
            } else if (((LA7_1 == 11) || (LA7_1 == 17))) {
              alt7 = 4;
            }

            else {
              final int nvaeMark = this.input.mark();
              try {
                this.input.consume();
                final NoViableAltException nvae = new NoViableAltException("",
                    7, 1, this.input);
                throw nvae;
              } finally {
                this.input.rewind(nvaeMark);
              }
            }

          }
            break;
          case 32: {
            alt7 = 2;
          }
            break;
          case 40: {
            alt7 = 3;
          }
            break;
          case 36: {
            alt7 = 5;
          }
            break;
          default:
            final NoViableAltException nvae = new NoViableAltException("", 7,
                0, this.input);
            throw nvae;
        }
        switch (alt7) {
          case 1:
          // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:101:6: assignStatement
          {
            pushFollow(StaticJavaParser.FOLLOW_assignStatement_in_statement326);
            assignStatement();
            this.state._fsp--;

          }
            break;
          case 2:
          // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:102:5: ifStatement
          {
            pushFollow(StaticJavaParser.FOLLOW_ifStatement_in_statement332);
            ifStatement();
            this.state._fsp--;

          }
            break;
          case 3:
          // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:103:5: whileStatement
          {
            pushFollow(StaticJavaParser.FOLLOW_whileStatement_in_statement338);
            whileStatement();
            this.state._fsp--;

          }
            break;
          case 4:
          // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:104:5: invokeExpStatement
          {
            pushFollow(StaticJavaParser.FOLLOW_invokeExpStatement_in_statement344);
            invokeExpStatement();
            this.state._fsp--;

          }
            break;
          case 5:
          // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:105:5: returnStatement
          {
            pushFollow(StaticJavaParser.FOLLOW_returnStatement_in_statement350);
            returnStatement();
            this.state._fsp--;

          }
            break;

        }

      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "statement"
  // $ANTLR start "type"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:76:1: type : ( 'boolean' | 'int' );
  public final void type() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:77:2: ( 'boolean' | 'int' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:
      {
        if ((this.input.LA(1) == 28) || (this.input.LA(1) == 33)) {
          this.input.consume();
          this.state.errorRecovery = false;
        } else {
          final MismatchedSetException mse = new MismatchedSetException(null,
              this.input);
          throw mse;
        }
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "type"
  // $ANTLR start "unaryExp"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:161:1: unaryExp : ( '-' unaryExp | '+' unaryExp | unaryExpNotPlusMinus );
  public final void unaryExp() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:162:2: ( '-' unaryExp | '+' unaryExp | unaryExpNotPlusMinus )
      int alt19 = 3;
      switch (this.input.LA(1)) {
        case 16: {
          alt19 = 1;
        }
          break;
        case 14: {
          alt19 = 2;
        }
          break;
        case ID:
        case NUM_INT:
        case 7:
        case 11:
        case 31:
        case 34:
        case 38: {
          alt19 = 3;
        }
          break;
        default:
          final NoViableAltException nvae = new NoViableAltException("", 19, 0,
              this.input);
          throw nvae;
      }
      switch (alt19) {
        case 1:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:162:4: '-' unaryExp
        {
          match(this.input, 16, StaticJavaParser.FOLLOW_16_in_unaryExp683);
          pushFollow(StaticJavaParser.FOLLOW_unaryExp_in_unaryExp685);
          unaryExp();
          this.state._fsp--;

        }
          break;
        case 2:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:163:4: '+' unaryExp
        {
          match(this.input, 14, StaticJavaParser.FOLLOW_14_in_unaryExp690);
          pushFollow(StaticJavaParser.FOLLOW_unaryExp_in_unaryExp692);
          unaryExp();
          this.state._fsp--;

        }
          break;
        case 3:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:164:4: unaryExpNotPlusMinus
        {
          pushFollow(StaticJavaParser.FOLLOW_unaryExpNotPlusMinus_in_unaryExp697);
          unaryExpNotPlusMinus();
          this.state._fsp--;

        }
          break;

      }
    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "unaryExp"
  // $ANTLR start "unaryExpNotPlusMinus"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:167:1: unaryExpNotPlusMinus : ( '!' unaryExp | primaryExp );
  public final void unaryExpNotPlusMinus() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:168:2: ( '!' unaryExp | primaryExp )
      int alt20 = 2;
      final int LA20_0 = this.input.LA(1);
      if ((LA20_0 == 7)) {
        alt20 = 1;
      } else if ((((LA20_0 >= StaticJavaParser.ID) && (LA20_0 <= StaticJavaParser.NUM_INT))
          || (LA20_0 == 11) || (LA20_0 == 31) || (LA20_0 == 34) || (LA20_0 == 38))) {
        alt20 = 2;
      }

      else {
        final NoViableAltException nvae = new NoViableAltException("", 20, 0,
            this.input);
        throw nvae;
      }

      switch (alt20) {
        case 1:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:168:4: '!' unaryExp
        {
          match(
              this.input,
              7,
              StaticJavaParser.FOLLOW_7_in_unaryExpNotPlusMinus709);
          pushFollow(StaticJavaParser.FOLLOW_unaryExp_in_unaryExpNotPlusMinus711);
          unaryExp();
          this.state._fsp--;

        }
          break;
        case 2:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:169:4: primaryExp
        {
          pushFollow(StaticJavaParser.FOLLOW_primaryExp_in_unaryExpNotPlusMinus716);
          primaryExp();
          this.state._fsp--;

        }
          break;

      }
    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }

  // $ANTLR end "unaryExpNotPlusMinus"
  // $ANTLR start "whileStatement"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:120:1: whileStatement : 'while' '(' exp ')' '{' ( statement )* '}' ;
  public final void whileStatement() throws RecognitionException {
    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:121:2: ( 'while' '(' exp ')' '{' ( statement )* '}' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:121:4: 'while' '(' exp ')' '{' ( statement )* '}'
      {
        match(this.input, 40, StaticJavaParser.FOLLOW_40_in_whileStatement437);
        match(this.input, 11, StaticJavaParser.FOLLOW_11_in_whileStatement439);
        pushFollow(StaticJavaParser.FOLLOW_exp_in_whileStatement441);
        exp();
        this.state._fsp--;

        match(this.input, 12, StaticJavaParser.FOLLOW_12_in_whileStatement443);
        match(this.input, 41, StaticJavaParser.FOLLOW_41_in_whileStatement447);
        // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:122:7: ( statement )*
        loop11: while (true) {
          int alt11 = 2;
          final int LA11_0 = this.input.LA(1);
          if (((LA11_0 == StaticJavaParser.ID) || (LA11_0 == 32)
              || (LA11_0 == 36) || (LA11_0 == 40))) {
            alt11 = 1;
          }

          switch (alt11) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJava.g:122:9: statement
            {
              pushFollow(StaticJavaParser.FOLLOW_statement_in_whileStatement451);
              statement();
              this.state._fsp--;

            }
              break;

            default:
              break loop11;
          }
        }

        match(this.input, 43, StaticJavaParser.FOLLOW_43_in_whileStatement456);
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "whileStatement"
}
