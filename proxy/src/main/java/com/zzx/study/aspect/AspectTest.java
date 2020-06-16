package com.zzx.study.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName AspectTest
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-22 19:12
 * @Version 1.0
 **/
@Aspect
public class AspectTest {
    @Pointcut("execution(* *.test(..))")
    public void test() {
        System.out.println("我切入了");
    }

    @Before("test()")
    public void beforeTest() {
        System.out.println("beforeTest()");
    }

    @After("test()")
    public void afterTest() {
        System.out.println("afterTest()");
    }

    @Around("test()")
    public Object aroundTest(ProceedingJoinPoint p) {
        System.out.println("before1");
        Object o = null;
        try {
            o = p.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("after1");
        return o;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TestBean bean = (TestBean) context.getBean("test");
        bean.test();
    }
}
