package Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int index = 1, len = nums.length;

        for (int i = 0; i < len-1; i++) {
                if ( nums[i] != nums[i + 1]) {
                    nums[index++] = nums[i + 1];
                }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }
}
