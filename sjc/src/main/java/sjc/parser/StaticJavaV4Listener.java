// Generated from /Users/robby/Repositories/706/compiler/sjc/src/main/java/sjc/parser/StaticJavaV4.g4 by ANTLR 4.7
package sjc.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StaticJavaV4Parser}.
 */
public interface StaticJavaV4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StaticJavaV4Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(StaticJavaV4Parser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticJavaV4Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(StaticJavaV4Parser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaticJavaV4Parser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(StaticJavaV4Parser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticJavaV4Parser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(StaticJavaV4Parser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaticJavaV4Parser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(StaticJavaV4Parser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticJavaV4Parser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(StaticJavaV4Parser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaticJavaV4Parser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainMethodDeclaration(StaticJavaV4Parser.MainMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticJavaV4Parser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainMethodDeclaration(StaticJavaV4Parser.MainMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaticJavaV4Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(StaticJavaV4Parser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticJavaV4Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(StaticJavaV4Parser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaticJavaV4Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(StaticJavaV4Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticJavaV4Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(StaticJavaV4Parser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link StaticJavaV4Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(StaticJavaV4Parser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link StaticJavaV4Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(StaticJavaV4Parser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link StaticJavaV4Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(StaticJavaV4Parser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link StaticJavaV4Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(StaticJavaV4Parser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link StaticJavaV4Parser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(StaticJavaV4Parser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link StaticJavaV4Parser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(StaticJavaV4Parser.VoidTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NonVoidReturnType}
	 * labeled alternative in {@link StaticJavaV4Parser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterNonVoidReturnType(StaticJavaV4Parser.NonVoidReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NonVoidReturnType}
	 * labeled alternative in {@link StaticJavaV4Parser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitNonVoidReturnType(StaticJavaV4Parser.NonVoidReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaticJavaV4Parser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(StaticJavaV4Parser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticJavaV4Parser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(StaticJavaV4Parser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaticJavaV4Parser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(StaticJavaV4Parser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticJavaV4Parser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(StaticJavaV4Parser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaticJavaV4Parser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(StaticJavaV4Parser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticJavaV4Parser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(StaticJavaV4Parser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaticJavaV4Parser#localDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalDeclaration(StaticJavaV4Parser.LocalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticJavaV4Parser#localDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalDeclaration(StaticJavaV4Parser.LocalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaticJavaV4Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(StaticJavaV4Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticJavaV4Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(StaticJavaV4Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaticJavaV4Parser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(StaticJavaV4Parser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticJavaV4Parser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(StaticJavaV4Parser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaticJavaV4Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(StaticJavaV4Parser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticJavaV4Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(StaticJavaV4Parser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaticJavaV4Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(StaticJavaV4Parser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticJavaV4Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(StaticJavaV4Parser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaticJavaV4Parser#invokeExpStatement}.
	 * @param ctx the parse tree
	 */
	void enterInvokeExpStatement(StaticJavaV4Parser.InvokeExpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticJavaV4Parser#invokeExpStatement}.
	 * @param ctx the parse tree
	 */
	void exitInvokeExpStatement(StaticJavaV4Parser.InvokeExpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaticJavaV4Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(StaticJavaV4Parser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticJavaV4Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(StaticJavaV4Parser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExp}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIdExp(StaticJavaV4Parser.IdExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExp}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIdExp(StaticJavaV4Parser.IdExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTrueLiteral(StaticJavaV4Parser.TrueLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTrueLiteral(StaticJavaV4Parser.TrueLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InvokeExp}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInvokeExp(StaticJavaV4Parser.InvokeExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InvokeExp}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInvokeExp(StaticJavaV4Parser.InvokeExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParenExp(StaticJavaV4Parser.ParenExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParenExp(StaticJavaV4Parser.ParenExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(StaticJavaV4Parser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(StaticJavaV4Parser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(StaticJavaV4Parser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(StaticJavaV4Parser.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(StaticJavaV4Parser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(StaticJavaV4Parser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExp(StaticJavaV4Parser.BinaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExp(StaticJavaV4Parser.BinaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFalseLiteral(StaticJavaV4Parser.FalseLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFalseLiteral(StaticJavaV4Parser.FalseLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaticJavaV4Parser#invoke}.
	 * @param ctx the parse tree
	 */
	void enterInvoke(StaticJavaV4Parser.InvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticJavaV4Parser#invoke}.
	 * @param ctx the parse tree
	 */
	void exitInvoke(StaticJavaV4Parser.InvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaticJavaV4Parser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(StaticJavaV4Parser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticJavaV4Parser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(StaticJavaV4Parser.ArgsContext ctx);
}