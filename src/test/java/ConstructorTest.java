import org.junit.*;
import static org.junit.Assert.*;

public class ConstructorTest {


    @Test
    public void testStandardConstructor() {
        Rational standard = new Rational();
        assertEquals("Standard constructor returns wrong numerator", 0, standard.getNumerator());
        assertEquals("Standard constructor returns wrong denominator", 1, standard.getDenominator());
    }

    @Test
    public void testConstructor() {
        Rational r1 = new Rational(3, 4);
        assertEquals("Constructor returns wrong numerator", 3, r1.getNumerator());
        assertEquals("Constructor returns wrong denominator", 4, r1.getDenominator());
    }
}









