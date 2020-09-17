package com.test.tucm.algorithm.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 6, 7};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 6));

    }

    public static int binarySearch(int[] arr, int left, int right, int findVal) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        int midVal = arr[mid];
        // 中间值 大于要查找的值 从右边开始找
        if (midVal < findVal) {
            return binarySearch(arr, mid + 1, right, findVal);
        } else if (midVal > findVal) {
            return binarySearch(arr, left, mid - 1, findVal);
        } else {
            return mid;
        }
    }
}
