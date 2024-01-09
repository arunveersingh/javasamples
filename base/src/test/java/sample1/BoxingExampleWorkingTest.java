package sample1;

import static org.junit.Assert.*;
import org.junit.Test;

public class BoxingExampleWorkingTest {

    @Test
    public void testCachingWithinRange() {
        // Auto-boxing: Converting int to Integer within cache range
        Integer a = 100; // uses cache
        Integer b = 100; // uses cache

        // Assert that a and b are the same object
        assertSame("Objects should be the same within cache range", a, b);
    }

    @Test
    public void testNoCachingOutsideRange() {
        // Auto-boxing: Converting int to Integer outside cache range
        Integer c = 200; // creates new object
        Integer d = 200; // creates new object

        // Assert that c and d are not the same object
        assertNotSame("Objects should not be the same outside cache range", c, d);
    }
}

