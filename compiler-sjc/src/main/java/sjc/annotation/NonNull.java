package sjc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation that indicates that a return value of a method, a field (once
 * initialized), or a method parameter is always non-null.
 */
@Retention(RetentionPolicy.CLASS)
@Target( { ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER })
public @interface NonNull {
}
