// Generated from /Users/robby/Repositories/ksu-cis-706/compiler/sjc/src/main/java/sjc/parser/StaticJavaV4.g4 by ANTLR 4.5.3
package sjc.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StaticJavaV4Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StaticJavaV4Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StaticJavaV4Parser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(StaticJavaV4Parser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaticJavaV4Parser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(StaticJavaV4Parser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaticJavaV4Parser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(StaticJavaV4Parser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaticJavaV4Parser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainMethodDeclaration(StaticJavaV4Parser.MainMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaticJavaV4Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(StaticJavaV4Parser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaticJavaV4Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(StaticJavaV4Parser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link StaticJavaV4Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(StaticJavaV4Parser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link StaticJavaV4Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(StaticJavaV4Parser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link StaticJavaV4Parser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(StaticJavaV4Parser.VoidTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NonVoidReturnType}
	 * labeled alternative in {@link StaticJavaV4Parser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonVoidReturnType(StaticJavaV4Parser.NonVoidReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaticJavaV4Parser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(StaticJavaV4Parser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaticJavaV4Parser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(StaticJavaV4Parser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaticJavaV4Parser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(StaticJavaV4Parser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaticJavaV4Parser#localDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDeclaration(StaticJavaV4Parser.LocalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaticJavaV4Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(StaticJavaV4Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaticJavaV4Parser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(StaticJavaV4Parser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaticJavaV4Parser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(StaticJavaV4Parser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaticJavaV4Parser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(StaticJavaV4Parser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaticJavaV4Parser#invokeExpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeExpStatement(StaticJavaV4Parser.InvokeExpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaticJavaV4Parser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(StaticJavaV4Parser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExp}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExp(StaticJavaV4Parser.IdExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLiteral(StaticJavaV4Parser.TrueLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InvokeExp}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeExp(StaticJavaV4Parser.InvokeExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExp(StaticJavaV4Parser.ParenExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(StaticJavaV4Parser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp(StaticJavaV4Parser.UnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(StaticJavaV4Parser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExp(StaticJavaV4Parser.BinaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link StaticJavaV4Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseLiteral(StaticJavaV4Parser.FalseLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaticJavaV4Parser#invoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvoke(StaticJavaV4Parser.InvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaticJavaV4Parser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(StaticJavaV4Parser.ArgsContext ctx);
}