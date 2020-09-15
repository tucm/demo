package com.test.tucm.algorithm.arrays;

import java.util.Arrays;

/**
 * 多维数组测试
 */
public class multi {

    public static void main(String[] args) {

        /*
         * 数组的定义
         * {21, 22}，只能由于定义初始化,不能用于赋值
         * 比如二维数组
         * int[][] arr2_length = new int[2][];
         * arr2_length[0]={21,22},程序报错
         *
         * 特殊方法的数组的赋值
         * new int[]是创建数组对象，是几维数组就要加几个括号,可用于数组的初始化
         * 也因为是创建对象所以可以为指定下标数组赋值，如：
         * int[][][] arr3_length = new int[2][][];
         * arr3_length[0] = new int[][]{{1, 3}, {2, 4}};
         *
         *
         * */
        int[] arr = {21, 22};
        int[] arr_copy = new int[]{21, 22};
        int[] arr_length = new int[2];

        int[][] arr2 = {{2, 4}, {3, 5}};
        int[][] arr2_copy = new int[][]{{2, 4}, {3, 5}};
        /*
         *不确定子数组长度初始化
         *不确定长度定义方法，但第一层数组必须赋值，否则无法初始化内存空间
         *未定义子数组长度，可以动态扩展，如下
         */
        int[][] arr2_length = new int[2][];
        arr2_length[0] = new int[]{21, 22};
        arr2_length[1] = new int[]{24, 24, 25};
        for (int j = 0; j < arr2_length.length; j++) {
            System.out.println(Arrays.toString(arr2_length[j]));

        }
        int[][][] arr3 = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}};
        int[][][] arr3_copy = new int[][][]{{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}};
        int[][][] arr3_length = new int[2][][];
        arr3_length[0] = new int[][]{{1, 3}, {2, 4}};


    }
}
