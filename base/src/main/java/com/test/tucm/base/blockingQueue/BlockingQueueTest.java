package com.test.tucm.base.blockingQueue;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * lockingQueue不允许插入空值<br/>
 * 此例子回报异常
 * 
 * @Author owl
 * @Date 2020/10/8 下午10:13
 * @Version 1.0
 **/
public class BlockingQueueTest {
	public static void main(String[] args) throws InterruptedException {
		PriorityBlockingQueue<String> queue = new PriorityBlockingQueue<String>();
		queue.put(null);
		queue.take();

	}
}
