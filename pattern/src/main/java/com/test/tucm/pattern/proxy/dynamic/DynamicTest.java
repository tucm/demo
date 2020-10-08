package com.test.tucm.pattern.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * @Author owl
 * @Date 2020/10/5 下午4:52
 * @Version 1.0
 **/
public class DynamicTest {
	public static void main(String[] args) {

		// 1. 创建被代理的对象，UserService接口的实现类
		Component component = new Component();
		// 2. 获取对应的 ClassLoader
		ClassLoader classLoader = component.getClass().getClassLoader();
		// 3. 获取所有接口的Class，这里的UserServiceImpl只实现了一个接口UserService，
		Class[] interfaces = component.getClass().getInterfaces();
		// 4. 创建一个将传给代理类的调用请求处理器，处理所有的代理对象上的方法调用
		MyInvocationHandler handler = new MyInvocationHandler(component);
		// 5.根据上面提供的类加载器、实现接口（新类所需要实现的接口）、handler动态创建新类
		ComponentInterface proxy = (ComponentInterface) Proxy.newProxyInstance(classLoader, interfaces, handler);
		// 调用代理的方法
		proxy.func();

		// 保存JDK动态代理生成的代理类，类名保存为 UserServiceProxy
		// ProxyUtils.generateClassFile(userServiceImpl.getClass(), "UserServiceProxy");
	}
}
