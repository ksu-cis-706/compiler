package sjc.util;

/**
 * Type-parametric 3-tuple class.
 * 
 * @author <a href="mailto:matt@cis.ksu.edu">Matt Hoosier</a>
 */

public class Triple<E1, E2, E3> {
  public final E1 first;

  public final E2 second;

  public final E3 third;

  public Triple(final E1 first, final E2 second, final E3 third) {
    this.first = first;
    this.second = second;
    this.third = third;
  }

  @Override
  public boolean equals(final Object o) {
    if (o instanceof Triple) {
      @SuppressWarnings("rawtypes")
      final Triple other = (Triple) o;
      return this.first.equals(other.first) && this.second.equals(other.second)
          && this.third.equals(other.third);
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
