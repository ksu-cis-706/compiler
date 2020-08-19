package sjc.ast;

import java.util.HashMap;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.BooleanLiteral;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.NullLiteral;
import org.eclipse.jdt.core.dom.NumberLiteral;
import org.eclipse.jdt.core.dom.ParenthesizedExpression;
import org.eclipse.jdt.core.dom.PrefixExpression;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.core.dom.WhileStatement;

import sjc.parser.StaticJavaV4BaseVisitor;
import sjc.parser.StaticJavaV4Parser.ArgsContext;
import sjc.parser.StaticJavaV4Parser.AssignStatementContext;
import sjc.parser.StaticJavaV4Parser.BinaryExpContext;
import sjc.parser.StaticJavaV4Parser.BooleanTypeContext;
import sjc.parser.StaticJavaV4Parser.ClassDefinitionContext;
import sjc.parser.StaticJavaV4Parser.CompilationUnitContext;
import sjc.parser.StaticJavaV4Parser.ExpContext;
import sjc.parser.StaticJavaV4Parser.FalseLiteralContext;
import sjc.parser.StaticJavaV4Parser.FieldDeclarationContext;
import sjc.parser.StaticJavaV4Parser.IdExpContext;
import sjc.parser.StaticJavaV4Parser.IfStatementContext;
import sjc.parser.StaticJavaV4Parser.IntLiteralContext;
import sjc.parser.StaticJavaV4Parser.IntTypeContext;
import sjc.parser.StaticJavaV4Parser.InvokeContext;
import sjc.parser.StaticJavaV4Parser.InvokeExpContext;
import sjc.parser.StaticJavaV4Parser.InvokeExpStatementContext;
import sjc.parser.StaticJavaV4Parser.LocalDeclarationContext;
import sjc.parser.StaticJavaV4Parser.MainMethodDeclarationContext;
import sjc.parser.StaticJavaV4Parser.MemberDeclarationContext;
import sjc.parser.StaticJavaV4Parser.MethodBodyContext;
import sjc.parser.StaticJavaV4Parser.MethodDeclarationContext;
import sjc.parser.StaticJavaV4Parser.NonVoidReturnTypeContext;
import sjc.parser.StaticJavaV4Parser.NullLiteralContext;
import sjc.parser.StaticJavaV4Parser.ParamContext;
import sjc.parser.StaticJavaV4Parser.ParamsContext;
import sjc.parser.StaticJavaV4Parser.ParenExpContext;
import sjc.parser.StaticJavaV4Parser.ReturnStatementContext;
import sjc.parser.StaticJavaV4Parser.StatementContext;
import sjc.parser.StaticJavaV4Parser.TrueLiteralContext;
import sjc.parser.StaticJavaV4Parser.UnaryExpContext;
import sjc.parser.StaticJavaV4Parser.VoidTypeContext;
import sjc.parser.StaticJavaV4Parser.WhileStatementContext;

