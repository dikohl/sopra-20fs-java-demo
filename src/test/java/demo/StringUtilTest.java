package demo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    private StringUtil classUnderTest;

    @Before
    public void setUp() {
        classUnderTest = new StringUtil();
    }

    @Test
    public void testReverseString() {
        assertEquals("+% GNIRTS SIHT GNITSET", classUnderTest.reverseString("TESTING THIS STRING %+"));
    }

    @Test
    public void testReverseString_Empty() {
        assertEquals("", classUnderTest.reverseString(""));
    }

    @Test
    public void testEqualStringsNotEmpty() {
        assertFalse(classUnderTest.equalStrings("TESTING THIS STRING %+", "+% GNIRTS SIHT GNITSET"));
    }

    @Test
    public void testEqualStringsNotEmpty_EmptyBoth() {
        assertFalse(classUnderTest.equalStrings("", ""));
    }

    @Test
    public void testEqualStringsNotEmpty_EmptyOriginal() {
        assertFalse(classUnderTest.equalStrings("AA", ""));
    }

    @Test
    public void testEqualStringsNotEmpty_EmptyReverse() {
        assertFalse(classUnderTest.equalStrings("", "AA"));
    }

    @Test
    public void testEqualStringsNotEmpty_Same() {
        assertTrue(classUnderTest.equalStrings("TESTING THIS STRING %+", "TESTING THIS STRING %+"));
    }
}
