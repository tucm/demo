package com.test.tucm.base.declarewords;

/**
 * 子类与基类不在同一包中：那么在子类中，子类实例可以访问其从基类继承而来的 protected 方法，而不能访问基类实例的protected方法
 * 
 * @Author owl
 * @Date 2020/10/8 下午4:46
 * @Version 1.0
 **/
public class DefaultProtectTest {
	public static void main(String[] args) {
		Son son = new Son();
		son.method4();

	}
}
