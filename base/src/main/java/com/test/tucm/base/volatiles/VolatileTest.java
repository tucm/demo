package com.test.tucm.base.volatiles;

/**
 * volatile 数据可见性并不能保正线程安全<br/>
 * 
 * 
 * @Author owl
 * @Date 2020/10/8 下午5:28
 * @Version 1.0
 **/
public class VolatileTest {

	private static volatile int count = 0;

	public static void main(String[] args) {
		Thread[] threads = new Thread[5];
		for (int i = 0; i < 5; i++) {
			threads[i] = new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						for (int j = 0; j < 10; j++) {
							count = count++;
							System.out.println(count);
							Thread.sleep(500);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			threads[i].start();
		}
	}
}
