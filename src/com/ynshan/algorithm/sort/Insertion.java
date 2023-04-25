package com.ynshan.algorithm.sort;

public class Insertion {
    /*
        对数组a中的元素进行排序
     */
    public static void sort(Comparable[] a){
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                // 比较索引j和j-1处的值,如果j-1处的值比j处的值大，则交换，否则找到了合适的位置
                if (greater(a[j-1], a[j])) {
                    exch(a, j-1, j);
                } else {
                    break;
                }
            }
        }
    }

    /*
        比较元素v是否大于元素w
     */
    private static boolean greater(Comparable v, Comparable w){
        return v.compareTo(w) > 0;
    }

    /*
        数组元素i和j交换位置
     */
    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
