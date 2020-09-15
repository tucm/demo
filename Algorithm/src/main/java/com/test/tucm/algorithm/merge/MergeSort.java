package com.test.tucm.algorithm.merge;

import java.util.Arrays;

/**
 * @ClassName MergeSort
 * @Description 归并排序
 * 1、把 n 个记录看成 n 个长度为1的有序子表；
 * 2、进行两两归并使记录关键字有序，得到 n/2 个长度为 2 的有序子表；
 * 3、重复第2步直到所有记录归并成一个长度为 n 的有序表为止。
 * @Author owl
 * @Date 2020-09-13 17:42
 * @Version 1.0
 **/
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9, 8, 8, 6, 5, 4, 3};
        int[] tmp = new int[arr.length];
        System.out.println("原始数据: " + Arrays.toString(arr));
        customMergeSort(arr, tmp, 0, arr.length - 1);
        System.out.println("归并排序: " + Arrays.toString(arr));
    }


    public static void customMergeSort(int[] a, int[] tmp, int start, int end) {
        //头尾指针相等或者越界return；
        if (start >= end) {
            return;
        }
        //中间数下标
        int mid = (start + end) / 2;
        // 对左侧子序列进行递归排序
        customMergeSort(a, tmp, start, mid);
        // 对右侧子序列进行递归排序
        customMergeSort(a, tmp, mid + 1, end);
        // 合并
        merge(a, tmp, start, mid, end);

    }


    private static void merge(int[] array, int[] temp, int start, int middle, int end) {
        //前半段数据游标
        int i = start;
        //后半段数据游标
        int j = middle + 1;
        //临时数据游标
        int k = start;
        while (i <= middle && j <= end) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        //如果第一个序列未检测完，直接将后面所有元素加到合并的序列中
        while (i <= middle) {
            temp[k++] = array[i++];
        }
        //同上
        while (j <= end) {
            temp[k++] = array[j++];
        }

        //最后讲剩余的数据全部追加进临时数组
        for (int l = start; l <= end; l++) {
            array[l] = temp[l];
        }


    }


}
