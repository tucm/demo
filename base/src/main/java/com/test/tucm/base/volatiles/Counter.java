package com.test.tucm.base.volatiles;

public class Counter {
    public static int num = 0;
    public static int num2 = 0;

    //使用CountDownLatch来等待计算线程执行完
    //static CountDownLatch countDownLatch = new CountDownLatch(30);
    public static void main(String[] args) throws InterruptedException {
        //开启30个线程进行累加操作
        for (int i = 0; i < 30; i++) {
            Thread thread = new Thread() {
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        //num++;//自加操作，不具备原子性
                        synchronized (this) {
                            num++;
                        }
                        num2++;

                    }
                    //countDownLatch.countDown();
                }
            };
            thread.start();
            //thread.join();
        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //等待计算线程执行完
        // countDownLatch.await();
        System.out.println(num);
        System.out.println(num2);
    }


}
