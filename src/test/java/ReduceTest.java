import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReduceTest {
    @Test
    public void testReducePositiveFractions() {
        Rational r6 = new Rational(6, 9);
        assertEquals("Numerator of r6 is incorrect", 2, r6.getNumerator());
        assertEquals("Denominator of r6 is incorrect", 3, r6.getDenominator());
    }

    @Test
    public void testReduceNegativeFractions() {
        Rational r7 = new Rational(-24, -16);
        assertEquals("Numerator of r7 is incorrect", 3, r7.getNumerator());
        assertEquals("Denominator of r7 is incorrect", 2, r7.getDenominator());
    }

    @Test
    public void testReduceNegativeNumerator() {
        Rational r8 = new Rational(-3, 9);
        assertEquals("Numerator of r8 is incorrect", -1, r8.getNumerator());
        assertEquals("Denominator of r8 is incorrect", 3, r8.getDenominator());
    }
}
