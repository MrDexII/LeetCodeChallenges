package sorting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {
    SelectionSort selectionSort;

    @Before
    public void init() {
        selectionSort = new SelectionSort();
    }

    @Test
    public void selectionSort1() {
        int[] array = new int[]{};
        int[] sorted = new int[]{};
        assertArrayEquals(sorted, selectionSort.selectionSort(array));
    }

    @Test
    public void selectionSort2() {
        int[] array = null;
        int[] sorted = null;
        assertArrayEquals(sorted, selectionSort.selectionSort(array));
    }


    @Test
    public void selectionSort3() {
        int[] array = new int[]{1};
        int[] sorted = new int[]{1};
        assertArrayEquals(sorted, selectionSort.selectionSort(array));
    }

    @Test
    public void selectionSort4() {
        int[] array = new int[]{2, 1};
        int[] sorted = new int[]{1, 2};
        assertArrayEquals(sorted, selectionSort.selectionSort(array));
    }

    @Test
    public void selectionSort5() {
        int[] array = new int[]{4, 9, 1, 3, 0, 2, 8, 5, 0, 6, 7};
        int[] sorted = new int[]{0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(sorted, selectionSort.selectionSort(array));
    }
}