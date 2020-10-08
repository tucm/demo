package com.test.tucm.pattern.observer;

/**
 * 自定义方式实现观察者-观察者接口
 * 
 * @Author owl
 * @Date 2020/10/4 下午7:21
 * @Version 1.0
 **/
public interface Observer {
	/**
	 * 更新接口
	 * 
	 * @param state 更新的状态
	 */
	public void update(String state);
}
