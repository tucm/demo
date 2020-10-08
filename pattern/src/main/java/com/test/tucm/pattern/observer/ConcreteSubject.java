package com.test.tucm.pattern.observer;

/**
 * 自定义方式实现观察者-被观察者（实际主题）
 * 
 * @Author owl
 * @Date 2020/10/4 下午7:21
 * @Version 1.0
 **/
public class ConcreteSubject extends Subject {
	private String state;

	public String getState() {
		return state;
	}

	public void change(String newState) {
		state = newState;
		System.out.println("主题状态为：" + state);
		// 状态发生改变，通知各个观察者
		this.nodifyObservers(state);
	}
}
