package Arrays;

import java.util.*;

//https://leetcode.com/problems/two-sum/
public class TwoSum {
    // space complexity O(1)
    // time complexity O(n^2)
    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int value = nums[i] + nums[j];
                if (value == target && i != j) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    // space complexity O(n)
    // time complexity O(n)
    public static int[] twoSum2(int[] nums, int target) {
        List<Integer> numbers = new ArrayList<>();
        for (int number : nums)
            numbers.add(number);
        for (int i = 0; i < nums.length; i++) {
            int value1 = target - nums[i];
            int index2value = numbers.indexOf(value1);
            if (index2value != -1 && i != index2value)
                return new int[]{i, index2value};
        }
        return new int[]{};
    }

    // space complexity O(n)
    // time complexity O(1)
    public static int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> numbersMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (numbersMap.containsKey(value))
                return new int[]{i, numbersMap.get(value)};
            numbersMap.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        //example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;

        //example 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;

        //example 3
        int[] nums3 = {3, 3};
        int target3 = 6;

        System.out.println(Arrays.toString(twoSum3(nums1, target1)));
        System.out.println(Arrays.toString(twoSum3(nums2, target2)));
        System.out.println(Arrays.toString(twoSum3(nums3, target3)));
    }
}
