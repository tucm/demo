package com.test.tucm.base.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @ClassName ArrayBlockingQueueTest
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-29 17:20
 * @Version 1.0
 **/
public class ArrayBlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        //创建一个固定大小的队列
        final BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);
        System.out.println("comsumer start");
        //创建10个消费者
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            String log = queue.take();
                            System.out.println(Thread.currentThread().getName() + "=>" + log);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }
        System.out.println("comsumer end");
        //生产数据
        System.out.println("producer start");
        for (int i = 0; i < 100; i++) {
            queue.put(i + 1 + "");
        }
        System.out.println("producer end");

    }
}
