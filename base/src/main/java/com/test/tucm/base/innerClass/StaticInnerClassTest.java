package com.test.tucm.base.innerClass;

/**
 * 静态内部类<br/>
 * 1、它的创建是不需要依赖于外围类的。(调用方式为：new InnerStaticClass1().display();)<br/>
 * 2、它不能使用任何外围类的非static成员变量和方法。<br/>
 * 
 * @Author owl
 * @Date 2020/10/8 下午9:55
 * @Version 1.0
 **/
public class StaticInnerClassTest {
	static class E {
		private static String field = "inner class field";

		public void method() {
			System.out.println("inner e class method called ");
		}
	}

	public static void main(String[] args) {
		// 外围类访问静态内部类静态变量
		System.out.println(E.field);
		// 静态内部类 可以直接创建实例不需要依赖于外围类
		E e = new E();
		e.method();

	}
}
