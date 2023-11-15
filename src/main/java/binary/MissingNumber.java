package binary;

public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers1 = {0, 1, 2, 3, 5, 6, 7, 8, 9}; //4
        int[] numbers2 = {3, 0, 1}; //2
        int[] numbers3 = {0, 1}; //2
        int[] numbers4 = {9, 6, 4, 2, 3, 5, 7, 0, 1}; //8

        System.out.println(missingNumber1(numbers1));
        System.out.println(missingNumber1(numbers2));
        System.out.println(missingNumber1(numbers3));
        System.out.println(missingNumber1(numbers4));
    }

    // time complexity O(n);
    // space complexity O(1);
    private static int missingNumber(int[] numbers) {
        int n = numbers.length;
        int sum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            actualSum += numbers[i];
        }
        return sum - actualSum;
    }

    // time complexity O(n);
    // space complexity O(1);
    // using xor operator
    private static int missingNumber1(int[] numbers) {
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 0; i < numbers.length; i++) {
            xor1 = xor1 ^ (i + 1);
            xor2 = xor2 ^ numbers[i];
        }

        return xor1 ^ xor2;
    }
}
