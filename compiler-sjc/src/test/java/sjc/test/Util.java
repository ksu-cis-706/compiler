package sjc.test;

import java.io.File;
import java.net.URI;

import sjc.SJC;

/**
 * Provides utility methods.
 * 
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class Util {
  public static String getResource(final Class<?> c, final String filename)
      throws Exception {
    return getResource(c, "..", filename);
  }

  public static String getResource(final Class<?> c, final String relpath,
      final String filename) throws Exception {
    return new File(new URI(SJC.class.getResource(relpath).toURI()
        .toASCIIString().replace("/bin", "/src/test/resources/" + filename)))
        .getAbsolutePath();
  }
}
