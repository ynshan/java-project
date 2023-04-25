package com.ynshan.algorithm.sort;

import java.util.ArrayList;
import java.util.Collections;

public class Bucket {
    /**
     * 桶排序：对数组 a 进行排序
     * 稳定，时间复杂度O(n^2)
     */
    public static void sort(int[] a){
        //找到数组a的最大值和最小值
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int value : a) {
            max = Math.max(max, value);
            min = Math.min(min, value);
        }

        // 计算数组a需要的桶的个数
        int bucketNum = (max - min) / a.length + 1;

        // 建立桶
        ArrayList<ArrayList<Integer>> bucketArray = new ArrayList<>(bucketNum);
        for (int i = 0; i < bucketNum; i++) {
            bucketArray.add(new ArrayList<>());
        }

        // 将每个元素放入桶
        for (int value : a) {
            int num = (value - min) / a.length;
            bucketArray.get(num).add(value);
        }
        ArrayList<Integer> b = new ArrayList<>();

        // 对每个桶进行排序
        for (ArrayList<Integer> integers : bucketArray) {
            Collections.sort(integers);
            b.addAll(integers);
        }

        // 将存储数组的值一一替换给原数组
        for(int i = 0; i < a.length; i++) {
            a[i] = b.get(i);
        }
    }
}
