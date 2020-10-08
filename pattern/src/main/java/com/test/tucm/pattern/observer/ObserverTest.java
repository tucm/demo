package com.test.tucm.pattern.observer;

/**
 * <p>
 * 观察者模式
 * </p>
 * <p>
 * 观察者observer在被观察者subject中注册（被观察者有个变量来存储）
 * </p>
 * <p>
 * 当被观察者（subject）发生变化，会回调观察者的更新方法 （调用被观察者变化方法，变化方法内部在调用注册观察者的具体方法）
 * </p>
 * <p>
 * jdk中有观察者模式的实现util包下的Observer（观察者实现）接口和Observable类（被观察者继承，实现自定义变化逻辑）
 * <p/>
 * 
 * @Author owl
 * @Date 2020/10/4 下午7:22
 * @Version 1.0
 **/
public class ObserverTest {
	public static void main(String[] args) {
		/* 以下为自定义模拟的实现方式 */
//		// 创建主题对象
//		ConcreteSubject subject = new ConcreteSubject();
//		// 创建观察者对象
//		Observer observer = new ConcreteObserver();
//		// 将观察者对象登记到主题对象上
//		subject.attach(observer);
//		// 改变主题对象的状态
//		subject.change("new state");
		/* 以下为jdk实现方式 */
		// 创建被观察者对象
		Watched watched = new Watched();
		// 创建观察者对象，并将被观察者对象登记
		Watcher watcher = new Watcher(watched);
		// 给被观察者状态赋值
		watched.setData("start");
		watched.setData("run");
		watched.setData("stop");
	}
}
