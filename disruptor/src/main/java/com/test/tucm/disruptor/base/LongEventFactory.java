package com.test.tucm.disruptor.base;

import com.lmax.disruptor.EventFactory;

/**
 * @ClassName LongEventFactory
 * @Description TODO
 * @Author TUCM
 * @Date 2019/6/28 15:24
 * @Version 1.0
 **/
// 产生Event的工厂
public class LongEventFactory implements EventFactory {
    @Override
    public Object newInstance() {
        return new LongEvent();
    }
}
