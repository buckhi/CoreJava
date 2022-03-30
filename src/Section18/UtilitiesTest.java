package Section18;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities utilities;
    @Before
    public void setup() {
        utilities = new Utilities();
    }

    @Test
    public void everyNthChar() {
        char[] output = utilities.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[]{'e', 'l'}, output);
        char[] output2 = utilities.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 8);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, output2);
    }

    @Test
    public void removePairs() {
        assertEquals("ABCDEFU", utilities.removePairs("AABCDDEFFU"));
        assertEquals("ABCABDEFU", utilities.removePairs("ABCCABDEEFU"));
        assertNull("not get null", utilities.removePairs(null));
        assertEquals("A", utilities.removePairs("A"));

    }

    @Test
    public void converter() {
        assertEquals(300, utilities.converter(10, 5));


    }

    @Test(expected = ArithmeticException.class)
    public void converter_arithmeticException() {
        utilities.converter(10, 0);
    }



    @Test
    public void nullIfOddLength() {
        assertNull(utilities.nullIfOddLength("odd"));
        assertNotNull(utilities.nullIfOddLength("even"));

    }
}