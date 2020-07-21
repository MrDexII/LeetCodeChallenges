package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int singleNumber1(int[] nums) {
        Map<Integer, Integer> tempMap = new HashMap<>();
        for (int num : nums) tempMap.put(num, tempMap.getOrDefault(num, 0) + 1);
        for (int number : nums)
            if (tempMap.get(number) == 1) return number;
        return -1;
    }

    public static int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        int number = nums[0];
        if (nums.length == 1) return number;
        if (number != nums[1]) return number;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                number = nums[i + 1];
                if ((i + 2) > (nums.length - 1) || number != nums[i + 2]) return number;
            }
        }
        return number;
    }

    public static int singleNumber(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum ^= n;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 0, 0, 1};

        System.out.println(singleNumber1(nums));

    }
}
