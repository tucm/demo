package com.test.tucm.spring.dispatcherServlet;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @ClassName MyWebApplicationInitializer
 * @Description
 *              以api的方式初始化DispatcherServlet
 *              另还有以web.xml的方式初始化
 * @Author owl
 * @Date 2020-06-13 16:58
 * @Version 1.0
 **/
public class MyWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {

        System.out.println("initing dispatcher servler..");
        // Load Spring web application configuration
        //AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        //ac.register(AppConfig.class);
        //ac.refresh();

        // Create and register the DispatcherServlet
        //DispatcherServlet servlet = new DispatcherServlet(ac);
        //ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
        //registration.setLoadOnStartup(1);
        //registration.addMapping("/app/*");

        XmlWebApplicationContext appContext = new XmlWebApplicationContext();
        appContext.setConfigLocation("classpath:/app-context.xml");

        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher", new DispatcherServlet(appContext));
        registration.setLoadOnStartup(1);
        registration.addMapping("/");


    }
}
