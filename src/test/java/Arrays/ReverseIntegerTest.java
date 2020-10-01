package Arrays;

import junit.framework.TestCase;
import org.junit.Assert;

public class ReverseIntegerTest extends TestCase {

    public void testReverse() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int x = 123;
        int expected = 321;

        Assert.assertEquals(expected, reverseInteger.reverse(x));
    }

    public void testReverse2() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int x = -123;
        int expected = -321;

        Assert.assertEquals(expected, reverseInteger.reverse(x));
    }

    public void testReverse3() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int x = 0;
        int expected = 0;

        Assert.assertEquals(expected, reverseInteger.reverse(x));
    }

    public void testReverse4() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int x = -1;
        int expected = -1;

        Assert.assertEquals(expected, reverseInteger.reverse(x));
    }
    public void testReverse5() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int x = 1;
        int expected = 1;

        Assert.assertEquals(expected, reverseInteger.reverse(x));
    }
}