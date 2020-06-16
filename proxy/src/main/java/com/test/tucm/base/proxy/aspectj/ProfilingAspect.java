package com.test.tucm.base.proxy.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @ClassName ProfilingAspect
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-22 17:31
 * @Version 1.0
 **/
@Aspect
public class ProfilingAspect {

    @Before("methodsToBeProfiled()")
    public void profile() {
        System.out.println("这是一个优雅的拦截器");

    }

    @Pointcut("execution(* method*(..))")
    public void methodsToBeProfiled() {
    }
}
