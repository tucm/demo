package com.test.tucm.algorithm.merge;

import java.util.Arrays;

/**
 * @ClassName Example
 * @Description TODO
 * @Author owl
 * @Date 2020-09-13 17:42
 * @Version 1.0
 **/
public class Example {
    public static void main(String[] args) {
        int[] arr = {49, 38, 65, 97, 76, 13, 27, 50};
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
        customDoubleMerge(a, tmp, start, mid, end);

    }


    public static void customDoubleMerge(int[] a, int[] tmp, int left, int mid, int right) {
        //p1、p2是检测指针，k是存放指针
        //p1,左侧起始位，p2，右侧起始位，k为临时数组指针
        int p1 = left, p2 = mid + 1, k = left;
        //两个数组都没有越界，就比较大小，将指针指向的最小的那个元素放在新数组中
        while (p1 <= mid && p2 <= right) {
            if (a[p1] <= a[p2])
                //较小数组传入tmp临时数组
                tmp[k++] = a[p1++];
            else
                tmp[k++] = a[p2++];
        }
        //如果第一个序列未检测完，直接将后面所有元素加到合并的序列中
        while (p1 <= mid)
            tmp[k++] = a[p1++];
        //同上
        while (p2 <= right)
            tmp[k++] = a[p2++];
        // 复制回原素组
        for (int i = left; i <= right; i++)
            a[i] = tmp[i];
        // System.arraycopy(tmp, 0,a, tmp.length);


    }


    private void merge(int[] array, int start, int middle, int end) {
        int[] temp = new int[array.length];
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
        //最后讲剩余的数据全部追加进临时数组
        while (i <= middle) {
            temp[k++] = array[i++];
        }
        while (j <= end) {
            temp[k++] = array[j++];
        }
        for (int l = start; l <= end; l++) {
            array[l] = temp[l];
        }


    }


}
