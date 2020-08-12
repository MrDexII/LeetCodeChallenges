package Arrays;

public class MergeSortedArray {
    //TimeComplexity O(n+m)
    //SpaceComplexity O(1)
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIndex = nums1.length - 1;
        int n1 = m - 1, n2 = n - 1;

        while (n2 >= 0) {
            if (n1 < 0 || nums2[n2] > nums1[n1]) {
                nums1[lastIndex--] = nums2[n2--];
            } else {
                nums1[lastIndex--] = nums1[n1--];
            }
        }
        return nums1;
    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();

//        int[] nums1 = {1, 2, 3, 0, 0, 0};
//        int[] nums2 = {2, 5, 6};
//        int m = 3;
//        int n = 3;


        int[] nums1 = {-1, 3, 0, 0, 0, 0, 0};
        int[] nums2 = {0, 0, 1, 2, 3};
        int m = 2;
        int n = 5;


        mergeSortedArray.merge(nums1, m, nums2, n);

    }
}
