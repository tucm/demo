package com.test.tucm.pattern.observer;

import java.util.Observable;

/**
 * jdk方式实现被观察者
 * 
 * @Author owl
 * @Date 2020/10/4 下午7:51
 * @Version 1.0
 **/
public class Watched extends Observable {

	private String data = "";

	public String getData() {
		return data;
	}

	/**
	 * 自定义被观察者变化状态
	 * 
	 * @param data
	 */
	public void setData(String data) {

		if (!this.data.equals(data)) {
			this.data = data;
			setChanged();
		}
		notifyObservers();
	}
}
