import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyTest {
    @Test
    public void testMultiply() {
        Rational r1 = new Rational(3, 4);
        Rational r2 = new Rational(1, 2);
        Rational r12 = new Rational(3, 8);
        assertEquals("Multiplication of r1 and r2 is incorrect", r12, r1.multiply(r2));
    }

    @Test
    public void testMultiplyByZero() {
        Rational r2 = new Rational(1, 2);
        Rational r3 = new Rational(0, 5);
        Rational r23 = new Rational(0, 1);
        assertEquals("Multiplication of r2 and r3 is incorrect", r23, r2.multiply(r3));
    }

    @Test
    public void testMultiplyNegativeNumbers() {
        Rational r2 = new Rational(1, 2);
        Rational r4 = new Rational(-4, -5);
        Rational r24 = new Rational(4, 10);
        assertEquals("Multiplication of r2 and r4 is incorrect", r24, r2.multiply(r4));
    }

    @Test
    public void testMultiplyNegativeAndPositiveNumber() {
        Rational r2 = new Rational(1, 2);
        Rational r5 = new Rational(-1, 3);
        Rational r25 = new Rational(-1, 6);
        assertEquals("Multiplication of r2 and r5 is incorrect", r25, r2.multiply(r5));
    }

}
