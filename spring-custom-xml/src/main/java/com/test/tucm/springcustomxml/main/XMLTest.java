package com.test.tucm.springcustomxml.main;

import com.test.tucm.springcustomxml.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xmltest.xml");
        Student student = (Student) applicationContext.getBean(Student.class.getName());
        System.out.println("name: " + student.getName() + " id: " + student.getId());
    }
}
