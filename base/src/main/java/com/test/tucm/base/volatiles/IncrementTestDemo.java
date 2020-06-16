package com.test.tucm.base.volatiles;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName IncrementTestDemo
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-08 19:33
 * @Version 1.0
 **/
public class IncrementTestDemo {
    public static int count = 0;
    public static Counter2 counter = new Counter2();
    public static AtomicInteger atomicInteger = new AtomicInteger(0);

    volatile public static int countVolatile = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            Thread thread = new Thread() {
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        count++;
                        counter.increment();
                        atomicInteger.getAndIncrement();
                        countVolatile++;
                    }
                }
            };
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("static count: " + count);
        System.out.println("Counter: " + counter.getValue());
        System.out.println("AtomicInteger: " + atomicInteger.intValue());
        System.out.println("countVolatile: " + countVolatile);
    }

}

class Counter2 {
    private int value;

    public synchronized int getValue() {
        return value;
    }

    public synchronized int increment() {
        return ++value;
    }

    public synchronized int decrement() {
        return --value;
    }
}
