package com.test.tucm.base.dynamic.param;

/**
 * 动态参数-相当于传入一个数组 <br/>
 * 从个数来看，可变参数只能有一个，数组可以有多个<br/>
 * 从定义位置来看，可变参数只能定义在参数列表的末尾，数组可以在任何位置<br/>
 * 从传参的形式来看，可变参数可以传数组、null、0个参数、一到多个参数，数组可以传数组引用、数组对象、null<br/>
 * 方法重载：方法名相同，但是参数列表不一致，重载的方法会根据参数来匹配调用<br/>
 * 
 * @Author owl
 * @Date 2020/10/6 下午5:40
 * @Version 1.0
 **/
public class DynamicParamTest {
	public void show(int a) {
		System.out.println("带有一个参数的方法");
	}

	public void show(int... a) {
		System.out.println("带有可变参数的方法");
	}

	public static void main(String[] args) {
		DynamicParamTest m1 = new DynamicParamTest();
		// public void show(int... a)
		m1.show();
		// public void show(int a)
		m1.show(6);// 优先调用参数匹配的方法
		// public void show(int... a)
		m1.show(new int[] { 5, 7, 9, 1 });
		// public void show(int... a)
		m1.show(1, 2, 3, 4);
	}
}
