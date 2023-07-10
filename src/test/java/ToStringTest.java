import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToStringTest {
    @Test
    public void testToString() {
        Rational r1 = new Rational(3, 4);
        assertEquals("toString() should return the correct value","3/4", r1.toString());
    }
}
