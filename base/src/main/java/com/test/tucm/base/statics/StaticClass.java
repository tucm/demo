package com.test.tucm.base.statics;

/**
 * @Author owl
 * @Date 2020/10/8 下午3:55
 * @Version 1.0
 **/
public class StaticClass {
	static {
		System.out.println("StaticClass loading...");
	}

	public static String VALUE = "static value loading";

	public static final String FIANL_VALUE = "fianl value loading";

}
