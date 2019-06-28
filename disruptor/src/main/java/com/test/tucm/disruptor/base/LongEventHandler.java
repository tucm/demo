package com.test.tucm.disruptor.base;

import com.lmax.disruptor.EventHandler;

/**
 * @ClassName LongEventHandler
 * @Description TODO
 * @Author TUCM
 * @Date 2019/6/28 15:25
 * @Version 1.0
 **/
// 消费逻辑
public class LongEventHandler implements EventHandler<LongEvent> {
    @Override
    public void onEvent(LongEvent longEvent, long l, boolean b) throws Exception {
        System.out.println(longEvent.getValue());
    }
}
