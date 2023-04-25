package com.ynshan.algorithm.sort;


import java.util.ArrayList;

public class Counting {
    /**
     * 计数排序：对数组 a 进行排序
     * 稳定，时间复杂度O(n+k)
     */
    public static void sort(int[] a, int maxValue, int minValue) {
        // 创建存储数组
        ArrayList<Integer> b = new ArrayList<>();
        // 创建计数数组
        int[] count = new int[maxValue - minValue + 1];

        // 初始化各元素的值，数组下标从0开始
        for (int num= minValue; num <= maxValue; num ++) {
            count[num - minValue] = 0;
        }

        // 遍历a,计算每个数出现的次数
        for (int num : a) {
            count[num - minValue] += 1;
        }

        // 按照顺序及次数填充数组b
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                b.add(i + minValue);
                count[i] --;
            }
        }
        // 将存储数组的值一一替换给原数组
        for(int i = 0; i < a.length; i++) {
            a[i] = b.get(i);
        }
    }
}
