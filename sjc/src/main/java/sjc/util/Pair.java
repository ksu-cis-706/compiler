package sjc.util;

/**
 * Type-parametric 2-tuple class.
 * 
 * @author <a href="mailto:matt@cis.ksu.edu">Matt Hoosier</a>
 */

public class Pair<E1, E2> {
  public final E1 first;

  public final E2 second;

  public Pair(final E1 first, final E2 second) {
    this.first = first;
    this.second = second;
  }

  @Override
  public boolean equals(final Object o) {
    if (o instanceof Pair) {
      @SuppressWarnings("rawtypes")
      final Pair other = (Pair) o;
      return this.first.equals(other.first) && this.second.equals(other.second);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return this.first.hashCode() + this.second.hashCode();
  }

  @Override
  public String toString() {
    return "<" + this.first + ", " + this.second + ">";
  }
}
