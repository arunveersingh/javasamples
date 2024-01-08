package sample1;

import static org.junit.Assert.*;
import org.junit.Test;

public class BoxingExampleTest {

    @Test
    public void testAutoBoxingWith100() {
        // Auto-boxing:
        // Converting int to Integer
        Integer a = 100;
        Integer b = 100;

        assertNotSame(
                "Should not be same",
                a, b);
    }

    @Test
    public void testAutoBoxingWith200() {
        // Auto-boxing:
        // Converting int to Integer
        Integer c = 200;
        Integer d = 200;

        assertNotSame(
                "Should not be same",
                c, d);
    }
}

