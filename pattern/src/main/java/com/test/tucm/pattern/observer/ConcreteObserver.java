package com.test.tucm.pattern.observer;

/**
 * 自定义方式实现观察者-观察者实例
 * 
 * @Author owl
 * @Date 2020/10/4 下午7:22
 * @Version 1.0
 **/
public class ConcreteObserver implements Observer {
	// 观察者的状态
	private String observerState;

	@Override
	public void update(String state) {
		/**
		 * 更新观察者的状态，使其与目标的状态保持一致
		 */
		observerState = state;
		System.out.println("状态为：" + observerState);
	}
}
