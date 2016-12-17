public class ParseError {
  public static void main(String[] args) {
    StaticJavaLib.println(ParseError.power(StaticJavaLib
        .getIntArgument(args, 0), StaticJavaLib.getIntArgument(args, 1)));
  }

  static int power(int m, int n)
    {
        int result;
        int i;

        StaticJavaLib.assertTrue(n >= 1);
        result = 1;
        i = 0;
        while (i < n)
        {
            result = result * ;
            i = i + 1;
        }

        return result;
    }
}
