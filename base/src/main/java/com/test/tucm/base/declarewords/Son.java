package com.test.tucm.base.declarewords;

import com.test.tucm.base.declarewords.b.Parent;

/**
 * @Author owl
 * @Date 2020/10/8 下午4:49
 * @Version 1.0
 **/
public class Son extends Parent {
	@Override
	protected void method2() {
		super.method2();
	}

	@Override
	public void method3() {
		super.method3();
	}

	protected void method4() {
		super.method2();
	}
}
