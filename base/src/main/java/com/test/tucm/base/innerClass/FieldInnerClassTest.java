package com.test.tucm.base.innerClass;

/**
 * 定义在作用域内的内部类
 * 
 * @Author owl
 * @Date 2020/10/8 下午9:26
 * @Version 1.0
 **/
public class FieldInnerClassTest {
	public void c(boolean flag) {
		if (flag) {
			// 作用在作用域内的内部类
			class D {
				public void d() {
					System.out.println("field class d method called ");
				}
			}
			D d = new D();
			d.d();

		}
	}

	public static void main(String[] args) {
		FieldInnerClassTest fieldInnerClassTest = new FieldInnerClassTest();
		fieldInnerClassTest.c(true);

	}
}
