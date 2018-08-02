// Generated from /Users/robby/Repositories/706/compiler/examples/src/main/java/antlrv4/example1/ExpSimple.g4 by ANTLR 4.7
package antlrv4.example1;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link ExpSimpleVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class ExpSimpleBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements ExpSimpleVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStart(ExpSimpleParser.StartContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExp(ExpSimpleParser.ExpContext ctx) { return visitChildren(ctx); }
}