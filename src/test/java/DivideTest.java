import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class DivideTest {
    @Test
    public void testDividePositiveFractions() {
        Rational r1 = new Rational(3, 4);
        Rational r2 = new Rational(1, 2);
        Rational r12 = new Rational(6, 4);
        assertEquals("Division of r1 and r2 is incorrect", r12, r1.divide(r2));
    }

    @Test
    public void testDivideZeroByFraction() {
        Rational r2 = new Rational(1, 2);
        Rational r3 = new Rational(0, 5);
        Rational r32 = new Rational(0, 1);
        assertEquals("Division of r3 and r2 is incorrect", r32, r3.divide(r2));
    }

    @Test
    public void testDivideNegativeFractions() {
        Rational r2 = new Rational(1, 2);
        Rational r4 = new Rational(-4, -5);
        Rational r24 = new Rational(5, 8);
        assertEquals("Division of r2 and r4 is incorrect", r24, r2.divide(r4));
    }

    @Test
    public void testDivideNegativeNumerator() {
        Rational r2 = new Rational(1, 2);
        Rational r5 = new Rational(-1, 3);
        Rational r25 = new Rational(-3, 2);
        assertEquals("Division of r2 and r5 is incorrect", r25, r2.divide(r5));
    }

    @Test
    public void testDivideByZero() {
        Rational r2 = new Rational(1, 2);
        Rational r23 = new Rational(0, 1);
        try {
            r2.divide(r23);
            fail("Expected ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
            assertEquals("division by zero !", e.getMessage());
        }
    }

}
