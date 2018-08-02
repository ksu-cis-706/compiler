// Generated from /Users/robby/Repositories/706/compiler/examples/src/main/java/antlrv4/example1/Exp.g4 by ANTLR 4.7
package antlrv4.example1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpParser}.
 */
public interface ExpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ExpParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ExpParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link ExpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParenExp(ExpParser.ParenExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link ExpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParenExp(ExpParser.ParenExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link ExpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(ExpParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link ExpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(ExpParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link ExpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExp(ExpParser.BinaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link ExpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExp(ExpParser.BinaryExpContext ctx);
}