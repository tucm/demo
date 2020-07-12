package com.test.tucm.spring.context;

import com.test.tucm.spring.cycle.InitBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName ApplicationContextTest
 * @Description TODO
 * @Author owl
 * @Date 2020-04-06 18:00
 * @Version 1.0
 **/
public class ApplicationContextTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        InitBean initBean = (InitBean) context.getBean("initBean");
        initBean.say();


    }
}
