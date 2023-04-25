package com.ynshan.algorithm.sort;

public class Bubble {
    /**
     * 冒泡排序：对数组a中的元素进行排序
     * 稳定，时间复杂度O(n^2)
     */
    public static void sort(Comparable[] a){
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                // 比较索引j和j+1处的值
                if (greater(a[j], a[j+1])) {
                    exch(a, j, j+1);
                }
            }
        }
    }

    /**
     * 算法优化，增加一个swap标志，当前一轮没有进行交换时，说明数组已经有序，没有必要进行下一轮的循环，直接退出
     * @param a 待排序的数组
     */
    public static void sortBubble(Comparable[] a){
        boolean swap;
        for (int i = a.length - 1; i > 0; i--) {
            swap = false;
            for (int j = 0; j < i; j++) {
                // 比较索引j和j+1处的值
                if (greater(a[j], a[j+1])) {
                    exch(a, j, j+1);
                    swap = true;
                }
            }
            if (!swap) {
                break;
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
