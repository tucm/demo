package com.test.tucm.base.string;

/**
 * null 和 ""的差异。null：对象未实例化 ""：对象实例化，长度和内容都为0
 * 
 * @Author owl
 * @Date 2020-07-12 16:51
 * @Version 1.0
 **/
public class Main {
	public static void main(String[] args) {
		String str1 = null;
		String str2 = "";
		System.out.println("str1" + str2);
		System.out.println("Str1" + str2.length());

	}
}
