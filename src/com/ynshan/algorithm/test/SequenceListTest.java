package com.ynshan.algorithm.test;

import com.ynshan.algorithm.linear.SequenceList;

public class SequenceListTest {
    public static void main(String[] args) {
        // 创建顺序表对象
        SequenceList<String> sl = new SequenceList<>(10);
        // 测试插入
        sl.insert("小梅");
        sl.insert("小花");
        sl.insert("小凯");
        sl.insert(1, "小雅");
        for (String s : sl) {
            System.out.println(s);
        }
        System.out.println("--------------");

        // 测试获取
        String getResult = sl.get(1);
        System.out.println("获取索引1处的值：" + getResult);
        // 测试删除
        String removeResult = sl.remove(0);
        System.out.println("删除的值：" + removeResult);
        // 测试清空
        sl.clear();
        System.out.println("删除的值：" + sl.length());
    }
}
