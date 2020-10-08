package com.test.tucm.pattern.decorate;

/**
 * 具体装饰角色
 * 
 * @Author owl
 * @Date 2020/10/4 下午3:24
 * @Version 1.0
 **/
public class ConcreteDecorator extends Decorator {
	public ConcreteDecorator(Component component) {
		super(component);
	}

	@Override
	public void function() {
		super.function();
		System.out.println("附加功能：");
		this.eat();
		this.bellow();

	}

	private void eat() {
		System.out.println("吃肉");
	}

	private void bellow() {
		System.out.println("吼叫");
	}

}
