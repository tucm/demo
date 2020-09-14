package com.test.tucm.algorithm.quick;

import java.util.Arrays;

/**
 * @ClassName QuickSort
 * @Description 快速排序
 * <p>
 * 该排序算法的基本思想是：
 * 1，定义i=0，j=A.lenght-1，i为第一个数的下标，j为最后一个数下标
 * 2，从数组的最后一个数Aj从右往左找，找到第一小于key的数，记为Aj；
 * 3，从数组的第一个数Ai 从左往右找，找到第一个大于key的数，记为Ai；
 * 4，交换Ai 和Aj 
 * 5，重复这个过程，直到 i=j
 * 6，调整key的位置，把A[i] 和key交换，并重新选择基准位（第一位）
 * 7，递归实现2至6步骤
 * <p>
 * <p>
 * 什么快速排序是不稳定的？
 * 因，当输入数组都为一致的数据时，依据快速排序算法，当移动到高位指针和低位指针相等的位置时，要把第一位的基准位赋值到该位置。
 * @Author owl
 * @Date 2020-09-13 18:08
 * @Version 1.0
 **/
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 11, 4, 5, 10, 8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        //temp临时数据
        int i, j, flag, temp;
        if (low >= high) {
            return;
        }
        i = low;
        j = high;
        //flag就是基准位
        flag = arr[low];
        //循环体：低位小于高位则进行循环（由于j、i都有对应的自减自增操作，所以子循环体要限制j<j条件）
        while (i < j) {
            //先看右边，当前值大于=基准位，依次往左递减（移动）
            while (flag <= arr[j] && i < j) {
                j--;
            }
            //再看左边，当前值小于等于基准依次往右递增
            while (flag >= arr[i] && i < j) {
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
                //较小的数
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //最后将基准为与i和j相等位置的数字交换
        //i=j位置的值复制给arr[low]（第一位），使这个值重新成为基准位
        arr[low] = arr[i];
        //基准位的值赋值给i=j位置
        arr[i] = flag;
        //low至j-1  j+1至high，不包含j，因j已经排好位置
        //递归调用左半数组
        quickSort(arr, low, j - 1);
        //递归调用右半数组
        quickSort(arr, j + 1, high);
    }


}
