package com.test.tucm.base.buffer;

import java.nio.ByteBuffer;

/**
 * @ClassName BufferTest
 * @Description TODO
 * @Author TUCM
 * @Date 2019-06-29 19:33
 * @Version 1.0
 **/
public class BufferTest {

    public static void main(String[] args) {
        System.out.println("----------Test allocate--------");
        //Runtime.getRuntime().freeMemory()该进程占用的堆内存大小(字节)
        System.out.println("before alocate:" + Runtime.getRuntime().freeMemory());
        // 如果分配的内存过小，调用Runtime.getRuntime().freeMemory()大小不会变化？
        //allocate从堆空间中分配一个容量大小为capacity的byte数组作为缓冲区的byte数据存储器
        ByteBuffer buffer = ByteBuffer.allocate(102400);
        System.out.println("buffer = " + buffer);
        System.out.println("after alocate:" + Runtime.getRuntime().freeMemory());

        // 这部分直接用的系统内存，所以对JVM的内存没有影响
        //是不使用JVM堆栈而是通过操作系统来创建内存块用作缓冲区
        ByteBuffer directBuffer = ByteBuffer.allocateDirect(102400);
        System.out.println("directBuffer = " + directBuffer);
        System.out.println("after direct alocate:" + Runtime.getRuntime().freeMemory());

        System.out.println("----------Test wrap--------");
        //这个缓冲区的数据会存放在byte数组中
        byte[] bytes = new byte[32];
        buffer = ByteBuffer.wrap(bytes);
        System.out.println(buffer);
        buffer = ByteBuffer.wrap(bytes, 10, 10);
        System.out.println(buffer);
    }

}
