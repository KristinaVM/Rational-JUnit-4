import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LessTest {
    @Test
    public void testLessPositiveNumbers() {
        Rational r1 = new Rational(3, 4);
        Rational r2 = new Rational(1, 2);

        assertTrue("r2 should be less than r1", r2.less(r1));
    }

    @Test
    public void testLessNegativeNumbers() {
        Rational r1 = new Rational(3, 4);
        Rational r3 = new Rational(-1, 2);

        assertTrue("r3 should be less than r1", r3.less(r1));
    }

    @Test
    public void testLessEqualDenominator() {
        Rational r1 = new Rational(3, 4);
        Rational r2 = new Rational(1, 4);

        assertFalse("r1 should not be less than r2", r1.less(r2));
    }
}
