import calculator.Calculator;
//import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double delta = 1e-15;
    Calculator cal = new Calculator();

    @Test
    public void squareRootPositive() {
        assertEquals("Testing True Positive for squareRoot", 5.0, cal.squareRoot(25.0), delta);
        assertEquals("Testing for True Negative for squareRoot", Double.NaN, cal.squareRoot(-25.0), delta);
    }

    @Test
    public void squareRootNegative() {
        assertNotEquals("Testing False Negative for squareRoot", 7.0, cal.squareRoot(-25.0), delta);
        assertNotEquals("Testing for False Positives for squareRoot", Double.NaN, cal.squareRoot(16.0), delta);
    }

    @Test
    public void factorialPositive() {
        assertEquals("Testing True Positive for factorial", 120.0, cal.factorial(5.0), delta);
        assertEquals("Testing for True Negative for factorial", Double.NaN, cal.factorial(-5.0), delta);

    }

    @Test
    public void factorialNegative() {
        assertNotEquals("Testing False Negative for factorial", 6.0, cal.factorial(-5.0), delta);
        assertNotEquals("Testing for False Positives for factorial", Double.NaN, cal.factorial(5.0), delta);
    }

    @Test
    public void logarithmPositive() {
        assertEquals("Testing True Positive for logarithm", 2.302585092994046, cal.logarithm(10.0), delta);
        assertEquals("Testing for True Negative for logarithm", Double.NaN, cal.logarithm(-10.0), delta);
    }

    @Test
    public void logarithmNegative() {
        assertNotEquals("Testing False Negative for logarithm", 5.0, cal.logarithm(-10.0), delta);
        assertNotEquals("Testing for False Positives for logarithm", Double.NaN, cal.logarithm(15.0), delta);
    }

    @Test
    public void powerPositive() {
        assertEquals("Testing True Positive for PowerFunction", 16.0, cal.power(2.0, 4.0), delta);
        assertEquals("Testing True Negative for PowerFunction", 0.125, cal.power(2.0, -3.0), delta);
    }

    @Test
    public void powerNegative() {
        assertNotEquals("Testing False Negative for PowerFunction", 8.0, cal.power(0.0, 0.0), delta);
        assertNotEquals("Testing False Positive for PowerFunction", 8.0, cal.power(2.0, -3.0), delta);
    }

}