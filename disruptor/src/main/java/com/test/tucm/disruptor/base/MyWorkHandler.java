package com.test.tucm.disruptor.base;

import com.lmax.disruptor.WorkHandler;

/**
 * @ClassName MyWorkHandler
 * @Description TODO
 * @Author TUCM
 * @Date 2019-06-30 19:13
 * @Version 1.0
 **/
public class MyWorkHandler implements WorkHandler<LongEvent> {
    @Override
    public void onEvent(LongEvent longEvent) throws Exception {
        System.out.println("myHandler:" + longEvent.getValue());

    }
}
