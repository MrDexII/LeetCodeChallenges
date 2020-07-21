package sorting;

import java.util.Arrays;

public class InsertionSort {

    public int[] insertionSort(int[] array) {
        if (array == null || array.length == 0 || array.length == 1) return array;
        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[i + 1];
            int pointer = i;
            while (pointer >= 0 && array[pointer] > temp) {
                array[pointer + 1] = array[pointer];
                pointer--;
            }
            array[pointer + 1] = temp;
        }
        return array;
    }


    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();

        int[] array = new int[]{4, 9, 1, 3, 0, 2, 8, 5, 0, 6, 7};

        System.out.println(Arrays.toString(sort.insertionSort(array)));

    }
}
