package com.test.tucm.base.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author TUCM
 * @Date 2020-03-06 21:18
 * @Version 1.0
 **/
public class Main {
	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 20000; i++) {
			list.add(i);
		}
		for (final int a : list) {
			try {
				executorService.execute(new Runnable() {
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
		System.out.println("main thread is over.");
	}
}
