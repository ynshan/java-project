package com.ynshan.algorithm.sort;

public class Heap {
    /**
     * 堆排序：对数组a中的元素进行排序
     * 不稳定，时间复杂度O(nlogn)
     */
    public static void sort(int[] a){
        // 将待排序的序列构建成一个大顶堆
        for (int i = a.length/2-1; i >= 0; i--) {
            // 从第一个非叶子节点从下至上，从右至左调整结构
            heapAdjust(a, i, a.length);
        }
        // 逐步将每个最大值的根节点与末尾元素交换，并且再调整二叉树，使其成为大顶堆
        for (int i = a.length-1; i > 0; i--) {
            // 将堆顶记录和当前未经排序子序列的最后一个记录交换
            exch(a, 0, i);
            // 交换之后，需要重新检查堆是否符合大顶堆，不符合则要调整
            heapAdjust(a, 0, i);
        }
    }

    /**
     * 构建堆的过程
     * @param a 需要排序的数组
     * @param i 需要构建堆的根节点的序号
     * @param length 数组的长度
     */
    public static void heapAdjust(int[] a, int i, int length) {
        // 先取出当前元素i
        int temp = a[i];
        // 从i节点的左子节点开始
        for (int k = 2*i+1; k < length; k = 2*k+1) {
            // 如果左子节点小于右子节点，k指向右子节点
            if (k+1 < length && a[k] < a[k+1]) {
                k++;
            }
            // 如果子节点大于父节点，将子节点赋值给父节点
            if (a[k] > temp) {
                a[i] = a[k];
                i = k;
            } else {
                break;
            }
        }
        // 将temp的值放到最终的位置
        a[i] = temp;
    }

    // 交换元素的位置
    private static void exch(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}
