package dynamicPrograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && 1 + dp[j] > dp[i]) {
                    dp[i] = 1 + dp[j];
                    if (max < dp[i]) {
                        max = dp[i];
                    }
                }
            }
        }
        int prev = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (dp[i] == max && (prev % nums[i] == 0 || prev == -1)) {
                list.add(nums[i]);
                max--;
                prev = nums[i];
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 8};

        LargestDivisibleSubset largestDivisibleSubset = new LargestDivisibleSubset();
        List<Integer> list = largestDivisibleSubset.largestDivisibleSubset(nums);

        System.out.println(list);
    }
}
