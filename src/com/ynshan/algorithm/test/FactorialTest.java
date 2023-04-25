package com.ynshan.algorithm.test;

public class FactorialTest {

    public static void main(String[] args) {
        // 求N的阶乘
         long result = factorial(4);
         System.out.println(result);
    }

    // 求N的阶乘 方法
    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
