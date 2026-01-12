package org.example.sort;

public class NaiveQuickSort implements SortAlgorithm {

    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] a, int l, int r) {
        if (l >= r) return;

        int pivot = a[l];
        int i = l;
        int j = r;

        while (i <= j) {
            while (a[i] < pivot) i++;
            while (a[j] > pivot) j--;
            if (i <= j) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++;
                j--;
            }
        }

        quickSort(a, l, j);
        quickSort(a, i, r);
    }

    @Override
    public String name() {
        return "NaiveQuickSort";
    }
}
