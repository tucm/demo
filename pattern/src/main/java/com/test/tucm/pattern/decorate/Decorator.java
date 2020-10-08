package com.test.tucm.pattern.decorate;

/**
 * 装饰角色
 * 
 * @Author owl
 * @Date 2020/10/4 下午3:24
 * @Version 1.0
 **/
public class Decorator implements Component {
	private Component component; // 持有一个Component类型的对象引用

	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void function() {
		component.function(); // 客户端的调用委派给具体的子类
	}

}
