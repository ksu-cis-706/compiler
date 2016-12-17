package sjc.util;

import sjc.annotation.PossiblyNull;

/**
 * This interface represents a function that process an input of type I.
 * 
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public interface VoidFunction<I> {
  /**
   * Apply this function to process a given input.
   * @param i The input.
   */
  void apply(@PossiblyNull I i);
}
