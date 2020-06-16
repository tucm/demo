package com.test.tucm.base.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName SqlProxyCglib
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-22 15:36
 * @Version 1.0
 **/
public class SqlProxyCglib implements MethodInterceptor {

    /**
     * 被代理的对象
     */
    private Object target;

    public SqlProxyCglib(Object target) {
        this.target = target;
    }

    /**
     * 实现回调方法
     *
     * @param o 代理的对象
     * @param method 被代理对象的方法
     * @param objects 参数集合
     * @param methodProxy 生成的代理类的方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("这是一个优雅的拦截器");
        //调用业务类（父类中）的方法
        Object result = methodProxy.invokeSuper(o, objects);
        return result;
    }
}
