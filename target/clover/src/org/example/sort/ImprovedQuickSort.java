/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.example.sort;

public class ImprovedQuickSort implements SortAlgorithm {public static class __CLR4_5_21k1kmkbgfhp7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0041\u006c\u0065\u0078\u0073\u0061\u0037\u0031\u0036\u0031\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0420\u0430\u0431\u043e\u0447\u0438\u0439\u0020\u0441\u0442\u043e\u043b\u005c\u005c\u006a\u0061\u0076\u0061\u005f\u006c\u0061\u0062\u0073\u005c\u005c\u006c\u0061\u0062\u0031\u005c\u005c\u006c\u0061\u0062\u0031\u005f\u0073\u006f\u0072\u0074\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1768239981297L,8589935092L,112,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    public void sort(int[] array) {try{__CLR4_5_21k1kmkbgfhp7.R.inc(56);
        __CLR4_5_21k1kmkbgfhp7.R.inc(57);quickSort(array, 0, array.length - 1);
    }finally{__CLR4_5_21k1kmkbgfhp7.R.flushNeeded();}}

    private void quickSort(int[] a, int l, int r) {try{__CLR4_5_21k1kmkbgfhp7.R.inc(58);
        __CLR4_5_21k1kmkbgfhp7.R.inc(59);while ((((l < r)&&(__CLR4_5_21k1kmkbgfhp7.R.iget(60)!=0|true))||(__CLR4_5_21k1kmkbgfhp7.R.iget(61)==0&false))) {{
            __CLR4_5_21k1kmkbgfhp7.R.inc(62);int pivot = medianOfThree(a, l, r);
            __CLR4_5_21k1kmkbgfhp7.R.inc(63);int i = l;
            __CLR4_5_21k1kmkbgfhp7.R.inc(64);int j = r;

            __CLR4_5_21k1kmkbgfhp7.R.inc(65);while ((((i <= j)&&(__CLR4_5_21k1kmkbgfhp7.R.iget(66)!=0|true))||(__CLR4_5_21k1kmkbgfhp7.R.iget(67)==0&false))) {{
                __CLR4_5_21k1kmkbgfhp7.R.inc(68);while ((((a[i] < pivot)&&(__CLR4_5_21k1kmkbgfhp7.R.iget(69)!=0|true))||(__CLR4_5_21k1kmkbgfhp7.R.iget(70)==0&false))) {__CLR4_5_21k1kmkbgfhp7.R.inc(71);i++;
                }__CLR4_5_21k1kmkbgfhp7.R.inc(72);while ((((a[j] > pivot)&&(__CLR4_5_21k1kmkbgfhp7.R.iget(73)!=0|true))||(__CLR4_5_21k1kmkbgfhp7.R.iget(74)==0&false))) {__CLR4_5_21k1kmkbgfhp7.R.inc(75);j--;
                }__CLR4_5_21k1kmkbgfhp7.R.inc(76);if ((((i <= j)&&(__CLR4_5_21k1kmkbgfhp7.R.iget(77)!=0|true))||(__CLR4_5_21k1kmkbgfhp7.R.iget(78)==0&false))) {{
                    __CLR4_5_21k1kmkbgfhp7.R.inc(79);int tmp = a[i];
                    __CLR4_5_21k1kmkbgfhp7.R.inc(80);a[i] = a[j];
                    __CLR4_5_21k1kmkbgfhp7.R.inc(81);a[j] = tmp;
                    __CLR4_5_21k1kmkbgfhp7.R.inc(82);i++;
                    __CLR4_5_21k1kmkbgfhp7.R.inc(83);j--;
                }
            }}

            }__CLR4_5_21k1kmkbgfhp7.R.inc(84);if ((((j - l < r - i)&&(__CLR4_5_21k1kmkbgfhp7.R.iget(85)!=0|true))||(__CLR4_5_21k1kmkbgfhp7.R.iget(86)==0&false))) {{
                __CLR4_5_21k1kmkbgfhp7.R.inc(87);quickSort(a, l, j);
                __CLR4_5_21k1kmkbgfhp7.R.inc(88);l = i;
            } }else {{
                __CLR4_5_21k1kmkbgfhp7.R.inc(89);quickSort(a, i, r);
                __CLR4_5_21k1kmkbgfhp7.R.inc(90);r = j;
            }
        }}
    }}finally{__CLR4_5_21k1kmkbgfhp7.R.flushNeeded();}}

    private int medianOfThree(int[] a, int l, int r) {try{__CLR4_5_21k1kmkbgfhp7.R.inc(91);
        __CLR4_5_21k1kmkbgfhp7.R.inc(92);int m = (l + r) >>> 1;

        __CLR4_5_21k1kmkbgfhp7.R.inc(93);if ((((a[l] > a[m])&&(__CLR4_5_21k1kmkbgfhp7.R.iget(94)!=0|true))||(__CLR4_5_21k1kmkbgfhp7.R.iget(95)==0&false))) {__CLR4_5_21k1kmkbgfhp7.R.inc(96);swap(a, l, m);
        }__CLR4_5_21k1kmkbgfhp7.R.inc(97);if ((((a[l] > a[r])&&(__CLR4_5_21k1kmkbgfhp7.R.iget(98)!=0|true))||(__CLR4_5_21k1kmkbgfhp7.R.iget(99)==0&false))) {__CLR4_5_21k1kmkbgfhp7.R.inc(100);swap(a, l, r);
        }__CLR4_5_21k1kmkbgfhp7.R.inc(101);if ((((a[m] > a[r])&&(__CLR4_5_21k1kmkbgfhp7.R.iget(102)!=0|true))||(__CLR4_5_21k1kmkbgfhp7.R.iget(103)==0&false))) {__CLR4_5_21k1kmkbgfhp7.R.inc(104);swap(a, m, r);

        }__CLR4_5_21k1kmkbgfhp7.R.inc(105);return a[m];
    }finally{__CLR4_5_21k1kmkbgfhp7.R.flushNeeded();}}

    private void swap(int[] a, int i, int j) {try{__CLR4_5_21k1kmkbgfhp7.R.inc(106);
        __CLR4_5_21k1kmkbgfhp7.R.inc(107);int t = a[i];
        __CLR4_5_21k1kmkbgfhp7.R.inc(108);a[i] = a[j];
        __CLR4_5_21k1kmkbgfhp7.R.inc(109);a[j] = t;
    }finally{__CLR4_5_21k1kmkbgfhp7.R.flushNeeded();}}

    @Override
    public String name() {try{__CLR4_5_21k1kmkbgfhp7.R.inc(110);
        __CLR4_5_21k1kmkbgfhp7.R.inc(111);return "ImprovedQuickSort";
    }finally{__CLR4_5_21k1kmkbgfhp7.R.flushNeeded();}}
}
