package com.ynshan.algorithm.test;

import com.ynshan.algorithm.sort.Selection;

import java.util.Arrays;

public class SelectionTest {
    public static void main(String[] args) {
        Integer[] a = {4, 5, 6, 3, 2, 1};
        Selection.sort(a);

        System.out.println(Arrays.toString(a));
    }
}
