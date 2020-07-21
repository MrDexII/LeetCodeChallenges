package Arrays;

import java.util.Arrays;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++)
            if (nums[i] >= target) return i;
        return nums.length;
    }

    //binary search O(log n)
    public int searchInsert2(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0, mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] > target)
                high = mid - 1;
            else if (nums[mid] < target)
                low = mid + 1;
            else
                return mid;
        }
        return low;
    }

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int i1 = Arrays.binarySearch(nums, target);
        System.out.println(i1);
        System.out.println(searchInsertPosition.searchInsert2(nums, target));
    }

}
