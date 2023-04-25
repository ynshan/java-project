package com.ynshan.algorithm.test;

import com.ynshan.algorithm.sort.Bucket;

import java.util.Arrays;

public class BucketTest {
    public static void main(String[] args) {
        int[] a = {13, 243, 67, 23, 56, 87, 102, 139, 45, 38, 169, 173, 199};
        Bucket.sort(a);

        System.out.println(Arrays.toString(a));
    }
}
