package antlrv4.example1;

import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

public class ExpEvaluatorTest {
  @Test
  public void onePlusFive() throws Exception {
    Assert.assertEquals(new BigInteger("6"), ExpEvaluator.eval("1 + 5"));
  }
  
  @Test
  public void onePlusFiveTimesThree() throws Exception {
    Assert.assertEquals(new BigInteger("16"), ExpEvaluator.eval("1 + 5 * 3"));
  }

  @Test
  public void onePlusParenFiveTimesThree() throws Exception {
    Assert.assertEquals(new BigInteger("16"), ExpEvaluator.eval("1 + (5 * 3)"));
  }

  @Test
  public void parenOnePlusFiveTimesThree() throws Exception {
    Assert.assertEquals(new BigInteger("18"), ExpEvaluator.eval("(1 + 5) * 3"));
  }
}
