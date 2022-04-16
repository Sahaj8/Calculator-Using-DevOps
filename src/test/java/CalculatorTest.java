import calculator.Calculator;
//import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double delta = 1e-15;
    Calculator calc = new Calculator();

    @Test
    public void squareRootPositive() {
        assertEquals("Testing for True Positive for squareRoot", 5.0, calc.squareRoot(25.0), delta);
        assertEquals("Testing for True Negative for squareRoot", Double.NaN, calc.squareRoot(-25.0), delta);
    }

    @Test
    public void squareRootNegative() {
        assertNotEquals("Testing for False Negative for squareRoot", 7.0, calc.squareRoot(-25.0), delta);
        assertNotEquals("Testing for False Positives for squareRoot", Double.NaN, calc.squareRoot(16.0), delta);
    }

    @Test
    public void factorialPositive() {
        assertEquals("Testing for True Positive for factorial", 120.0, calc.factorial(5.0), delta);
        assertEquals("Testing for True Negative for factorial", Double.NaN, calc.factorial(-5.0), delta);

    }

    @Test
    public void factorialNegative() {
        assertNotEquals("Testing for False Negative for factorial", 6.0, calc.factorial(-5.0), delta);
        assertNotEquals("Testing for False Positives for factorial", Double.NaN, calc.factorial(5.0), delta);
    }

    @Test
    public void logarithmPositive() {
        assertEquals("Testing for True Positive for logarithm", 2.302585092994046, calc.logarithm(10.0), delta);
        assertEquals("Testing for True Negative for logarithm", Double.NaN, calc.logarithm(-10.0), delta);
    }

    @Test
    public void logarithmNegative() {
        assertNotEquals("Testing for False Negative for logarithm", 5.0, calc.logarithm(-10.0), delta);
        assertNotEquals("Testing for False Positives for logarithm", Double.NaN, calc.logarithm(15.0), delta);
    }

    @Test
    public void powerPositive() {
        assertEquals("Testing for True Positive for power", 16.0, calc.power(2.0, 4.0), delta);
        assertEquals("Testing for True Negative for power", 0.125, calc.power(2.0, -3.0), delta);
    }

    @Test
    public void powerNegative() {
        assertNotEquals("Testing for False Negative for power", 8.0, calc.power(0.0, 0.0), delta);
        assertNotEquals("Testing for False Positive for power", 8.0, calc.power(2.0, -3.0), delta);
    }

}