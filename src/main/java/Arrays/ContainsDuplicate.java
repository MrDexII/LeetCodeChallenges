package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    // time complexity O(n^2)
    // space complexity O(1)
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }
        return false;
    }

    // time complexity O(n)
    // space complexity O(n)
    public static boolean containsDuplicate2(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsSet.contains(nums[i])) return true;
            else {
                numsSet.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] nums4 = {1, 1};
        int[] nums5 = {1, 2};
        int[] nums6 = {1};

        System.out.println(containsDuplicate2(nums1));
        System.out.println(containsDuplicate2(nums2));
        System.out.println(containsDuplicate2(nums3));
        System.out.println(containsDuplicate2(nums4));
        System.out.println(containsDuplicate2(nums5));
        System.out.println(containsDuplicate2(nums6));

    }
}
