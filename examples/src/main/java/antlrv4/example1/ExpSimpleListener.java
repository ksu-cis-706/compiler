// Generated from /Users/robby/Repositories/706/compiler/examples/src/main/java/antlrv4/example1/ExpSimple.g4 by ANTLR 4.7
package antlrv4.example1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpSimpleParser}.
 */
public interface ExpSimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpSimpleParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ExpSimpleParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpSimpleParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ExpSimpleParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpSimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(ExpSimpleParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpSimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(ExpSimpleParser.ExpContext ctx);
}