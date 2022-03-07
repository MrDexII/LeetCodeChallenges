package Arrays;

public class SearchInRotatedSortedArray {

    //time complexity O(log n)
    //space complexity O(1)
    public static int search(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex <= rightIndex) {
            int mid = leftIndex + (rightIndex - leftIndex) / 2;
            if (nums[mid] == target) return mid;

            // left sorted portion
            if (nums[leftIndex] <= nums[mid]) {
                if (target > nums[mid] || target < nums[leftIndex])
                    leftIndex = mid + 1;
                else {
                    rightIndex = mid - 1;
                }
                // right sorted portion
            } else {
                if (target < nums[mid] || target > nums[rightIndex]) {
                    rightIndex = mid - 1;
                } else {
                    leftIndex = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2}; //4
        int target1 = 0;
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2}; //-1
        int target2 = 3;
        int[] nums3 = {1}; //-1
        int target3 = 0;
        int[] nums4 = {1, 2, 3, 4, 5, 6}; //3
        int target4 = 4;
        int[] nums5 = {4, 5, 6, 7, 0, 1, 2};//1
        int target5 = 5;
        int[] nums6 = {5, 1, 2, 3, 4};//1
        int target6 = 1;


        System.out.println(search(nums1, target1));
        System.out.println(search(nums2, target2));
        System.out.println(search(nums3, target3));
        System.out.println(search(nums4, target4));
        System.out.println(search(nums5, target5));
        System.out.println(search(nums6, target6));
    }
}
