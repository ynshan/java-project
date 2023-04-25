package com.ynshan.algorithm.linear;

import java.util.Iterator;

public class SequenceList<T> implements Iterable<T>{
    // 存储元素的数组
    private T[] eles;
    // 记录当前顺序表的个数
    private int N;
    // 构造方法
    public SequenceList(int capacity) {
        // 初始化数组
        this.eles = (T[]) new Object[capacity];
        // 初始化长度
        this.N = 0;
    }
    // 将一个线性表置为空表
    public void clear() {
        this.N = 0;
    }
    // 判断当前线性表是否为空表
    public boolean isEmpty() {
        return N == 0;
    }
    // 获取指定位置的元素
    public T get(int i) {
        return eles[i];
    }
    // 想线性表中添加元素t
    public void insert(T t) {
        eles[N++] = t;
    }
    // 在i元素处插入元素t
    public void insert(int i, T t) {
        // 先把i索引处的运算及后面的元素一次向后移动一位
        for (int index = N; index > i; index--) {
            eles[index] = eles[index - 1];
        }
        // 再把t元素放在i索引处
        eles[i] = t;
        // 元素个数+1
        N++;
    }
    // 删除指定位置i处的元素，并返回该元素
    public  T remove(int i) {
        // 记录i索引处的值
        T current = eles[i];
        // 先把i索引处的运算及后面的元素一次向前移动一位
        for (int index = i; index > N-1; index++) {
            eles[index] = eles[index + 1];
        }
        // 元素个数减1
        N--;
        return current;
    }
    // 查找t元素第一次出现的位置
    public int indexOf(T t) {
        for (int i = 0; i < N-1; i++) {
            if (eles[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }
    // 返回数组的长度
    public int length() {
        return N;
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }
    private class SIterator implements Iterator {
        private int cusor;
        public SIterator() {
            this.cusor = 0;
        }
        @Override
        public boolean hasNext() {
            return cusor < N;
        }

        @Override
        public Object next() {
            return eles[cusor++];
        }
    }
}
