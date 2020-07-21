package sorting;

public class SortColors {
    //time complexity O(n)
    //space complexity O(n)
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) return;

        final int read = 0;
        final int white = 1;
        final int blue = 2;

        int readCount = 0;
        int whiteCount = 0;
        int blueCount = 0;

        for (int num : nums) {
            if (num == 0) {
                readCount++;
            } else if (num == 1) {
                whiteCount++;
            } else {
                blueCount++;
            }
        }

        int[] sortedNums = new int[nums.length];

        for (int i = 0; i < readCount; i++) {
            sortedNums[i] = read;
        }
        for (int i = readCount; i < whiteCount + readCount; i++) {
            sortedNums[i] = white;
        }
        for (int i = readCount + whiteCount; i < blueCount + readCount + whiteCount; i++) {
            sortedNums[i] = blue;
        }

        nums = sortedNums;
    }

    //time complexity O(n)
    //space complexity O(1)
    public void sortColors2(int[] nums) {
        int i = 0;
        int j = 0;
        int k = nums.length - 1;

        while (j <= k) {
            if (nums[j] == 0) {
                swap(nums, i, j);
                i++;
                j++;
            } else if (nums[j] == 1) {
                j++;
            } else {
                swap(nums, j, k);
                k--;
            }
        }
    }

    private void swap(int[] nums, int j, int k) {
        int temp = nums[j];
        nums[j] = nums[k];
        nums[k] = temp;
    }

    public static void main(String[] args) {
        SortColors sortColors = new SortColors();
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors.sortColors2(nums);
    }
}
