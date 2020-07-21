package sorting;

import java.util.Arrays;

public class BubbleSort {

    public int[] bubbleSort(int[] array) {
        if (array == null || array.length == 0 || array.length == 1) return array;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();

        int[] array = new int[]{4, 9, 1, 3, 0, 2, 8, 5, 0, 6, 7};

        System.out.println(Arrays.toString(sort.bubbleSort(array)));
    }
}
