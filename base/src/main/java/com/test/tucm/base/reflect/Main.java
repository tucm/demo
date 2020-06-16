package com.test.tucm.base.reflect;

import java.lang.reflect.Method;

/**
 * @ClassName Main
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-21 17:57
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) throws Exception {
        //获取类
        Class<?> aClass = Class.forName("com.test.tucm.base.reflect.A");
        //实例化
        Object object = aClass.newInstance();
        //定义方法输入参数
        Class partypes[] = new Class[1];
        //定义方法输入参数：第一个参数为String类型
        partypes[0] = String.class;
        //获取方法
        Method method = aClass.getDeclaredMethod("hello", partypes);
        //调用方法
        method.invoke(object, "tom");
    }
}
