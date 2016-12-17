package sjc.analysis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.core.dom.WhileStatement;

import sjc.annotation.NonNull;
import sjc.annotation.NonNullElements;
import sjc.util.Util;

/**
 * This class is used to represent a Control Flow Graph (CFG) of a
 * {@link MethodDeclaration}.
 * 
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class CFG {
  protected class Visitor extends ASTVisitor {
    Set<Statement> B = new HashSet<>();

    // we model E as a function that maps statement to set of
    // statements instead of as relations
    Map<Statement, Set<Statement>> E = new HashMap<>();

    Statement b_init;

    Statement b_last;

    Map<Statement, Set<Statement>> succs = new HashMap<>();

    Map<Statement, Set<Statement>> preds = new HashMap<>();

    protected void addEdge(final Statement s1, final Statement s2) {
      if ((s1 instanceof ReturnStatement) && (s2 != this.b_last)) {
        return;
      }
      this.B.add(s1);
      this.B.add(s2);
      getStatements(this.E, s1).add(s2);
    }

    protected void computeSuccsPreds(final Set<Statement> set, final Statement s) {
      if (set.contains(s)) {
        return;
      }
      set.add(s);
      for (final Statement succS : getStatements(this.E, s)) {
        getStatements(this.succs, s).add(succS);
        getStatements(this.preds, succS).add(s);
        computeSuccsPreds(set, succS);
      }
    }

    @Override
    public void endVisit(final MethodDeclaration node) {
      final Set<Statement> reachableSet = new HashSet<>();
      computeSuccsPreds(reachableSet, this.b_init);
    }

    protected Statement first(@SuppressWarnings("rawtypes") final List l) {
      assert !l.isEmpty();
      return (Statement) l.get(0);
    }

    protected Set<Statement> getStatements(
        final Map<Statement, Set<Statement>> m, final Statement s) {
      Set<Statement> set = m.computeIfAbsent(s, k -> new HashSet<>());
      return set;
    }

    protected Statement last(@SuppressWarnings("rawtypes") final List l) {
      assert !l.isEmpty();
      return (Statement) l.get(l.size() - 1);
    }

    @Override
    public boolean visit(final Block node) {
      @SuppressWarnings("rawtypes")
      final List l = node.statements();
      final int size = l.size();
      for (int i = 0; i < size - 1; i++) {
        final Statement s = (Statement) l.get(i);
        if (s instanceof VariableDeclarationStatement) {
          continue;
        }
        // temporarily add edge for if-statement
        // addEdge doesn't really add if s is a return statement
        //   and its successor is not equal to last
        addEdge(s, (Statement) l.get(i + 1));
      }
      return true;
    }

    @Override
    public boolean visit(final IfStatement node) {
      final Set<Statement> set = getStatements(this.E, node);
      assert set.size() == 1;
      final Statement next = set.iterator().next();
      this.E.remove(node); // remove temporary edge for if-statement
      @SuppressWarnings("rawtypes")
      final List thenList = ((Block) node.getThenStatement()).statements();
      if (thenList.isEmpty()) {
        addEdge(node, next);
      } else {
        addEdge(node, first(thenList));
        addEdge(last(thenList), next);
      }
      @SuppressWarnings("rawtypes")
      final List elseList = ((Block) node.getElseStatement()).statements();
      if (elseList.isEmpty()) {
        addEdge(node, next);
      } else {
        addEdge(node, first(elseList));
        addEdge(last(elseList), next);
      }
      return true;
    }

    @Override
    public boolean visit(final MethodDeclaration node) {
      @SuppressWarnings("rawtypes")
      final List l = node.getBody().statements();
      this.b_last = node.getBody(); // use method's body as virtual last
      if (l.size() == 0) {
        this.b_init = this.b_last;
        return false; // empty body
      }
      int i = 0; // we need to find the first actual SJ statement
      while ((i != l.size())
          && (l.get(i) instanceof VariableDeclarationStatement)) {
        i++;
      }
      if (l.size() == i) {
        this.b_init = this.b_last;
        return false; // no SJ statements in body
      } else {
        this.b_init = (Statement) l.get(i); // first SJ statement
        // add edge from last statement in method body to virtual b_last
        addEdge(last(l), this.b_last);
      }
      return true;
    }

    @Override
    public boolean visit(final ReturnStatement node) {
      addEdge(node, this.b_last);
      return false;
    }

    @Override
    public boolean visit(final WhileStatement node) {
      @SuppressWarnings("rawtypes")
      final List l = ((Block) node.getBody()).statements();
      if (l.isEmpty()) {
        addEdge(node, node);
      } else {
        addEdge(node, first(l));
        addEdge(last(l), node);
      }
      return true;
    }
  }

  /**
   * Holds the {@link MethodDeclaration} of this CFG.
   */
  public final MethodDeclaration md;

  /**
   * Holds the mappings of {@link Statement}s to their predecessors.
   */
  public final @NonNullElements
  Map<Statement, Set<Statement>> preds;

  /**
   * Holds the mappings of {@link Statement}s to their successors.
   */
  public final @NonNullElements
  Map<Statement, Set<Statement>> succs;

  /**
   * Holds the start {@link Statement} of the CFG. If the method body is empty
   * then, the start {@link Statement} is equal to the end {@link Statement}.
   */
  public final @NonNull
  Statement start;

  /**
   * Holds the end {@link Statement} of the CFG. The end {@link Statement} is
   * always the method block body.
   */
  public final @NonNull
  Statement end;

  /**
   * Constructs a CFG for a {@link MethodDeclaration}.
   * 
   * @param md
   *          The {@link MethodDeclaration}.
   */
  public CFG(@NonNull final MethodDeclaration md) {
    assert md != null;
    this.md = md;
    final Visitor v = new Visitor();
    md.accept(v);
    this.start = v.b_init;
    this.end = v.b_last;
    this.succs = v.succs;
    this.preds = v.preds;
  }

  /**
   * Returns the {@link String} representation of a {@link Statement} in this
   * CFG. If the {@link Statement} is equal to the end {@link Statement}, then
   * the {@link String} literal "END" is returned.
   * 
   * @param s
   *          The {@link Statement}.
   * @return The {@link String} representation of a {@link Statement} in this
   *         CFG.
   */
  public String getStatementString(final Statement s) {
    assert s != null;
    return s == this.end ? "END" : Util.getFirstLine(s);
  }

  /**
   * Returns the {@link String} representation of this CFG.
   * 
   * @return The {@link String} representation of this CFG.
   */
  @Override
  public @NonNull
  String toString() {
    final StringBuilder sb = new StringBuilder("*** CFG for "
        + Util.getFirstLine(this.md) + " ***\n");
    sb.append("start=");
    sb.append(getStatementString(this.start));
    sb.append("\n*** Predecessor Map ***\n");
    sb.append(toString(this.preds));
    sb.append("\n*** Successor Map ***\n");
    sb.append(toString(this.succs));
    return sb.toString();
  }

  protected String toString(final Map<Statement, Set<Statement>> m) {
    final TreeSet<String> set = new TreeSet<>();
    final StringBuilder sb = new StringBuilder();
    for (final Statement s : m.keySet()) {
      sb.append(getStatementString(s));
      sb.append(" ==> ");
      final TreeSet<String> ts = new TreeSet<>();
      for (final Statement s2 : m.get(s)) {
        ts.add(getStatementString(s2));
      }
      for (final String str : ts) {
        sb.append(str);
        sb.append("  #  ");
      }
      final String str = sb.toString();
      sb.setLength(0);
      set.add(str.substring(0, str.length() - 5) + "\n");
    }
    for (final String s : set) {
      sb.append(s);
    }
    return sb.toString();
  }
}
