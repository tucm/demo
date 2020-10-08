package com.test.tucm.base.statics;

/**
 * 静态常量值存储在JVM内存中的常量区中，在类不加载时即可访问 <br/>
 * 静态变量要在类被初始化时才加载到jvm常量区中
 * 
 * @Author owl
 * @Date 2020/10/8 下午3:54
 * @Version 1.0
 **/
public class StaticTest {
	public static void main(String[] args) {
		System.out.println("StaticClassLoadTest...");
		printStaticVar();
	}

	private static void printStaticVar() {
		System.out.println(StaticClass.FIANL_VALUE);
		System.out.println(StaticClass.VALUE);
	}
}
