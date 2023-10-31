package sorting;

//O(n log(n)) - time complexity
// O(log(n)) - space complexity
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {4, 3, 6, 1, 2, 56, 34, 12, 1, 2, 0, 8};

        quickSort2(array, 0, array.length - 1);
        for (int number : array) {
            System.out.print(number + " ");
        }
    }

    private static void quickSort(int[] array, int low, int high) {
        int i = low;
        int j = high;

        int pivot = array[low + (high - low) / 2];

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (i < high)
            quickSort(array, i, high);
    }

    private static void quickSort2(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);

            quickSort2(array, low, partitionIndex - 1);
            quickSort2(array, partitionIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);

        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
