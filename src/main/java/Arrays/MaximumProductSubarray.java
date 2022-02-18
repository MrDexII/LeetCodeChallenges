package Arrays;

import java.util.Arrays;

public class MaximumProductSubarray {

    // time complexity O(n^2)
    // space complexity O(1)
    public static int maxProduct1(int[] nums) {
        int maxMulti = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int multi = nums[i];
            if (multi > maxMulti) {
                maxMulti = multi;
            }
            for (int j = i + 1; j < nums.length; j++) {
                multi = multi * nums[j];
                if (multi > maxMulti) {
                    maxMulti = multi;
                }
            }
        }
        return maxMulti;
    }
    // time complexity O(n)
    // space complexity O(1)
    public static int maxProduct2(int[] nums) {
        int res = Arrays.stream(nums).max().getAsInt();
        int curMin = 1;
        int curMax = 1;

        for (int number : nums) {
            if (number == 0) {
                curMin = 1;
                curMax = 1;
                continue;
            }
            int tmp = curMax * number;
            curMax = Arrays.stream(new int[]{tmp, number * curMin, number}).max().getAsInt();
            curMin = Arrays.stream(new int[]{tmp, number * curMin, number}).min().getAsInt();
            res = Arrays.stream(new int[]{res, curMax}).max().getAsInt();
        }
        return res;

    }
    // time complexity O(n)
    // space complexity O(1)
    // best solution
    public int maxProduct3(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int pdt = 1;
        for(int i=0; i<nums.length; i++){
            pdt *= nums[i];
            ans = Math.max(ans, pdt);
            if(pdt==0){
                pdt = 1;
            }
        }

        pdt = 1;
        for(int i = nums.length-1; i>=0; i--){
            pdt *= nums[i];
            ans = Math.max(ans, pdt);
            if(pdt==0){
                pdt = 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, -2, 4}; //6
        int[] nums2 = {-2, 0, -1}; //0
        int[] nums3 = {0, 2}; //0

        System.out.println(maxProduct1(nums1));
        System.out.println(maxProduct1(nums2));
        System.out.println(maxProduct1(nums3));
        System.out.println("----------------");
        System.out.println(maxProduct2(nums1));
        System.out.println(maxProduct2(nums2));
        System.out.println(maxProduct2(nums3));

    }
}
