package com.test.tucm.base.proxy.cglib;

/**
 * @ClassName SqlService
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-22 15:36
 * @Version 1.0
 **/
public class SqlService {

    public void executeSql1() throws InterruptedException {
        System.out.println("Sql 开始执行.....");
        Thread.sleep(1000);
        System.out.println("Sql 执行结束.....");
    }
}
