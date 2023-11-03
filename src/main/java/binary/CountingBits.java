package binary;

public class CountingBits {

    public static void main(String[] args) {
        int[] array = countBits(100);

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "->" + array[i]);
        }
    }

    // time complexity - O(n log(n))
    // space complexity - O(n)
    private static int[] countBits1(int number) {
        int[] array = new int[number + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = countOnes1(i);
        }
        return array;
    }

    private static int countOnes1(int i) {
        int counter = 0;
        while (i != 0) {
            if (i % 2 == 1) counter++;
            i = i / 2;
        }
        return counter;
    }

    // time complexity - O(n)
    // space complexity - O(n)
    private static int[] countBits(int number) {
        int[] array = new int[number + 1];
        int offset = 1;
        for (int i = 1; i < array.length; i++) {
            if (offset * 2 == i) offset = i;
            array[i] = 1 + array[i - offset];
        }
        return array;
    }
}
