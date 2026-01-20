package org.example.sort;

public class ImprovedQuickSort implements SortAlgorithm {

    @Override
    public void sort(int[] arr) {
        qsort(arr, 0, arr.length - 1);
    }

    private void qsort(int[] arr, int left, int right) {
        while (left < right) {
            int pivot = median(arr, left, right);
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
                    swap(arr, i, j);
                    i++;
                    j--;
                }
            }

            if (j - left < right - i) {
                qsort(arr, left, j);
                left = i;
            } else {
                qsort(arr, i, right);
                right = j;
            }
        }
    }

    private int median(int[] arr, int left, int right) {
        int mid = (left + right) >>> 1;

        if (arr[left] > arr[mid]) swap(arr, left, mid);
        if (arr[left] > arr[right]) swap(arr, left, right);
        if (arr[mid] > arr[right]) swap(arr, mid, right);

        return arr[mid];
    }

    private void swap(int[] arr, int i, int j) {
        int buff = arr[i];
        arr[i] = arr[j];
        arr[j] = buff;
    }

    @Override
    public String name() {
        return "ImprovedQuickSort";
    }
}
