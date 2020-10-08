package com.test.tucm.base.classloader;

/**
 * @Author owl
 * @Date 2020/10/5 下午5:47
 * @Version 1.0
 **/
public class ClassloaderTest {
	public static void main(String[] args) {
//		ClassLoader.getSystemClassLoader();
//		Class<?> aClass = A.class;
//		System.out.println(aClass.getClassLoader().toString());
		// classloadExtends();
		System.out.println(A.class.getClassLoader().toString());
		System.out.println(Thread.currentThread().getContextClassLoader().toString());
		System.out.println(ClassLoader.getSystemClassLoader().toString());

	}

	/**
	 * 类加载器继承情况 <br/>
	 * notice：父类加载器是引导类加载器的情况， getParent() 方法返回 null <br/>
	 * 输出：<br/>
	 * sun.misc.Launcher$AppClassLoader@18b4aac2
	 * sun.misc.Launcher$ExtClassLoader@36baf30c
	 */
	public static void classloadExtends() {
		ClassLoader loader = A.class.getClassLoader();
		while (loader != null) {
			System.out.println(loader.toString());
			loader = loader.getParent();
		}
	}
}
