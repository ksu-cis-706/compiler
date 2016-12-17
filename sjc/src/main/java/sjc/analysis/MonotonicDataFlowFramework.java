package sjc.analysis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.jdt.core.dom.Statement;

import sjc.annotation.NonNull;
import sjc.annotation.NonNullElements;
import sjc.util.Util;

/**
 * This classs represents the Monotonic Data-Flow Framework (MDF) for
 * StaticJava.
 * 
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 * @param <E>
 *          The element type of the MDF lattice.
 */
public abstract class MonotonicDataFlowFramework<E> {
  protected @NonNull
  CFG cfg;

  protected @NonNullElements
  Map<Statement, Set<E>> outMap = new HashMap<>();

  protected @NonNullElements
  Set<E> init;

  protected @NonNullElements
  Set<E> bottom;

  protected boolean isForward;

  protected boolean isLUB;

  protected boolean isDone;

  /**
   * Instantiate MDF.
   * 
   * @param cfg
   *          The CFG for this MDF to work on.
   * @param isForward
   *          The flow direction.
   * @param isLUB
   *          Indicates whether the MDF is using least upper bound (LUB) or
   *          greatest lower bound (GLB).
   */
  public MonotonicDataFlowFramework(@NonNull final CFG cfg,
      final boolean isForward, final boolean isLUB) {
    assert cfg != null;
    this.cfg = cfg;
    this.isForward = isForward;
    this.isLUB = isLUB;
  }

  protected boolean compute(final Statement s) {
    final Set<E> inSet = getInSet(s);
    inSet.removeAll(kill(inSet, s));
    inSet.addAll(gen(inSet, s));
    final Set<E> outSet = getOutSet(s);
    if ((outSet.size() != inSet.size()) || !outSet.containsAll(inSet)
        || !inSet.containsAll(outSet)) {
      outSet.clear();
      outSet.addAll(inSet);
      inSet.clear();
      return true;
    }
    inSet.clear();
    return false;
  }

  /**
   * Computes the fix point solution.
   */
  public abstract void computeFixPoint();

  protected void computeFixPoint(@NonNullElements final Set<E> init) {
    computeFixPoint(init, new HashSet<>());
  }

  protected void computeFixPoint(@NonNullElements final Set<E> init,
      @NonNullElements final Set<E> bottom) {
    this.bottom = bottom;
    if (this.isDone) {
      return;
    }
    this.isDone = true;
    this.init = init;
    final Set<Statement> seen = new HashSet<>();
    while (iterate(seen, this.isForward ? this.cfg.start : this.cfg.end)) {
      seen.clear();
    }
  }

  protected abstract Set<E> gen(Set<E> set, Statement s);

  /**
   * Returns the name of this analysis.
   * 
   * @return The name of this analysis.
   */
  public abstract @NonNull
  String getAnalysisName();

  /**
   * Returns the in-set of a {@link Statement}.
   * 
   * @param s
   *          The {@link Statement}.
   * @return The in-set of the given {@link Statement}.
   */
  public @NonNullElements
  Set<E> getInSet(@NonNull final Statement s) {
    assert s != null;
    Set<E> inSet;
    boolean first = true;
    if (this.isForward ? s == this.cfg.start : s == this.cfg.end) {
      inSet = new HashSet<>(this.init);
      first = false;
    } else {
      inSet = new HashSet<>();
    }
    final Set<Statement> set = this.isForward ? this.cfg.preds.get(s)
        : this.cfg.succs.get(s);
    if (set == null) {
      return inSet;
    }
    for (final Statement predS : set) {
      if (first) {
        inSet.addAll(getOutSet(predS));
        first = false;
      } else {
        if (this.isLUB) {
          inSet.addAll(getOutSet(predS));
        } else {
          inSet.retainAll(getOutSet(predS));
        }
      }
    }
    return inSet;
  }

  /**
   * Returns the out-set of a {@link Statement}.
   * 
   * @param s
   *          The {@link Statement}.
   * @return The out-set of the given {@link Statement}.
   */
  public @NonNullElements
  Set<E> getOutSet(@NonNull final Statement s) {
    assert s != null;

    Set<E> result = this.outMap.computeIfAbsent(s, k -> new HashSet<>(this.bottom));
    return result;
  }

  /**
   * Returns the {@link String} representation of the MDF result.
   * 
   * @return The {@link String} representation of the MDF result.
   */
  public @NonNull
  String getResultString() {
    final StringBuilder sb = new StringBuilder("*** " + getAnalysisName()
        + " for ");
    sb.append(Util.getFirstLine(this.cfg.md));
    sb.append(" ***\n*** InSet Map ***\n");
    sb.append(getResultString(true));
    sb.append("\n*** OutSet Map ***\n");
    sb.append(getResultString(false));
    return sb.toString();
  }

  protected String getResultString(final boolean isInSet) {
    final StringBuilder sb = new StringBuilder();
    final ArrayList<String> list = new ArrayList<>();
    for (final Statement s : this.outMap.keySet()) {
      sb.append(this.cfg.getStatementString(s));
      sb.append(" ==> ");
      final TreeSet<String> ts = new TreeSet<>();
      for (final E e : (isInSet ? getInSet(s) : getOutSet(s))) {
        ts.add(toString(e));
      }
      for (final String str : ts) {
        sb.append(str);
        sb.append("  #  ");
      }
      final String str = sb.toString();
      sb.setLength(0);
      list.add(str.substring(0, str.length() - 5) + "\n");
    }
    Collections.sort(list);
    for (final String s : list) {
      sb.append(s);
    }
    return sb.toString();
  }

  protected boolean iterate(final Set<Statement> seen, final Statement s) {
    if (seen.contains(s)) {
      return false;
    }
    boolean hasChanged = compute(s);
    seen.add(s);
    final Set<Statement> succs = this.isForward ? this.cfg.succs.get(s)
        : this.cfg.preds.get(s);
    if (succs != null) {
      for (final Statement succS : succs) {
        hasChanged = iterate(seen, succS) || hasChanged;
      }
    }
    return hasChanged;
  }

  protected abstract Set<E> kill(Set<E> set, Statement s);

  /**
   * Returns the {@link String} representation of the MDF lattice element.
   * 
   * @param e
   *          The MDF lattice element.
   * @return The {@link String} representation of the MDF lattice element.
   */
  public abstract @NonNull
  String toString(@NonNull E e);
}
