package com.ynshan.algorithm.test;

import com.ynshan.algorithm.sort.Student;

/**
 * author:yanan.shan
 * date:2021/01/09
 * content:
 * 1、定义测试类，在测试类中定义测试方法Comparable getMax(Comparable c1, Comparable c2)完成测试
 */
public class TestComparable {

    public static void main(String[] args) {
        // 创建两个student对象
        Student s1 = new Student();
        s1.setUsername("张三");
        s1.setAge(18);

        Student s2 = new Student();
        s1.setUsername("李四");
        s1.setAge(20);

        Comparable max = getMax(s1,s2);
        System.out.println(max);
    }

    public static Comparable getMax(Comparable c1, Comparable c2) {
        int result = c1.compareTo(c2);
        //若result<0,则c1<c2;若result=0,则c1=c2;若result>0,则c1>c2
        if (result >= 0) {
            return c1;
        } else {
            return c2;
        }
    }
}
