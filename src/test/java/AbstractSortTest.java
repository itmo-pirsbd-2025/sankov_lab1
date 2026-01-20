import org.example.sort.SortAlgorithm;
import org.junit.jupiter.api.Test;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public abstract class AbstractSortTest {

    protected abstract SortAlgorithm getSort();

    @Test
    void empty() {
        int[] arr = {};
        getSort().sort(arr);
        assertSorted(arr);
    }

    @Test
    void oneElement() {
        int[] arr = {42};
        getSort().sort(arr);
        assertSorted(arr);
    }

    @Test
    void sorted() {
        int[] arr = sortedArray(1000);
        getSort().sort(arr);
        assertSorted(arr);
    }

    @Test
    void reverse() {
        int[] arr = reverseArray(1000);
        getSort().sort(arr);
        assertSorted(arr);
    }

    @Test
    void random() {
        int[] arr = randArray(10000);
        getSort().sort(arr);
        assertSorted(arr);
    }

    @Test
    void duplicates() {
        int[] arr = new int[10000];
        Random r = new Random(1);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }
        getSort().sort(arr);
        assertSorted(arr);
    }

    @Test
    void almostSorted() {
        int[] arr = sortedArray(10000);
        Random r = new Random(2);
        // мешаем 1% элементов
        for (int i = 0; i < arr.length / 100; i++) {
            int x = r.nextInt(arr.length);
            int y = r.nextInt(arr.length);
            int tmp = arr[x]; arr[x] = arr[y]; arr[y] = tmp;
        }
        getSort().sort(arr);
        assertSorted(arr);
    }

    private void assertSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]) {
                fail("не отсортировано на позиции " + i);
            }
        }
    }

    private int[] sortedArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i;
        return arr;
    }

    private int[] reverseArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = n - 1 - i;
        return arr;
    }

    private int[] randArray(int n) {
        Random r = new Random(42);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = r.nextInt();
        return arr;
    }
}
