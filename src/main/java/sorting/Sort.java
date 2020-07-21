package sorting;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] numbers = new int[]{6, 5, 1, 3, 8, 7, 2, 4};

        Arrays.stream(numbers).forEach(System.out::print);
        System.out.println();

        QuickSort sort = new QuickSort(numbers);
        sort.sort();
        Arrays.stream(sort.getNumbers()).forEach(System.out::print);
        System.out.println();
    }
}
