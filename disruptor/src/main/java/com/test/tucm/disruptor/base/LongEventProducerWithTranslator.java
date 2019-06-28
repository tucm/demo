package com.test.tucm.disruptor.base;

import com.lmax.disruptor.EventTranslatorOneArg;
import com.lmax.disruptor.RingBuffer;

import java.nio.ByteBuffer;

/**
 * @ClassName LongEventProducerWithTranslator
 * @Description TODO
 * @Author TUCM
 * @Date 2019/6/28 15:27
 * @Version 1.0
 **/
//生产者实现二
public class LongEventProducerWithTranslator {
    // 使用EventTranslator, 封装 获取Event的过程
    private static final EventTranslatorOneArg<LongEvent, ByteBuffer> TRANSLATOR = new EventTranslatorOneArg<LongEvent, ByteBuffer>() {
        @Override
        public void translateTo(LongEvent event, long sequeue, ByteBuffer buffer) {
            event.setValue(buffer.getLong(0));
        }
    };

    private final RingBuffer<LongEvent> ringBuffer;

    public LongEventProducerWithTranslator(RingBuffer<LongEvent> ringBuffer) {
        this.ringBuffer = ringBuffer;
    }

    public void produceData(ByteBuffer buffer){
        // 发布
        ringBuffer.publishEvent(TRANSLATOR, buffer);
    }
}
