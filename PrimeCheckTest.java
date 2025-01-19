import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    assertEquals("Test 7", true, PrimeCheck.isPrime(5));
    assertEquals("Test 11", true, PrimeCheck.isPrime(11));
    assertEquals("Test 10007", true, PrimeCheck.isPrime(10007));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    assertEquals("Test 4", false, PrimeCheck.isPrime(4));
    assertEquals("Test 12", false, PrimeCheck.isPrime(12));
    assertEquals("Test 10006", false, PrimeCheck.isPrime(10006));
  }
}
