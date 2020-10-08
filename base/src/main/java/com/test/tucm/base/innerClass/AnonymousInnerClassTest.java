package com.test.tucm.base.innerClass;

/**
 * 
 * 1、匿名内部类是没有访问修饰符的。<br/>
 * 2、new 匿名内部类，这个类首先是要存在的。如果我们将那个InnerClass接口注释掉，就会出现编译出错。<br/>
 * 3、注意getInnerClass()方法的形参，第一个形参是用final修饰的，而第二个却没有。同时我们也发现第二个形参在匿名内部类中没有使用过，<br/>
 * 所以当所在方法的形参需要被匿名内部类使用，那么这个形参就必须为final。<br/>
 * 4、匿名内部类是没有构造方法的。因为它连名字都没有何来构造方法<br/>
 * 
 * 匿名内部类引用外部类参数为什么必须要为final呢?<br/>
 * 拷贝引用，为了避免引用值发生改变，例如被外部类的方法修改等，而导致内部类得到的值不一致，于是用final来让该引用不可改变。
 * 
 * @Author owl
 * @Date 2020/10/8 下午9:39
 * @Version 1.0
 **/
public class AnonymousInnerClassTest {
	public MyInterface e(final String str) {
		return new MyInterface() {
			@Override
			public void method() {
				System.out.println("my anonymous innerclass called " + str);

			}
		};
	}

	public static void main(String[] args) {
		AnonymousInnerClassTest anonymousInnerClassTest = new AnonymousInnerClassTest();
		anonymousInnerClassTest.e("haha").method();

	}

	interface MyInterface {
		void method();
	}
}
