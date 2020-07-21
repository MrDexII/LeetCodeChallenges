package sorting;

import java.util.Arrays;

public class SelectionSort {

    public int[] selectionSort(int[] array) {
        if (array == null || array.length == 0 || array.length == 1) return array;
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < array.length - 1; j++) {
                if (array[minIndex] > array[j + 1])
                    minIndex = j + 1;
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        return array;
    }

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();

        int[] array = new int[]{4, 9, 1, 3, 0, 2, 8, 5, 0, 6, 7};

        System.out.println(Arrays.toString(sort.selectionSort(array)));

    }
}
