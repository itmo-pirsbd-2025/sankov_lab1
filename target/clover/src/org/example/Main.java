/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.example;

import org.example.sort.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {public static class __CLR4_5_200mkmv57pg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0041\u006c\u0065\u0078\u0073\u0061\u0037\u0031\u0036\u0031\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0420\u0430\u0431\u043e\u0447\u0438\u0439\u0020\u0441\u0442\u043e\u043b\u005c\u005c\u006a\u0061\u0076\u0061\u005f\u006c\u0061\u0062\u0073\u005c\u005c\u006c\u0061\u0062\u0031\u005c\u005c\u006c\u0061\u0062\u0031\u005f\u0073\u006f\u0072\u0074\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1768929824005L,8589935092L,40,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int N = 100_000_000;
    private static final int ROUNDS = 1;

    public static void main(String[] args) throws InterruptedException {try{__CLR4_5_200mkmv57pg.R.inc(0);
        __CLR4_5_200mkmv57pg.R.inc(1);List<SortAlgorithm> sorts = List.of(
                new NaiveQuickSort(),
                new ImprovedQuickSort(),
                new OptimizedQuickSort()
        );

        __CLR4_5_200mkmv57pg.R.inc(2);int[] arr = randArray(N);

        __CLR4_5_200mkmv57pg.R.inc(3);System.out.println("\u0440\u0430\u0437\u043c\u0435\u0440: " + N);
        __CLR4_5_200mkmv57pg.R.inc(4);System.out.println("\u043f\u043e\u0432\u0442\u043e\u0440\u043e\u0432: " + ROUNDS);
        __CLR4_5_200mkmv57pg.R.inc(5);System.out.println();

        __CLR4_5_200mkmv57pg.R.inc(6);for (SortAlgorithm s : sorts) {{
            __CLR4_5_200mkmv57pg.R.inc(7);long totalTime = 0;

            __CLR4_5_200mkmv57pg.R.inc(8);for (int r = 0; (((r < ROUNDS)&&(__CLR4_5_200mkmv57pg.R.iget(9)!=0|true))||(__CLR4_5_200mkmv57pg.R.iget(10)==0&false)); r++) {{
                __CLR4_5_200mkmv57pg.R.inc(11);int[] copy = Arrays.copyOf(arr, arr.length);

                __CLR4_5_200mkmv57pg.R.inc(12);long t1 = System.nanoTime();
                __CLR4_5_200mkmv57pg.R.inc(13);s.sort(copy);
                __CLR4_5_200mkmv57pg.R.inc(14);long t2 = System.nanoTime();

                __CLR4_5_200mkmv57pg.R.inc(15);if ((((!sorted(copy))&&(__CLR4_5_200mkmv57pg.R.iget(16)!=0|true))||(__CLR4_5_200mkmv57pg.R.iget(17)==0&false))) {{
                    __CLR4_5_200mkmv57pg.R.inc(18);throw new RuntimeException(s.name() + " \u0441\u043b\u043e\u043c\u0430\u043b\u0441\u044f");
                }

                }__CLR4_5_200mkmv57pg.R.inc(19);totalTime += t2 - t1;
            }

            }__CLR4_5_200mkmv57pg.R.inc(20);double ms = totalTime / 1e6 / ROUNDS;
            __CLR4_5_200mkmv57pg.R.inc(21);System.out.printf("%-18s : %.2f ms\n", s.name(), ms);

            __CLR4_5_200mkmv57pg.R.inc(22);Thread.sleep(30000); // \u043e\u0441\u0442\u0443\u0434\u0438\u0442\u044c CPU + \u0434\u043b\u044f \u043f\u043e\u043a\u0430\u0437\u0430\u0442\u0435\u043b\u044c\u043d\u043e\u0441\u0442\u0438 \u043d\u0430 \u043f\u0440\u043e\u0444\u0438\u043b\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0438
        }
    }}finally{__CLR4_5_200mkmv57pg.R.flushNeeded();}}

    private static int[] randArray(int n) {try{__CLR4_5_200mkmv57pg.R.inc(23);
        __CLR4_5_200mkmv57pg.R.inc(24);Random r = new Random(42);
        __CLR4_5_200mkmv57pg.R.inc(25);int[] a = new int[n];
        __CLR4_5_200mkmv57pg.R.inc(26);for (int i = 0; (((i < n)&&(__CLR4_5_200mkmv57pg.R.iget(27)!=0|true))||(__CLR4_5_200mkmv57pg.R.iget(28)==0&false)); i++) {{
            __CLR4_5_200mkmv57pg.R.inc(29);a[i] = r.nextInt();
        }
        }__CLR4_5_200mkmv57pg.R.inc(30);return a;
    }finally{__CLR4_5_200mkmv57pg.R.flushNeeded();}}

    private static boolean sorted(int[] a) {try{__CLR4_5_200mkmv57pg.R.inc(31);
        __CLR4_5_200mkmv57pg.R.inc(32);for (int i = 1; (((i < a.length)&&(__CLR4_5_200mkmv57pg.R.iget(33)!=0|true))||(__CLR4_5_200mkmv57pg.R.iget(34)==0&false)); i++) {{
            __CLR4_5_200mkmv57pg.R.inc(35);if ((((a[i-1] > a[i])&&(__CLR4_5_200mkmv57pg.R.iget(36)!=0|true))||(__CLR4_5_200mkmv57pg.R.iget(37)==0&false))) {__CLR4_5_200mkmv57pg.R.inc(38);return false;
        }}
        }__CLR4_5_200mkmv57pg.R.inc(39);return true;
    }finally{__CLR4_5_200mkmv57pg.R.flushNeeded();}}
}
