package org.example;

import org.example.sort.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 2, time = 1)
@Measurement(iterations = 3, time = 1)
@State(Scope.Thread)
@Fork(1)
public class QuickSortBenchmark {

    @Param({"1e5", "5e5", "1e6"})
    private int n;

    private int[] data;
    private final NaiveQuickSort naive = new NaiveQuickSort();
    private final ImprovedQuickSort imp = new ImprovedQuickSort();
    private final OptimizedQuickSort opt = new OptimizedQuickSort();

    @Setup(Level.Invocation)
    public void setup() {
        Random r = new Random(42);
        data = r.ints(n, 0, 1000000).toArray();
    }

    @Benchmark public void naive() {
        int[] arr = Arrays.copyOf(data, n);
        naive.sort(arr);
    }

    @Benchmark public void imp() {
        int[] arr = Arrays.copyOf(data, n);
        imp.sort(arr);
    }

    @Benchmark public void opt() {
        int[] arr = Arrays.copyOf(data, n);
        opt.sort(arr);
    }

    public static void main(String[] args) throws Exception {
        new Runner(new OptionsBuilder()
                .include(QuickSortBenchmark.class.getSimpleName())
                .forks(1)
                .warmupIterations(2)
                .measurementIterations(3)
                .build()).run();
    }
}
