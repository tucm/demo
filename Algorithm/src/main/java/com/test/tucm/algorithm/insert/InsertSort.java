package com.test.tucm.algorithm.insert;

import java.util.Arrays;

/**
 * @ClassName InsertSort
 * @Description 插入排序
 * 算法描述：
 * 1、从第一个元素开始，该元素可以认为已经被排序；
 * 2、取出下一个元素，在已经排序的元素序列中从后向前扫描；
 * 3、如果该元素（已排序）大于新元素，将该元素移到下一位置；
 * 4、重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 * 5、将新元素插入到该位置后；
 * 6、重复步骤2~5
 * <p>
 * 代码实现前分析：
 * 最小逻辑单元：与之前的有序序列比较，大的数往后挪
 * <p>
 * 有n个数，最多要循环比较n-1趟。
 * 每趟第一个数到第n个数分别比较0,1,2,...,(n-1)次，利用外层i，可以得出每次比较的次数，依次递减
 * @Author owl
 * @Date 2020-09-12 21:46
 * @Version 1.0
 **/
public class InsertSort {

    public static void main(String[] args) {
        int[] arrary = {1, 3, -9, -6};
        //第n个数
        for (int i = 1; i < arrary.length; i++) {
            //取第n个数的值
            int temp = arrary[i];
            //每趟第一个数到第n个数分别比较0,1,2,...,(n-1)次，利用外层i，（j-1）可以得出每次比较的次数，依次递减
            //比较上一个位置的坐标
            int j = i - 1;
            for (; j >= 0; j--) {
                //最末尾的数小于前一位的数，往前挪
                if (temp < arrary[j]) {
                    //大的数往后挪动一位
                    arrary[j + 1] = arrary[j];
                } else {
                    //末位大于前面一位的数跳出循环，因之前的队列是有序（小>>>大）的。此时（j+1）的下标就是当前第n个数的位置
                    break;
                }
            }
            //赋值（j+1）下标的值
            arrary[j + 1] = temp;

        }
        System.out.println(Arrays.toString(arrary));
    }
}
