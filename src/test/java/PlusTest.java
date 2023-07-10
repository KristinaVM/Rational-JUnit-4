import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlusTest {
    @Test
    public void testPlusWithPositive() {
        Rational r1 = new Rational(3, 4);
        Rational r2 = new Rational(1, 2);

        Rational r12 = new Rational(5, 4);
        assertEquals("r1 plus r2 should be equal to r12", r12, r1.plus(r2));
    }

    @Test
    public void testPlusWithZero() {
        Rational r2 = new Rational(1, 2);
        Rational r3 = new Rational(0, 5);

        Rational r23 = new Rational(1, 2);
        assertEquals("r2 plus r3 should be equal to r23", r23, r2.plus(r3));
    }

    @Test
    public void testPlusWithNegative() {
        Rational r2 = new Rational(1, 2);
        Rational r4 = new Rational(-4, -5);

        Rational r24 = new Rational(13, 10);
        assertEquals("r2 plus r4 should be equal to r24", r24, r2.plus(r4));
    }

    @Test
    public void testPlusWithNegativeFraction() {
        Rational r2 = new Rational(1, 2);
        Rational r5 = new Rational(-1, 3);

        Rational r25 = new Rational(1, 6);
        assertEquals("r2 plus r5 should be equal to r25", r25, r2.plus(r5));
    }
}