/**
 * This class builds JDT AST from ANTLR Parse Tree produced by StaticJavaV4
 * parser.
 *
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class StaticJavaASTBuilder extends StaticJavaV4BaseVisitor<ASTNode> {

  static CompilationUnit ast(final CompilationUnitContext ctx) {
    final StaticJavaASTBuilder builder = new StaticJavaASTBuilder();
    return builder.build(ctx);
  }

  final static HashMap<String, InfixExpression.Operator> binopMap;

  final static HashMap<String, PrefixExpression.Operator> unopMap;

  static {
    binopMap = new HashMap<>(16);
    StaticJavaASTBuilder.binopMap.put(
        "||",
        InfixExpression.Operator.CONDITIONAL_OR);
    StaticJavaASTBuilder.binopMap.put(
        "&&",
        InfixExpression.Operator.CONDITIONAL_AND);
    StaticJavaASTBuilder.binopMap.put("==", InfixExpression.Operator.EQUALS);
    StaticJavaASTBuilder.binopMap
    .put("!=", InfixExpression.Operator.NOT_EQUALS);
    StaticJavaASTBuilder.binopMap.put("==", InfixExpression.Operator.EQUALS);
    StaticJavaASTBuilder.binopMap.put("<", InfixExpression.Operator.LESS);
    StaticJavaASTBuilder.binopMap.put(">", InfixExpression.Operator.GREATER);
    StaticJavaASTBuilder.binopMap.put(
        "<=",
        InfixExpression.Operator.LESS_EQUALS);
    StaticJavaASTBuilder.binopMap.put(
        ">=",
        InfixExpression.Operator.GREATER_EQUALS);
    StaticJavaASTBuilder.binopMap.put("+", InfixExpression.Operator.PLUS);
    StaticJavaASTBuilder.binopMap.put("-", InfixExpression.Operator.MINUS);
    StaticJavaASTBuilder.binopMap.put("*", InfixExpression.Operator.TIMES);
    StaticJavaASTBuilder.binopMap.put("/", InfixExpression.Operator.DIVIDE);
    StaticJavaASTBuilder.binopMap.put("%", InfixExpression.Operator.REMAINDER);

    unopMap = new HashMap<>(4);
    StaticJavaASTBuilder.unopMap.put("+", PrefixExpression.Operator.PLUS);
    StaticJavaASTBuilder.unopMap.put("-", PrefixExpression.Operator.MINUS);
    StaticJavaASTBuilder.unopMap.put("!", PrefixExpression.Operator.NOT);
  }

  protected AST ast = AST.newAST(AST.JLS14, false);

  private StaticJavaASTBuilder() {
  }

  @SuppressWarnings("unchecked")
  private void add(@SuppressWarnings("rawtypes") final List l, final Object o) {
    l.add(o);
  }

  @SuppressWarnings("unchecked")
  private <T extends ASTNode> T build(final ParserRuleContext tree) {
    return (T) visit(tree);
  }

  private <E extends ParserRuleContext> void builds(
      @SuppressWarnings("rawtypes") final List l, final List<E> trees) {
    if (trees != null) {
      for (final E e : trees) {
        add(l, build(e));
      }
    }
  }

  @Override
  public ExpressionStatement visitAssignStatement(
      final AssignStatementContext ctx) {
    final Assignment a = this.ast.newAssignment();
    final ExpressionStatement result = this.ast.newExpressionStatement(a);

    a.setLeftHandSide(this.ast.newSimpleName(ctx.ID().getText()));

    a.setRightHandSide(this.build(ctx.exp()));

    return result;
  }

  @Override
  public InfixExpression visitBinaryExp(final BinaryExpContext ctx) {
    final InfixExpression result = this.ast.newInfixExpression();

    result.setLeftOperand(this.build(ctx.e1));

    result.setOperator(StaticJavaASTBuilder.binopMap.get(ctx.op.getText()));

    result.setRightOperand(this.build(ctx.e2));

    return result;
  }

  @Override
  public PrimitiveType visitBooleanType(final BooleanTypeContext ctx) {
    return this.ast.newPrimitiveType(PrimitiveType.BOOLEAN);
  }

  @Override
  public TypeDeclaration visitClassDefinition(final ClassDefinitionContext ctx) {
    final TypeDeclaration result = this.ast.newTypeDeclaration();
    add(
        result.modifiers(),
        this.ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));

    result.setName(this.ast.newSimpleName(ctx.ID().getText()));

    add(
        result.bodyDeclarations(),
        this.<MethodDeclaration> build(ctx.mainMethodDeclaration()));

    final List<MemberDeclarationContext> memberDeclarations = ctx
        .memberDeclaration();
    if (memberDeclarations != null) {
      builds(result.bodyDeclarations(), memberDeclarations);
    }

    return result;
  }

  @Override
  public CompilationUnit visitCompilationUnit(final CompilationUnitContext ctx) {
    final CompilationUnit result = this.ast.newCompilationUnit();

    add(result.types(), this.<TypeDeclaration> build(ctx.classDefinition()));

    return result;
  }

  @Override
  public BooleanLiteral visitFalseLiteral(final FalseLiteralContext ctx) {
    return this.ast.newBooleanLiteral(false);
  }

  @Override
  public FieldDeclaration visitFieldDeclaration(
      final FieldDeclarationContext ctx) {
    final VariableDeclarationFragment vdf = this.ast
        .newVariableDeclarationFragment();
    final FieldDeclaration result = this.ast.newFieldDeclaration(vdf);
    add(
        result.modifiers(),
        this.ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));

    result.setType(this.build(ctx.type()));

    vdf.setName(this.ast.newSimpleName(ctx.ID().getText()));

    return result;
  }

  @Override
  public SimpleName visitIdExp(final IdExpContext ctx) {
    return this.ast.newSimpleName(ctx.ID().getText());
  }

  @Override
  public IfStatement visitIfStatement(final IfStatementContext ctx) {
    final IfStatement result = this.ast.newIfStatement();
    final Block thenBlock = this.ast.newBlock();
    result.setThenStatement(thenBlock);
    final Block elseBlock = this.ast.newBlock();
    result.setElseStatement(elseBlock);

    result.setExpression(this.build(ctx.exp()));

    final List<StatementContext> ts = ctx.ts;
    if (ts != null) {
      builds(thenBlock.statements(), ts);
    }

    final List<StatementContext> fs = ctx.fs;
    if (fs != null) {
      builds(elseBlock.statements(), fs);
    }

    return result;
  }

  @Override
  public NumberLiteral visitIntLiteral(final IntLiteralContext ctx) {
    final NumberLiteral result = this.ast.newNumberLiteral();
    result.setToken(ctx.getText());
    return result;
  }

  @Override
  public PrimitiveType visitIntType(final IntTypeContext ctx) {
    return this.ast.newPrimitiveType(PrimitiveType.INT);
  }

  @Override
  public MethodInvocation visitInvoke(final InvokeContext ctx) {
    final MethodInvocation result = this.ast.newMethodInvocation();

    if (ctx.id1 != null) {
      result.setExpression(this.ast.newSimpleName(ctx.id1.getText()));
    }

    result.setName(this.ast.newSimpleName(ctx.id2.getText()));

    final ArgsContext args = ctx.args();
    if (args != null) {
      builds(result.arguments(), args.exp());
    }

    return result;
  }

  @Override
  public MethodInvocation visitInvokeExp(final InvokeExpContext ctx) {
    return this.build(ctx.invoke());
  }

  @Override
  public ExpressionStatement visitInvokeExpStatement(
      final InvokeExpStatementContext ctx) {
    return this.ast.newExpressionStatement(this.<MethodInvocation> build(ctx
        .invoke()));
  }

  @Override
  public VariableDeclarationStatement visitLocalDeclaration(
      final LocalDeclarationContext ctx) {
    final VariableDeclarationFragment vdf = this.ast
        .newVariableDeclarationFragment();
    final VariableDeclarationStatement result = this.ast
        .newVariableDeclarationStatement(vdf);

    result.setType(this.build(ctx.type()));

    vdf.setName(this.ast.newSimpleName(ctx.ID().getText()));

    return result;
  }

  @Override
  public MethodDeclaration visitMainMethodDeclaration(
      final MainMethodDeclarationContext ctx) {
    final MethodDeclaration result = this.ast.newMethodDeclaration();
    add(
        result.modifiers(),
        this.ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
    add(
        result.modifiers(),
        this.ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
    result.setReturnType2(this.ast.newPrimitiveType(PrimitiveType.VOID));
    result.setName(this.ast.newSimpleName("main"));

    final SingleVariableDeclaration svd = this.ast
        .newSingleVariableDeclaration();
    svd.setType(this.ast.newArrayType(this.ast.newSimpleType(this.ast
        .newSimpleName("String"))));
    svd.setName(this.ast.newSimpleName(ctx.id3.getText()));
    add(result.parameters(), svd);

    result.setBody(this.build(ctx.methodBody()));

    return result;
  }

  @Override
  public Block visitMethodBody(final MethodBodyContext ctx) {
    final Block result = this.ast.newBlock();

    final List<LocalDeclarationContext> localDeclarations = ctx
        .localDeclaration();
    if (localDeclarations != null) {
      builds(result.statements(), localDeclarations);
    }

    final List<StatementContext> statements = ctx.statement();
    if (statements != null) {
      builds(result.statements(), statements);
    }

    return result;
  }

  @Override
  public MethodDeclaration visitMethodDeclaration(
      final MethodDeclarationContext ctx) {
    final MethodDeclaration result = this.ast.newMethodDeclaration();
    add(
        result.modifiers(),
        this.ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));

    result.setReturnType2(this.build(ctx.returnType()));

    result.setName(this.ast.newSimpleName(ctx.ID().getText()));

    final ParamsContext params = ctx.params();
    if (params != null) {
      builds(result.parameters(), params.param());
    }

    result.setBody(this.build(ctx.methodBody()));

    return result;
  }

  @Override
  public Type visitNonVoidReturnType(final NonVoidReturnTypeContext ctx) {
    return this.build(ctx.type());
  }

  @Override
  public NullLiteral visitNullLiteral(final NullLiteralContext ctx) {
    return this.ast.newNullLiteral();
  }

  @Override
  public SingleVariableDeclaration visitParam(final ParamContext ctx) {
    final SingleVariableDeclaration result = this.ast
        .newSingleVariableDeclaration();

    result.setType(this.build(ctx.type()));

    result.setName(this.ast.newSimpleName(ctx.ID().getText()));

    return result;
  }

  @Override
  public ParenthesizedExpression visitParenExp(final ParenExpContext ctx) {
    final ParenthesizedExpression result = this.ast
        .newParenthesizedExpression();

    result.setExpression(this.build(ctx.exp()));

    return result;
  }

  @Override
  public ReturnStatement visitReturnStatement(final ReturnStatementContext ctx) {
    final ReturnStatement result = this.ast.newReturnStatement();

    final ExpContext exp = ctx.exp();
    if (exp != null) {
      result.setExpression(this.build(exp));
    }

    return result;
  }

  @Override
  public BooleanLiteral visitTrueLiteral(final TrueLiteralContext ctx) {
    return this.ast.newBooleanLiteral(true);
  }

  @Override
  public PrefixExpression visitUnaryExp(final UnaryExpContext ctx) {
    final PrefixExpression result = this.ast.newPrefixExpression();

    result.setOperator(StaticJavaASTBuilder.unopMap.get(ctx.op.getText()));

    result.setOperand(this.build(ctx.exp()));

    return result;
  }

  @Override
  public PrimitiveType visitVoidType(final VoidTypeContext ctx) {
    return this.ast.newPrimitiveType(PrimitiveType.VOID);
  }

  @Override
  public WhileStatement visitWhileStatement(final WhileStatementContext ctx) {
    final WhileStatement result = this.ast.newWhileStatement();
    final Block whileBody = this.ast.newBlock();
    result.setBody(whileBody);

    result.setExpression(this.build(ctx.exp()));

    final List<StatementContext> statements = ctx.statement();
    if (statements != null) {
      builds(whileBody.statements(), statements);
    }

    return result;
  }
}
