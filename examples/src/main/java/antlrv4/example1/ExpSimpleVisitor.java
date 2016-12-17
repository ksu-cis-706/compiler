// Generated from /Users/robby/Repositories/ksu-cis-706/compiler/examples/src/main/java/antlrv4/example1/ExpSimple.g4 by ANTLR 4.5.3
package antlrv4.example1;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpSimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpSimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpSimpleParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ExpSimpleParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpSimpleParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(ExpSimpleParser.ExpContext ctx);
}