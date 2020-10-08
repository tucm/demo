package com.test.tucm.pattern.proxy.dynamic;

/**
 * 真实被代理类（目标类）
 * 
 * @Author owl
 * @Date 2020/10/5 下午3:44
 * @Version 1.0
 **/
public class Component implements ComponentInterface {
	@Override
	public void func() {
		System.out.println("concrete component func called");
	}
}
