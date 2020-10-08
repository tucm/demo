package com.test.tucm.pattern.proxy.statics;

/**
 *
 * <p>
 * 静态代理
 * </p>
 * 静态代理在使用时,需要定义接口或者父类,被代理对象与代理对象一起实现相同的接口或者继承相同的父类 <br/>
 * 代理类传入被代理（目标）对象
 * <p>
 * 静态代理总结:
 * </p>
 * ①可以做到在不修改目标对象功能的情况下,对目标对象进行功能扩展
 * ②因为代理对象需要与目标对象实现相同的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法, 目标对象与代理对象都需要维护.
 * 
 * @Author owl
 * @Date 2020/10/5 下午3:48
 * @Version 1.0
 **/
public class StaticProxyTest {
	public static void main(String[] args) {
		Component component = new Component();
		ProxyComponent proxyComponent = new ProxyComponent(component);
		proxyComponent.func();
	}
}
