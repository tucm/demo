package com.test.tucm.spring.nullsafety;

import com.sun.istack.internal.Nullable;

/**
 * @ClassName NullDemo
 * @Description TODO
 *      @NotNull  提示不能为空
 *      @Nullable 可为空
 * @Author owl
 * @Date 2020-06-14 16:39
 * @Version 1.0
 **/
public class NullDemo {

    public  void A(){
        //若过此时调用B方法会有提示，参数值不能为空
        this.B(null);

    }

    public void B (@Nullable String a) {
        System.out.println("input message data is "+ a);
    }
}
