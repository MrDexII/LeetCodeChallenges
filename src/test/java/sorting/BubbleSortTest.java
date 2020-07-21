package sorting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {
    BubbleSort bubbleSort;

    @Before
    public void init() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void bubbleSort1() {
        int[] array = new int[]{};
        int[] sorted = new int[]{};
        assertArrayEquals(sorted, bubbleSort.bubbleSort(array));
    }

    @Test
    public void bubbleSort2() {
        int[] array = null;
        int[] sorted = null;
        assertArrayEquals(sorted, bubbleSort.bubbleSort(array));
    }


    @Test
    public void bubbleSort3() {
        int[] array = new int[]{1};
        int[] sorted = new int[]{1};
        assertArrayEquals(sorted, bubbleSort.bubbleSort(array));
    }

    @Test
    public void bubbleSort4() {
        int[] array = new int[]{2, 1};
        int[] sorted = new int[]{1, 2};
        assertArrayEquals(sorted, bubbleSort.bubbleSort(array));
    }

    @Test
    public void bubbleSort5() {
        int[] array = new int[]{4, 9, 1, 3, 0, 2, 8, 5, 0, 6, 7};
        int[] sorted = new int[]{0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(sorted, bubbleSort.bubbleSort(array));
    }
}