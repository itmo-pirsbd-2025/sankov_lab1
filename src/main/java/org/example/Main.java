package org.example;

import org.example.sort.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    private static final int N = 100_000_000;
    private static final int ROUNDS = 1;

    public static void main(String[] args) throws InterruptedException {
        List<SortAlgorithm> sorts = List.of(
                new NaiveQuickSort(),
                new ImprovedQuickSort(),
                new OptimizedQuickSort()
        );

        int[] arr = randArray(N);

        System.out.println("размер: " + N);
        System.out.println("повторов: " + ROUNDS);
        System.out.println();

        for (SortAlgorithm s : sorts) {
            long totalTime = 0;

            for (int r = 0; r < ROUNDS; r++) {
                int[] copy = Arrays.copyOf(arr, arr.length);

                long t1 = System.nanoTime();
                s.sort(copy);
                long t2 = System.nanoTime();

                if (!sorted(copy)) {
                    throw new RuntimeException(s.name() + " сломался");
                }

                totalTime += t2 - t1;
            }

            double ms = totalTime / 1e6 / ROUNDS;
            System.out.printf("%-18s : %.2f ms\n", s.name(), ms);

            Thread.sleep(30000); // остудить CPU + для показательности на профилировании
        }
    }

    private static int[] randArray(int n) {
        Random r = new Random(42);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt();
        }
        return a;
    }

    private static boolean sorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i-1] > a[i]) return false;
        }
        return true;
    }
}
