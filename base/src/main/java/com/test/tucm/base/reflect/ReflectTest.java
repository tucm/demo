package com.test.tucm.base.reflect;

import java.lang.reflect.Method;

/**
 * 
 * 反射访问私有方法需要设置method.setAccessible(true);
 * 
 * @Author TUCM
 * @Date 2020-03-21 17:57
 * @Version 1.0
 **/
public class ReflectTest {
	public static void main(String[] args) throws Exception {
		// 获取类
		Class<?> aClass = Class.forName("com.test.tucm.base.reflect.A");
		// 若要指定有参的构造方法，则可通过aClass.getConstructor(参数类型).newInstance(参数)获取实例化的对象
		// 实例化（无参构造方法）
		Object object = aClass.newInstance();
		// 定义方法输入参数
		Class partypes[] = new Class[1];
		// 定义方法输入参数：第一个参数为String类型
		partypes[0] = String.class;
		// 获取方法
		Method method = aClass.getDeclaredMethod("method", partypes);
		// 访问私有方法
		method.setAccessible(true);
		// 调用方法
		method.invoke(object, "tom");
	}
}
