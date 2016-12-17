// $ANTLR 3.5 /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g 2013-07-08 18:13:04

package sjc.parser;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * StaticJava parser.
 *
 * @author robby
 */
import org.antlr.runtime.BitSet;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.NumberLiteral;
import org.eclipse.jdt.core.dom.ParenthesizedExpression;
import org.eclipse.jdt.core.dom.PrefixExpression;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.core.dom.WhileStatement;

@SuppressWarnings("all")
public class StaticJavaASTParser extends Parser {
  public static final String[] tokenNames = new String[] { "<invalid>",
      "<EOR>", "<DOWN>", "<UP>", "ID", "NUM_INT", "WS", "'!'", "'!='", "'%'",
      "'&&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "';'",
      "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'['", "']'", "'boolean'",
      "'class'", "'else'", "'false'", "'if'", "'int'", "'public'", "'return'",
      "'static'", "'true'", "'void'", "'while'", "'{'", "'||'", "'}'" };
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

  protected AST ast = AST.newAST(AST.JLS4);

  // delegators

  public static final BitSet FOLLOW_classDefinition_in_compilationUnit45 = new BitSet(
      new long[] { 0x0000000000000000L });
  public static final BitSet FOLLOW_EOF_in_compilationUnit68 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_34_in_classDefinition84 = new BitSet(
      new long[] { 0x0000000020000000L });
  public static final BitSet FOLLOW_29_in_classDefinition114 = new BitSet(
      new long[] { 0x0000000000000010L });

  public static final BitSet FOLLOW_ID_in_classDefinition116 = new BitSet(
      new long[] { 0x0000010000000000L });

  public static final BitSet FOLLOW_40_in_classDefinition118 = new BitSet(
      new long[] { 0x0000000400000000L });

  public static final BitSet FOLLOW_mainMethodDeclaration_in_classDefinition152 = new BitSet(
      new long[] { 0x0000041000000000L });

  public static final BitSet FOLLOW_fieldDeclaration_in_classDefinition174 = new BitSet(
      new long[] { 0x0000041000000000L });

  public static final BitSet FOLLOW_methodDeclaration_in_classDefinition202 = new BitSet(
      new long[] { 0x0000041000000000L });

  public static final BitSet FOLLOW_42_in_classDefinition231 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_34_in_mainMethodDeclaration252 = new BitSet(
      new long[] { 0x0000001000000000L });

  public static final BitSet FOLLOW_36_in_mainMethodDeclaration289 = new BitSet(
      new long[] { 0x0000004000000000L });

  public static final BitSet FOLLOW_38_in_mainMethodDeclaration326 = new BitSet(
      new long[] { 0x0000000000000010L });

  public static final BitSet FOLLOW_ID_in_mainMethodDeclaration367 = new BitSet(
      new long[] { 0x0000000000000800L });

  public static final BitSet FOLLOW_11_in_mainMethodDeclaration381 = new BitSet(
      new long[] { 0x0000000000000010L });

  public static final BitSet FOLLOW_ID_in_mainMethodDeclaration388 = new BitSet(
      new long[] { 0x0000000004000000L });

  public static final BitSet FOLLOW_26_in_mainMethodDeclaration399 = new BitSet(
      new long[] { 0x0000000008000000L });

  public static final BitSet FOLLOW_27_in_mainMethodDeclaration401 = new BitSet(
      new long[] { 0x0000000000000010L });

  public static final BitSet FOLLOW_ID_in_mainMethodDeclaration405 = new BitSet(
      new long[] { 0x0000000000001000L });

  public static final BitSet FOLLOW_12_in_mainMethodDeclaration436 = new BitSet(
      new long[] { 0x0000010000000000L });

  public static final BitSet FOLLOW_40_in_mainMethodDeclaration438 = new BitSet(
      new long[] { 0x0000048B10000010L });

  public static final BitSet FOLLOW_methodBody_in_mainMethodDeclaration442 = new BitSet(
      new long[] { 0x0000040000000000L });

  public static final BitSet FOLLOW_42_in_mainMethodDeclaration444 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_36_in_fieldDeclaration482 = new BitSet(
      new long[] { 0x0000000210000000L });

  public static final BitSet FOLLOW_type_in_fieldDeclaration522 = new BitSet(
      new long[] { 0x0000000000000010L });

  public static final BitSet FOLLOW_ID_in_fieldDeclaration554 = new BitSet(
      new long[] { 0x0000000000080000L });

  public static final BitSet FOLLOW_19_in_fieldDeclaration597 = new BitSet(
      new long[] { 0x0000000000000002L });

  public static final BitSet FOLLOW_36_in_methodDeclaration613 = new BitSet(
      new long[] { 0x0000004210000000L });

  public static final BitSet FOLLOW_returnType_in_methodDeclaration653 = new BitSet(
      new long[] { 0x0000000000000010L });

  public static final BitSet FOLLOW_ID_in_methodDeclaration680 = new BitSet(
      new long[] { 0x0000000000000800L });

  public static final BitSet FOLLOW_11_in_methodDeclaration682 = new BitSet(
      new long[] { 0x0000000210001000L });

  public static final BitSet FOLLOW_params_in_methodDeclaration725 = new BitSet(
      new long[] { 0x0000000000001000L });

  public static final BitSet FOLLOW_12_in_methodDeclaration762 = new BitSet(
      new long[] { 0x0000010000000000L });

  public static final BitSet FOLLOW_40_in_methodDeclaration764 = new BitSet(
      new long[] { 0x0000048B10000010L });

  public static final BitSet FOLLOW_methodBody_in_methodDeclaration768 = new BitSet(
      new long[] { 0x0000040000000000L });

  // Delegated rules

