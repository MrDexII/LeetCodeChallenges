package sorting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    InsertionSort insertionSort;

    @Before
    public void init() {
        insertionSort = new InsertionSort();
    }

    @Test
    public void insertionSort1() {
        int[] array = new int[]{};
        int[] sorted = new int[]{};
        assertArrayEquals(sorted, insertionSort.insertionSort(array));
    }

    @Test
    public void insertionSort2() {
        int[] array = null;
        int[] sorted = null;
        assertArrayEquals(sorted, insertionSort.insertionSort(array));
    }


    @Test
    public void insertionSort3() {
        int[] array = new int[]{1};
        int[] sorted = new int[]{1};
        assertArrayEquals(sorted, insertionSort.insertionSort(array));
    }

    @Test
    public void insertionSort4() {
        int[] array = new int[]{2, 1};
        int[] sorted = new int[]{1, 2};
        assertArrayEquals(sorted, insertionSort.insertionSort(array));
    }

    @Test
    public void insertionSort5() {
        int[] array = new int[]{4, 9, 1, 3, 0, 2, 8, 5, 0, 6, 7};
        int[] sorted = new int[]{0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(sorted, insertionSort.insertionSort(array));
    }
}