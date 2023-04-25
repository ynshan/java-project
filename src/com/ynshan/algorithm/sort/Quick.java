package com.ynshan.algorithm.sort;


import java.util.ArrayList;

public class Quick {
    /**
     * 快速排序：对数组 a 进行排序
     * 不稳定，时间复杂度O(nlogn)
     */
    public static void sort(int[] a) {
        // 定义一个low变量和high变量，分别记录数组中最小的索引和最大的索引
        int low = 0;
        int high = a.length - 1;
        sort(a, low, high);
    }

    /**
     * 对数组中的从low到high的元素进行排序
     */
    public static void sort(int[] a, int low, int high) {
        // 做安全性校验
        if (high < low) {
            return;
        }
        // 将数组分为两部分
        int temp = partition(a, low, high);
        // 递归排序左子数组
        sort(a, low, temp - 1);
        // 递归排序右子数组
        sort(a, temp + 1, high);
    }

    /**
     * 将数组分为两个部分
     */
    public static int partition(int[] a, int low, int high) {
        // 基准数据
        int temp = a[low];
        while (low < high) {
            // 当队尾的元素大于等于基准数据时,向前挪动high指针
            while (low < high && a[high] >= temp) {
                high--;
            }
            // 如果队尾元素小于tmp了,需要将其赋值给low
            a[low] = a[high];
            // 当队首元素小于等于tmp时,向前挪动low指针
            while (low < high && a[low] < temp) {
                low++;
            }
            a[high] = a[low];
        }
        // 跳出循环时low和high相等,此时的low或high就是tmp的正确索引位置
        // 由原理部分可以很清楚的知道low位置的值并不是tmp,所以需要将tmp赋值给arr[low]
        a[low] = temp;
        return low; // 返回tmp的正确位置
    }
}
