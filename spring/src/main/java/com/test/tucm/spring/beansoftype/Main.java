package com.test.tucm.spring.beansoftype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @ClassName Main
 * @Description getBeansOfType 获取继承某个类的所有bean
 * @Author owl
 * @Date 2020-07-12 18:39
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        //context.getBeansOfType();
        Map<String, Student> map = context.getBeansOfType(Student.class);
        for (Map.Entry<String, Student> entry : map.entrySet()) {
            //输出
            //this is xiaohong study
            //this is xiaoming study
            entry.getValue().study();
        }

    }
}
