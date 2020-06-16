package com.test.tucm.spring.cycle.test;

import com.test.tucm.spring.cycle.InitBean;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @ClassName InitBeanTest
 * @Description TODO
 * @Author owl
 * @Date 2020-04-06 21:21
 * @Version 1.0
 **/
public class InitBeanTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void say() {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        InitBean initBean =(InitBean) context.getBean("initBean");
        initBean.say();
    }
}