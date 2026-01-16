package org.example;

import org.example.sort.NaiveQuickSort;
import org.example.sort.ImprovedQuickSort;
import org.example.sort.OptimizedQuickSort;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.Arrays;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 2, time = 1)
@Measurement(iterations = 3, time = 1)
@State(Scope.Thread)
@Fork(value = 1)
public class QuickSortBenchmark {

    private int[] array;
    private final NaiveQuickSort naiveSorter = new NaiveQuickSort();
    private final ImprovedQuickSort improvedSorter = new ImprovedQuickSort();
    private final OptimizedQuickSort optimizedSorter = new OptimizedQuickSort();

    @Param({"100000", "500000", "1000000"})
    private int size;

    @Setup(Level.Invocation)
    public void setUp() {
        Random random = new Random(42);
        array = random.ints(size, 0, 1_000_000).toArray();
    }
    @Benchmark
    public void benchmark1_naive() {
        int[] copy = Arrays.copyOf(array, array.length);
        naiveSorter.sort(copy);
    }

    @Benchmark
    public void benchmark2_improved() {
        int[] copy = Arrays.copyOf(array, array.length);
        improvedSorter.sort(copy);
    }

    @Benchmark
    public void benchmark3_optimized() {
        int[] copy = Arrays.copyOf(array, array.length);
        optimizedSorter.sort(copy);
    }

    public static void main(String[] args) throws Exception {
        Options opt = new OptionsBuilder()
                .include(QuickSortBenchmark.class.getSimpleName())
                .forks(1)
                .warmupIterations(2)
                .measurementIterations(3)
                .build();

        new Runner(opt).run();
    }
}
