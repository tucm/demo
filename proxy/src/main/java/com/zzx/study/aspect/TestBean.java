package com.zzx.study.aspect;

/**
 * @ClassName TestBean
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-22 19:11
 * @Version 1.0
 **/
public class TestBean implements IITestBean {
    @Override
    public void test() {
        System.out.println("test");
    }
}
