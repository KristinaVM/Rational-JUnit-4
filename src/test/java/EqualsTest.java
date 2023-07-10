import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class EqualsTest {
    @Test
    public void testEquals() {
        Rational r1 = new Rational(3, 4);
        Rational r3 = new Rational(3, 4);

        assertEquals("r1 should be equal to r3", r1, r3);
    }

    @Test
    public void testEqualsReduce() {
        Rational r1 = new Rational(3, 4);
        Rational r4 = new Rational(6, 8);

        assertEquals("r1 should be equal to r4", r1, r4);
    }

    @Test
    public void testNotEquals() {
        Rational r1 = new Rational(3, 4);
        Rational r5 = new Rational(2, 3);

        assertFalse("r1 should not be equal to r5", r1.equals(r5));
    }

    @Test
    public void testNotEqualsNull() {
        Rational r1 = new Rational(3, 4);
        assertFalse("r1 should not be equal to null", r1.equals(null));
    }

    @Test
    public void testNotEqualsString() {
        Rational r1 = new Rational(3, 4);
        assertFalse("r1 should not be equal to a String", r1.equals(new String()));
    }
}
