
import org.example.sort.SortAlgorithm;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public abstract class AbstractSortTest {

    protected abstract SortAlgorithm algorithm();

    @Test
    void testEmptyArray() {
        int[] a = new int[0];
        algorithm().sort(a);
        assertSorted(a);
    }

    @Test
    void testSingleElement() {
        int[] a = {42};
        algorithm().sort(a);
        assertSorted(a);
    }

    @Test
    void testAlreadySorted() {
        int[] a = generateSorted(1000);
        algorithm().sort(a);
        assertSorted(a);
    }

    @Test
    void testReverseSorted() {
        int[] a = generateReverseSorted(1000);
        algorithm().sort(a);
        assertSorted(a);
    }

    @Test
    void testRandomArray() {
        int[] a = generateRandom(10_000);
        algorithm().sort(a);
        assertSorted(a);
    }

    @Test
    void testWithDuplicates() {
        int[] a = new int[10_000];
        Random r = new Random(1);
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(10);
        }
        algorithm().sort(a);
        assertSorted(a);
    }

    @Test
    void testAlmostSorted() {
        int[] a = generateSorted(10_000);
        Random r = new Random(2);
        for (int i = 0; i < a.length / 100; i++) {
            int x = r.nextInt(a.length);
            int y = r.nextInt(a.length);
            int t = a[x];
            a[x] = a[y];
            a[y] = t;
        }
        algorithm().sort(a);
        assertSorted(a);
    }

    protected void assertSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            assertTrue(a[i - 1] <= a[i], "Array is not sorted at " + i);
        }
    }

    protected int[] generateSorted(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        return a;
    }

    protected int[] generateReverseSorted(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = n - i;
        }
        return a;
    }

    protected int[] generateRandom(int n) {
        Random r = new Random(42);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt();
        }
        return a;
    }
}
