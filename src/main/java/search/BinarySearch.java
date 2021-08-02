package search;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();

        int[] array = new int[]{9, 3, 1, 6, 0, 8, 2, 5, 7, 4};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index = binarySearch.binaryS(0, array.length - 1, array, 9);
        System.out.println(index);
    }

    private int binaryS(int low, int high, int[] array, int key) {
        int mid = (low + high) / 2;

        while (low <= high) {
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key == array[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
            mid = (low + high) / 2;
        }
        return -1;
    }
}
