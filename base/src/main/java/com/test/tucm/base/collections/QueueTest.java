package com.test.tucm.base.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        for (String string : queue) {
            System.out.println(string);

        }

    }
}
