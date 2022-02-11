package Arrays;

public class MaximumSubarray {
    // space complexity O(1)
    // time complexity O(n)
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;

        for (int number : nums) {
            if (currentSum < 0) currentSum = 0;
            currentSum += number;
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};//6
        int[] nums2 = {1};//1
        int[] nums3 = {5, 4, -1, 7, 8};//23

        System.out.println(maxSubArray(nums1));
        System.out.println(maxSubArray(nums2));
        System.out.println(maxSubArray(nums3));
    }
}
