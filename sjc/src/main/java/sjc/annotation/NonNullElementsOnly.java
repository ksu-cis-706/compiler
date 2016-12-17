package sjc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation that indicates that the elements of an array, a collection, or
 * a map of a return value of a method, a field (once initialized), or a method
 * parameter are always non-null.
 */
@Retention(RetentionPolicy.CLASS)
@Target( { ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER })
public @interface NonNullElementsOnly {
}
