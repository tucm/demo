package com.test.tucm.base.threads.communication;

/**
 * @ClassName Test
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-29 15:20
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Object object = new Object();
        Object object2 = new Object();
        //实例化调用wait()的线程
        MyThread wait = new MyThread(true, object);
        Thread waitThread = new Thread(wait, "wait线程");
        //实例化调用notify()的线程
        MyThread notify = new MyThread(false, object);
        Thread notifyThread = new Thread(notify, "notify线程");
        //启动线程
        waitThread.start();
        //调用一下sleep()方法，使得查看效果更明显
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyThread.start();
    }


}
