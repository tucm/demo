package com.test.tucm.algorithm.bubble;

import java.util.Arrays;

/**
 * @Author TUCM
 * 冒泡排序
 * 最小的逻辑单元为：两个相邻的数比较，最大的数往后移动
 * 由于每次排序后，最大的数都排到了最后
 * 所以第一个数到第n个数需要比较的次数分别为n-1,n-2,n-3直道0 次。总比较次数为1*(n-1)+1*(n-2)...+1*(0)
 * 即 n-1趟 ，每趟为(n-1),(n-2),(n-3)...直到0
 * <p>
 * 代码实现：用外层循环控制排序趟数（n-1），内层循环控制每一趟排序多少次(n-1),(n-2),(n-3)刚好利用外层循环的值i，内层循环代码实现大的值往后移动
 * <p>
 * 为什么每次排序后最大的数移动到了最后？
 * 因：每趟排序，最大的数都跟每个数进行了一次比较。
 */
public class Bubble {
    public static void main(String[] args) {
        int[] arrary = {1, 0, 3, 4, 5, -6, 7, 8, 9, 10};
        System.out.println("原始数据：" + Arrays.toString(arrary));
        //外层循环控制排序趟数(n-1)趟
        for (int i = 1; i < arrary.length; i++) {
            //内层循环控制每一趟排序多少次（数组index从0开始，利用外层循环的i控制每趟需要比较的次数）
            for (int j = 0; j < arrary.length - i; j++) {
                //往前移动代码
                if (arrary[j] > arrary[j + 1]) {
                    int temp = arrary[j];
                    arrary[j] = arrary[j + 1];
                    arrary[j + 1] = temp;
                }
            }

        }
        System.out.println("冒泡排序：" + Arrays.toString(arrary));


    }
}
