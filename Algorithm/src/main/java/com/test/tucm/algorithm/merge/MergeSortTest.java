package com.test.tucm.algorithm.merge;

import java.util.Arrays;

/**
 * @ClassName MergeSort
 * @Description 归并排序
 * 1、把 n 个记录看成 n 个长度为1的有序子表；
 * 2、进行两两归并使记录关键字有序，得到 n/2 个长度为 2 的有序子表；
 * 3、重复第②步直到所有记录归并成一个长度为 n 的有序表为止。
 * @Author owl
 * @Date 2020-09-13 17:36
 * @Version 1.0
 **/
public class MergeSortTest {

    public static void main(String[] args) {
        int[] array = {9, 8, 6, 5, 4, 3};
        int[] temp = new int[array.length];
        System.out.println("归并排序前" + Arrays.toString(array));
        customMergerSort(array, temp, 0, array.length - 1);
        System.out.println("归并排序后" + Arrays.toString(array));

    }

    static void customMergerSort(int[] arrary, int[] temp, int start, int end) {
        //递归跳出循环条件
        if (start >= end) {
            return;
        }
        //二分
        int mid = (start + end) / 2;
        customMergerSort(arrary, temp, start, mid);
        customMergerSort(arrary, temp, mid + 1, end);
        merge(arrary, temp, start, mid, end);

    }

    static void merge(int[] array, int[] temp, int start, int middle, int end) {
        //temp数组下标
        int k = start;
        //左侧下标
        int i = start;
        //右侧下标
        int j = middle + 1;
        //没有越界则继续比较
        while (i <= middle && j <= end) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        //比较完之后仍有数据
        while (i <= middle) {
            temp[k++] = array[i++];
        }
        //比较完后仍有数据
        while (j <= end) {
            temp[k++] = array[j++];
        }
        //temp数组赋值给array
        for (int l = start; l <= end; l++) {
            array[l] = temp[l];
        }


    }


}
