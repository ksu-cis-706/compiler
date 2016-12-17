package sjc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation that indicates both {@link ReadOnly} and
 * {@link ReadOnlyElementsOnly}.
 */
@Retention(RetentionPolicy.CLASS)
@Target( { ElementType.FIELD })
public @interface ReadOnlyElements {
}
