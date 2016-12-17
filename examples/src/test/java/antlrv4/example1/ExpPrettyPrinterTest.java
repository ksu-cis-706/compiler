package antlrv4.example1;

import org.junit.Assert;
import org.junit.Test;

public class ExpPrettyPrinterTest {
  @Test
  public void onePlusFive() throws Exception {
    Assert.assertEquals("1 + 5", ExpPrettyPrinter.print("1+5"));
  }

  @Test
  public void onePlusFiveTimesThree() throws Exception {
    Assert.assertEquals("1 + 5 * 3", ExpPrettyPrinter.print("1  +  5 * 3"));
  }

  @Test
  public void onePlusParenFiveTimesThree() throws Exception {
    Assert.assertEquals("1 + (5 * 3)", ExpPrettyPrinter.print("1  +( 5 *3 )"));
  }

  @Test
  public void parenOnePlusFiveTimesThree() throws Exception {
    Assert.assertEquals("(1 + 5) * 3", ExpPrettyPrinter.print("( 1+5 ) *   3"));
  }
}
