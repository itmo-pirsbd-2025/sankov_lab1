/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */import org.example.sort.SortAlgorithm;
import org.junit.jupiter.api.Test;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public abstract class AbstractSortTest {static class __CLR4_5_25f5fmkmv57tk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0041\u006c\u0065\u0078\u0073\u0061\u0037\u0031\u0036\u0031\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0420\u0430\u0431\u043e\u0447\u0438\u0439\u0020\u0441\u0442\u043e\u043b\u005c\u005c\u006a\u0061\u0076\u0061\u005f\u006c\u0061\u0062\u0073\u005c\u005c\u006c\u0061\u0062\u0031\u005c\u005c\u006c\u0061\u0062\u0031\u005f\u0073\u006f\u0072\u0074\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1768929824200L,8589935092L,267,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected abstract SortAlgorithm getSort();

    @Test
    void empty() {__CLR4_5_25f5fmkmv57tk.R.globalSliceStart(getClass().getName(),195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g4yvp05f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_25f5fmkmv57tk.R.rethrow($CLV_t2$);}finally{__CLR4_5_25f5fmkmv57tk.R.globalSliceEnd(getClass().getName(),"AbstractSortTest.empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),195,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g4yvp05f(){try{__CLR4_5_25f5fmkmv57tk.R.inc(195);
        __CLR4_5_25f5fmkmv57tk.R.inc(196);int[] arr = {};
        __CLR4_5_25f5fmkmv57tk.R.inc(197);getSort().sort(arr);
        __CLR4_5_25f5fmkmv57tk.R.inc(198);assertSorted(arr);
    }finally{__CLR4_5_25f5fmkmv57tk.R.flushNeeded();}}

    @Test
    void oneElement() {__CLR4_5_25f5fmkmv57tk.R.globalSliceStart(getClass().getName(),199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oxomgz5j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_25f5fmkmv57tk.R.rethrow($CLV_t2$);}finally{__CLR4_5_25f5fmkmv57tk.R.globalSliceEnd(getClass().getName(),"AbstractSortTest.oneElement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),199,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oxomgz5j(){try{__CLR4_5_25f5fmkmv57tk.R.inc(199);
        __CLR4_5_25f5fmkmv57tk.R.inc(200);int[] arr = {42};
        __CLR4_5_25f5fmkmv57tk.R.inc(201);getSort().sort(arr);
        __CLR4_5_25f5fmkmv57tk.R.inc(202);assertSorted(arr);
    }finally{__CLR4_5_25f5fmkmv57tk.R.flushNeeded();}}

    @Test
    void sorted() {__CLR4_5_25f5fmkmv57tk.R.globalSliceStart(getClass().getName(),203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21o61d05n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_25f5fmkmv57tk.R.rethrow($CLV_t2$);}finally{__CLR4_5_25f5fmkmv57tk.R.globalSliceEnd(getClass().getName(),"AbstractSortTest.sorted",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),203,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21o61d05n(){try{__CLR4_5_25f5fmkmv57tk.R.inc(203);
        __CLR4_5_25f5fmkmv57tk.R.inc(204);int[] arr = sortedArray(1000);
        __CLR4_5_25f5fmkmv57tk.R.inc(205);getSort().sort(arr);
        __CLR4_5_25f5fmkmv57tk.R.inc(206);assertSorted(arr);
    }finally{__CLR4_5_25f5fmkmv57tk.R.flushNeeded();}}

    @Test
    void reverse() {__CLR4_5_25f5fmkmv57tk.R.globalSliceStart(getClass().getName(),207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rjdlux5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_25f5fmkmv57tk.R.rethrow($CLV_t2$);}finally{__CLR4_5_25f5fmkmv57tk.R.globalSliceEnd(getClass().getName(),"AbstractSortTest.reverse",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),207,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rjdlux5r(){try{__CLR4_5_25f5fmkmv57tk.R.inc(207);
        __CLR4_5_25f5fmkmv57tk.R.inc(208);int[] arr = reverseArray(1000);
        __CLR4_5_25f5fmkmv57tk.R.inc(209);getSort().sort(arr);
        __CLR4_5_25f5fmkmv57tk.R.inc(210);assertSorted(arr);
    }finally{__CLR4_5_25f5fmkmv57tk.R.flushNeeded();}}

    @Test
    void random() {__CLR4_5_25f5fmkmv57tk.R.globalSliceStart(getClass().getName(),211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xe761i5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_25f5fmkmv57tk.R.rethrow($CLV_t2$);}finally{__CLR4_5_25f5fmkmv57tk.R.globalSliceEnd(getClass().getName(),"AbstractSortTest.random",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),211,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xe761i5v(){try{__CLR4_5_25f5fmkmv57tk.R.inc(211);
        __CLR4_5_25f5fmkmv57tk.R.inc(212);int[] arr = randArray(10000);
        __CLR4_5_25f5fmkmv57tk.R.inc(213);getSort().sort(arr);
        __CLR4_5_25f5fmkmv57tk.R.inc(214);assertSorted(arr);
    }finally{__CLR4_5_25f5fmkmv57tk.R.flushNeeded();}}

    @Test
    void duplicates() {__CLR4_5_25f5fmkmv57tk.R.globalSliceStart(getClass().getName(),215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21706xb5z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_25f5fmkmv57tk.R.rethrow($CLV_t2$);}finally{__CLR4_5_25f5fmkmv57tk.R.globalSliceEnd(getClass().getName(),"AbstractSortTest.duplicates",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),215,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21706xb5z(){try{__CLR4_5_25f5fmkmv57tk.R.inc(215);
        __CLR4_5_25f5fmkmv57tk.R.inc(216);int[] arr = new int[10000];
        __CLR4_5_25f5fmkmv57tk.R.inc(217);Random r = new Random(1);
        __CLR4_5_25f5fmkmv57tk.R.inc(218);for (int i = 0; (((i < arr.length)&&(__CLR4_5_25f5fmkmv57tk.R.iget(219)!=0|true))||(__CLR4_5_25f5fmkmv57tk.R.iget(220)==0&false)); i++) {{
            __CLR4_5_25f5fmkmv57tk.R.inc(221);arr[i] = r.nextInt(10);
        }
        }__CLR4_5_25f5fmkmv57tk.R.inc(222);getSort().sort(arr);
        __CLR4_5_25f5fmkmv57tk.R.inc(223);assertSorted(arr);
    }finally{__CLR4_5_25f5fmkmv57tk.R.flushNeeded();}}

    @Test
    void almostSorted() {__CLR4_5_25f5fmkmv57tk.R.globalSliceStart(getClass().getName(),224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yeg51q68();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_25f5fmkmv57tk.R.rethrow($CLV_t2$);}finally{__CLR4_5_25f5fmkmv57tk.R.globalSliceEnd(getClass().getName(),"AbstractSortTest.almostSorted",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),224,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yeg51q68(){try{__CLR4_5_25f5fmkmv57tk.R.inc(224);
        __CLR4_5_25f5fmkmv57tk.R.inc(225);int[] arr = sortedArray(10000);
        __CLR4_5_25f5fmkmv57tk.R.inc(226);Random r = new Random(2);
        // \u043c\u0435\u0448\u0430\u0435\u043c 1% \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u0432
        __CLR4_5_25f5fmkmv57tk.R.inc(227);for (int i = 0; (((i < arr.length / 100)&&(__CLR4_5_25f5fmkmv57tk.R.iget(228)!=0|true))||(__CLR4_5_25f5fmkmv57tk.R.iget(229)==0&false)); i++) {{
            __CLR4_5_25f5fmkmv57tk.R.inc(230);int x = r.nextInt(arr.length);
            __CLR4_5_25f5fmkmv57tk.R.inc(231);int y = r.nextInt(arr.length);
            __CLR4_5_25f5fmkmv57tk.R.inc(232);int tmp = arr[x]; __CLR4_5_25f5fmkmv57tk.R.inc(233);arr[x] = arr[y]; __CLR4_5_25f5fmkmv57tk.R.inc(234);arr[y] = tmp;
        }
        }__CLR4_5_25f5fmkmv57tk.R.inc(235);getSort().sort(arr);
        __CLR4_5_25f5fmkmv57tk.R.inc(236);assertSorted(arr);
    }finally{__CLR4_5_25f5fmkmv57tk.R.flushNeeded();}}

    private void assertSorted(int[] arr) {try{__CLR4_5_25f5fmkmv57tk.R.inc(237);
        __CLR4_5_25f5fmkmv57tk.R.inc(238);for (int i = 1; (((i < arr.length)&&(__CLR4_5_25f5fmkmv57tk.R.iget(239)!=0|true))||(__CLR4_5_25f5fmkmv57tk.R.iget(240)==0&false)); i++) {{
            __CLR4_5_25f5fmkmv57tk.R.inc(241);if ((((arr[i-1] > arr[i])&&(__CLR4_5_25f5fmkmv57tk.R.iget(242)!=0|true))||(__CLR4_5_25f5fmkmv57tk.R.iget(243)==0&false))) {{
                __CLR4_5_25f5fmkmv57tk.R.inc(244);fail("\u043d\u0435 \u043e\u0442\u0441\u043e\u0440\u0442\u0438\u0440\u043e\u0432\u0430\u043d\u043e \u043d\u0430 \u043f\u043e\u0437\u0438\u0446\u0438\u0438 " + i);
            }
        }}
    }}finally{__CLR4_5_25f5fmkmv57tk.R.flushNeeded();}}

    private int[] sortedArray(int n) {try{__CLR4_5_25f5fmkmv57tk.R.inc(245);
        __CLR4_5_25f5fmkmv57tk.R.inc(246);int[] arr = new int[n];
        __CLR4_5_25f5fmkmv57tk.R.inc(247);for (int i = 0; (((i < n)&&(__CLR4_5_25f5fmkmv57tk.R.iget(248)!=0|true))||(__CLR4_5_25f5fmkmv57tk.R.iget(249)==0&false)); i++) {__CLR4_5_25f5fmkmv57tk.R.inc(250);arr[i] = i;
        }__CLR4_5_25f5fmkmv57tk.R.inc(251);return arr;
    }finally{__CLR4_5_25f5fmkmv57tk.R.flushNeeded();}}

    private int[] reverseArray(int n) {try{__CLR4_5_25f5fmkmv57tk.R.inc(252);
        __CLR4_5_25f5fmkmv57tk.R.inc(253);int[] arr = new int[n];
        __CLR4_5_25f5fmkmv57tk.R.inc(254);for (int i = 0; (((i < n)&&(__CLR4_5_25f5fmkmv57tk.R.iget(255)!=0|true))||(__CLR4_5_25f5fmkmv57tk.R.iget(256)==0&false)); i++) {__CLR4_5_25f5fmkmv57tk.R.inc(257);arr[i] = n - 1 - i;
        }__CLR4_5_25f5fmkmv57tk.R.inc(258);return arr;
    }finally{__CLR4_5_25f5fmkmv57tk.R.flushNeeded();}}

    private int[] randArray(int n) {try{__CLR4_5_25f5fmkmv57tk.R.inc(259);
        __CLR4_5_25f5fmkmv57tk.R.inc(260);Random r = new Random(42);
        __CLR4_5_25f5fmkmv57tk.R.inc(261);int[] arr = new int[n];
        __CLR4_5_25f5fmkmv57tk.R.inc(262);for (int i = 0; (((i < n)&&(__CLR4_5_25f5fmkmv57tk.R.iget(263)!=0|true))||(__CLR4_5_25f5fmkmv57tk.R.iget(264)==0&false)); i++) {__CLR4_5_25f5fmkmv57tk.R.inc(265);arr[i] = r.nextInt();
        }__CLR4_5_25f5fmkmv57tk.R.inc(266);return arr;
    }finally{__CLR4_5_25f5fmkmv57tk.R.flushNeeded();}}
}
