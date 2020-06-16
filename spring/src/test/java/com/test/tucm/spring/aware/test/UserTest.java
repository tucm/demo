package com.test.tucm.spring.aware.test;

import com.test.tucm.spring.aware.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName UserTest
 * @Description TODO
 * @Author owl
 * @Date 2020-04-06 21:55
 * @Version 1.0
 **/
public class UserTest {

    @Test
    public void setBeanName() {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        User user = (User) context.getBean("zhangsan");
        System.out.println("实现了BeanNameAware接口的信息BeanId="+user.getId());

    }
}