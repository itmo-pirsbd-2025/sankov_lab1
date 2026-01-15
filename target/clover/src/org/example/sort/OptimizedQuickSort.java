/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.example.sort;

public class OptimizedQuickSort implements SortAlgorithm {public static class __CLR4_5_24141mkbgfhpy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0041\u006c\u0065\u0078\u0073\u0061\u0037\u0031\u0036\u0031\u005c\u005c\u004f\u006e\u0065\u0044\u0072\u0069\u0076\u0065\u005c\u005c\u0420\u0430\u0431\u043e\u0447\u0438\u0439\u0020\u0441\u0442\u043e\u043b\u005c\u005c\u006a\u0061\u0076\u0061\u005f\u006c\u0061\u0062\u0073\u005c\u005c\u006c\u0061\u0062\u0031\u005c\u005c\u006c\u0061\u0062\u0031\u005f\u0073\u006f\u0072\u0074\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1768239981297L,8589935092L,273,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int INSERTION_THRESHOLD = 16;

    @Override
    public void sort(int[] a) {try{__CLR4_5_24141mkbgfhpy.R.inc(145);
        __CLR4_5_24141mkbgfhpy.R.inc(146);int l = 0;
        __CLR4_5_24141mkbgfhpy.R.inc(147);int r = a.length - 1;

        __CLR4_5_24141mkbgfhpy.R.inc(148);while ((((l < r)&&(__CLR4_5_24141mkbgfhpy.R.iget(149)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(150)==0&false))) {{
            __CLR4_5_24141mkbgfhpy.R.inc(151);if ((((r - l < INSERTION_THRESHOLD)&&(__CLR4_5_24141mkbgfhpy.R.iget(152)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(153)==0&false))) {{
                __CLR4_5_24141mkbgfhpy.R.inc(154);insertionSort(a, l, r);
                __CLR4_5_24141mkbgfhpy.R.inc(155);return;
            }

            }__CLR4_5_24141mkbgfhpy.R.inc(156);int m = (l + r) >>> 1;

            __CLR4_5_24141mkbgfhpy.R.inc(157);if ((((a[l] > a[m])&&(__CLR4_5_24141mkbgfhpy.R.iget(158)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(159)==0&false))) {__CLR4_5_24141mkbgfhpy.R.inc(160);swap(a, l, m);
            }__CLR4_5_24141mkbgfhpy.R.inc(161);if ((((a[l] > a[r])&&(__CLR4_5_24141mkbgfhpy.R.iget(162)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(163)==0&false))) {__CLR4_5_24141mkbgfhpy.R.inc(164);swap(a, l, r);
            }__CLR4_5_24141mkbgfhpy.R.inc(165);if ((((a[m] > a[r])&&(__CLR4_5_24141mkbgfhpy.R.iget(166)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(167)==0&false))) {__CLR4_5_24141mkbgfhpy.R.inc(168);swap(a, m, r);

            }__CLR4_5_24141mkbgfhpy.R.inc(169);int pivot = a[m];

            __CLR4_5_24141mkbgfhpy.R.inc(170);int i = l;
            __CLR4_5_24141mkbgfhpy.R.inc(171);int j = r;

            __CLR4_5_24141mkbgfhpy.R.inc(172);while ((((i <= j)&&(__CLR4_5_24141mkbgfhpy.R.iget(173)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(174)==0&false))) {{
                __CLR4_5_24141mkbgfhpy.R.inc(175);while ((((a[i] < pivot)&&(__CLR4_5_24141mkbgfhpy.R.iget(176)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(177)==0&false))) {__CLR4_5_24141mkbgfhpy.R.inc(178);i++;
                }__CLR4_5_24141mkbgfhpy.R.inc(179);while ((((a[j] > pivot)&&(__CLR4_5_24141mkbgfhpy.R.iget(180)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(181)==0&false))) {__CLR4_5_24141mkbgfhpy.R.inc(182);j--;
                }__CLR4_5_24141mkbgfhpy.R.inc(183);if ((((i <= j)&&(__CLR4_5_24141mkbgfhpy.R.iget(184)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(185)==0&false))) {{
                    __CLR4_5_24141mkbgfhpy.R.inc(186);int t = a[i];
                    __CLR4_5_24141mkbgfhpy.R.inc(187);a[i] = a[j];
                    __CLR4_5_24141mkbgfhpy.R.inc(188);a[j] = t;
                    __CLR4_5_24141mkbgfhpy.R.inc(189);i++;
                    __CLR4_5_24141mkbgfhpy.R.inc(190);j--;
                }
            }}

            }__CLR4_5_24141mkbgfhpy.R.inc(191);if ((((j - l < r - i)&&(__CLR4_5_24141mkbgfhpy.R.iget(192)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(193)==0&false))) {{
                __CLR4_5_24141mkbgfhpy.R.inc(194);if ((((l < j)&&(__CLR4_5_24141mkbgfhpy.R.iget(195)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(196)==0&false))) {{
                    __CLR4_5_24141mkbgfhpy.R.inc(197);sortRange(a, l, j);
                }
                }__CLR4_5_24141mkbgfhpy.R.inc(198);l = i;
            } }else {{
                __CLR4_5_24141mkbgfhpy.R.inc(199);if ((((i < r)&&(__CLR4_5_24141mkbgfhpy.R.iget(200)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(201)==0&false))) {{
                    __CLR4_5_24141mkbgfhpy.R.inc(202);sortRange(a, i, r);
                }
                }__CLR4_5_24141mkbgfhpy.R.inc(203);r = j;
            }
        }}
    }}finally{__CLR4_5_24141mkbgfhpy.R.flushNeeded();}}

    private void sortRange(int[] a, int l, int r) {try{__CLR4_5_24141mkbgfhpy.R.inc(204);
        __CLR4_5_24141mkbgfhpy.R.inc(205);while ((((l < r)&&(__CLR4_5_24141mkbgfhpy.R.iget(206)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(207)==0&false))) {{
            __CLR4_5_24141mkbgfhpy.R.inc(208);if ((((r - l < INSERTION_THRESHOLD)&&(__CLR4_5_24141mkbgfhpy.R.iget(209)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(210)==0&false))) {{
                __CLR4_5_24141mkbgfhpy.R.inc(211);insertionSort(a, l, r);
                __CLR4_5_24141mkbgfhpy.R.inc(212);return;
            }

            }__CLR4_5_24141mkbgfhpy.R.inc(213);int m = (l + r) >>> 1;

            __CLR4_5_24141mkbgfhpy.R.inc(214);if ((((a[l] > a[m])&&(__CLR4_5_24141mkbgfhpy.R.iget(215)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(216)==0&false))) {__CLR4_5_24141mkbgfhpy.R.inc(217);swap(a, l, m);
            }__CLR4_5_24141mkbgfhpy.R.inc(218);if ((((a[l] > a[r])&&(__CLR4_5_24141mkbgfhpy.R.iget(219)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(220)==0&false))) {__CLR4_5_24141mkbgfhpy.R.inc(221);swap(a, l, r);
            }__CLR4_5_24141mkbgfhpy.R.inc(222);if ((((a[m] > a[r])&&(__CLR4_5_24141mkbgfhpy.R.iget(223)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(224)==0&false))) {__CLR4_5_24141mkbgfhpy.R.inc(225);swap(a, m, r);

            }__CLR4_5_24141mkbgfhpy.R.inc(226);int pivot = a[m];
            __CLR4_5_24141mkbgfhpy.R.inc(227);int i = l;
            __CLR4_5_24141mkbgfhpy.R.inc(228);int j = r;

            __CLR4_5_24141mkbgfhpy.R.inc(229);while ((((i <= j)&&(__CLR4_5_24141mkbgfhpy.R.iget(230)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(231)==0&false))) {{
                __CLR4_5_24141mkbgfhpy.R.inc(232);while ((((a[i] < pivot)&&(__CLR4_5_24141mkbgfhpy.R.iget(233)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(234)==0&false))) {__CLR4_5_24141mkbgfhpy.R.inc(235);i++;
                }__CLR4_5_24141mkbgfhpy.R.inc(236);while ((((a[j] > pivot)&&(__CLR4_5_24141mkbgfhpy.R.iget(237)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(238)==0&false))) {__CLR4_5_24141mkbgfhpy.R.inc(239);j--;
                }__CLR4_5_24141mkbgfhpy.R.inc(240);if ((((i <= j)&&(__CLR4_5_24141mkbgfhpy.R.iget(241)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(242)==0&false))) {{
                    __CLR4_5_24141mkbgfhpy.R.inc(243);int t = a[i];
                    __CLR4_5_24141mkbgfhpy.R.inc(244);a[i] = a[j];
                    __CLR4_5_24141mkbgfhpy.R.inc(245);a[j] = t;
                    __CLR4_5_24141mkbgfhpy.R.inc(246);i++;
                    __CLR4_5_24141mkbgfhpy.R.inc(247);j--;
                }
            }}

            }__CLR4_5_24141mkbgfhpy.R.inc(248);if ((((j - l < r - i)&&(__CLR4_5_24141mkbgfhpy.R.iget(249)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(250)==0&false))) {{
                __CLR4_5_24141mkbgfhpy.R.inc(251);sortRange(a, l, j);
                __CLR4_5_24141mkbgfhpy.R.inc(252);l = i;
            } }else {{
                __CLR4_5_24141mkbgfhpy.R.inc(253);sortRange(a, i, r);
                __CLR4_5_24141mkbgfhpy.R.inc(254);r = j;
            }
        }}
    }}finally{__CLR4_5_24141mkbgfhpy.R.flushNeeded();}}

    private void insertionSort(int[] a, int l, int r) {try{__CLR4_5_24141mkbgfhpy.R.inc(255);
        __CLR4_5_24141mkbgfhpy.R.inc(256);for (int i = l + 1; (((i <= r)&&(__CLR4_5_24141mkbgfhpy.R.iget(257)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(258)==0&false)); i++) {{
            __CLR4_5_24141mkbgfhpy.R.inc(259);int key = a[i];
            __CLR4_5_24141mkbgfhpy.R.inc(260);int j = i - 1;
            __CLR4_5_24141mkbgfhpy.R.inc(261);while ((((j >= l && a[j] > key)&&(__CLR4_5_24141mkbgfhpy.R.iget(262)!=0|true))||(__CLR4_5_24141mkbgfhpy.R.iget(263)==0&false))) {{
                __CLR4_5_24141mkbgfhpy.R.inc(264);a[j + 1] = a[j];
                __CLR4_5_24141mkbgfhpy.R.inc(265);j--;
            }
            }__CLR4_5_24141mkbgfhpy.R.inc(266);a[j + 1] = key;
        }
    }}finally{__CLR4_5_24141mkbgfhpy.R.flushNeeded();}}

    private void swap(int[] a, int i, int j) {try{__CLR4_5_24141mkbgfhpy.R.inc(267);
        __CLR4_5_24141mkbgfhpy.R.inc(268);int t = a[i];
        __CLR4_5_24141mkbgfhpy.R.inc(269);a[i] = a[j];
        __CLR4_5_24141mkbgfhpy.R.inc(270);a[j] = t;
    }finally{__CLR4_5_24141mkbgfhpy.R.flushNeeded();}}

    @Override
    public String name() {try{__CLR4_5_24141mkbgfhpy.R.inc(271);
        __CLR4_5_24141mkbgfhpy.R.inc(272);return "OptimizedQuickSort";
    }finally{__CLR4_5_24141mkbgfhpy.R.flushNeeded();}}
}
