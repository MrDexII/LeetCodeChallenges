package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThreeSum {

    //time complexity O(n^3)
    //space complexity O(1)
    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) return new ArrayList<>();
        List<List<Integer>> results = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
                        list.sort(Comparator.naturalOrder());
                        if (!checkIfExistsInList(list, results)) {
                            results.add(list);
                        }
                    }
                }
            }
        }
        return results;
    }

    private static boolean checkIfExistsInList(List<Integer> num, List<List<Integer>> results) {
        for (int i = 0; i < results.size(); i++) {
            List<Integer> integers = results.get(i);
            if (num.equals(integers)) {
                return true;
            }
        }
        return false;
    }

    //time complexity O(n^2)
    //space complexity O(1)
    public static List<List<Integer>> threeSum2(int[] nums) {
        if (nums.length < 3) return new ArrayList<>();
        nums = Arrays.stream(nums).sorted().toArray();
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (i > 0 && a == nums[i - 1]) continue;
            int leftPointer = i + 1;
            int rightPointer = nums.length - 1;
            while (leftPointer < rightPointer) {
                int threeSum = a + nums[leftPointer] + nums[rightPointer];
                if (threeSum > 0) {
                    rightPointer -= 1;
                } else if (threeSum < 0) {
                    leftPointer += 1;
                } else {
                    result.add(List.of(a, nums[leftPointer], nums[rightPointer]));
                    leftPointer += 1;
                    while (nums[leftPointer] == nums[leftPointer - 1] && leftPointer < rightPointer) {
                        leftPointer += 1;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        int[] nums2 = {};
        int[] nums3 = {0};

        System.out.println(threeSum2(nums1));
        System.out.println(threeSum2(nums2));
        System.out.println(threeSum2(nums3));

    }
}
