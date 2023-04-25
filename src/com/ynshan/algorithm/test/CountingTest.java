package com.ynshan.algorithm.test;

import com.ynshan.algorithm.sort.Counting;

import java.util.Arrays;

public class CountingTest {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 3, 2, 1, 4, 3, 6, 8, 7, 1, 9};
        Counting.sort(a, 9, 1);

        System.out.println(Arrays.toString(a));
    }
}
