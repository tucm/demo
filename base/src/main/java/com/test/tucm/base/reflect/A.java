package com.test.tucm.base.reflect;

/**
 * @Author TUCM
 * @Date 2020-03-21 18:03
 * @Version 1.0
 **/
public class A {

	public void hello(String a) {
		System.out.println("hello world:" + a);
	}

	private void method(String a) {
		System.out.println("private method called by" + a);
	}
}
