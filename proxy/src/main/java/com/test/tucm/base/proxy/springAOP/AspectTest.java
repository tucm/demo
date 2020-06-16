package com.test.tucm.base.proxy.springAOP;

import com.zzx.study.aspect.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName AspectTest
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-22 19:14
 * @Version 1.0
 **/
public class AspectTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TestBean bean = (TestBean) context.getBean("test");
        bean.test();
    }
}
