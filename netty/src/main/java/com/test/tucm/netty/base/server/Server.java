package com.test.tucm.netty.base.server;

import com.test.tucm.netty.base.server.handler.ServerHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName Server
 * @Description TODO
 * @Author TUCM
 * @Date 2020-02-25 17:19
 * @Version 1.0
 **/
public class Server {

    private int port;

    public Server(int port) {
        this.port = port;
    }

    final static Logger logger = LoggerFactory.getLogger(Server.class);

    public void run() throws Exception {
        EventLoopGroup bossGroup = new NioEventLoopGroup(); // (1)
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap(); // (2)
            serverBootstrap.group(bossGroup, workerGroup).channel(NioServerSocketChannel.class) // (3)
                    .childHandler(new ChannelInitializer<SocketChannel>() { // (4)
                        @Override
                        public void initChannel(SocketChannel ch) throws Exception {
                            //ch.pipeline().addLast(new FixedLengthFrameDecoder(2));
                            // ch.pipeline().addLast(new StringDecoder());
                            ch.pipeline().addLast(new ServerHandler());

                        }
                    }).option(ChannelOption.SO_BACKLOG, 128) // (5)
                    .childOption(ChannelOption.SO_KEEPALIVE, true); // 长链接

            // 绑定端口，开始接收进来的连接
            ChannelFuture f = serverBootstrap.bind(port).sync(); // (7)
            // 等待服务器 socket 关闭 。
            // 在这个例子中，这不会发生，但你可以优雅地关闭你的服务器。
            f.channel().closeFuture().sync();
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }

    public static void main(String[] args) throws Exception {
        int port;
        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        } else {
            port = 8846;
        }
        logger.info("端口[{}]启动成功", port);
        new Server(port).run();

    }
}
