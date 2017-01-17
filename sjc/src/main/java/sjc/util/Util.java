package sjc.util;

import java.io.File;
import java.net.URI;
import java.util.Collection;
import java.util.Map;

import sjc.annotation.NonNull;
import sjc.annotation.PossiblyNull;

/**
 * This class contains some utility methods for the StaticJava compiler.
 *
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class Util {
    /**
     * Checks whether a {@link Collection} is non-null and all its elements are
     * also non-null.
     *
     * @param c The {@link Collection}.
     * @return True, if the {@link Collection} is non-null and all its elements
     * are also non-null.
     */
    public static boolean checkNonNullElements(
            @SuppressWarnings("rawtypes") @PossiblyNull final Collection c) {
        if (c == null) {
            return false;
        }
        for (final Object o : c) {
            if (o == null) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks whether a {@link Map} is non-null and all its keys and values are
     * also non-null.
     *
     * @param m The {@link Map}.
     * @return True, if the {@link Map} is non-null and all its keys and values
     * are also non-null.
     */
    public static boolean checkNonNullElements(
            @SuppressWarnings("rawtypes") @PossiblyNull final Map m) {
        if (m == null) {
            return false;
        }
        if (!Util.checkNonNullElements(m.keySet())) {
            return false;
        }
        return Util.checkNonNullElements(m.values());
    }

    /**
     * Checks whether an array is non-null and all its elements are also non-null.
     *
     * @param a The array.
     * @return True, if the array is non-null and all its elements are also
     * non-null.
     */
    public static boolean checkNonNullElements(@PossiblyNull final Object[] a) {
        if (a == null) {
            return false;
        }
        for (final Object o : a) {
            if (o == null) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns the first line of an object's {@link String} representation
     *
     * @param o The object.
     * @return The first line of the given object's {@link String} representation
     */
    public static
    @NonNull
    String getFirstLine(@NonNull final Object o) {
        assert o != null;
        final String nText = o.toString();
        final int index = nText.indexOf('\n');
        return index >= 0 ? nText.substring(0, index) : nText;
    }

    public static String getResource(final Class<?> c, final String filename)
            throws Exception {
        return getResource(c, "..", filename);
    }

    public static String getResource(final Class<?> c, final String relpath,
                                     final String filename) throws Exception {
        final File f = new File(new URI(c.getResource(relpath).toURI().toASCIIString()
                + "/" + filename));
        if (f.exists()) return f.getAbsolutePath();
        else {
            String pathSep = java.io.File.separator;
            return new File(new URI(c.getResource(relpath).toURI().toASCIIString()
                    + "/" + filename)).getAbsolutePath().replace(
                    pathSep + "target" + pathSep + "test-classes" + pathSep,
                    pathSep + "src" + pathSep + "test" + pathSep + "java" + pathSep);
        }
    }
}
