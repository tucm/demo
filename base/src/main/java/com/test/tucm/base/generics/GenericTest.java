package com.test.tucm.base.generics;

/**
 * @Author owl
 * @Date 2020/10/6 下午7:46
 * @Version 1.0
 **/
public class GenericTest {
	public static void main(String[] args) {
		// 泛型类
//		GenericClass<Integer> aa = new GenericClass();
//		aa.method(1);
		// 泛型方法
		GenericMethod genericMethod = new GenericMethod();
		genericMethod.method(1);

	}
}
