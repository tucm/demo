package com.test.tucm.base.proxy.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Main
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-22 17:40
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        MyService myService = (MyService) ctx.getBean("myService");
        // the profiling aspect is 'woven' around this method execution
        myService.method();
    }
}
