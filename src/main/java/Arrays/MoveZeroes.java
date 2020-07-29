package Arrays;

public class MoveZeroes {

    //Space complexity O(1)
    //Time complexity  O(n^2)
    public void moveZeroes(int[] nums) {
        int numberOfZeros = 0;

        for (int i = 0; i < nums.length - numberOfZeros; i++) {
            if (nums[i] == 0) {
                int index = i;

                for (int j = index + 1; j < nums.length - numberOfZeros; j++)
                    index = swap(nums, index, j);

                numberOfZeros++;
                i--;
            }
        }
    }

    //Space complexity O(1)
    //Time complexity  O(n)
    public void moveZeroes2(int[] nums) {
        int start = -1;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] != 0 && start != -1) {
                swapVoid(nums, start, end);
                start++;
            } else if (nums[end] == 0 && start == -1) {
                start = end;
            }
        }
    }

    private int swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i++] = nums[j];
        nums[j] = temp;
        return i;
    }

    private void swapVoid(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();

        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes.moveZeroes2(nums);

    }
}
