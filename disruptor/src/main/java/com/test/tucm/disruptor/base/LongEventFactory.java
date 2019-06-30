package com.test.tucm.disruptor.base;

import com.lmax.disruptor.EventFactory;

/**
 * @ClassName LongEventFactory
 * @Description 产生Event的工厂
 * @Author TUCM
 * @Date 2019/6/28 15:24
 * @Version 1.0
 **/
public class LongEventFactory implements EventFactory {
    @Override
    public Object newInstance() {
        return new LongEvent();
    }
}
