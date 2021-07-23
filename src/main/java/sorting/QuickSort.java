package sorting;

public class QuickSort {

    private final int[] numbers;
    private final int length;

    public int[] getNumbers() {
        return numbers;
    }

    public QuickSort(int[] numbers) {
        this.numbers = numbers;
        this.length = numbers.length;
    }

    public void sort() {
        if (numbers.length == 0 || numbers.length == 1)
            return;

        quickSort(0, length - 1);
    }

    private void quickSort(int low, int high) {
        int i = low;
        int j = high;

        int pivot = numbers[low + (high - low) / 2];

        while (i <= j) {
            while (numbers[i] < pivot)
                i++;
            while (numbers[j] > pivot)
                j--;
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(low, j);

        if (i < high)
            quickSort(i, high);
    }

    private void swap(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 5, 9, 0, 2, 6, 8, 3, 7, 4};

        QuickSort quickSort = new QuickSort(numbers);
        quickSort.sort();

    }
}
