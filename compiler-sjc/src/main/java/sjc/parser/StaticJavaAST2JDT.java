package sjc.parser;

import java.util.HashMap;
import java.util.List;

import org.antlr.runtime.tree.Tree;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
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

import sjc.annotation.NonNull;
import sjc.util.VoidFunction;

/**
 * This class builds JDT AST from ANTLR Tree produced by StaticJavaAST2 parser.
 * 
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class StaticJavaAST2JDT extends StaticJavaASTAltTreeVisitor<Object> {

  final static HashMap<String, InfixExpression.Operator> binopMap;

  static {
    binopMap = new HashMap<String, InfixExpression.Operator>(16);
    StaticJavaAST2JDT.binopMap.put(
        "||",
        InfixExpression.Operator.CONDITIONAL_OR);
    StaticJavaAST2JDT.binopMap.put(
        "&&",
        InfixExpression.Operator.CONDITIONAL_AND);
    StaticJavaAST2JDT.binopMap.put("==", InfixExpression.Operator.EQUALS);
    StaticJavaAST2JDT.binopMap.put("!=", InfixExpression.Operator.NOT_EQUALS);
    StaticJavaAST2JDT.binopMap.put("==", InfixExpression.Operator.EQUALS);
    StaticJavaAST2JDT.binopMap.put("<", InfixExpression.Operator.LESS);
    StaticJavaAST2JDT.binopMap.put(">", InfixExpression.Operator.GREATER);
    StaticJavaAST2JDT.binopMap.put("<=", InfixExpression.Operator.LESS_EQUALS);
    StaticJavaAST2JDT.binopMap.put(
        ">=",
        InfixExpression.Operator.GREATER_EQUALS);
    StaticJavaAST2JDT.binopMap.put("+", InfixExpression.Operator.PLUS);
    StaticJavaAST2JDT.binopMap.put("-", InfixExpression.Operator.MINUS);
    StaticJavaAST2JDT.binopMap.put("*", InfixExpression.Operator.TIMES);
    StaticJavaAST2JDT.binopMap.put("/", InfixExpression.Operator.DIVIDE);
    StaticJavaAST2JDT.binopMap.put("%", InfixExpression.Operator.REMAINDER);
  }

  final static HashMap<String, PrefixExpression.Operator> unopMap;

  static {
    unopMap = new HashMap<String, PrefixExpression.Operator>(4);
    StaticJavaAST2JDT.unopMap.put("+", PrefixExpression.Operator.PLUS);
    StaticJavaAST2JDT.unopMap.put("-", PrefixExpression.Operator.MINUS);
    StaticJavaAST2JDT.unopMap.put("!", PrefixExpression.Operator.NOT);
  }

  /**
   * Builds JDT AST from a given ANTLR Tree.
   * 
   * @param t
   *          The ANTLR Tree to build JDT AST from.
   * @param c
   *          The class of the expected JDT AST root node.
   * @return the JDT AST root node.
   */
  @NonNull
  public static <T extends ASTNode> T builds(@NonNull final Tree t,
      @NonNull final Class<T> c) {
    final StaticJavaAST2JDT v = new StaticJavaAST2JDT(null);
    v.visit(t);
    return v.pop(c);
  }

  protected AST ast = AST.newAST(AST.JLS4);

  ASTNode vresult = null;

  protected StaticJavaAST2JDT(final StaticJavaAST2JDT context) {
    super(context);
  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
  protected <T> void add(final List l, final T e) {
    l.add(e);
  }

  protected Tree getChild(final Tree t, final int i) {
    return t.getChild(i);
  }

  protected void getOptChild(final Tree t, final int i,
      final VoidFunction<Tree> f) {
    final Tree optTree = getChild(t, i);
    if (optTree.getChildCount() == 1) {
      f.apply(getChild(optTree, 0));
    }
  }

  protected <T extends ASTNode> T pop(final Class<T> c) {
    assert this.vresult != null;
    assert c.isAssignableFrom(this.vresult.getClass());
    @SuppressWarnings("unchecked")
    final T r = (T) this.vresult;
    this.vresult = null;
    return r;
  }

  protected void push(final ASTNode n) {
    assert this.vresult == null;
    this.vresult = n;
  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
  protected <T extends ASTNode> void transChild(final List l, final Tree t,
      final int i, final Class<T> c) {
    l.add(transChild(t, i, c));
  }

  protected <T extends ASTNode> T transChild(final Tree t, final int i,
      final Class<T> c) {
    visit(getChild(t, i));
    return pop(c);
  }

  @SuppressWarnings({ "rawtypes" })
  protected <T extends ASTNode> void transChildren(final List l, final Tree t,
      final Class<T> c) {
    final int size = t.getChildCount();
    for (int i = 0; i < size; i++) {
      transChild(l, t, i, c);
    }
  }

  protected <T extends ASTNode> void transOptChild(final Tree t, final int i,
      final Class<T> c, final VoidFunction<T> f) {
    final Tree optTree = getChild(t, i);
    if (optTree.getChildCount() == 1) {
      f.apply(transChild(optTree, 0, c));
    }
  }

  @Override
  protected boolean visitASSIGN_STMT(final Tree t) {
    final Assignment a = this.ast.newAssignment();
    final ExpressionStatement result = this.ast.newExpressionStatement(a);

    int i = 0;

    // i=0: ID
    a.setLeftHandSide(this.ast.newSimpleName(getChild(t, i).getText()));
    i++;

    // i=1: exp
    a.setRightHandSide(transChild(t, i, Expression.class));

    push(result);
    return false;
  }

  @Override
  protected boolean visitBINARY_EXP(final Tree t) {
    final InfixExpression result = this.ast.newInfixExpression();

    int i = 0;

    // i=0: exp
    result.setLeftOperand(transChild(t, i, Expression.class));
    i++;

    // i=1: op
    result
        .setOperator(StaticJavaAST2JDT.binopMap.get(getChild(t, i).getText()));
    i++;

    // i=2: exp
    result.setRightOperand(transChild(t, i, Expression.class));

    push(result);
    return false;
  }

  @Override
  protected boolean visitBODY(final Tree t) {
    final Block result = this.ast.newBlock();

    int i = 0;

    // i=0: LIST localDeclaration*
    transChildren(
        result.statements(),
        getChild(t, i),
        VariableDeclarationStatement.class);
    i++;

    // i=1: LIST statement*
    transChildren(result.statements(), getChild(t, i), Statement.class);

    push(result);
    return false;
  }

  @Override
  protected boolean visitBOOLEAN(final Tree t) {
    push(this.ast.newPrimitiveType(PrimitiveType.BOOLEAN));
    return false;
  }

  @Override
  protected boolean visitCLASS_DEF(final Tree t) {
    final TypeDeclaration result = this.ast.newTypeDeclaration();
    add(
        result.modifiers(),
        this.ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));

    int i = 0;

    // i=0: ID
    result.setName(this.ast.newSimpleName(getChild(t, i).getText()));
    i++;

    // i=1: mainMethodDeclaration
    transChild(result.bodyDeclarations(), t, i, MethodDeclaration.class);
    i++;

    // i=2: LIST fieldDeclaration*
    transChildren(
        result.bodyDeclarations(),
        getChild(t, i),
        FieldDeclaration.class);
    i++;

    // i=3: LIST methodDeclaration*
    transChildren(
        result.bodyDeclarations(),
        getChild(t, i),
        MethodDeclaration.class);

    push(result);
    return false;
  }

  @Override
  protected boolean visitCOMP_UNIT(final Tree t) {
    final CompilationUnit result = this.ast.newCompilationUnit();

    int i = 0;

    // i=0: classDefinition
    transChild(result.types(), t, i, TypeDeclaration.class);
    i++;

    push(result);
    return false;
  }

  @Override
  protected boolean visitFALSE_LIT(final Tree t) {
    push(this.ast.newBooleanLiteral(false));
    return false;
  }

  @Override
  protected boolean visitFIELD_DECL(final Tree t) {
    final VariableDeclarationFragment vdf = this.ast
        .newVariableDeclarationFragment();
    final FieldDeclaration result = this.ast.newFieldDeclaration(vdf);
    add(
        result.modifiers(),
        this.ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));

    int i = 0;

    // i=0: type
    result.setType(transChild(t, i, Type.class));
    i++;

    // i=1: ID
    vdf.setName(this.ast.newSimpleName(getChild(t, i).getText()));

    push(result);
    return false;
  }

  @Override
  protected boolean visitIF_STMT(final Tree t) {
    final IfStatement result = this.ast.newIfStatement();
    final Block thenStatement = this.ast.newBlock();
    result.setThenStatement(thenStatement);
    final Block elseStatement = this.ast.newBlock();
    result.setElseStatement(elseStatement);

    int i = 0;

    // i=0: exp
    result.setExpression(transChild(t, i, Expression.class));
    i++;

    // i=1: LIST statement*
    transChildren(thenStatement.statements(), getChild(t, i), Statement.class);
    i++;

    // i=2: LIST statement*
    transChildren(elseStatement.statements(), getChild(t, i), Statement.class);

    push(result);
    return false;
  }

  @Override
  protected boolean visitINT(final Tree t) {
    push(this.ast.newPrimitiveType(PrimitiveType.INT));
    return false;
  }

  @Override
  protected boolean visitINT_LIT(final Tree t) {
    final NumberLiteral result = this.ast.newNumberLiteral();

    final int i = 0;

    // i=0: NUM_INT
    result.setToken(getChild(t, i).getText());

    push(result);
    return false;
  }

  @Override
  protected boolean visitINVOKE_EXP(final Tree t) {
    final MethodInvocation result = this.ast.newMethodInvocation();

    int i = 0;

    // i=0: OPTION ID
    getOptChild(t, i, new VoidFunction<Tree>() {
      public void apply(final Tree t) {
        result.setExpression(StaticJavaAST2JDT.this.ast.newSimpleName(t
            .getText()));
      }
    });
    i++;

    // i=1: ID
    result.setName(this.ast.newSimpleName(getChild(t, i).getText()));
    i++;

    // i=2: LIST (args+)?
    transChildren(result.arguments(), getChild(t, i), Expression.class);

    push(result);
    return false;
  }

  @Override
  protected boolean visitINVOKE_STMT(final Tree t) {
    final int i = 0;

    // i=0: invokeExp
    final ExpressionStatement result = this.ast
        .newExpressionStatement(transChild(t, i, Expression.class));

    push(result);
    return false;
  }

  @Override
  protected boolean visitLOCAL_DECL(final Tree t) {
    final VariableDeclarationFragment vdf = this.ast
        .newVariableDeclarationFragment();
    final VariableDeclarationStatement result = this.ast
        .newVariableDeclarationStatement(vdf);

    int i = 0;

    // i=0: type
    result.setType(transChild(t, i, Type.class));
    i++;

    // i=1: ID
    vdf.setName(this.ast.newSimpleName(getChild(t, i).getText()));

    push(result);
    return false;
  }

  @Override
  protected boolean visitMAIN_DECL(final Tree t) {
    final MethodDeclaration result = this.ast.newMethodDeclaration();
    add(
        result.modifiers(),
        this.ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
    add(
        result.modifiers(),
        this.ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
    result.setReturnType2(this.ast.newPrimitiveType(PrimitiveType.VOID));
    result.setName(this.ast.newSimpleName("main"));

    int i = 0;

    // i=0: ID
    {
      final SingleVariableDeclaration svd = this.ast
          .newSingleVariableDeclaration();
      svd.setType(this.ast.newArrayType(this.ast.newSimpleType(this.ast
          .newSimpleName("String"))));
      svd.setName(this.ast.newSimpleName(getChild(t, i).getText()));
      add(result.parameters(), svd);
    }
    i++;

    // i=1: methodBody
    result.setBody(transChild(t, i, Block.class));

    push(result);
    return false;
  }

  @Override
  protected boolean visitMETHOD_DECL(final Tree t) {
    final MethodDeclaration result = this.ast.newMethodDeclaration();
    add(
        result.modifiers(),
        this.ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));

    int i = 0;

    // i=0: returnType
    result.setReturnType2(transChild(t, i, Type.class));
    i++;

    // i=1: ID
    result.setName(this.ast.newSimpleName(getChild(t, i).getText()));
    i++;

    // i=2: LIST (params+)?
    transChildren(
        result.parameters(),
        getChild(t, i),
        SingleVariableDeclaration.class);
    i++;

    // i=3: methodBody
    result.setBody(transChild(t, i, Block.class));

    push(result);
    return false;
  }

  @Override
  protected boolean visitPARAM(final Tree t) {
    final SingleVariableDeclaration result = this.ast
        .newSingleVariableDeclaration();

    int i = 0;

    // i=0: type
    result.setType(transChild(t, i, Type.class));
    i++;

    // i=1: ID
    result.setName(this.ast.newSimpleName(getChild(t, i).getText()));

    push(result);
    return false;
  }

  @Override
  protected boolean visitPAREN_EXP(final Tree t) {
    final ParenthesizedExpression result = this.ast
        .newParenthesizedExpression();

    final int i = 0;

    // i=0: exp
    result.setExpression(transChild(t, i, Expression.class));

    push(result);
    return false;
  }

  @Override
  protected boolean visitRETURN_STMT(final Tree t) {
    final ReturnStatement result = this.ast.newReturnStatement();

    final int i = 0;

    // i=0: OPTION exp?
    transOptChild(t, i, Expression.class, new VoidFunction<Expression>() {
      public void apply(final Expression e) {
        result.setExpression(e);
      }
    });

    push(result);
    return false;
  }

  @Override
  protected boolean visitTRUE_LIT(final Tree t) {
    push(this.ast.newBooleanLiteral(true));
    return false;
  }

  @Override
  protected boolean visitUNARY_EXP(final Tree t) {
    final PrefixExpression result = this.ast.newPrefixExpression();

    int i = 0;

    // i=0: op
    result.setOperator(StaticJavaAST2JDT.unopMap.get(getChild(t, i).getText()));
    i++;

    // i=1: exp
    result.setOperand(transChild(t, i, Expression.class));

    push(result);
    return false;
  }

  @Override
  protected boolean visitVAR_REF_EXP(final Tree t) {
    final int i = 0;

    // i=0: ID
    push(this.ast.newSimpleName(getChild(t, i).getText()));
    return false;
  }

  @Override
  protected boolean visitVOID(final Tree t) {
    push(this.ast.newPrimitiveType(PrimitiveType.VOID));
    return false;
  }

  @Override
  protected boolean visitWHILE_STMT(final Tree t) {
    final WhileStatement result = this.ast.newWhileStatement();
    final Block whileBody = this.ast.newBlock();
    result.setBody(whileBody);

    int i = 0;

    // i=0: exp
    result.setExpression(transChild(t, i, Expression.class));
    i++;

    // i=1: LIST statement*
    transChildren(whileBody.statements(), getChild(t, i), Statement.class);

    push(result);
    return false;
  }
}
