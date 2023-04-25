package com.ynshan.algorithm.test;

import com.ynshan.algorithm.sort.Quick;

import java.util.Arrays;

public class QuickTest {
    public static void main(String[] args) {
        int[] a = {13, 243, 67, 23, 56, 87, 102, 139, 45, 38, 169, 173, 199};
        Quick.sort(a);

        System.out.println(Arrays.toString(a));
    }
}
