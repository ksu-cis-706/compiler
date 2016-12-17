package antlrv4.example1;

import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

public class ExpLiteralCollectorTest {
  @Test
  public void onePlusFive() throws Exception {
    Assert.assertArrayEquals(new BigInteger[] { new BigInteger("1"),
        new BigInteger("5") }, ExpLiteralCollector.collect("1 + 5").toArray());
  }

  @Test
  public void onePlusFiveTimesThree() throws Exception {
    Assert.assertArrayEquals(new BigInteger[] { new BigInteger("1"),
        new BigInteger("5"), new BigInteger("3") }, ExpLiteralCollector
        .collect("1 + 5 * 3").toArray());
  }

  @Test
  public void onePlusParenFiveTimesThree() throws Exception {
    Assert.assertArrayEquals(new BigInteger[] { new BigInteger("1"),
        new BigInteger("5"), new BigInteger("3") }, ExpLiteralCollector
        .collect("1 + (5 * 3)").toArray());
  }

  @Test
  public void parenOnePlusFiveTimesThree() throws Exception {
    Assert.assertArrayEquals(new BigInteger[] { new BigInteger("1"),
        new BigInteger("5"), new BigInteger("3") }, ExpLiteralCollector
        .collect("(1 + 5) * 3").toArray());
  }
}
