package com.ynshan.algorithm.test;

import com.ynshan.algorithm.sort.Shell;

import java.util.Arrays;

public class ShellTest {
    public static void main(String[] args) {
        Integer[] a = {4, 5, 6, 3, 2, 1, 9, 8, 3, 2, 1, 5, 7};
        Shell.sort(a);

        System.out.println(Arrays.toString(a));
    }
}
