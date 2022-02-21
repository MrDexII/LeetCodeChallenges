package Arrays;

public class FindMinimumInRotatedSortedArray {
    //space complexity O(1)
    //time complexity O(log n)
    public static int findMin1(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {

        int[] nums1 = {3, 4, 5, 1, 2}; // 1
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2}; // 0
        int[] nums3 = {11, 13, 15, 17}; // 11
        int[] nums4 = {1, 2, 3, 4, 5, 6, 7, 0};


        System.out.println(findMin1(nums1));
        System.out.println(findMin1(nums2));
        System.out.println(findMin1(nums3));
        System.out.println(findMin1(nums4));
    }
}
