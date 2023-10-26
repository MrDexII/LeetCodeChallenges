package sorting;

import java.util.Arrays;

public class MergeSort {
    // O(n log(n)) time complexity
    // O(n) space complexity
    public static void main(String[] args) {
        int[] tab = {8, 5, 9, 1, 6, 7};
        int left = 0;
        int right = tab.length - 1;
        mSort(tab, left, right);
        Arrays.stream(tab).forEach(System.out::println);
    }

    private static void mSort(int[] tab, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mSort(tab, left, mid);
            mSort(tab, mid + 1, right);
            merge(tab, left, mid, right);
        }
    }

    private static void merge(int[] tab, int left, int mid, int right) {
        int leftArrayLength = mid - left + 1;
        int rightArrayLength = right - mid;

        int[] leftTab = new int[leftArrayLength];
        int[] rightTab = new int[rightArrayLength];
        for (int i = 0; i < leftArrayLength; i++) {
            leftTab[i] = tab[left + i];
        }
        for (int i = 0; i < rightArrayLength; i++) {
            rightTab[i] = tab[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        //merging
        while (i < leftArrayLength && j < rightArrayLength) {
            if (leftTab[i] <= rightTab[j]) {
                tab[k] = leftTab[i];
                i++;
            } else {
                tab[k] = rightTab[j];
                j++;
            }
            k++;
        }
        //coping values
        while (i < leftArrayLength) {
            tab[k] = leftTab[i];
            i++;
            k++;
        }
        while (j < rightArrayLength) {
            tab[k] = rightTab[j];
            j++;
            k++;
        }
    }

}
