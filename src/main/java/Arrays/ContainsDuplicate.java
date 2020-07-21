package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicateBruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) return false;
        Set<Integer> integerSet = new HashSet<>();
        for (int number : nums)
            if(!integerSet.add(number)) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        //int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        //int[] nums = {1};

        System.out.println(containsDuplicate(nums));
    }
}
