package com.test.tucm.pattern.proxy.statics;

/**
 * 代理类
 * 
 * @Author owl
 * @Date 2020/10/5 下午3:47
 * @Version 1.0
 **/
public class ProxyComponent implements ComponentInterface {

	private Component component;

	public ProxyComponent(Component component) {
		this.component = component;
	}

	@Override
	public void func() {
		System.out.println("proxy component called");
		component.func();
	}
}
