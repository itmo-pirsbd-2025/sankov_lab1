/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.example.sort;

public class NaiveQuickSort implements SortAlgorithm {public static class __CLR4_5_23030mkmv57qy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0041\u006c\u0065\u0078\u0073\u0061\u0037\u0031\u0036\u0031\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0420\u0430\u0431\u043e\u0447\u0438\u0439\u0020\u0441\u0442\u043e\u043b\u005c\u005c\u006a\u0061\u0076\u0061\u005f\u006c\u0061\u0062\u0073\u005c\u005c\u006c\u0061\u0062\u0031\u005c\u005c\u006c\u0061\u0062\u0031\u005f\u0073\u006f\u0072\u0074\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1768929824005L,8589935092L,141,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    public void sort(int[] arr) {try{__CLR4_5_23030mkmv57qy.R.inc(108);
        __CLR4_5_23030mkmv57qy.R.inc(109);qsort(arr, 0, arr.length - 1);
    }finally{__CLR4_5_23030mkmv57qy.R.flushNeeded();}}

    private void qsort(int[] arr, int left, int right) {try{__CLR4_5_23030mkmv57qy.R.inc(110);
        __CLR4_5_23030mkmv57qy.R.inc(111);if ((((left >= right)&&(__CLR4_5_23030mkmv57qy.R.iget(112)!=0|true))||(__CLR4_5_23030mkmv57qy.R.iget(113)==0&false))) {{
            __CLR4_5_23030mkmv57qy.R.inc(114);return;
        }

        }__CLR4_5_23030mkmv57qy.R.inc(115);int pivot = arr[left];
        __CLR4_5_23030mkmv57qy.R.inc(116);int i = left;
        __CLR4_5_23030mkmv57qy.R.inc(117);int j = right;

        __CLR4_5_23030mkmv57qy.R.inc(118);while ((((i <= j)&&(__CLR4_5_23030mkmv57qy.R.iget(119)!=0|true))||(__CLR4_5_23030mkmv57qy.R.iget(120)==0&false))) {{
            __CLR4_5_23030mkmv57qy.R.inc(121);while ((((arr[i] < pivot)&&(__CLR4_5_23030mkmv57qy.R.iget(122)!=0|true))||(__CLR4_5_23030mkmv57qy.R.iget(123)==0&false))) {{
                __CLR4_5_23030mkmv57qy.R.inc(124);i++;
            }
            }__CLR4_5_23030mkmv57qy.R.inc(125);while ((((arr[j] > pivot)&&(__CLR4_5_23030mkmv57qy.R.iget(126)!=0|true))||(__CLR4_5_23030mkmv57qy.R.iget(127)==0&false))) {{
                __CLR4_5_23030mkmv57qy.R.inc(128);j--;
            }

            }__CLR4_5_23030mkmv57qy.R.inc(129);if ((((i <= j)&&(__CLR4_5_23030mkmv57qy.R.iget(130)!=0|true))||(__CLR4_5_23030mkmv57qy.R.iget(131)==0&false))) {{
                __CLR4_5_23030mkmv57qy.R.inc(132);int buff = arr[i];
                __CLR4_5_23030mkmv57qy.R.inc(133);arr[i] = arr[j];
                __CLR4_5_23030mkmv57qy.R.inc(134);arr[j] = buff;
                __CLR4_5_23030mkmv57qy.R.inc(135);i++;
                __CLR4_5_23030mkmv57qy.R.inc(136);j--;
            }
        }}

        }__CLR4_5_23030mkmv57qy.R.inc(137);qsort(arr, left, j);
        __CLR4_5_23030mkmv57qy.R.inc(138);qsort(arr, i, right);
    }finally{__CLR4_5_23030mkmv57qy.R.flushNeeded();}}

    @Override
    public String name() {try{__CLR4_5_23030mkmv57qy.R.inc(139);
        __CLR4_5_23030mkmv57qy.R.inc(140);return "NaiveQuickSort";
    }finally{__CLR4_5_23030mkmv57qy.R.flushNeeded();}}
}
