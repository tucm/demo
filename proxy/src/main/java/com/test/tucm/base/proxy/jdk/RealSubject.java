package com.test.tucm.base.proxy.jdk;

/**
 * @ClassName RealSubject
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-22 15:16
 * @Version 1.0
 **/
public class RealSubject implements RealSubjectInterface {

    @Override
    public String SayHello(String name) {
        return "hello, " + name;
    }

    @Override
    public String SayGoodBye() {
        return " good bye ";
    }
}
