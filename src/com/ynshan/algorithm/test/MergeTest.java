package com.ynshan.algorithm.test;

import com.ynshan.algorithm.sort.Merge;

import java.util.Arrays;

public class MergeTest {
    public static void main(String[] args) {
        Integer[] a = {13, 243, 67, 23, 56, 87, 102, 139, 45, 38, 169, 173, 199};
        Merge.sort(a);

        System.out.println(Arrays.toString(a));
    }
}
