package Arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    // space complexity O(1)
    // time complexity O(n)
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        //create a suffix in arr;
        int temp = nums[n - 1];
        arr[n - 1] = 1;
        for (int j = n - 2; j >= 0; j--) {
            int value = nums[j];
            arr[j] = temp;
            temp *= value;

        }
        //create a prefix in arr;
        temp = nums[0];
        for (int i = 1; i < n; i++) {
            arr[i] *= temp;
            temp *= nums[i];
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};// Output: [24,12,8,6]
        int[] nums2 = {-1, 1, 0, -3, 3};//Output: [0,0,9,0,0]

        System.out.println(Arrays.toString(productExceptSelf(nums1)));
        System.out.println(Arrays.toString(productExceptSelf(nums2)));
    }
}
