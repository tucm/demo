package com.test.tucm.algorithm.merge;

import java.util.Arrays;

/**
 * @ClassName Arrary2Add
 * @Description 两种数组赋值的特殊情况
 * @Author owl
 * @Date 2020-09-13 19:01
 * @Version 1.0
 **/
public class Arrary2Add {
    public static void main(String[] args) {
        int[] a = {2, 4, 3, 6};
        int[] b = new int[4];
        int i = 0;
        int j = 0;
        while (true) {
            //第一种情况先赋值，i再+1
            //int temp = a[i++];
            //b[i++] = temp;
            //输出结果为：
            //a:[2, 4, 3, 6]
            //b:[0, 2, 0, 3]

            //第二种情况，i先加1再取值
            //即：i=i+1；b[1]=a[1];i=i+1
            b[i++] = a[i++];
            //输出结果为：
            //a:[2, 4, 3, 6]
            //b:[4, 0, 6, 0]
            if (i >= 4) {
                break;
            }
        }
        System.out.println("a:" + Arrays.toString(a));
        System.out.println("b:" + Arrays.toString(b));
    }
}
