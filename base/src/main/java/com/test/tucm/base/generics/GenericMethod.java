package com.test.tucm.base.generics;

/**
 * 泛型方法
 * 
 * @Author owl
 * @Date 2020/10/6 下午7:50
 * @Version 1.0
 **/
public class GenericMethod {
	public <E> void method(E e) {
		System.out.println("geneic method called " + e);
	}
}
