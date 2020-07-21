package Arrays;

import java.util.*;

public class TwoSum {

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
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum3(nums, target)));

    }
}
