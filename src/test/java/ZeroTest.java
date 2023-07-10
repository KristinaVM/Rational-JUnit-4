import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class ZeroTest {
    @Test
    public void testZeroDenominator() {
        assertThrows(ArithmeticException.class, () -> {
            Rational r0 = new Rational(3, 0);
        });
    }

    @Test
    public void testZeroNumeratorAndDenominator() {
        assertThrows(ArithmeticException.class, () -> {
            Rational r01 = new Rational(0, 0);
        });
    }
}
