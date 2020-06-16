package com.test.tucm.cache.springCache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @ClassName Main
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-15 16:17
 * @Version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        //        AccountService2 accountService2;
        //        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        //        accountService2 = context.getBean("accountService2", AccountService2.class);
        //        Account account1 = accountService2.getAccountByName("accountName");
        //        Account account2 = accountService2.getAccountByName("accountName");
        //        logger.info("account1=[{}]", account1.getName());
        //        logger.info("account2=[{}]", account2.getName());
        //spring-cache-test
        AccountService1 accountService1;
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
        accountService1 = context.getBean("accountService1", AccountService1.class);
        Account account1 = accountService1.getAccountByName("accountName");
        Account account2 = accountService1.getAccountByName("accountName");
        logger.info("account1=[{}]", account1.getName());
        logger.info("account2=[{}]", account2.getName());


    }
}
