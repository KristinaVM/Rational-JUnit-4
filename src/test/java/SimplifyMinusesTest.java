import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimplifyMinusesTest {
    @Test
    public void testSimplifyMinuses_Numerator1() {
        Rational r5 = new Rational(-1, 3);
        assertEquals("SimplifyMinuses method works incorrectly", -1, r5.getNumerator());
    }

    @Test
    public void testSimplifyMinuses_Denominator1() {
        Rational r5 = new Rational(-1, 3);
        assertEquals("SimplifyMinuses method works incorrectly", 3, r5.getDenominator());
    }

    @Test
    public void testSimplifyMinuses_Numerator2() {
        Rational r4 = new Rational(-4, -5);
        assertEquals("SimplifyMinuses method works incorrectly", 4, r4.getNumerator());
    }

    @Test
    public void testSimplifyMinuses_Denominator2() {
        Rational r4 = new Rational(-4, -5);
        assertEquals("SimplifyMinuses method works incorrectly", 5, r4.getDenominator());
    }

    @Test
    public void testSimplifyMinuses_Numerator3() {
        Rational r9 = new Rational(2, -3);
        assertEquals("SimplifyMinuses method works incorrectly", -2, r9.getNumerator());
    }

    @Test
    public void testSimplifyMinuses_Denominator3() {
        Rational r9 = new Rational(2, -3);
        assertEquals("SimplifyMinuses method works incorrectly", 3, r9.getDenominator());
    }
}
