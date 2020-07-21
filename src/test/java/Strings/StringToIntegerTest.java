package Strings;

import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
@Category(StringToInteger.class)
public class StringToIntegerTest {

    @Test
    public void myAtoi1() {
        assertEquals(42, StringToInteger.myAtoi2("42"));
    }

    @Test
    public void myAtoi2() {
        assertEquals(-42, StringToInteger.myAtoi2("   -42"));
    }
    @Test
    public void myAtoi3() {
        assertEquals(4193, StringToInteger.myAtoi2("4193 with words"));
    }
    @Test
    public void myAtoi4() {
        assertEquals(0, StringToInteger.myAtoi2("words and 987"));
    }
    @Test
    public void myAtoi5() {
        assertEquals(-2147483648, StringToInteger.myAtoi2("-91283472332"));
    }
    @Test
    public void myAtoi6() {
        assertEquals(3, StringToInteger.myAtoi2("3.14159"));
    }
    @Test
    public void myAtoi7() {
        assertEquals(0, StringToInteger.myAtoi2("-"));
    }
    @Test
    public void myAtoi8() {
        assertEquals(0, StringToInteger.myAtoi2("+"));
    }
    @Test
    public void myAtoi9() {
        assertEquals(213, StringToInteger.myAtoi2("+213"));
    }
    @Test
    public void myAtoi10() {
        assertEquals(0, StringToInteger.myAtoi2(null));
    }
    @Test
    public void myAtoi11() {
        assertEquals(0, StringToInteger.myAtoi2(""));
    }

    @Test
    public void myAtoi12() {
        assertEquals(1, StringToInteger.myAtoi2("1"));
    }
    @Test
    public void myAtoi13() {
        assertEquals(0, StringToInteger.myAtoi2(" "));
    }

}