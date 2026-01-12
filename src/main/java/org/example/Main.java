package org.example;

import org.example.sort.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    private static final int SIZE = 100_000_000;
    private static final int RUNS = 1;

    public static void main(String[] args) throws InterruptedException {
        List<SortAlgorithm> algorithms = List.of(
                new NaiveQuickSort(),
                new ImprovedQuickSort(),
                new OptimizedQuickSort()
        );

        int[] base = generateRandomArray(SIZE);

        System.out.println("Array size: " + SIZE);
        System.out.println("Measured runs: " + RUNS);
        System.out.println();

        for (SortAlgorithm algo : algorithms) {
            long total = 0;

            for (int i = 0; i < RUNS; i++) {
                int[] data = Arrays.copyOf(base, base.length);

                long start = System.nanoTime();
                algo.sort(data);
                long end = System.nanoTime();

                if (!isSorted(data)) {
                    throw new IllegalStateException(algo.name() + " produced unsorted array");
                }

                long time = end - start;
                total += time;
            }

            double avgMs = total / 1_000_000.0 / RUNS;
            System.out.printf("%-20s : %.3f ms%n", algo.name(), avgMs);

            Thread.sleep(30_000);
        }
    }

    private static int[] generateRandomArray(int size) {
        Random rnd = new Random(42);
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = rnd.nextInt();
        }
        return a;
    }

    private static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) return false;
        }
        return true;
    }
}