  public static final BitSet FOLLOW_42_in_methodDeclaration770 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_28_in_type803 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_33_in_type840 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_38_in_returnType892 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_type_in_returnType932 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_param_in_params985 = new BitSet(
      new long[] { 0x0000000000008002L });
  public static final BitSet FOLLOW_15_in_params1024 = new BitSet(
      new long[] { 0x0000000210000000L });
  public static final BitSet FOLLOW_param_in_params1028 = new BitSet(
      new long[] { 0x0000000000008002L });
  public static final BitSet FOLLOW_type_in_param1077 = new BitSet(
      new long[] { 0x0000000000000010L });
  public static final BitSet FOLLOW_ID_in_param1108 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_localDeclaration_in_methodBody1170 = new BitSet(
      new long[] { 0x0000008B10000012L });
  public static final BitSet FOLLOW_statement_in_methodBody1204 = new BitSet(
      new long[] { 0x0000008900000012L });
  public static final BitSet FOLLOW_type_in_localDeclaration1259 = new BitSet(
      new long[] { 0x0000000000000010L });
  public static final BitSet FOLLOW_ID_in_localDeclaration1290 = new BitSet(
      new long[] { 0x0000000000080000L });
  public static final BitSet FOLLOW_19_in_localDeclaration1292 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_assignStatement_in_statement1347 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_ifStatement_in_statement1377 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_whileStatement_in_statement1411 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_invokeExpStatement_in_statement1442 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_returnStatement_in_statement1468 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_ID_in_assignStatement1515 = new BitSet(
      new long[] { 0x0000000000400000L });
  public static final BitSet FOLLOW_22_in_assignStatement1558 = new BitSet(
      new long[] { 0x00000020800148B0L });
  public static final BitSet FOLLOW_exp_in_assignStatement1562 = new BitSet(
      new long[] { 0x0000000000080000L });
  public static final BitSet FOLLOW_19_in_assignStatement1564 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_32_in_ifStatement1612 = new BitSet(
      new long[] { 0x0000000000000800L });
  public static final BitSet FOLLOW_11_in_ifStatement1614 = new BitSet(
      new long[] { 0x00000020800148B0L });
  public static final BitSet FOLLOW_exp_in_ifStatement1618 = new BitSet(
      new long[] { 0x0000000000001000L });
  public static final BitSet FOLLOW_12_in_ifStatement1620 = new BitSet(
      new long[] { 0x0000010000000000L });
  public static final BitSet FOLLOW_40_in_ifStatement1641 = new BitSet(
      new long[] { 0x0000048900000010L });
  public static final BitSet FOLLOW_statement_in_ifStatement1653 = new BitSet(
      new long[] { 0x0000048900000010L });
  public static final BitSet FOLLOW_42_in_ifStatement1691 = new BitSet(
      new long[] { 0x0000000040000002L });
  public static final BitSet FOLLOW_30_in_ifStatement1697 = new BitSet(
      new long[] { 0x0000010000000000L });
  public static final BitSet FOLLOW_40_in_ifStatement1699 = new BitSet(
      new long[] { 0x0000048900000010L });
  public static final BitSet FOLLOW_statement_in_ifStatement1714 = new BitSet(
      new long[] { 0x0000048900000010L });
  public static final BitSet FOLLOW_42_in_ifStatement1748 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_39_in_whileStatement1772 = new BitSet(
      new long[] { 0x0000000000000800L });
  public static final BitSet FOLLOW_11_in_whileStatement1774 = new BitSet(
      new long[] { 0x00000020800148B0L });
  public static final BitSet FOLLOW_exp_in_whileStatement1778 = new BitSet(
      new long[] { 0x0000000000001000L });
  public static final BitSet FOLLOW_12_in_whileStatement1800 = new BitSet(
      new long[] { 0x0000010000000000L });
  public static final BitSet FOLLOW_40_in_whileStatement1802 = new BitSet(
      new long[] { 0x0000048900000010L });
  public static final BitSet FOLLOW_statement_in_whileStatement1814 = new BitSet(
      new long[] { 0x0000048900000010L });
  public static final BitSet FOLLOW_42_in_whileStatement1849 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_invokeExp_in_invokeExpStatement1867 = new BitSet(
      new long[] { 0x0000000000080000L });
  public static final BitSet FOLLOW_19_in_invokeExpStatement1869 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_35_in_returnStatement1909 = new BitSet(
      new long[] { 0x00000020800948B0L });
  public static final BitSet FOLLOW_exp_in_returnStatement1922 = new BitSet(
      new long[] { 0x0000000000080000L });
  public static final BitSet FOLLOW_19_in_returnStatement1963 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_logicalOrExp_in_exp1981 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_logicalAndExp_in_logicalOrExp2025 = new BitSet(
      new long[] { 0x0000020000000002L });
  public static final BitSet FOLLOW_41_in_logicalOrExp2060 = new BitSet(
      new long[] { 0x00000020800148B0L });
  public static final BitSet FOLLOW_logicalAndExp_in_logicalOrExp2064 = new BitSet(
      new long[] { 0x0000020000000002L });
  public static final BitSet FOLLOW_equalityExp_in_logicalAndExp2104 = new BitSet(
      new long[] { 0x0000000000000402L });
  public static final BitSet FOLLOW_10_in_logicalAndExp2139 = new BitSet(
      new long[] { 0x00000020800148B0L });
  public static final BitSet FOLLOW_equalityExp_in_logicalAndExp2143 = new BitSet(
      new long[] { 0x0000000000000402L });
  public static final BitSet FOLLOW_relationalExp_in_equalityExp2191 = new BitSet(
      new long[] { 0x0000000000800102L });
  public static final BitSet FOLLOW_8_in_equalityExp2233 = new BitSet(
      new long[] { 0x00000020800148B0L });
  public static final BitSet FOLLOW_23_in_equalityExp2273 = new BitSet(
      new long[] { 0x00000020800148B0L });
  public static final BitSet FOLLOW_relationalExp_in_equalityExp2319 = new BitSet(
      new long[] { 0x0000000000800102L });
  public static final BitSet FOLLOW_additiveExp_in_relationalExp2371 = new BitSet(
      new long[] { 0x0000000003300002L });
  public static final BitSet FOLLOW_20_in_relationalExp2411 = new BitSet(
      new long[] { 0x00000020800148B0L });
  public static final BitSet FOLLOW_24_in_relationalExp2452 = new BitSet(
      new long[] { 0x00000020800148B0L });
  public static final BitSet FOLLOW_21_in_relationalExp2493 = new BitSet(
      new long[] { 0x00000020800148B0L });
  public static final BitSet FOLLOW_25_in_relationalExp2533 = new BitSet(
      new long[] { 0x00000020800148B0L });
  public static final BitSet FOLLOW_additiveExp_in_relationalExp2579 = new BitSet(
      new long[] { 0x0000000003300002L });
  public static final BitSet FOLLOW_multiplicativeExp_in_additiveExp2633 = new BitSet(
      new long[] { 0x0000000000014002L });
  public static final BitSet FOLLOW_14_in_additiveExp2666 = new BitSet(
      new long[] { 0x00000020800148B0L });
  public static final BitSet FOLLOW_16_in_additiveExp2707 = new BitSet(
      new long[] { 0x00000020800148B0L });
  public static final BitSet FOLLOW_multiplicativeExp_in_additiveExp2754 = new BitSet(
      new long[] { 0x0000000000014002L });
  public static final BitSet FOLLOW_unaryExp_in_multiplicativeExp2802 = new BitSet(
      new long[] { 0x0000000000042202L });
  public static final BitSet FOLLOW_13_in_multiplicativeExp2844 = new BitSet(
      new long[] { 0x00000020800148B0L });
  public static final BitSet FOLLOW_18_in_multiplicativeExp2885 = new BitSet(
      new long[] { 0x00000020800148B0L });
  public static final BitSet FOLLOW_9_in_multiplicativeExp2926 = new BitSet(
      new long[] { 0x00000020800148B0L });
  public static final BitSet FOLLOW_unaryExp_in_multiplicativeExp2972 = new BitSet(
      new long[] { 0x0000000000042202L });
  public static final BitSet FOLLOW_16_in_unaryExp3022 = new BitSet(
      new long[] { 0x00000020800148B0L });
  public static final BitSet FOLLOW_unaryExp_in_unaryExp3026 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_14_in_unaryExp3058 = new BitSet(
      new long[] { 0x00000020800148B0L });
  public static final BitSet FOLLOW_unaryExp_in_unaryExp3062 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_unaryExpNotPlusMinus_in_unaryExp3096 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_7_in_unaryExpNotPlusMinus3131 = new BitSet(
      new long[] { 0x00000020800148B0L });
  public static final BitSet FOLLOW_unaryExp_in_unaryExpNotPlusMinus3135 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_primaryExp_in_unaryExpNotPlusMinus3169 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_NUM_INT_in_primaryExp3216 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_37_in_primaryExp3267 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_31_in_primaryExp3307 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_11_in_primaryExp3346 = new BitSet(
      new long[] { 0x00000020800148B0L });
  public static final BitSet FOLLOW_exp_in_primaryExp3350 = new BitSet(
      new long[] { 0x0000000000001000L });
  public static final BitSet FOLLOW_12_in_primaryExp3352 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_invokeExp_in_primaryExp3387 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_ID_in_primaryExp3422 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_ID_in_invokeExp3486 = new BitSet(
      new long[] { 0x0000000000020000L });
  public static final BitSet FOLLOW_17_in_invokeExp3524 = new BitSet(
      new long[] { 0x0000000000000010L });
  public static final BitSet FOLLOW_ID_in_invokeExp3545 = new BitSet(
      new long[] { 0x0000000000000800L });
  public static final BitSet FOLLOW_11_in_invokeExp3584 = new BitSet(
      new long[] { 0x00000020800158B0L });
  public static final BitSet FOLLOW_args_in_invokeExp3590 = new BitSet(
      new long[] { 0x0000000000001000L });
  public static final BitSet FOLLOW_12_in_invokeExp3625 = new BitSet(
      new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_exp_in_args3646 = new BitSet(
      new long[] { 0x0000000000008002L });
  public static final BitSet FOLLOW_15_in_args3691 = new BitSet(
      new long[] { 0x00000020800148B0L });
  public static final BitSet FOLLOW_exp_in_args3695 = new BitSet(
      new long[] { 0x0000000000008002L });

  public StaticJavaASTParser(final TokenStream input) {
    this(input, new RecognizerSharedState());
  }

  public StaticJavaASTParser(final TokenStream input,
      final RecognizerSharedState state) {
    super(input, state);
  }

  // $ANTLR start "additiveExp"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:260:1: additiveExp returns [Expression result = null] : e= multiplicativeExp ( ( '+' | '-' ) e= multiplicativeExp )* ;
  public final Expression additiveExp() throws RecognitionException {
    Expression result = null;

    Expression e = null;

    InfixExpression.Operator op = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:264:2: (e= multiplicativeExp ( ( '+' | '-' ) e= multiplicativeExp )* )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:264:4: e= multiplicativeExp ( ( '+' | '-' ) e= multiplicativeExp )*
      {
        pushFollow(StaticJavaASTParser.FOLLOW_multiplicativeExp_in_additiveExp2633);
        e = multiplicativeExp();
        this.state._fsp--;

        result = e;
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:265:3: ( ( '+' | '-' ) e= multiplicativeExp )*
        loop21: while (true) {
          int alt21 = 2;
          final int LA21_0 = this.input.LA(1);
          if (((LA21_0 == 14) || (LA21_0 == 16))) {
            alt21 = 1;
          }

          switch (alt21) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:266:4: ( '+' | '-' ) e= multiplicativeExp
            {
              // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:266:4: ( '+' | '-' )
              int alt20 = 2;
              final int LA20_0 = this.input.LA(1);
              if ((LA20_0 == 14)) {
                alt20 = 1;
              } else if ((LA20_0 == 16)) {
                alt20 = 2;
              }

              else {
                final NoViableAltException nvae = new NoViableAltException("",
                    20, 0, this.input);
                throw nvae;
              }

              switch (alt20) {
                case 1:
                // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:266:6: '+'
                {
                  match(
                      this.input,
                      14,
                      StaticJavaASTParser.FOLLOW_14_in_additiveExp2666);
                  op = InfixExpression.Operator.PLUS;
                }
                  break;
                case 2:
                // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:267:6: '-'
                {
                  match(
                      this.input,
                      16,
                      StaticJavaASTParser.FOLLOW_16_in_additiveExp2707);
                  op = InfixExpression.Operator.MINUS;
                }
                  break;

              }

              pushFollow(StaticJavaASTParser.FOLLOW_multiplicativeExp_in_additiveExp2754);
              e = multiplicativeExp();
              this.state._fsp--;

              final InfixExpression ie = this.ast.newInfixExpression();
              ie.setLeftOperand(result);
              ie.setOperator(op);
              ie.setRightOperand(e);
              result = ie;
            }
              break;

            default:
              break loop21;
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
    return result;
  }

  // $ANTLR end "additiveExp"
  // $ANTLR start "args"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:342:1: args returns [ArrayList<Expression> result = new ArrayList<Expression>()] : e= exp ( ',' e= exp )* ;
  public final ArrayList<Expression> args() throws RecognitionException {
    final ArrayList<Expression> result = new ArrayList<Expression>();

    Expression e = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:343:2: (e= exp ( ',' e= exp )* )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:343:4: e= exp ( ',' e= exp )*
      {
        pushFollow(StaticJavaASTParser.FOLLOW_exp_in_args3646);
        e = exp();
        this.state._fsp--;

        result.add(e);
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:344:3: ( ',' e= exp )*
        loop29: while (true) {
          int alt29 = 2;
          final int LA29_0 = this.input.LA(1);
          if ((LA29_0 == 15)) {
            alt29 = 1;
          }

          switch (alt29) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:345:4: ',' e= exp
            {
              match(this.input, 15, StaticJavaASTParser.FOLLOW_15_in_args3691);
              pushFollow(StaticJavaASTParser.FOLLOW_exp_in_args3695);
              e = exp();
              this.state._fsp--;

              result.add(e);
            }
              break;

            default:
              break loop29;
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
    return result;
  }

  // $ANTLR end "args"
  // $ANTLR start "assignStatement"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:148:1: assignStatement returns [ExpressionStatement result = null] : ID '=' e= exp ';' ;
  public final ExpressionStatement assignStatement()
      throws RecognitionException {
    ExpressionStatement result = null;

    Token ID6 = null;
    Expression e = null;

    final Assignment a = this.ast.newAssignment();
    result = this.ast.newExpressionStatement(a);

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:153:2: ( ID '=' e= exp ';' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:153:4: ID '=' e= exp ';'
      {
        ID6 = (Token) match(
            this.input,
            StaticJavaASTParser.ID,
            StaticJavaASTParser.FOLLOW_ID_in_assignStatement1515);
        a.setLeftHandSide(this.ast.newSimpleName((ID6 != null ? ID6.getText()
            : null)));
        match(
            this.input,
            22,
            StaticJavaASTParser.FOLLOW_22_in_assignStatement1558);
        pushFollow(StaticJavaASTParser.FOLLOW_exp_in_assignStatement1562);
        e = exp();
        this.state._fsp--;

        match(
            this.input,
            19,
            StaticJavaASTParser.FOLLOW_19_in_assignStatement1564);
        a.setRightHandSide(e);
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
    return result;
  }

  // $ANTLR end "assignStatement"
  // $ANTLR start "classDefinition"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:53:1: classDefinition returns [TypeDeclaration result = ast.newTypeDeclaration()] : 'public' 'class' ID '{' md= mainMethodDeclaration (fd= fieldDeclaration |md= methodDeclaration )* '}' ;
  public final TypeDeclaration classDefinition() throws RecognitionException {
    final TypeDeclaration result = this.ast.newTypeDeclaration();

    Token ID1 = null;
    MethodDeclaration md = null;
    FieldDeclaration fd = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:54:2: ( 'public' 'class' ID '{' md= mainMethodDeclaration (fd= fieldDeclaration |md= methodDeclaration )* '}' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:54:4: 'public' 'class' ID '{' md= mainMethodDeclaration (fd= fieldDeclaration |md= methodDeclaration )* '}'
      {
        match(
            this.input,
            34,
            StaticJavaASTParser.FOLLOW_34_in_classDefinition84);
        result.modifiers().add(
            this.ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
        match(
            this.input,
            29,
            StaticJavaASTParser.FOLLOW_29_in_classDefinition114);
        ID1 = (Token) match(
            this.input,
            StaticJavaASTParser.ID,
            StaticJavaASTParser.FOLLOW_ID_in_classDefinition116);
        match(
            this.input,
            40,
            StaticJavaASTParser.FOLLOW_40_in_classDefinition118);
        result.setName(this.ast.newSimpleName((ID1 != null ? ID1.getText()
            : null)));
        pushFollow(StaticJavaASTParser.FOLLOW_mainMethodDeclaration_in_classDefinition152);
        md = mainMethodDeclaration();
        this.state._fsp--;

        result.bodyDeclarations().add(md);
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:57:3: (fd= fieldDeclaration |md= methodDeclaration )*
        loop1: while (true) {
          int alt1 = 3;
          final int LA1_0 = this.input.LA(1);
          if ((LA1_0 == 36)) {
            switch (this.input.LA(2)) {
              case 28: {
                final int LA1_3 = this.input.LA(3);
                if ((LA1_3 == StaticJavaASTParser.ID)) {
                  final int LA1_6 = this.input.LA(4);
                  if ((LA1_6 == 11)) {
                    alt1 = 2;
                  } else if ((LA1_6 == 19)) {
                    alt1 = 1;
                  }

                }

              }
                break;
              case 33: {
                final int LA1_4 = this.input.LA(3);
                if ((LA1_4 == StaticJavaASTParser.ID)) {
                  final int LA1_6 = this.input.LA(4);
                  if ((LA1_6 == 11)) {
                    alt1 = 2;
                  } else if ((LA1_6 == 19)) {
                    alt1 = 1;
                  }

                }

              }
                break;
              case 38: {
                alt1 = 2;
              }
                break;
            }
          }

          switch (alt1) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:57:5: fd= fieldDeclaration
            {
              pushFollow(StaticJavaASTParser.FOLLOW_fieldDeclaration_in_classDefinition174);
              fd = fieldDeclaration();
              this.state._fsp--;

              result.bodyDeclarations().add(fd);
            }
              break;
            case 2:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:58:5: md= methodDeclaration
            {
              pushFollow(StaticJavaASTParser.FOLLOW_methodDeclaration_in_classDefinition202);
              md = methodDeclaration();
              this.state._fsp--;

              result.bodyDeclarations().add(md);
            }
              break;

            default:
              break loop1;
          }
        }

        match(
            this.input,
            42,
            StaticJavaASTParser.FOLLOW_42_in_classDefinition231);
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
    return result;
  }

  // $ANTLR end "classDefinition"
  // $ANTLR start "compilationUnit"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:48:1: compilationUnit returns [CompilationUnit result = ast.newCompilationUnit()] : td= classDefinition EOF ;
  public final CompilationUnit compilationUnit() throws RecognitionException {
    final CompilationUnit result = this.ast.newCompilationUnit();

    TypeDeclaration td = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:49:2: (td= classDefinition EOF )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:49:4: td= classDefinition EOF
      {
        pushFollow(StaticJavaASTParser.FOLLOW_classDefinition_in_compilationUnit45);
        td = classDefinition();
        this.state._fsp--;

        result.types().add(td);
        match(
            this.input,
            StaticJavaASTParser.EOF,
            StaticJavaASTParser.FOLLOW_EOF_in_compilationUnit68);
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
    return result;
  }

  // $ANTLR end "compilationUnit"
  // $ANTLR start "equalityExp"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:223:1: equalityExp returns [Expression result = null] : e= relationalExp ( ( '!=' | '==' ) e= relationalExp )* ;
  public final Expression equalityExp() throws RecognitionException {
    Expression result = null;

    Expression e = null;

    InfixExpression.Operator op = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:227:2: (e= relationalExp ( ( '!=' | '==' ) e= relationalExp )* )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:227:4: e= relationalExp ( ( '!=' | '==' ) e= relationalExp )*
      {
        pushFollow(StaticJavaASTParser.FOLLOW_relationalExp_in_equalityExp2191);
        e = relationalExp();
        this.state._fsp--;

        result = e;
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:228:3: ( ( '!=' | '==' ) e= relationalExp )*
        loop17: while (true) {
          int alt17 = 2;
          final int LA17_0 = this.input.LA(1);
          if (((LA17_0 == 8) || (LA17_0 == 23))) {
            alt17 = 1;
          }

          switch (alt17) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:229:4: ( '!=' | '==' ) e= relationalExp
            {
              // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:229:4: ( '!=' | '==' )
              int alt16 = 2;
              final int LA16_0 = this.input.LA(1);
              if ((LA16_0 == 8)) {
                alt16 = 1;
              } else if ((LA16_0 == 23)) {
                alt16 = 2;
              }

              else {
                final NoViableAltException nvae = new NoViableAltException("",
                    16, 0, this.input);
                throw nvae;
              }

              switch (alt16) {
                case 1:
                // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:230:5: '!='
                {
                  match(
                      this.input,
                      8,
                      StaticJavaASTParser.FOLLOW_8_in_equalityExp2233);
                  op = InfixExpression.Operator.NOT_EQUALS;
                }
                  break;
                case 2:
                // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:231:6: '=='
                {
                  match(
                      this.input,
                      23,
                      StaticJavaASTParser.FOLLOW_23_in_equalityExp2273);
                  op = InfixExpression.Operator.EQUALS;
                }
                  break;

              }

              pushFollow(StaticJavaASTParser.FOLLOW_relationalExp_in_equalityExp2319);
              e = relationalExp();
              this.state._fsp--;

              final InfixExpression ie = this.ast.newInfixExpression();
              ie.setLeftOperand(result);
              ie.setOperator(op);
              ie.setRightOperand(e);
              result = ie;
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
    return result;
  }

  // $ANTLR end "equalityExp"
  // $ANTLR start "exp"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:199:1: exp returns [Expression result = null] : e= logicalOrExp ;
  public final Expression exp() throws RecognitionException {
    Expression result = null;

    Expression e = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:200:2: (e= logicalOrExp )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:200:4: e= logicalOrExp
      {
        pushFollow(StaticJavaASTParser.FOLLOW_logicalOrExp_in_exp1981);
        e = logicalOrExp();
        this.state._fsp--;

        result = e;
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
    return result;
  }

  // $ANTLR end "exp"
  // $ANTLR start "fieldDeclaration"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:80:1: fieldDeclaration returns [FieldDeclaration result = null] : 'static' fieldType= type ID ';' ;
  public final FieldDeclaration fieldDeclaration() throws RecognitionException {
    FieldDeclaration result = null;

    Token ID2 = null;
    Type fieldType = null;

    final VariableDeclarationFragment vdf = this.ast
        .newVariableDeclarationFragment();
    ;
    result = this.ast.newFieldDeclaration(vdf);

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:85:2: ( 'static' fieldType= type ID ';' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:85:4: 'static' fieldType= type ID ';'
      {
        match(
            this.input,
            36,
            StaticJavaASTParser.FOLLOW_36_in_fieldDeclaration482);
        result.modifiers().add(
            this.ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
        pushFollow(StaticJavaASTParser.FOLLOW_type_in_fieldDeclaration522);
        fieldType = type();
        this.state._fsp--;

        result.setType(fieldType);
        ID2 = (Token) match(
            this.input,
            StaticJavaASTParser.ID,
            StaticJavaASTParser.FOLLOW_ID_in_fieldDeclaration554);
        vdf.setName(this.ast.newSimpleName(ID2.getText()));
        match(
            this.input,
            19,
            StaticJavaASTParser.FOLLOW_19_in_fieldDeclaration597);
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
    return result;
  }

  // $ANTLR end "fieldDeclaration"
  // delegates
  public Parser[] getDelegates() {
    return new Parser[] {};
  }

  @Override
  public String getGrammarFileName() {
    return "/compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g";
  }

  @Override
  public String[] getTokenNames() {
    return StaticJavaASTParser.tokenNames;
  }

  // $ANTLR start "ifStatement"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:157:1: ifStatement returns [IfStatement result = ast.newIfStatement()] : 'if' '(' condExp= exp ')' '{' (s= statement )* '}' ( 'else' '{' (s= statement )* '}' )? ;
  public final IfStatement ifStatement() throws RecognitionException {
    final IfStatement result = this.ast.newIfStatement();

    Expression condExp = null;
    Statement s = null;

    final Block thenStatement = this.ast.newBlock();
    result.setThenStatement(thenStatement);
    final Block elseStatement = this.ast.newBlock();
    result.setElseStatement(elseStatement);

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:164:2: ( 'if' '(' condExp= exp ')' '{' (s= statement )* '}' ( 'else' '{' (s= statement )* '}' )? )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:164:4: 'if' '(' condExp= exp ')' '{' (s= statement )* '}' ( 'else' '{' (s= statement )* '}' )?
      {
        match(this.input, 32, StaticJavaASTParser.FOLLOW_32_in_ifStatement1612);
        match(this.input, 11, StaticJavaASTParser.FOLLOW_11_in_ifStatement1614);
        pushFollow(StaticJavaASTParser.FOLLOW_exp_in_ifStatement1618);
        condExp = exp();
        this.state._fsp--;

        match(this.input, 12, StaticJavaASTParser.FOLLOW_12_in_ifStatement1620);
        result.setExpression(condExp);
        match(this.input, 40, StaticJavaASTParser.FOLLOW_40_in_ifStatement1641);
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:166:3: (s= statement )*
        loop9: while (true) {
          int alt9 = 2;
          final int LA9_0 = this.input.LA(1);
          if (((LA9_0 == StaticJavaASTParser.ID) || (LA9_0 == 32)
              || (LA9_0 == 35) || (LA9_0 == 39))) {
            alt9 = 1;
          }

          switch (alt9) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:167:4: s= statement
            {
              pushFollow(StaticJavaASTParser.FOLLOW_statement_in_ifStatement1653);
              s = statement();
              this.state._fsp--;

              thenStatement.statements().add(s);
            }
              break;

            default:
              break loop9;
          }
        }

        match(this.input, 42, StaticJavaASTParser.FOLLOW_42_in_ifStatement1691);
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:170:3: ( 'else' '{' (s= statement )* '}' )?
        int alt11 = 2;
        final int LA11_0 = this.input.LA(1);
        if ((LA11_0 == 30)) {
          alt11 = 1;
        }
        switch (alt11) {
          case 1:
          // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:170:5: 'else' '{' (s= statement )* '}'
          {
            match(
                this.input,
                30,
                StaticJavaASTParser.FOLLOW_30_in_ifStatement1697);
            match(
                this.input,
                40,
                StaticJavaASTParser.FOLLOW_40_in_ifStatement1699);
            // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:171:4: (s= statement )*
            loop10: while (true) {
              int alt10 = 2;
              final int LA10_0 = this.input.LA(1);
              if (((LA10_0 == StaticJavaASTParser.ID) || (LA10_0 == 32)
                  || (LA10_0 == 35) || (LA10_0 == 39))) {
                alt10 = 1;
              }

              switch (alt10) {
                case 1:
                // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:172:5: s= statement
                {
                  pushFollow(StaticJavaASTParser.FOLLOW_statement_in_ifStatement1714);
                  s = statement();
                  this.state._fsp--;

                  elseStatement.statements().add(s);
                }
                  break;

                default:
                  break loop10;
              }
            }

            match(
                this.input,
                42,
                StaticJavaASTParser.FOLLOW_42_in_ifStatement1748);
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
    return result;
  }

  // $ANTLR end "ifStatement"
  // $ANTLR start "invokeExp"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:332:1: invokeExp returns [MethodInvocation result = ast.newMethodInvocation()] : (id1= ID '.' )? id2= ID '(' (es= args )? ')' ;
  public final MethodInvocation invokeExp() throws RecognitionException {
    final MethodInvocation result = this.ast.newMethodInvocation();

    Token id1 = null;
    Token id2 = null;
    ArrayList<Expression> es = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:333:2: ( (id1= ID '.' )? id2= ID '(' (es= args )? ')' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:333:4: (id1= ID '.' )? id2= ID '(' (es= args )? ')'
      {
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:333:4: (id1= ID '.' )?
        int alt27 = 2;
        final int LA27_0 = this.input.LA(1);
        if ((LA27_0 == StaticJavaASTParser.ID)) {
          final int LA27_1 = this.input.LA(2);
          if ((LA27_1 == 17)) {
            alt27 = 1;
          }
        }
        switch (alt27) {
          case 1:
          // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:334:4: id1= ID '.'
          {
            id1 = (Token) match(
                this.input,
                StaticJavaASTParser.ID,
                StaticJavaASTParser.FOLLOW_ID_in_invokeExp3486);
            result.setExpression(this.ast.newSimpleName((id1 != null ? id1
                .getText() : null)));
            match(
                this.input,
                17,
                StaticJavaASTParser.FOLLOW_17_in_invokeExp3524);
          }
            break;

        }

        id2 = (Token) match(
            this.input,
            StaticJavaASTParser.ID,
            StaticJavaASTParser.FOLLOW_ID_in_invokeExp3545);
        result.setName(this.ast.newSimpleName((id2 != null ? id2.getText()
            : null)));
        match(this.input, 11, StaticJavaASTParser.FOLLOW_11_in_invokeExp3584);
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:338:7: (es= args )?
        int alt28 = 2;
        final int LA28_0 = this.input.LA(1);
        if ((((LA28_0 >= StaticJavaASTParser.ID) && (LA28_0 <= StaticJavaASTParser.NUM_INT))
            || (LA28_0 == 7)
            || (LA28_0 == 11)
            || (LA28_0 == 14)
            || (LA28_0 == 16) || (LA28_0 == 31) || (LA28_0 == 37))) {
          alt28 = 1;
        }
        switch (alt28) {
          case 1:
          // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:338:9: es= args
          {
            pushFollow(StaticJavaASTParser.FOLLOW_args_in_invokeExp3590);
            es = args();
            this.state._fsp--;

            result.arguments().addAll(es);
          }
            break;

        }

        match(this.input, 12, StaticJavaASTParser.FOLLOW_12_in_invokeExp3625);
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
    return result;
  }

  // $ANTLR end "invokeExp"
  // $ANTLR start "invokeExpStatement"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:188:1: invokeExpStatement returns [ExpressionStatement result = null] : mi= invokeExp ';' ;
  public final ExpressionStatement invokeExpStatement()
      throws RecognitionException {
    ExpressionStatement result = null;

    MethodInvocation mi = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:189:2: (mi= invokeExp ';' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:189:4: mi= invokeExp ';'
      {
        pushFollow(StaticJavaASTParser.FOLLOW_invokeExp_in_invokeExpStatement1867);
        mi = invokeExp();
        this.state._fsp--;

        match(
            this.input,
            19,
            StaticJavaASTParser.FOLLOW_19_in_invokeExpStatement1869);
        result = this.ast.newExpressionStatement(mi);
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
    return result;
  }

  // $ANTLR end "invokeExpStatement"
  // $ANTLR start "localDeclaration"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:130:1: localDeclaration returns [VariableDeclarationStatement result = null] : localType= type ID ';' ;
  public final VariableDeclarationStatement localDeclaration()
      throws RecognitionException {
    VariableDeclarationStatement result = null;

    Token ID5 = null;
    Type localType = null;

    final VariableDeclarationFragment vdf = this.ast
        .newVariableDeclarationFragment();
    result = this.ast.newVariableDeclarationStatement(vdf);

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:135:2: (localType= type ID ';' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:135:4: localType= type ID ';'
      {
        pushFollow(StaticJavaASTParser.FOLLOW_type_in_localDeclaration1259);
        localType = type();
        this.state._fsp--;

        result.setType(localType);
        ID5 = (Token) match(
            this.input,
            StaticJavaASTParser.ID,
            StaticJavaASTParser.FOLLOW_ID_in_localDeclaration1290);
        match(
            this.input,
            19,
            StaticJavaASTParser.FOLLOW_19_in_localDeclaration1292);
        vdf.setName(this.ast.newSimpleName((ID5 != null ? ID5.getText() : null)));
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
    return result;
  }

  // $ANTLR end "localDeclaration"
  // $ANTLR start "logicalAndExp"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:213:1: logicalAndExp returns [Expression result = null] : e= equalityExp ( '&&' e= equalityExp )* ;
  public final Expression logicalAndExp() throws RecognitionException {
    Expression result = null;

    Expression e = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:214:2: (e= equalityExp ( '&&' e= equalityExp )* )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:214:4: e= equalityExp ( '&&' e= equalityExp )*
      {
        pushFollow(StaticJavaASTParser.FOLLOW_equalityExp_in_logicalAndExp2104);
        e = equalityExp();
        this.state._fsp--;

        result = e;
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:215:3: ( '&&' e= equalityExp )*
        loop15: while (true) {
          int alt15 = 2;
          final int LA15_0 = this.input.LA(1);
          if ((LA15_0 == 10)) {
            alt15 = 1;
          }

          switch (alt15) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:215:5: '&&' e= equalityExp
            {
              match(
                  this.input,
                  10,
                  StaticJavaASTParser.FOLLOW_10_in_logicalAndExp2139);
              pushFollow(StaticJavaASTParser.FOLLOW_equalityExp_in_logicalAndExp2143);
              e = equalityExp();
              this.state._fsp--;

              final InfixExpression ie = this.ast.newInfixExpression();
              ie.setLeftOperand(result);
              ie.setOperator(InfixExpression.Operator.CONDITIONAL_AND);
              ie.setRightOperand(e);
              result = ie;
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
    return result;
  }

  // $ANTLR end "logicalAndExp"
  // $ANTLR start "logicalOrExp"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:203:1: logicalOrExp returns [Expression result = null] : e= logicalAndExp ( '||' e= logicalAndExp )* ;
  public final Expression logicalOrExp() throws RecognitionException {
    Expression result = null;

    Expression e = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:204:2: (e= logicalAndExp ( '||' e= logicalAndExp )* )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:204:4: e= logicalAndExp ( '||' e= logicalAndExp )*
      {
        pushFollow(StaticJavaASTParser.FOLLOW_logicalAndExp_in_logicalOrExp2025);
        e = logicalAndExp();
        this.state._fsp--;

        result = e;
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:205:3: ( '||' e= logicalAndExp )*
        loop14: while (true) {
          int alt14 = 2;
          final int LA14_0 = this.input.LA(1);
          if ((LA14_0 == 41)) {
            alt14 = 1;
          }

          switch (alt14) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:205:5: '||' e= logicalAndExp
            {
              match(
                  this.input,
                  41,
                  StaticJavaASTParser.FOLLOW_41_in_logicalOrExp2060);
              pushFollow(StaticJavaASTParser.FOLLOW_logicalAndExp_in_logicalOrExp2064);
              e = logicalAndExp();
              this.state._fsp--;

              final InfixExpression ie = this.ast.newInfixExpression();
              ie.setLeftOperand(result);
              ie.setOperator(InfixExpression.Operator.CONDITIONAL_OR);
              ie.setRightOperand(e);
              result = ie;
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
    return result;
  }

  // $ANTLR end "logicalOrExp"
  // $ANTLR start "mainMethodDeclaration"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:64:1: mainMethodDeclaration returns [MethodDeclaration result = ast.newMethodDeclaration()] : 'public' 'static' 'void' id1= ID {...}? '(' id2= ID {...}? '[' ']' id3= ID ')' '{' b= methodBody '}' ;
  public final MethodDeclaration mainMethodDeclaration()
      throws RecognitionException {
    final MethodDeclaration result = this.ast.newMethodDeclaration();

    Token id1 = null;
    Token id2 = null;
    Token id3 = null;
    Block b = null;

    final SingleVariableDeclaration svd = this.ast
        .newSingleVariableDeclaration();

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:68:2: ( 'public' 'static' 'void' id1= ID {...}? '(' id2= ID {...}? '[' ']' id3= ID ')' '{' b= methodBody '}' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:68:4: 'public' 'static' 'void' id1= ID {...}? '(' id2= ID {...}? '[' ']' id3= ID ')' '{' b= methodBody '}'
      {
        match(
            this.input,
            34,
            StaticJavaASTParser.FOLLOW_34_in_mainMethodDeclaration252);
        result.modifiers().add(
            this.ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
        match(
            this.input,
            36,
            StaticJavaASTParser.FOLLOW_36_in_mainMethodDeclaration289);
        result.modifiers().add(
            this.ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
        match(
            this.input,
            38,
            StaticJavaASTParser.FOLLOW_38_in_mainMethodDeclaration326);
        result.setReturnType2(this.ast.newPrimitiveType(PrimitiveType.VOID));
        id1 = (Token) match(
            this.input,
            StaticJavaASTParser.ID,
            StaticJavaASTParser.FOLLOW_ID_in_mainMethodDeclaration367);
        if (!(("main".equals((id1 != null ? id1.getText() : null))))) {
          throw new FailedPredicateException(this.input,
              "mainMethodDeclaration", "\"main\".equals($id1.text)");
        }
        result.setName(this.ast.newSimpleName("main"));
        match(
            this.input,
            11,
            StaticJavaASTParser.FOLLOW_11_in_mainMethodDeclaration381);
        id2 = (Token) match(
            this.input,
            StaticJavaASTParser.ID,
            StaticJavaASTParser.FOLLOW_ID_in_mainMethodDeclaration388);
        if (!(("String".equals((id2 != null ? id2.getText() : null))))) {
          throw new FailedPredicateException(this.input,
              "mainMethodDeclaration", "\"String\".equals($id2.text)");
        }
        svd.setType(this.ast.newArrayType(this.ast.newSimpleType(this.ast
            .newSimpleName("String"))));
        match(
            this.input,
            26,
            StaticJavaASTParser.FOLLOW_26_in_mainMethodDeclaration399);
        match(
            this.input,
            27,
            StaticJavaASTParser.FOLLOW_27_in_mainMethodDeclaration401);
        id3 = (Token) match(
            this.input,
            StaticJavaASTParser.ID,
            StaticJavaASTParser.FOLLOW_ID_in_mainMethodDeclaration405);
        svd.setName(this.ast.newSimpleName((id3 != null ? id3.getText() : null)));
        result.parameters().add(svd);
        match(
            this.input,
            12,
            StaticJavaASTParser.FOLLOW_12_in_mainMethodDeclaration436);
        match(
            this.input,
            40,
            StaticJavaASTParser.FOLLOW_40_in_mainMethodDeclaration438);
        pushFollow(StaticJavaASTParser.FOLLOW_methodBody_in_mainMethodDeclaration442);
        b = methodBody();
        this.state._fsp--;

        match(
            this.input,
            42,
            StaticJavaASTParser.FOLLOW_42_in_mainMethodDeclaration444);
        result.setBody(b);
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
    return result;
  }

  // $ANTLR end "mainMethodDeclaration"
  // $ANTLR start "methodBody"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:122:1: methodBody returns [Block result = ast.newBlock()] : (l= localDeclaration )* (s= statement )* ;
  public final Block methodBody() throws RecognitionException {
    final Block result = this.ast.newBlock();

    VariableDeclarationStatement l = null;
    Statement s = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:123:2: ( (l= localDeclaration )* (s= statement )* )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:124:3: (l= localDeclaration )* (s= statement )*
      {
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:124:3: (l= localDeclaration )*
        loop6: while (true) {
          int alt6 = 2;
          final int LA6_0 = this.input.LA(1);
          if (((LA6_0 == 28) || (LA6_0 == 33))) {
            alt6 = 1;
          }

          switch (alt6) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:124:5: l= localDeclaration
            {
              pushFollow(StaticJavaASTParser.FOLLOW_localDeclaration_in_methodBody1170);
              l = localDeclaration();
              this.state._fsp--;

              result.statements().add(l);
            }
              break;

            default:
              break loop6;
          }
        }

        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:126:3: (s= statement )*
        loop7: while (true) {
          int alt7 = 2;
          final int LA7_0 = this.input.LA(1);
          if (((LA7_0 == StaticJavaASTParser.ID) || (LA7_0 == 32)
              || (LA7_0 == 35) || (LA7_0 == 39))) {
            alt7 = 1;
          }

          switch (alt7) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:126:5: s= statement
            {
              pushFollow(StaticJavaASTParser.FOLLOW_statement_in_methodBody1204);
              s = statement();
              this.state._fsp--;

              result.statements().add(s);
            }
              break;

            default:
              break loop7;
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
    return result;
  }

  // $ANTLR end "methodBody"
  // $ANTLR start "methodDeclaration"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:91:1: methodDeclaration returns [MethodDeclaration result = ast.newMethodDeclaration()] : 'static' retType= returnType ID '(' (sdvs= params )? ')' '{' b= methodBody '}' ;
  public final MethodDeclaration methodDeclaration()
      throws RecognitionException {
    final MethodDeclaration result = this.ast.newMethodDeclaration();

    Token ID3 = null;
    Type retType = null;
    ArrayList<SingleVariableDeclaration> sdvs = null;
    Block b = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:92:2: ( 'static' retType= returnType ID '(' (sdvs= params )? ')' '{' b= methodBody '}' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:92:4: 'static' retType= returnType ID '(' (sdvs= params )? ')' '{' b= methodBody '}'
      {
        match(
            this.input,
            36,
            StaticJavaASTParser.FOLLOW_36_in_methodDeclaration613);
        result.modifiers().add(
            this.ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
        pushFollow(StaticJavaASTParser.FOLLOW_returnType_in_methodDeclaration653);
        retType = returnType();
        this.state._fsp--;

        result.setReturnType2(retType);
        ID3 = (Token) match(
            this.input,
            StaticJavaASTParser.ID,
            StaticJavaASTParser.FOLLOW_ID_in_methodDeclaration680);
        match(
            this.input,
            11,
            StaticJavaASTParser.FOLLOW_11_in_methodDeclaration682);
        result.setName(this.ast.newSimpleName((ID3 != null ? ID3.getText()
            : null)));
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:95:3: (sdvs= params )?
        int alt2 = 2;
        final int LA2_0 = this.input.LA(1);
        if (((LA2_0 == 28) || (LA2_0 == 33))) {
          alt2 = 1;
        }
        switch (alt2) {
          case 1:
          // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:96:4: sdvs= params
          {
            pushFollow(StaticJavaASTParser.FOLLOW_params_in_methodDeclaration725);
            sdvs = params();
            this.state._fsp--;

            result.parameters().addAll(sdvs);
          }
            break;

        }

        match(
            this.input,
            12,
            StaticJavaASTParser.FOLLOW_12_in_methodDeclaration762);
        match(
            this.input,
            40,
            StaticJavaASTParser.FOLLOW_40_in_methodDeclaration764);
        pushFollow(StaticJavaASTParser.FOLLOW_methodBody_in_methodDeclaration768);
        b = methodBody();
        this.state._fsp--;

        match(
            this.input,
            42,
            StaticJavaASTParser.FOLLOW_42_in_methodDeclaration770);
        result.setBody(b);
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
    return result;
  }

  // $ANTLR end "methodDeclaration"
  // $ANTLR start "multiplicativeExp"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:277:1: multiplicativeExp returns [Expression result = null] : e= unaryExp ( ( '*' | '/' | '%' ) e= unaryExp )* ;
  public final Expression multiplicativeExp() throws RecognitionException {
    Expression result = null;

    Expression e = null;

    InfixExpression.Operator op = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:281:2: (e= unaryExp ( ( '*' | '/' | '%' ) e= unaryExp )* )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:281:4: e= unaryExp ( ( '*' | '/' | '%' ) e= unaryExp )*
      {
        pushFollow(StaticJavaASTParser.FOLLOW_unaryExp_in_multiplicativeExp2802);
        e = unaryExp();
        this.state._fsp--;

        result = e;
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:282:3: ( ( '*' | '/' | '%' ) e= unaryExp )*
        loop23: while (true) {
          int alt23 = 2;
          final int LA23_0 = this.input.LA(1);
          if (((LA23_0 == 9) || (LA23_0 == 13) || (LA23_0 == 18))) {
            alt23 = 1;
          }

          switch (alt23) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:283:4: ( '*' | '/' | '%' ) e= unaryExp
            {
              // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:283:4: ( '*' | '/' | '%' )
              int alt22 = 3;
              switch (this.input.LA(1)) {
                case 13: {
                  alt22 = 1;
                }
                  break;
                case 18: {
                  alt22 = 2;
                }
                  break;
                case 9: {
                  alt22 = 3;
                }
                  break;
                default:
                  final NoViableAltException nvae = new NoViableAltException(
                      "", 22, 0, this.input);
                  throw nvae;
              }
              switch (alt22) {
                case 1:
                // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:283:6: '*'
                {
                  match(
                      this.input,
                      13,
                      StaticJavaASTParser.FOLLOW_13_in_multiplicativeExp2844);
                  op = InfixExpression.Operator.TIMES;
                }
                  break;
                case 2:
                // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:284:6: '/'
                {
                  match(
                      this.input,
                      18,
                      StaticJavaASTParser.FOLLOW_18_in_multiplicativeExp2885);
                  op = InfixExpression.Operator.DIVIDE;
                }
                  break;
                case 3:
                // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:285:6: '%'
                {
                  match(
                      this.input,
                      9,
                      StaticJavaASTParser.FOLLOW_9_in_multiplicativeExp2926);
                  op = InfixExpression.Operator.REMAINDER;
                }
                  break;

              }

              pushFollow(StaticJavaASTParser.FOLLOW_unaryExp_in_multiplicativeExp2972);
              e = unaryExp();
              this.state._fsp--;

              final InfixExpression ie = this.ast.newInfixExpression();
              ie.setLeftOperand(result);
              ie.setOperator(op);
              ie.setRightOperand(e);
              result = ie;
            }
              break;

            default:
              break loop23;
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
    return result;
  }

  // $ANTLR end "multiplicativeExp"
  // $ANTLR start "param"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:117:1: param returns [SingleVariableDeclaration result = ast.newSingleVariableDeclaration()] : paramType= type ID ;
  public final SingleVariableDeclaration param() throws RecognitionException {
    final SingleVariableDeclaration result = this.ast
        .newSingleVariableDeclaration();

    Token ID4 = null;
    Type paramType = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:118:2: (paramType= type ID )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:118:4: paramType= type ID
      {
        pushFollow(StaticJavaASTParser.FOLLOW_type_in_param1077);
        paramType = type();
        this.state._fsp--;

        result.setType(paramType);
        ID4 = (Token) match(
            this.input,
            StaticJavaASTParser.ID,
            StaticJavaASTParser.FOLLOW_ID_in_param1108);
        result.setName(this.ast.newSimpleName((ID4 != null ? ID4.getText()
            : null)));
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
    return result;
  }

  // $ANTLR end "param"
  // $ANTLR start "params"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:111:1: params returns [ArrayList<SingleVariableDeclaration> result = new ArrayList<SingleVariableDeclaration>()] : svd= param ( ',' svd= param )* ;
  public final ArrayList<SingleVariableDeclaration> params()
      throws RecognitionException {
    final ArrayList<SingleVariableDeclaration> result = new ArrayList<SingleVariableDeclaration>();

    SingleVariableDeclaration svd = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:112:2: (svd= param ( ',' svd= param )* )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:112:4: svd= param ( ',' svd= param )*
      {
        pushFollow(StaticJavaASTParser.FOLLOW_param_in_params985);
        svd = param();
        this.state._fsp--;

        result.add(svd);
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:113:3: ( ',' svd= param )*
        loop5: while (true) {
          int alt5 = 2;
          final int LA5_0 = this.input.LA(1);
          if ((LA5_0 == 15)) {
            alt5 = 1;
          }

          switch (alt5) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:113:5: ',' svd= param
            {
              match(this.input, 15, StaticJavaASTParser.FOLLOW_15_in_params1024);
              pushFollow(StaticJavaASTParser.FOLLOW_param_in_params1028);
              svd = param();
              this.state._fsp--;

              result.add(svd);
            }
              break;

            default:
              break loop5;
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
    return result;
  }

  // $ANTLR end "params"
  // $ANTLR start "primaryExp"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:316:1: primaryExp returns [Expression result = null] : (n= NUM_INT {...}?| 'true' | 'false' | '(' e= exp ')' |i= invokeExp | ID );
  public final Expression primaryExp() throws RecognitionException {
    Expression result = null;

    Token n = null;
    Token ID7 = null;
    Expression e = null;
    MethodInvocation i = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:317:2: (n= NUM_INT {...}?| 'true' | 'false' | '(' e= exp ')' |i= invokeExp | ID )
      int alt26 = 6;
      switch (this.input.LA(1)) {
        case NUM_INT: {
          alt26 = 1;
        }
          break;
        case 37: {
          alt26 = 2;
        }
          break;
        case 31: {
          alt26 = 3;
        }
          break;
        case 11: {
          alt26 = 4;
        }
          break;
        case ID: {
          final int LA26_5 = this.input.LA(2);
          if (((LA26_5 == 11) || (LA26_5 == 17))) {
            alt26 = 5;
          } else if ((((LA26_5 >= 8) && (LA26_5 <= 10))
              || ((LA26_5 >= 12) && (LA26_5 <= 16))
              || ((LA26_5 >= 18) && (LA26_5 <= 21))
              || ((LA26_5 >= 23) && (LA26_5 <= 25)) || (LA26_5 == 41))) {
            alt26 = 6;
          }

          else {
            final int nvaeMark = this.input.mark();
            try {
              this.input.consume();
              final NoViableAltException nvae = new NoViableAltException("",
                  26, 5, this.input);
              throw nvae;
            } finally {
              this.input.rewind(nvaeMark);
            }
          }

        }
          break;
        default:
          final NoViableAltException nvae = new NoViableAltException("", 26, 0,
              this.input);
          throw nvae;
      }
      switch (alt26) {
        case 1:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:317:4: n= NUM_INT {...}?
        {
          n = (Token) match(
              this.input,
              StaticJavaASTParser.NUM_INT,
              StaticJavaASTParser.FOLLOW_NUM_INT_in_primaryExp3216);
          if (!((new BigInteger(n.getText()).bitLength() < 32))) {
            throw new FailedPredicateException(this.input, "primaryExp",
                " new BigInteger(n.getText()).bitLength() < 32 ");
          }
          final NumberLiteral nl = this.ast.newNumberLiteral();
          nl.setToken((n != null ? n.getText() : null));
          result = nl;
        }
          break;
        case 2:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:322:4: 'true'
        {
          match(this.input, 37, StaticJavaASTParser.FOLLOW_37_in_primaryExp3267);
          result = this.ast.newBooleanLiteral(true);
        }
          break;
        case 3:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:323:4: 'false'
        {
          match(this.input, 31, StaticJavaASTParser.FOLLOW_31_in_primaryExp3307);
          result = this.ast.newBooleanLiteral(false);
        }
          break;
        case 4:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:324:4: '(' e= exp ')'
        {
          match(this.input, 11, StaticJavaASTParser.FOLLOW_11_in_primaryExp3346);
          pushFollow(StaticJavaASTParser.FOLLOW_exp_in_primaryExp3350);
          e = exp();
          this.state._fsp--;

          match(this.input, 12, StaticJavaASTParser.FOLLOW_12_in_primaryExp3352);
          final ParenthesizedExpression pe = this.ast
              .newParenthesizedExpression();
          pe.setExpression(e);
          result = pe;
        }
          break;
        case 5:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:327:4: i= invokeExp
        {
          pushFollow(StaticJavaASTParser.FOLLOW_invokeExp_in_primaryExp3387);
          i = invokeExp();
          this.state._fsp--;

          result = i;
        }
          break;
        case 6:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:328:4: ID
        {
          ID7 = (Token) match(
              this.input,
              StaticJavaASTParser.ID,
              StaticJavaASTParser.FOLLOW_ID_in_primaryExp3422);
          result = this.ast.newSimpleName((ID7 != null ? ID7.getText() : null));
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
    return result;
  }

  // $ANTLR end "primaryExp"
  // $ANTLR start "relationalExp"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:241:1: relationalExp returns [Expression result = null] : e= additiveExp ( ( '<' | '>' | '<=' | '>=' ) e= additiveExp )* ;
  public final Expression relationalExp() throws RecognitionException {
    Expression result = null;

    Expression e = null;

    InfixExpression.Operator op = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:245:2: (e= additiveExp ( ( '<' | '>' | '<=' | '>=' ) e= additiveExp )* )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:245:4: e= additiveExp ( ( '<' | '>' | '<=' | '>=' ) e= additiveExp )*
      {
        pushFollow(StaticJavaASTParser.FOLLOW_additiveExp_in_relationalExp2371);
        e = additiveExp();
        this.state._fsp--;

        result = e;
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:246:3: ( ( '<' | '>' | '<=' | '>=' ) e= additiveExp )*
        loop19: while (true) {
          int alt19 = 2;
          final int LA19_0 = this.input.LA(1);
          if ((((LA19_0 >= 20) && (LA19_0 <= 21)) || ((LA19_0 >= 24) && (LA19_0 <= 25)))) {
            alt19 = 1;
          }

          switch (alt19) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:247:4: ( '<' | '>' | '<=' | '>=' ) e= additiveExp
            {
              // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:247:4: ( '<' | '>' | '<=' | '>=' )
              int alt18 = 4;
              switch (this.input.LA(1)) {
                case 20: {
                  alt18 = 1;
                }
                  break;
                case 24: {
                  alt18 = 2;
                }
                  break;
                case 21: {
                  alt18 = 3;
                }
                  break;
                case 25: {
                  alt18 = 4;
                }
                  break;
                default:
                  final NoViableAltException nvae = new NoViableAltException(
                      "", 18, 0, this.input);
                  throw nvae;
              }
              switch (alt18) {
                case 1:
                // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:247:6: '<'
                {
                  match(
                      this.input,
                      20,
                      StaticJavaASTParser.FOLLOW_20_in_relationalExp2411);
                  op = InfixExpression.Operator.LESS;
                }
                  break;
                case 2:
                // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:248:6: '>'
                {
                  match(
                      this.input,
                      24,
                      StaticJavaASTParser.FOLLOW_24_in_relationalExp2452);
                  op = InfixExpression.Operator.GREATER;
                }
                  break;
                case 3:
                // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:249:6: '<='
                {
                  match(
                      this.input,
                      21,
                      StaticJavaASTParser.FOLLOW_21_in_relationalExp2493);
                  op = InfixExpression.Operator.LESS_EQUALS;
                }
                  break;
                case 4:
                // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:250:6: '>='
                {
                  match(
                      this.input,
                      25,
                      StaticJavaASTParser.FOLLOW_25_in_relationalExp2533);
                  op = InfixExpression.Operator.GREATER_EQUALS;
                }
                  break;

              }

              pushFollow(StaticJavaASTParser.FOLLOW_additiveExp_in_relationalExp2579);
              e = additiveExp();
              this.state._fsp--;

              final InfixExpression ie = this.ast.newInfixExpression();
              ie.setLeftOperand(result);
              ie.setOperator(op);
              ie.setRightOperand(e);
              result = ie;
            }
              break;

            default:
              break loop19;
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
    return result;
  }

  // $ANTLR end "relationalExp"
  @Override
  public void reportError(final RecognitionException arg0) {
    throw new RuntimeException(arg0);
  }

  // $ANTLR start "returnStatement"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:192:1: returnStatement returns [ReturnStatement result = ast.newReturnStatement()] : 'return' (e= exp )? ';' ;
  public final ReturnStatement returnStatement() throws RecognitionException {
    final ReturnStatement result = this.ast.newReturnStatement();

    Expression e = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:193:2: ( 'return' (e= exp )? ';' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:193:4: 'return' (e= exp )? ';'
      {
        match(
            this.input,
            35,
            StaticJavaASTParser.FOLLOW_35_in_returnStatement1909);
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:194:3: (e= exp )?
        int alt13 = 2;
        final int LA13_0 = this.input.LA(1);
        if ((((LA13_0 >= StaticJavaASTParser.ID) && (LA13_0 <= StaticJavaASTParser.NUM_INT))
            || (LA13_0 == 7)
            || (LA13_0 == 11)
            || (LA13_0 == 14)
            || (LA13_0 == 16) || (LA13_0 == 31) || (LA13_0 == 37))) {
          alt13 = 1;
        }
        switch (alt13) {
          case 1:
          // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:195:4: e= exp
          {
            pushFollow(StaticJavaASTParser.FOLLOW_exp_in_returnStatement1922);
            e = exp();
            this.state._fsp--;

            result.setExpression(e);
          }
            break;

        }

        match(
            this.input,
            19,
            StaticJavaASTParser.FOLLOW_19_in_returnStatement1963);
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
    return result;
  }

  // $ANTLR end "returnStatement"
  // $ANTLR start "returnType"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:106:1: returnType returns [Type result = null] : ( 'void' |t= type );
  public final Type returnType() throws RecognitionException {
    Type result = null;

    Type t = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:107:2: ( 'void' |t= type )
      int alt4 = 2;
      final int LA4_0 = this.input.LA(1);
      if ((LA4_0 == 38)) {
        alt4 = 1;
      } else if (((LA4_0 == 28) || (LA4_0 == 33))) {
        alt4 = 2;
      }

      else {
        final NoViableAltException nvae = new NoViableAltException("", 4, 0,
            this.input);
        throw nvae;
      }

      switch (alt4) {
        case 1:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:107:4: 'void'
        {
          match(this.input, 38, StaticJavaASTParser.FOLLOW_38_in_returnType892);
          result = this.ast.newPrimitiveType(PrimitiveType.VOID);
        }
          break;
        case 2:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:108:4: t= type
        {
          pushFollow(StaticJavaASTParser.FOLLOW_type_in_returnType932);
          t = type();
          this.state._fsp--;

          result = t;
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
    return result;
  }

  // $ANTLR end "returnType"
  // $ANTLR start "statement"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:139:1: statement returns [Statement result = null] : (a= assignStatement |i= ifStatement |w= whileStatement |in= invokeExpStatement |r= returnStatement ) ;
  public final Statement statement() throws RecognitionException {
    Statement result = null;

    ExpressionStatement a = null;
    IfStatement i = null;
    WhileStatement w = null;
    ExpressionStatement in = null;
    ReturnStatement r = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:140:2: ( (a= assignStatement |i= ifStatement |w= whileStatement |in= invokeExpStatement |r= returnStatement ) )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:140:4: (a= assignStatement |i= ifStatement |w= whileStatement |in= invokeExpStatement |r= returnStatement )
      {
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:140:4: (a= assignStatement |i= ifStatement |w= whileStatement |in= invokeExpStatement |r= returnStatement )
        int alt8 = 5;
        switch (this.input.LA(1)) {
          case ID: {
            final int LA8_1 = this.input.LA(2);
            if ((LA8_1 == 22)) {
              alt8 = 1;
            } else if (((LA8_1 == 11) || (LA8_1 == 17))) {
              alt8 = 4;
            }

            else {
              final int nvaeMark = this.input.mark();
              try {
                this.input.consume();
                final NoViableAltException nvae = new NoViableAltException("",
                    8, 1, this.input);
                throw nvae;
              } finally {
                this.input.rewind(nvaeMark);
              }
            }

          }
            break;
          case 32: {
            alt8 = 2;
          }
            break;
          case 39: {
            alt8 = 3;
          }
            break;
          case 35: {
            alt8 = 5;
          }
            break;
          default:
            final NoViableAltException nvae = new NoViableAltException("", 8,
                0, this.input);
            throw nvae;
        }
        switch (alt8) {
          case 1:
          // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:140:6: a= assignStatement
          {
            pushFollow(StaticJavaASTParser.FOLLOW_assignStatement_in_statement1347);
            a = assignStatement();
            this.state._fsp--;

            result = a;
          }
            break;
          case 2:
          // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:141:5: i= ifStatement
          {
            pushFollow(StaticJavaASTParser.FOLLOW_ifStatement_in_statement1377);
            i = ifStatement();
            this.state._fsp--;

            result = i;
          }
            break;
          case 3:
          // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:142:5: w= whileStatement
          {
            pushFollow(StaticJavaASTParser.FOLLOW_whileStatement_in_statement1411);
            w = whileStatement();
            this.state._fsp--;

            result = w;
          }
            break;
          case 4:
          // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:143:5: in= invokeExpStatement
          {
            pushFollow(StaticJavaASTParser.FOLLOW_invokeExpStatement_in_statement1442);
            in = invokeExpStatement();
            this.state._fsp--;

            result = in;
          }
            break;
          case 5:
          // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:144:5: r= returnStatement
          {
            pushFollow(StaticJavaASTParser.FOLLOW_returnStatement_in_statement1468);
            r = returnStatement();
            this.state._fsp--;

            result = r;
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
    return result;
  }

  // $ANTLR end "statement"
  // $ANTLR start "type"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:101:1: type returns [Type result = null] : ( 'boolean' | 'int' );
  public final Type type() throws RecognitionException {
    Type result = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:102:2: ( 'boolean' | 'int' )
      int alt3 = 2;
      final int LA3_0 = this.input.LA(1);
      if ((LA3_0 == 28)) {
        alt3 = 1;
      } else if ((LA3_0 == 33)) {
        alt3 = 2;
      }

      else {
        final NoViableAltException nvae = new NoViableAltException("", 3, 0,
            this.input);
        throw nvae;
      }

      switch (alt3) {
        case 1:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:102:4: 'boolean'
        {
          match(this.input, 28, StaticJavaASTParser.FOLLOW_28_in_type803);
          result = this.ast.newPrimitiveType(PrimitiveType.BOOLEAN);
        }
          break;
        case 2:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:103:4: 'int'
        {
          match(this.input, 33, StaticJavaASTParser.FOLLOW_33_in_type840);
          result = this.ast.newPrimitiveType(PrimitiveType.INT);
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
    return result;
  }

  // $ANTLR end "type"
  // $ANTLR start "unaryExp"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:295:1: unaryExp returns [Expression result = null] : ( '-' e= unaryExp | '+' e= unaryExp |e= unaryExpNotPlusMinus );
  public final Expression unaryExp() throws RecognitionException {
    Expression result = null;

    Expression e = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:296:2: ( '-' e= unaryExp | '+' e= unaryExp |e= unaryExpNotPlusMinus )
      int alt24 = 3;
      switch (this.input.LA(1)) {
        case 16: {
          alt24 = 1;
        }
          break;
        case 14: {
          alt24 = 2;
        }
          break;
        case ID:
        case NUM_INT:
        case 7:
        case 11:
        case 31:
        case 37: {
          alt24 = 3;
        }
          break;
        default:
          final NoViableAltException nvae = new NoViableAltException("", 24, 0,
              this.input);
          throw nvae;
      }
      switch (alt24) {
        case 1:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:296:4: '-' e= unaryExp
        {
          match(this.input, 16, StaticJavaASTParser.FOLLOW_16_in_unaryExp3022);
          pushFollow(StaticJavaASTParser.FOLLOW_unaryExp_in_unaryExp3026);
          e = unaryExp();
          this.state._fsp--;

          final PrefixExpression pe = this.ast.newPrefixExpression();
          pe.setOperator(PrefixExpression.Operator.MINUS);
          pe.setOperand(e);
          result = pe;
        }
          break;
        case 2:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:300:4: '+' e= unaryExp
        {
          match(this.input, 14, StaticJavaASTParser.FOLLOW_14_in_unaryExp3058);
          pushFollow(StaticJavaASTParser.FOLLOW_unaryExp_in_unaryExp3062);
          e = unaryExp();
          this.state._fsp--;

          final PrefixExpression pe = this.ast.newPrefixExpression();
          pe.setOperator(PrefixExpression.Operator.PLUS);
          pe.setOperand(e);
          result = pe;

        }
          break;
        case 3:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:305:4: e= unaryExpNotPlusMinus
        {
          pushFollow(StaticJavaASTParser.FOLLOW_unaryExpNotPlusMinus_in_unaryExp3096);
          e = unaryExpNotPlusMinus();
          this.state._fsp--;

          result = e;
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
    return result;
  }

  // $ANTLR end "unaryExp"
  // $ANTLR start "unaryExpNotPlusMinus"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:308:1: unaryExpNotPlusMinus returns [Expression result = null] : ( '!' e= unaryExp |e= primaryExp );
  public final Expression unaryExpNotPlusMinus() throws RecognitionException {
    Expression result = null;

    Expression e = null;

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:309:2: ( '!' e= unaryExp |e= primaryExp )
      int alt25 = 2;
      final int LA25_0 = this.input.LA(1);
      if ((LA25_0 == 7)) {
        alt25 = 1;
      } else if ((((LA25_0 >= StaticJavaASTParser.ID) && (LA25_0 <= StaticJavaASTParser.NUM_INT))
          || (LA25_0 == 11) || (LA25_0 == 31) || (LA25_0 == 37))) {
        alt25 = 2;
      }

      else {
        final NoViableAltException nvae = new NoViableAltException("", 25, 0,
            this.input);
        throw nvae;
      }

      switch (alt25) {
        case 1:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:309:4: '!' e= unaryExp
        {
          match(
              this.input,
              7,
              StaticJavaASTParser.FOLLOW_7_in_unaryExpNotPlusMinus3131);
          pushFollow(StaticJavaASTParser.FOLLOW_unaryExp_in_unaryExpNotPlusMinus3135);
          e = unaryExp();
          this.state._fsp--;

          final PrefixExpression pe = this.ast.newPrefixExpression();
          pe.setOperator(PrefixExpression.Operator.NOT);
          pe.setOperand(e);
          result = pe;
        }
          break;
        case 2:
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:313:4: e= primaryExp
        {
          pushFollow(StaticJavaASTParser.FOLLOW_primaryExp_in_unaryExpNotPlusMinus3169);
          e = primaryExp();
          this.state._fsp--;

          result = e;
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
    return result;
  }

  // $ANTLR end "unaryExpNotPlusMinus"
  // $ANTLR start "whileStatement"
  // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:176:1: whileStatement returns [WhileStatement result = ast.newWhileStatement()] : 'while' '(' condExp= exp ')' '{' (s= statement )* '}' ;
  public final WhileStatement whileStatement() throws RecognitionException {
    final WhileStatement result = this.ast.newWhileStatement();

    Expression condExp = null;
    Statement s = null;

    final Block whileBody = this.ast.newBlock();
    result.setBody(whileBody);

    try {
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:181:2: ( 'while' '(' condExp= exp ')' '{' (s= statement )* '}' )
      // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:181:4: 'while' '(' condExp= exp ')' '{' (s= statement )* '}'
      {
        match(
            this.input,
            39,
            StaticJavaASTParser.FOLLOW_39_in_whileStatement1772);
        match(
            this.input,
            11,
            StaticJavaASTParser.FOLLOW_11_in_whileStatement1774);
        pushFollow(StaticJavaASTParser.FOLLOW_exp_in_whileStatement1778);
        condExp = exp();
        this.state._fsp--;

        result.setExpression(condExp);
        match(
            this.input,
            12,
            StaticJavaASTParser.FOLLOW_12_in_whileStatement1800);
        match(
            this.input,
            40,
            StaticJavaASTParser.FOLLOW_40_in_whileStatement1802);
        // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:183:3: (s= statement )*
        loop12: while (true) {
          int alt12 = 2;
          final int LA12_0 = this.input.LA(1);
          if (((LA12_0 == StaticJavaASTParser.ID) || (LA12_0 == 32)
              || (LA12_0 == 35) || (LA12_0 == 39))) {
            alt12 = 1;
          }

          switch (alt12) {
            case 1:
            // /compiler-sjc/src-sjc/sjc/parser/StaticJavaAST.g:184:4: s= statement
            {
              pushFollow(StaticJavaASTParser.FOLLOW_statement_in_whileStatement1814);
              s = statement();
              this.state._fsp--;

              whileBody.statements().add(s);
            }
              break;

            default:
              break loop12;
          }
        }

        match(
            this.input,
            42,
            StaticJavaASTParser.FOLLOW_42_in_whileStatement1849);
      }

    }

    /**
     * Eliminate rule error recovery so that all parse errors cause exceptions
     * to propogate out of the top-level parse method.
     */

    finally {
      // do for sure before leaving
    }
    return result;
  }
  // $ANTLR end "whileStatement"
}
