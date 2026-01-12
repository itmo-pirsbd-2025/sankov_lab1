package org.example.sort;

public class ImprovedQuickSort implements SortAlgorithm {

    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] a, int l, int r) {
        while (l < r) {
            int pivot = medianOfThree(a, l, r);
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

            if (j - l < r - i) {
                quickSort(a, l, j);
                l = i;
            } else {
                quickSort(a, i, r);
                r = j;
            }
        }
    }

    private int medianOfThree(int[] a, int l, int r) {
        int m = (l + r) >>> 1;

        if (a[l] > a[m]) swap(a, l, m);
        if (a[l] > a[r]) swap(a, l, r);
        if (a[m] > a[r]) swap(a, m, r);

        return a[m];
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    @Override
    public String name() {
        return "ImprovedQuickSort";
    }
}
