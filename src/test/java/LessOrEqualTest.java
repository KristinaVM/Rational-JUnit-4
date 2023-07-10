import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LessOrEqualTest {
    @Test
    public void testLessOrEqual() {
        Rational r1 = new Rational(3, 4);
        Rational r2 = new Rational(1, 2);

        assertTrue("r2 should be less or equal to r1", r2.lessOrEqual(r1));
    }

    @Test
    public void testLessOrEqual_EqualDenominator() {
        Rational r1 = new Rational(3, 4);
        Rational r2 = new Rational(1, 4);

        assertFalse("r1 should not be less or equal to r2", r1.lessOrEqual(r2));
    }

    @Test
    public void testLessOrEqual_equal() {
        Rational r1 = new Rational(3, 4);

        assertTrue("r1 should be less or equal to itself", r1.lessOrEqual(r1));
    }

    @Test
    public void testLessOrEqualNegativeNumbers() {
        Rational r1 = new Rational(3, 4);
        Rational r3 = new Rational(-1, 2);

        assertTrue("r3 should be less or equal to r1", r3.lessOrEqual(r1));
    }
}
