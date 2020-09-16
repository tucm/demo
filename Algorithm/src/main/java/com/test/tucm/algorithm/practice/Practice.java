package com.test.tucm.algorithm.practice;

import java.util.*;

/**
 * 实践
 */
public class Practice {

    public static void main(String[] args) {
        p5();

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

    /**
     * 问题：
     * 给定一个字符串，逐个翻转字符串中的每个单词。例如，输入："This is a good example"，输出："example good a is This"
     * 分析：
     * 排序类问题
     * 跟顺序有关，且是倒序，考虑使用栈
     */
    public static void p4() {
        String data = "This is a good example";
        Stack stack = new Stack();
        String[] array = data.split(" +");
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    /**
     * 给定一棵树，按照层次顺序遍历并打印这棵树
     * 二叉树的遍历问题
     * 排除：前序、中序、后序遍历
     * 经分析，遍历优先顺序为，上比下优先，左比右优先
     */
    public static void p5() {
        //TODO 构造树结构
        Node<Integer> root = getNode();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node<Integer> temp = queue.poll();
            System.out.print(temp.data + "-");
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
    }

    /**
     * 构造树对象
     *
     * @return
     */
    public static Node<Integer> getNode() {
        Node<Integer> node16 = new Node<>();
        Node<Integer> node13 = new Node<>();
        Node<Integer> node10 = new Node<>();
        node10.setNode(10);
        Node<Integer> node15 = new Node<>();
        node15.setNode(15);
        node13.setNode(13);
        node13.setLeft(node10);
        node13.setRight(node15);
        Node<Integer> node21 = new Node<>();
        node21.setNode(21);
        Node<Integer> node26 = new Node<>();
        node26.setNode(26);
        Node<Integer> node22 = new Node<>();
        node22.setNode(22);
        node22.setLeft(node21);
        node22.setRight(node26);
        Node<Integer> node20 = new Node<>();
        node20.setRight(node22);
        node20.setNode(20);
        node16.setLeft(node13);
        node16.setRight(node20);
        node16.setNode(16);
        return node16;
    }


}
