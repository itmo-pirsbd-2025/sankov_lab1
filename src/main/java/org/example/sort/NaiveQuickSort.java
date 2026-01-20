package org.example.sort;

public class NaiveQuickSort implements SortAlgorithm {

    @Override
    public void sort(int[] arr) {
        qsort(arr, 0, arr.length - 1);
    }

    private void qsort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = arr[left];
        int i = left;
        int j = right;

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int buff = arr[i];
                arr[i] = arr[j];
                arr[j] = buff;
                i++;
                j--;
            }
        }

        qsort(arr, left, j);
        qsort(arr, i, right);
    }

    @Override
    public String name() {
        return "NaiveQuickSort";
    }
}
