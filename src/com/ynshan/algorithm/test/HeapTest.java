package com.ynshan.algorithm.test;

import com.ynshan.algorithm.sort.Heap;

import java.util.Arrays;

public class HeapTest {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 3, 2, 1};
        Heap.sort(a);

        System.out.println(Arrays.toString(a));
    }
}
