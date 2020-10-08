package com.test.tucm.base.innerClass;

/**
 * 即使用内部类可以使用多重继承<br/>
 * 成员内部类
 * 
 * @Author owl
 * @Date 2020/10/8 下午9:06
 * @Version 1.0
 **/
public class MemberInnerClassTest extends A {
	class InnerClass extends B {
		public void merge() {
			// 内部类可以访问外部类成员和方法（不管是否是private）
			a();
			b();
		}

	}

	public static void main(String[] args) {
//		InnerClassTest innerClassTest = new InnerClassTest();
//		InnerClassTest.InnerClass innerClass = innerClassTest.new InnerClass();
//      innerClassTest.a();
//		innerClass.b();
		MemberInnerClassTest memberInnerClassTest = new MemberInnerClassTest();
		MemberInnerClassTest.InnerClass innerClass = memberInnerClassTest.new InnerClass();
		innerClass.merge();
	}
}
