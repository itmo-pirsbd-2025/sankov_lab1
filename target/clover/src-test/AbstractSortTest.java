/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */
import org.example.sort.SortAlgorithm;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public abstract class AbstractSortTest {static class __CLR4_5_27l7lmkbgfhs2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0041\u006c\u0065\u0078\u0073\u0061\u0037\u0031\u0036\u0031\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0420\u0430\u0431\u043e\u0447\u0438\u0439\u0020\u0441\u0442\u043e\u043b\u005c\u005c\u006a\u0061\u0076\u0061\u005f\u006c\u0061\u0062\u0073\u005c\u005c\u006c\u0061\u0062\u0031\u005c\u005c\u006c\u0061\u0062\u0031\u005f\u0073\u006f\u0072\u0074\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1768239981492L,8589935092L,342,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected abstract SortAlgorithm algorithm();

    @Test
    void testEmptyArray() {__CLR4_5_27l7lmkbgfhs2.R.globalSliceStart(getClass().getName(),273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26ec0mz7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27l7lmkbgfhs2.R.rethrow($CLV_t2$);}finally{__CLR4_5_27l7lmkbgfhs2.R.globalSliceEnd(getClass().getName(),"AbstractSortTest.testEmptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),273,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26ec0mz7l(){try{__CLR4_5_27l7lmkbgfhs2.R.inc(273);
        __CLR4_5_27l7lmkbgfhs2.R.inc(274);int[] a = new int[0];
        __CLR4_5_27l7lmkbgfhs2.R.inc(275);algorithm().sort(a);
        __CLR4_5_27l7lmkbgfhs2.R.inc(276);assertSorted(a);
    }finally{__CLR4_5_27l7lmkbgfhs2.R.flushNeeded();}}

    @Test
    void testSingleElement() {__CLR4_5_27l7lmkbgfhs2.R.globalSliceStart(getClass().getName(),277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yh57hl7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27l7lmkbgfhs2.R.rethrow($CLV_t2$);}finally{__CLR4_5_27l7lmkbgfhs2.R.globalSliceEnd(getClass().getName(),"AbstractSortTest.testSingleElement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),277,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yh57hl7p(){try{__CLR4_5_27l7lmkbgfhs2.R.inc(277);
        __CLR4_5_27l7lmkbgfhs2.R.inc(278);int[] a = {42};
        __CLR4_5_27l7lmkbgfhs2.R.inc(279);algorithm().sort(a);
        __CLR4_5_27l7lmkbgfhs2.R.inc(280);assertSorted(a);
    }finally{__CLR4_5_27l7lmkbgfhs2.R.flushNeeded();}}

    @Test
    void testAlreadySorted() {__CLR4_5_27l7lmkbgfhs2.R.globalSliceStart(getClass().getName(),281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_253r44q7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27l7lmkbgfhs2.R.rethrow($CLV_t2$);}finally{__CLR4_5_27l7lmkbgfhs2.R.globalSliceEnd(getClass().getName(),"AbstractSortTest.testAlreadySorted",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),281,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_253r44q7t(){try{__CLR4_5_27l7lmkbgfhs2.R.inc(281);
        __CLR4_5_27l7lmkbgfhs2.R.inc(282);int[] a = generateSorted(1000);
        __CLR4_5_27l7lmkbgfhs2.R.inc(283);algorithm().sort(a);
        __CLR4_5_27l7lmkbgfhs2.R.inc(284);assertSorted(a);
    }finally{__CLR4_5_27l7lmkbgfhs2.R.flushNeeded();}}

    @Test
    void testReverseSorted() {__CLR4_5_27l7lmkbgfhs2.R.globalSliceStart(getClass().getName(),285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ktwozw7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27l7lmkbgfhs2.R.rethrow($CLV_t2$);}finally{__CLR4_5_27l7lmkbgfhs2.R.globalSliceEnd(getClass().getName(),"AbstractSortTest.testReverseSorted",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),285,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ktwozw7x(){try{__CLR4_5_27l7lmkbgfhs2.R.inc(285);
        __CLR4_5_27l7lmkbgfhs2.R.inc(286);int[] a = generateReverseSorted(1000);
        __CLR4_5_27l7lmkbgfhs2.R.inc(287);algorithm().sort(a);
        __CLR4_5_27l7lmkbgfhs2.R.inc(288);assertSorted(a);
    }finally{__CLR4_5_27l7lmkbgfhs2.R.flushNeeded();}}

    @Test
    void testRandomArray() {__CLR4_5_27l7lmkbgfhs2.R.globalSliceStart(getClass().getName(),289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v6kwd181();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27l7lmkbgfhs2.R.rethrow($CLV_t2$);}finally{__CLR4_5_27l7lmkbgfhs2.R.globalSliceEnd(getClass().getName(),"AbstractSortTest.testRandomArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),289,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v6kwd181(){try{__CLR4_5_27l7lmkbgfhs2.R.inc(289);
        __CLR4_5_27l7lmkbgfhs2.R.inc(290);int[] a = generateRandom(10_000);
        __CLR4_5_27l7lmkbgfhs2.R.inc(291);algorithm().sort(a);
        __CLR4_5_27l7lmkbgfhs2.R.inc(292);assertSorted(a);
    }finally{__CLR4_5_27l7lmkbgfhs2.R.flushNeeded();}}

    @Test
    void testWithDuplicates() {__CLR4_5_27l7lmkbgfhs2.R.globalSliceStart(getClass().getName(),293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i0wkvb85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27l7lmkbgfhs2.R.rethrow($CLV_t2$);}finally{__CLR4_5_27l7lmkbgfhs2.R.globalSliceEnd(getClass().getName(),"AbstractSortTest.testWithDuplicates",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),293,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i0wkvb85(){try{__CLR4_5_27l7lmkbgfhs2.R.inc(293);
        __CLR4_5_27l7lmkbgfhs2.R.inc(294);int[] a = new int[10_000];
        __CLR4_5_27l7lmkbgfhs2.R.inc(295);Random r = new Random(1);
        __CLR4_5_27l7lmkbgfhs2.R.inc(296);for (int i = 0; (((i < a.length)&&(__CLR4_5_27l7lmkbgfhs2.R.iget(297)!=0|true))||(__CLR4_5_27l7lmkbgfhs2.R.iget(298)==0&false)); i++) {{
            __CLR4_5_27l7lmkbgfhs2.R.inc(299);a[i] = r.nextInt(10);
        }
        }__CLR4_5_27l7lmkbgfhs2.R.inc(300);algorithm().sort(a);
        __CLR4_5_27l7lmkbgfhs2.R.inc(301);assertSorted(a);
    }finally{__CLR4_5_27l7lmkbgfhs2.R.flushNeeded();}}

    @Test
    void testAlmostSorted() {__CLR4_5_27l7lmkbgfhs2.R.globalSliceStart(getClass().getName(),302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yc6hgk8e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27l7lmkbgfhs2.R.rethrow($CLV_t2$);}finally{__CLR4_5_27l7lmkbgfhs2.R.globalSliceEnd(getClass().getName(),"AbstractSortTest.testAlmostSorted",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),302,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yc6hgk8e(){try{__CLR4_5_27l7lmkbgfhs2.R.inc(302);
        __CLR4_5_27l7lmkbgfhs2.R.inc(303);int[] a = generateSorted(10_000);
        __CLR4_5_27l7lmkbgfhs2.R.inc(304);Random r = new Random(2);
        __CLR4_5_27l7lmkbgfhs2.R.inc(305);for (int i = 0; (((i < a.length / 100)&&(__CLR4_5_27l7lmkbgfhs2.R.iget(306)!=0|true))||(__CLR4_5_27l7lmkbgfhs2.R.iget(307)==0&false)); i++) {{
            __CLR4_5_27l7lmkbgfhs2.R.inc(308);int x = r.nextInt(a.length);
            __CLR4_5_27l7lmkbgfhs2.R.inc(309);int y = r.nextInt(a.length);
            __CLR4_5_27l7lmkbgfhs2.R.inc(310);int t = a[x];
            __CLR4_5_27l7lmkbgfhs2.R.inc(311);a[x] = a[y];
            __CLR4_5_27l7lmkbgfhs2.R.inc(312);a[y] = t;
        }
        }__CLR4_5_27l7lmkbgfhs2.R.inc(313);algorithm().sort(a);
        __CLR4_5_27l7lmkbgfhs2.R.inc(314);assertSorted(a);
    }finally{__CLR4_5_27l7lmkbgfhs2.R.flushNeeded();}}

    protected void assertSorted(int[] a) {try{__CLR4_5_27l7lmkbgfhs2.R.inc(315);
        __CLR4_5_27l7lmkbgfhs2.R.inc(316);for (int i = 1; (((i < a.length)&&(__CLR4_5_27l7lmkbgfhs2.R.iget(317)!=0|true))||(__CLR4_5_27l7lmkbgfhs2.R.iget(318)==0&false)); i++) {{
            __CLR4_5_27l7lmkbgfhs2.R.inc(319);assertTrue(a[i - 1] <= a[i], "Array is not sorted at " + i);
        }
    }}finally{__CLR4_5_27l7lmkbgfhs2.R.flushNeeded();}}

    protected int[] generateSorted(int n) {try{__CLR4_5_27l7lmkbgfhs2.R.inc(320);
        __CLR4_5_27l7lmkbgfhs2.R.inc(321);int[] a = new int[n];
        __CLR4_5_27l7lmkbgfhs2.R.inc(322);for (int i = 0; (((i < n)&&(__CLR4_5_27l7lmkbgfhs2.R.iget(323)!=0|true))||(__CLR4_5_27l7lmkbgfhs2.R.iget(324)==0&false)); i++) {{
            __CLR4_5_27l7lmkbgfhs2.R.inc(325);a[i] = i;
        }
        }__CLR4_5_27l7lmkbgfhs2.R.inc(326);return a;
    }finally{__CLR4_5_27l7lmkbgfhs2.R.flushNeeded();}}

    protected int[] generateReverseSorted(int n) {try{__CLR4_5_27l7lmkbgfhs2.R.inc(327);
        __CLR4_5_27l7lmkbgfhs2.R.inc(328);int[] a = new int[n];
        __CLR4_5_27l7lmkbgfhs2.R.inc(329);for (int i = 0; (((i < n)&&(__CLR4_5_27l7lmkbgfhs2.R.iget(330)!=0|true))||(__CLR4_5_27l7lmkbgfhs2.R.iget(331)==0&false)); i++) {{
            __CLR4_5_27l7lmkbgfhs2.R.inc(332);a[i] = n - i;
        }
        }__CLR4_5_27l7lmkbgfhs2.R.inc(333);return a;
    }finally{__CLR4_5_27l7lmkbgfhs2.R.flushNeeded();}}

    protected int[] generateRandom(int n) {try{__CLR4_5_27l7lmkbgfhs2.R.inc(334);
        __CLR4_5_27l7lmkbgfhs2.R.inc(335);Random r = new Random(42);
        __CLR4_5_27l7lmkbgfhs2.R.inc(336);int[] a = new int[n];
        __CLR4_5_27l7lmkbgfhs2.R.inc(337);for (int i = 0; (((i < n)&&(__CLR4_5_27l7lmkbgfhs2.R.iget(338)!=0|true))||(__CLR4_5_27l7lmkbgfhs2.R.iget(339)==0&false)); i++) {{
            __CLR4_5_27l7lmkbgfhs2.R.inc(340);a[i] = r.nextInt();
        }
        }__CLR4_5_27l7lmkbgfhs2.R.inc(341);return a;
    }finally{__CLR4_5_27l7lmkbgfhs2.R.flushNeeded();}}
}
