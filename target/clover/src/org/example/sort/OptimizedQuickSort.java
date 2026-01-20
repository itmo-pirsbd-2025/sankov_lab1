/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.example.sort;

public class OptimizedQuickSort implements SortAlgorithm {public static class __CLR4_5_23x3xmkmv57r9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0041\u006c\u0065\u0078\u0073\u0061\u0037\u0031\u0036\u0031\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0420\u0430\u0431\u043e\u0447\u0438\u0439\u0020\u0441\u0442\u043e\u043b\u005c\u005c\u006a\u0061\u0076\u0061\u005f\u006c\u0061\u0062\u0073\u005c\u005c\u006c\u0061\u0062\u0031\u005c\u005c\u006c\u0061\u0062\u0031\u005f\u0073\u006f\u0072\u0074\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1768929824005L,8589935092L,195,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    public void sort(int[] arr) {try{__CLR4_5_23x3xmkmv57r9.R.inc(141);
        __CLR4_5_23x3xmkmv57r9.R.inc(142);qsort(arr, 0, arr.length - 1);
    }finally{__CLR4_5_23x3xmkmv57r9.R.flushNeeded();}}

    private void qsort(int[] arr, int left, int right) {try{__CLR4_5_23x3xmkmv57r9.R.inc(143);
        __CLR4_5_23x3xmkmv57r9.R.inc(144);while ((((left < right)&&(__CLR4_5_23x3xmkmv57r9.R.iget(145)!=0|true))||(__CLR4_5_23x3xmkmv57r9.R.iget(146)==0&false))) {{
            __CLR4_5_23x3xmkmv57r9.R.inc(147);int pivot = medianOfThree(arr, left, right);
            __CLR4_5_23x3xmkmv57r9.R.inc(148);int i = left;
            __CLR4_5_23x3xmkmv57r9.R.inc(149);int j = right;

            __CLR4_5_23x3xmkmv57r9.R.inc(150);while ((((i <= j)&&(__CLR4_5_23x3xmkmv57r9.R.iget(151)!=0|true))||(__CLR4_5_23x3xmkmv57r9.R.iget(152)==0&false))) {{
                __CLR4_5_23x3xmkmv57r9.R.inc(153);while ((((arr[i] < pivot)&&(__CLR4_5_23x3xmkmv57r9.R.iget(154)!=0|true))||(__CLR4_5_23x3xmkmv57r9.R.iget(155)==0&false))) {__CLR4_5_23x3xmkmv57r9.R.inc(156);i++;
                }__CLR4_5_23x3xmkmv57r9.R.inc(157);while ((((arr[j] > pivot)&&(__CLR4_5_23x3xmkmv57r9.R.iget(158)!=0|true))||(__CLR4_5_23x3xmkmv57r9.R.iget(159)==0&false))) {__CLR4_5_23x3xmkmv57r9.R.inc(160);j--;

                }__CLR4_5_23x3xmkmv57r9.R.inc(161);if ((((i <= j)&&(__CLR4_5_23x3xmkmv57r9.R.iget(162)!=0|true))||(__CLR4_5_23x3xmkmv57r9.R.iget(163)==0&false))) {{
                    __CLR4_5_23x3xmkmv57r9.R.inc(164);swap(arr, i, j);
                    __CLR4_5_23x3xmkmv57r9.R.inc(165);i++;
                    __CLR4_5_23x3xmkmv57r9.R.inc(166);j--;
                }
            }}

            }__CLR4_5_23x3xmkmv57r9.R.inc(167);if ((((j - left < right - i)&&(__CLR4_5_23x3xmkmv57r9.R.iget(168)!=0|true))||(__CLR4_5_23x3xmkmv57r9.R.iget(169)==0&false))) {{
                __CLR4_5_23x3xmkmv57r9.R.inc(170);qsort(arr, left, j);
                __CLR4_5_23x3xmkmv57r9.R.inc(171);left = i;
            } }else {{
                __CLR4_5_23x3xmkmv57r9.R.inc(172);qsort(arr, i, right);
                __CLR4_5_23x3xmkmv57r9.R.inc(173);right = j;
            }
        }}
    }}finally{__CLR4_5_23x3xmkmv57r9.R.flushNeeded();}}

    private int medianOfThree(int[] arr, int left, int right) {try{__CLR4_5_23x3xmkmv57r9.R.inc(174);
        __CLR4_5_23x3xmkmv57r9.R.inc(175);int mid = (left + right) >>> 1;

        __CLR4_5_23x3xmkmv57r9.R.inc(176);if ((((arr[left] > arr[mid])&&(__CLR4_5_23x3xmkmv57r9.R.iget(177)!=0|true))||(__CLR4_5_23x3xmkmv57r9.R.iget(178)==0&false))) {__CLR4_5_23x3xmkmv57r9.R.inc(179);swap(arr, left, mid);
        }__CLR4_5_23x3xmkmv57r9.R.inc(180);if ((((arr[left] > arr[right])&&(__CLR4_5_23x3xmkmv57r9.R.iget(181)!=0|true))||(__CLR4_5_23x3xmkmv57r9.R.iget(182)==0&false))) {__CLR4_5_23x3xmkmv57r9.R.inc(183);swap(arr, left, right);
        }__CLR4_5_23x3xmkmv57r9.R.inc(184);if ((((arr[mid] > arr[right])&&(__CLR4_5_23x3xmkmv57r9.R.iget(185)!=0|true))||(__CLR4_5_23x3xmkmv57r9.R.iget(186)==0&false))) {__CLR4_5_23x3xmkmv57r9.R.inc(187);swap(arr, mid, right);

        }__CLR4_5_23x3xmkmv57r9.R.inc(188);return arr[mid];
    }finally{__CLR4_5_23x3xmkmv57r9.R.flushNeeded();}}

    private void swap(int[] arr, int i, int j) {try{__CLR4_5_23x3xmkmv57r9.R.inc(189);
        __CLR4_5_23x3xmkmv57r9.R.inc(190);int buff = arr[i];
        __CLR4_5_23x3xmkmv57r9.R.inc(191);arr[i] = arr[j];
        __CLR4_5_23x3xmkmv57r9.R.inc(192);arr[j] = buff;
    }finally{__CLR4_5_23x3xmkmv57r9.R.flushNeeded();}}

    @Override
    public String name() {try{__CLR4_5_23x3xmkmv57r9.R.inc(193);
        __CLR4_5_23x3xmkmv57r9.R.inc(194);return "OptimizedQuickSort";
    }finally{__CLR4_5_23x3xmkmv57r9.R.flushNeeded();}}
}
