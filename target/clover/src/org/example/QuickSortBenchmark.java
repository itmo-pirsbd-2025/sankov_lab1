/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.example;

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
public class QuickSortBenchmark {public static class __CLR4_5_21414mkmv57qd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0041\u006c\u0065\u0078\u0073\u0061\u0037\u0031\u0036\u0031\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0420\u0430\u0431\u043e\u0447\u0438\u0439\u0020\u0441\u0442\u043e\u043b\u005c\u005c\u006a\u0061\u0076\u0061\u005f\u006c\u0061\u0062\u0073\u005c\u005c\u006c\u0061\u0062\u0031\u005c\u005c\u006c\u0061\u0062\u0031\u005f\u0073\u006f\u0072\u0074\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1768929824005L,8589935092L,54,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Param({"1e5", "5e5", "1e6"})
    private int n;

    private int[] data;
    private final NaiveQuickSort naive = new NaiveQuickSort();
    private final ImprovedQuickSort imp = new ImprovedQuickSort();
    private final OptimizedQuickSort opt = new OptimizedQuickSort();

    @Setup(Level.Invocation)
    public void setup() {try{__CLR4_5_21414mkmv57qd.R.inc(40);
        __CLR4_5_21414mkmv57qd.R.inc(41);Random r = new Random(42);
        __CLR4_5_21414mkmv57qd.R.inc(42);data = r.ints(n, 0, 1000000).toArray();
    }finally{__CLR4_5_21414mkmv57qd.R.flushNeeded();}}

    @Benchmark public void naive() {try{__CLR4_5_21414mkmv57qd.R.inc(43);
        __CLR4_5_21414mkmv57qd.R.inc(44);int[] arr = Arrays.copyOf(data, n);
        __CLR4_5_21414mkmv57qd.R.inc(45);naive.sort(arr);
    }finally{__CLR4_5_21414mkmv57qd.R.flushNeeded();}}

    @Benchmark public void imp() {try{__CLR4_5_21414mkmv57qd.R.inc(46);
        __CLR4_5_21414mkmv57qd.R.inc(47);int[] arr = Arrays.copyOf(data, n);
        __CLR4_5_21414mkmv57qd.R.inc(48);imp.sort(arr);
    }finally{__CLR4_5_21414mkmv57qd.R.flushNeeded();}}

    @Benchmark public void opt() {try{__CLR4_5_21414mkmv57qd.R.inc(49);
        __CLR4_5_21414mkmv57qd.R.inc(50);int[] arr = Arrays.copyOf(data, n);
        __CLR4_5_21414mkmv57qd.R.inc(51);opt.sort(arr);
    }finally{__CLR4_5_21414mkmv57qd.R.flushNeeded();}}

    public static void main(String[] args) throws Exception {try{__CLR4_5_21414mkmv57qd.R.inc(52);
        __CLR4_5_21414mkmv57qd.R.inc(53);new Runner(new OptionsBuilder()
                .include(QuickSortBenchmark.class.getSimpleName())
                .forks(1)
                .warmupIterations(2)
                .measurementIterations(3)
                .build()).run();
    }finally{__CLR4_5_21414mkmv57qd.R.flushNeeded();}}
}
