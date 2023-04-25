package com.ynshan.algorithm.sort;

public class Selection {
    /*
        对数组a中的元素进行排序
     */
    public static void sort(Comparable[] a){
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < a.length; j++) {
                // 比较索引minIndex和j处的值
                if (greater(a[minIndex], a[j])) {
                    minIndex = j;
                }
            }
            // 交换最小元素所在索引minIndex和所以i处的值
            exch(a, minIndex, i);
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
