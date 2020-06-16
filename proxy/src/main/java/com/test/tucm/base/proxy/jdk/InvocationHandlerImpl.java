package com.test.tucm.base.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName InvocationHandlerImpl
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-22 15:18
 * @Version 1.0
 **/
public class InvocationHandlerImpl implements InvocationHandler {

    /**
     * 我们要代理的真实对象
     */
    private Object realSubject;//为了new InvocationHandlerImpl(realSubject);传参名一致

    /**
     * 构造函数，为真实对象赋初值
     */
    public InvocationHandlerImpl(Object realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //在代理真实对象前可以添加额外操作
        System.out.println("在用代理对象调用真实对象的方法之前，类似AOP的Before()，自己的操作：");
        System.out.println("其调用的方法Method:" + method);
        //当代理对象调用真实对象的方法时，其会自动跳转到代理对象关联的handler对象的invoke方法来进行调用
        Object returnValue = method.invoke(realSubject, args);
        //在代理真实对象之后可以添加额外操作
        System.out.println("在用代理对象调用真实对象的方法之后，但是返回值returnValue之前，自己的操作?");
        return returnValue;
    }
}
