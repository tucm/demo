package com.test.tucm.base.threadpool;

import java.util.concurrent.Executors;

/**
 * @Author owl
 * @Date 2020/10/6 下午8:09
 * @Version 1.0
 **/
public class FixedThreadPoolTest {
	public static void main(String[] args) {
		Executors.newFixedThreadPool(1).submit(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		});

	}
}
