// Generated from /Users/robby/Repositories/706/compiler/examples/src/main/java/antlrv4/example2/Exp2.g4 by ANTLR 4.7
package antlrv4.example2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Exp2Parser}.
 */
public interface Exp2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Exp2Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Exp2Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Exp2Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Exp2Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExp}
	 * labeled alternative in {@link Exp2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIdExp(Exp2Parser.IdExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExp}
	 * labeled alternative in {@link Exp2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIdExp(Exp2Parser.IdExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link Exp2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParenExp(Exp2Parser.ParenExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link Exp2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParenExp(Exp2Parser.ParenExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link Exp2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(Exp2Parser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link Exp2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(Exp2Parser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link Exp2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExp(Exp2Parser.BinaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link Exp2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExp(Exp2Parser.BinaryExpContext ctx);
}