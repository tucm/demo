package com.test.tucm.pattern.decorate;

/**
 * 具体类
 * 
 * @Author owl
 * @Date 2020/10/4 下午3:23
 * @Version 1.0
 **/
public class ConcreteComponent implements Component {
	@Override
	public void function() {
		System.out.println("基本功能：呼吸+觅食+睡觉");
	}
}
