import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class SettersTest {
    @Test
    public void testSetNumeratorUpdatesNumerator() {
        Rational r1 = new Rational(3, 4);
        r1.setNumerator(5);
        assertEquals("Numerator should be 5", 5, r1.getNumerator());
    }

    @Test
    public void testSetDenominatorUpdatesDenominator() {
        Rational r1 = new Rational(3, 4);
        r1.setDenominator(6);
        assertEquals("Denominator should be 6", 6, r1.getDenominator());
    }

    @Test
    public void testSetDenominatorReducesDenominator() {
        Rational r3 = new Rational(2, 5);
        r3.setDenominator(6);
        assertEquals("Denominator should be 3", 3, r3.getDenominator());
    }

    @Test
    public void testSetNumeratorUpdatesNumeratorToZero() {
        Rational r2 = new Rational(1, 2);
        r2.setNumerator(0);
        assertEquals("Numerator should be 0", 0, r2.getNumerator());
    }

    @Test
    public void testSetDenominatorThrowsArithmeticException() {
        Rational r2 = new Rational(1, 2);
        assertThrows(ArithmeticException.class, () -> {
            r2.setDenominator(0);
        });
    }
}
