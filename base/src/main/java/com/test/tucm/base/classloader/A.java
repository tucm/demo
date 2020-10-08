package com.test.tucm.base.classloader;

/**
 * @Author TUCM
 * @Date 2020-03-21 18:03
 * @Version 1.0
 **/
public class A {
	static {
		System.out.println("static called");
	}

	public void hello(String a) {
		System.out.println("hello world:" + a);
	}
}
