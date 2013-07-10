package sjc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation that indicates that field (once initialized) is read-only
 * (write-access is disallowed).
 */
@Retention(RetentionPolicy.CLASS)
@Target( { ElementType.FIELD })
public @interface ReadOnly {
}
