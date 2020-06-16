package com.test.tucm.base.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @ClassName Main
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-22 15:40
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        SqlService sqlService = new SqlService();
        SqlProxyCglib sqlProxyCglib = new SqlProxyCglib(sqlService);
        //创建加强器，用来创建动态代理类
        Enhancer enhancer = new Enhancer();
        //为加强器指定要代理的业务类（即：为下面生成的代理类指定父类）
        enhancer.setSuperclass(sqlService.getClass());
        //设置回调：对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法进行拦
        enhancer.setCallback(sqlProxyCglib);
        // 创建动态代理类对象并返回
        SqlService sqlServiceProxy = (SqlService) enhancer.create();
        // 调用
        sqlServiceProxy.executeSql1();
    }
}
