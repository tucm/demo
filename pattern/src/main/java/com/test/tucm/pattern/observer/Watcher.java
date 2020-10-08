package com.test.tucm.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * jdk方式实现观察者
 * 
 * @Author owl
 * @Date 2020/10/4 下午7:56
 * @Version 1.0
 **/
public class Watcher implements Observer {

	public Watcher(Observable o) {
		o.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("状态发生改变：" + ((Watched) o).getData());
	}
}
