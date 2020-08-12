package Arrays;

import junit.framework.TestCase;
import org.junit.Assert;

public class MergeSortedArrayTest extends TestCase {

    MergeSortedArray mergeSortedArray;

    @Override
    public void setUp() throws Exception {
        mergeSortedArray = new MergeSortedArray();
    }

    public void testMergeShouldBeEqual() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        int[] result = {1, 2, 2, 3, 5, 6};
        Assert.assertArrayEquals(result, mergeSortedArray.merge(nums1, m, nums2, n));


    }

    public void testMergeShouldBeNotEqual() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        int[] result = new int[]{1, 2, 2, 3, 6, 5};
        Assert.assertNotSame(result, mergeSortedArray.merge(nums1, m, nums2, n));
    }
}