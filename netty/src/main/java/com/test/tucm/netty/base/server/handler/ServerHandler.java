package com.test.tucm.netty.base.server.handler;


import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @ClassName ServerHandler
 * @Description TODO
 * @Author TUCM
 * @Date 2020-02-25 17:19
 * @Version 1.0
 **/
public class ServerHandler extends ChannelInboundHandlerAdapter { // (1)
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) { // (2)
        ByteBuf in = (ByteBuf) msg;
        logger.info("接收到的数据[{}]", in);
        String str = "{\"response\":\"socket server response\"}";
        byte[] all = str.getBytes();
        ByteBuf byteBuf;
        byteBuf = Unpooled.buffer(all.length);
        byteBuf.writeBytes(all);
        ctx.writeAndFlush(byteBuf);
        ctx.writeAndFlush(str);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) { // (4)
        // 当出现异常就关闭连接
        cause.printStackTrace();
        ctx.close();
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("客户端连接成功....");
    }

}