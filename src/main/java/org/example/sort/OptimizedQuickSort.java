package org.example.sort;

public class OptimizedQuickSort implements SortAlgorithm {

    private static final int INSERTION_THRESHOLD = 16;

    @Override
    public void sort(int[] a) {
        int l = 0;
        int r = a.length - 1;

        while (l < r) {
            if (r - l < INSERTION_THRESHOLD) {
                insertionSort(a, l, r);
                return;
            }

            int m = (l + r) >>> 1;

            if (a[l] > a[m]) swap(a, l, m);
            if (a[l] > a[r]) swap(a, l, r);
            if (a[m] > a[r]) swap(a, m, r);

            int pivot = a[m];

            int i = l;
            int j = r;

            while (i <= j) {
                while (a[i] < pivot) i++;
                while (a[j] > pivot) j--;
                if (i <= j) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                    i++;
                    j--;
                }
            }

            if (j - l < r - i) {
                if (l < j) {
                    sortRange(a, l, j);
                }
                l = i;
            } else {
                if (i < r) {
                    sortRange(a, i, r);
                }
                r = j;
            }
        }
    }

    private void sortRange(int[] a, int l, int r) {
        while (l < r) {
            if (r - l < INSERTION_THRESHOLD) {
                insertionSort(a, l, r);
                return;
            }

            int m = (l + r) >>> 1;

            if (a[l] > a[m]) swap(a, l, m);
            if (a[l] > a[r]) swap(a, l, r);
            if (a[m] > a[r]) swap(a, m, r);

            int pivot = a[m];
            int i = l;
            int j = r;

            while (i <= j) {
                while (a[i] < pivot) i++;
                while (a[j] > pivot) j--;
                if (i <= j) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                    i++;
                    j--;
                }
            }

            if (j - l < r - i) {
                sortRange(a, l, j);
                l = i;
            } else {
                sortRange(a, i, r);
                r = j;
            }
        }
    }

    private void insertionSort(int[] a, int l, int r) {
        for (int i = l + 1; i <= r; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= l && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    @Override
    public String name() {
        return "OptimizedQuickSort";
    }
}
