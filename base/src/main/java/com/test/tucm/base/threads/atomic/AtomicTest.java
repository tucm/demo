package com.test.tucm.base.threads.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 保证多线程赋值的线程安全<br/>
 * 原理:<br/>
 * volatile和cas以及jdk的unsafe类
 * 
 * @Author owl
 * @Date 2020/10/8 下午6:31
 * @Version 1.0
 **/
public class AtomicTest {
	public static void main(String[] args) {
		AtomicInteger atomicInteger = new AtomicInteger(1);
		atomicInteger.compareAndSet(1, 2);

	}
}
