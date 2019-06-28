package com.test.tucm.disruptor.base;

/**
 * @ClassName LongEvent
 * @Description TODO
 * @Author TUCM
 * @Date 2019/6/28 15:24
 * @Version 1.0
 **/
// Event封装要传递的数据
public class LongEvent {
    private long value;
    public long getValue() {
        return value;
    }
    public void setValue(long value) {
        this.value = value;
    }
}
