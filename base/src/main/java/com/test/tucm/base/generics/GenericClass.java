package com.test.tucm.base.generics;

/**
 * 泛型类
 * 
 * @Author owl
 * @Date 2020/10/6 下午7:47
 * @Version 1.0
 **/
public class GenericClass<T> {
	public void method(T t) {
		System.out.println("generic class method callled " + t);
	}
}
