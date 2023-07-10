import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GettersTest {
    @Test
    public void testGettersNumerator() {
        Rational r1 = new Rational(3, 4);
        assertEquals("Getter returns wrong numerator", 3, r1.getNumerator());
    }

    @Test
    public void testGettersDenominator() {
        Rational r1 = new Rational(3, 4);
        assertEquals("Getter returns wrong denominator", 4, r1.getDenominator());
    }
}
