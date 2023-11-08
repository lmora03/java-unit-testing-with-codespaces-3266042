import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class CalculatorTest {
  // MAKING THIS A CLASS VARIABLES ALLOWS FOR REUSE
  Calculator cal = new Calculator();

  @Test
  public void testSum() {
    int expected = 3;
    int actual = cal.sum(1, 2);
    assertEquals(expected, actual);
  }
}