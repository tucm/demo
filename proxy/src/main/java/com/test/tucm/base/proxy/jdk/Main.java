package com.test.tucm.base.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @ClassName Main
 * @Description jdk代理类通过动态实现接口生成代理类
 * 通过实现 InvocationHandler 接口创建自己的调用处理器类；
 * 通过为 Proxy 类指定 ClassLoader 对象和一组 interface 来创建动态代理类；
 * 通过构造函数创建动态代理类实例，构造时调用处理器对象（handler）作为参数被传入。
 * @Author TUCM
 * @Date 2020-03-22 15:01
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        //创建要被代理的真实对象
        RealSubjectInterface realSubject = new RealSubject();
        //设置代理对象
        InvocationHandler handler = new InvocationHandlerImpl(realSubject);
        ClassLoader loader = realSubject.getClass().getClassLoader();
        Class[] interfaces = realSubject.getClass().getInterfaces();
        //Proxy.newProxyInstance该方法用于为指定类加载器，一组接口，调用处理器生成动态代理类对象
        RealSubjectInterface realSubjectProxy = (RealSubjectInterface) Proxy.newProxyInstance(loader, interfaces, handler);
        System.out.println("动态代理对象的类型：" + realSubjectProxy.getClass().getName());
        //用动态代理类对象 调用真实对象的方法
        System.out.println(realSubjectProxy.SayHello("Jason zhang"));
    }
}
