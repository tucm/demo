package com.test.tucm.disruptor.base;

import com.lmax.disruptor.EventHandler;

/**
 * @ClassName 消费者2逻辑
 * @Description TODO
 * @Author TUCM
 * @Date 2019/6/28 15:25
 * @Version 1.0
 */
public class ConsumerHandler implements EventHandler<LongEvent> {
    @Override
    public void onEvent(LongEvent longEvent, long l, boolean b) throws Exception {
        System.out.println("consumer2:" + longEvent.getValue());
    }
}
