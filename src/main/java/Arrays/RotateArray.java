package Arrays;

public class RotateArray {
    public static int[] rotate1(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for (int j = 0; j < k; j++) {
            temp[0] = nums[nums.length - 1];
            for (int i = 1; i <= nums.length - 1; i++) {
                temp[i] = nums[i - 1];
            }
            nums = temp.clone();
        }
        return temp;
    }

    // if k < nums.length
    public static int[] rotate(int[] nums, int k) {

        int[] numsClone = nums.clone();

        int boundry = k % nums.length;

        System.out.println(boundry);

        for (int i = 1; i <= boundry; i++) {
            nums[boundry - i] = numsClone[nums.length - i];
        }
        for (int i = 0; i < nums.length - boundry; i++) {
            nums[boundry + i] = numsClone[i];
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {-1, -100, 5, 3, 99};
        int k = 21;

        int[] rotate = rotate(nums, k);
        for (int i = 0; i < rotate.length; i++) {
            System.out.print(rotate[i] + ", ");
        }
    }
}
