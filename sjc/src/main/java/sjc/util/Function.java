package sjc.util;

import sjc.annotation.PossiblyNull;

/**
 * This interface represents a function that when given an input of type I, its
 * apply method returns an object of type O.
 * 
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public interface Function<I, O> {
  /**
   * Apply this function to a given input to produce an output.
   * 
   * @param i
   *          The input.
   * @return The output.
   */
  @PossiblyNull
  O apply(@PossiblyNull I i);
}
