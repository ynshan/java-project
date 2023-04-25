package com.ynshan.algorithm.leetcode;

public class test {
    public static void main(String[] args) {
        int n = 10;
        int m = 10;
//        for(int i = 0; i < n; i++) {
//            System.out.println(i);
//        }
//        for(int i = 0; i < n; ++i) {
//            System.out.println(i);
//        }
        int a, b;
        a = n++ + n++;

        b = ++m + ++m;
        System.out.println(a);
        System.out.println(b);
        System.out.println(n);
        System.out.println(m);
    }
}
