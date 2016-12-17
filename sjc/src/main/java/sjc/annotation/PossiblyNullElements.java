package sjc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation that indicates both {@link PossiblyNull} and
 * {@link PossiblyNullElementsOnly}.
 */
@Retention(RetentionPolicy.CLASS)
@Target( { ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER })
public @interface PossiblyNullElements {
}
