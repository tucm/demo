package com.test.tucm.base.collections;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {

        Stack stack = new Stack();
        //测试堆栈是否为空。
        System.out.println(stack.empty());
        stack.push(1);
        stack.push("str");
        //查看堆栈顶部的对象，但不从堆栈中移除它。
        System.out.println(stack.peek());
        //返回对象在堆栈中的位置，以 1 为基数。不存在返回-1
        System.out.println(stack.search(1));
        System.out.println(stack.size());
        //移除堆栈顶部的对象，并作为此函数的值返回该对象。
        System.out.println(stack.pop());


    }
}
