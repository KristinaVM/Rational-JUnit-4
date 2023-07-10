import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargeNumbersTest {
    @Test
    public void testLargeNumbers_NumeratorAndDenominatorEqualMaxValue() {
        Rational r1 = new Rational(Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertEquals("Expected the numerator and denominator to be equal when divided by their maximum value",
                1, r1.getNumerator());
        assertEquals("Expected the numerator and denominator to be equal when divided by their maximum value",
                1, r1.getDenominator());
    }

    @Test
    public void testLargeNumbers_NumeratorAndDenominatorEqualMinValue() {
        Rational r2 = new Rational(Integer.MIN_VALUE, Integer.MIN_VALUE);
        assertEquals("Expected the numerator and denominator to be equal when divided by their minimum value",
                1, r2.getNumerator());
        assertEquals("Expected the numerator and denominator to be equal when divided by their minimum value",
                1, r2.getDenominator());
    }

    @Test
    public void testLargeNumbers_NumeratorIsMaxValueAndDenominatorIsOne() {
        Rational r3 = new Rational(Integer.MAX_VALUE, 1);
        assertEquals("Expected the numerator to be equal to the maximum value and the denominator to be 1",
                Integer.MAX_VALUE, r3.getNumerator());
        assertEquals("Expected the numerator to be equal to the maximum value and the denominator to be 1",
                1, r3.getDenominator());
    }

    @Test
    public void testLargeNumbers_NumeratorIsOneAndDenominatorIsMinValue() {
        Rational r4 = new Rational(1, Integer.MIN_VALUE);
        assertEquals("Expected the numerator to be 1 and the denominator to be equal to the minimum value",
                1, r4.getNumerator());
        assertEquals("Expected the numerator to be 1 and the denominator to be equal to the minimum value",
                Integer.MIN_VALUE, r4.getDenominator());
    }
}
