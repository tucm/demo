package com.test.tucm.spring.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @ClassName InitBean
 * @Description TODO
 * @Author owl
 * @Date 2020-04-06 18:45
 * @Version 1.0
 **/
public class InitBean  implements InitializingBean, DisposableBean , BeanPostProcessor {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("this is a implement InitializingBean.afterPropertiesSet");

    }
    public  void  say(){
        System.out.println("this is a say method.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("this is a implement DisposableBean.destroy");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("this is a implement BeanPostProcessor.postProcessBeforeInitialization");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("this is a implement BeanPostProcessor.postProcessAfterInitialization");
        return null;
    }
}
