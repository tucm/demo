package com.test.tucm.base.threads.communication;

/**
 * @ClassName MyThread
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-29 15:18
 * @Version 1.0
 **/
class MyThread implements Runnable {
    private boolean flag;
    private Object object;

    //定义一个构造方法
    public MyThread(boolean flag, Object object) {
        this.flag = flag;
        this.object = object;
    }

    //定义一个普通方法,其中调用了wait()方法
    public void waitThread() {
        synchronized (this.object) {
            try {
                System.out.println("调用wait()前------" + Thread.currentThread().getName());
                //调用wait()方法
                this.object.wait();
                System.out.println("调用wait()后------" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //定义一个普通方法,其中调用了notify()方法
    public void notifyThread() {
        synchronized (this.object) {
            try {
                System.out.println("调用notify前------" + Thread.currentThread().getName());
                //调用notify()方法
                this.object.notify();
                System.out.println("调用notify()后------" + Thread.currentThread().getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        if (this.flag) {
            this.waitThread();
        } else {
            this.notifyThread();
        }
    }
}

