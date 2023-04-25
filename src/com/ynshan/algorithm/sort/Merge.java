package com.ynshan.algorithm.sort;

public class Merge {
    // 归并所需的辅助数组
    public static Comparable[] assist;

    /**
     *对数组a中的元素进行排序
     */
    public static void sort(Comparable[] a){

        // 1、初始化辅助数组 assist
        assist = new Comparable[a.length];
        // 2、定义一个low变量和high变量，分别记录数组中最小的索引和最大的索引
        int low = 0;
        int high = a.length - 1;
        // 3、调用sort重载方法完成数组a中，从索引low到索引high的排序
        sort(a, low, high);
    }

    /**
     * 对数组中的从low到high的元素进行排序
     */
    public static void sort(Comparable[] a, int low, int high) {
        // 做安全性校验
        if (high <= low) {
            return;
        }
        // 对low到high之间的数据进行分组
        int middle = (low + high) / 2;
        //分别对分一组进行排序
        sort(a, low, middle);
        sort(a, middle + 1, high);
        // 再把两组数据进行归并
        merge(a, low, middle, high);
    }

    /**
     * 对数组中, 从low到middle为一组，从middle+1到high为一组，对这两组的元素进行排序
     */
    public static void merge(Comparable[] a, int low, int middle, int high) {
        // 定义三个指针
        int i = low;
        int p1 = low;
        int p2 = middle + 1;
        // 遍历，移动p1指针和p2指针，比较对应索引处的值，找出最小的那个，放到辅助数组对应的索引出
        while (p1 <= middle && p2 <= high) {
            if (less(a[p1], a[p2])) {
                assist[i++] = a[p1++];
            } else {
                assist[i++] = a[p2++];
            }
        }
        // 遍历， 如果p1的指针没有走完，那么顺序移动p1的指针，把对应的元素放到辅助数组对应的索引处
        while (p1 <= middle) {
            assist[i++] = a[p1++];
        }
        // 遍历， 如果p2的指针没有走完，那么顺序移动p2的指针，把对应的元素放到辅助数组对应的索引处
        while (p2 <= high) {
            assist[i++] = a[p2++];
        }
        // 把辅助数组的元素拷贝到元数组
        for (int index = low; index <= high; index++) {
            a[index] = assist[index];
        }
    }

    /**
     * 比较元素v是否小于元素w
     */
    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    /**
     * 数组元素i和j交换位置
     */
    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
