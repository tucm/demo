package com.test.tucm.base.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author TUCM
 * @Date 2020-03-28 18:50
 * @Version 1.0
 **/
public class ThreadA extends Thread {
	public ThreadA(String name) {
		super(name);
	}

	public void run() {
		synchronized (this) {
			// this.conrrentThread();
			try {
				Thread.sleep(2000); // 使当前线阻塞 1 s，确保主程序的 t1.wait(); 执行之后再执行 notify()
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " call notify()");
			// 唤醒当前的wait线程
			this.notify();
		}
	}

	private void conrrentThread() {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 20000; i++) {
			list.add(i);
		}
		for (final int a : list) {
			try {
				executorService.submit(new Runnable() {
					@Override
					public void run() {
						if (a % 10 == 0) {
							throw new NullPointerException("this is a exception :" + a);
						}
						System.out.println("a:" + a);

					}
				});

			} catch (Exception e) {
				System.out.println("around exception :" + e.getMessage());
				throw e;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		executorService.shutdown();
		// System.out.println("main thread is over.");
	}
}
