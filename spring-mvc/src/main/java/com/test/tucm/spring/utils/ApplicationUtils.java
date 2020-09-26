package com.test.tucm.spring.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @ClassName ApplicationUtils
 * @Description TODO
 * @Author owl
 * @Date 2020/9/26 下午8:22
 * @Version 1.0
 **/
public class ApplicationUtils implements ApplicationContextAware {

	private static ApplicationContext context = null;

	public static ApplicationContext getApplicationContext() {
		return context;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}
}
