package com.test.tucm.algorithm.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * 实践
 */
public class Practice {

    public static void main(String[] args) {
        p3();

    }

    /**
     * 问题：
     * 在一个包含 n 个元素的无序数组 a 中，输出其最大值 max_val。
     * 分析：
     * 查找类问题
     * 不是有序数组，排除二分查找，O(logN)
     * 新增数据，都对结果有影响，所以判定时间负责度最少也要为O(n).
     * 只需要存储最大值，不需要什么特殊的数据结构，空间复杂度为O(1)
     */
    public static void p1() {
        int[] array = {9, 8, 7, 6, 5, 4};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                max = array[i];
                continue;
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    /**
     * 问题：
     * 在一个数组 a = [1, 3, 4, 3, 4, 1, 3] 中，找到出现次数最多的那个数字。如果并列存在多个，随机输出一个。
     * 分析：
     * 查找类问题
     * 无序数组，排除二分法，新增输入数据影响结果，最低时间复杂度O(n)即需要全部遍历
     * 需要记录每个数出现的次数，才有哈希表数据结构，k-数值，v-出现的次数。空间复杂度O(1)
     */
    public static void p2() {
        int[] array = {1, 3, 4, 3, 4, 1, 3};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) == null) {
                map.put(array[i], 1);
            } else if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            }
        }
        int maxCount = 0;
        int maxCountValue = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxCountValue = entry.getKey();
            }
        }
        System.out.println(maxCountValue);
    }

    /**
     * 问题：
     * 给定一个整数数组 arr 和一个目标值 target，请你在该数组中找出加和等于目标值的两个整数，并返回它们在原数组中的下标
     * 分析：
     * 查找类问题，
     * 最复杂时间复杂度为0（n*n），两次遍历，计算n*n种情况的值
     * 非有序数组，排除二分查找，新增数据都会影响结果，所以最低时间复杂度为O(n)
     * 对顺序无要求，采用哈希表
     * 遍历一次数组，key存当前值，value存index的值
     * 再次遍历哈希表，判断数组是否含有targer-value的值，有则返回一个数组
     */
    public static void p3() {
        int[] array = {1, 3, 4, 9, 7, 6};
        int target = 10;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = target - entry.getKey();
            if (map.containsKey(value) && map.get(value) != entry.getValue()) {
                System.out.println(entry.getValue() + ":" + map.get(value));
            }

        }

    }


}
