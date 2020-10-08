package com.test.tucm.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author owl
 * @Date 2020/10/5 下午3:59
 * @Version 1.0
 **/
public class MyInvocationHandler implements InvocationHandler {
	private Object obj;

	public MyInvocationHandler(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("proxy handler called");
		Object returnVal = method.invoke(obj, args);
		return returnVal;
	}
}
