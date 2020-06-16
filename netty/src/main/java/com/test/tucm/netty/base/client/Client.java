package com.test.tucm.netty.base.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @ClassName Client
 * @Description TODO
 * @Author TUCM
 * @Date 2020-02-25 17:19
 * @Version 1.0
 **/
public class Client {
    final static Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) throws Exception {
        try {
            final Socket socket = new Socket("127.0.0.1", 1234);
            logger.info("成功连接服务器");
            final OutputStream outputStream = socket.getOutputStream();
            Thread writeThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    long startTime = System.currentTimeMillis();
                    byte[] clientBytes = "{\"request\":\"client request\"}".getBytes();
                    for (int i = 1; i <= 1; i++) {
                        try {
                            logger.info("即将写入的数据为：[{}]", new String(clientBytes));
                            outputStream.write(clientBytes);
                            outputStream.flush();

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    long endTime = System.currentTimeMillis();
                    logger.info("执行时间:" + (endTime - startTime) / 1000 + "秒");

                }
            });
            writeThread.start();

            Thread readThread = new Thread(new Runnable() {
                @Override
                public void run() {

                    while (socket.isConnected()) {
                        try {
                            InputStream inputStream = socket.getInputStream();
                            byte[] buffer = new byte[9];
                            int len = 0;
                            while ((len = inputStream.read(buffer)) != -1) {
                                String readStr = new String(buffer);
                                logger.info("接收到响应报文:" + readStr);
                                if (inputStream.available() <= 0) {
                                    break;
                                }
                            }


                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
                }
            });
            readThread.start();
        } catch (

                IOException e) {
            e.printStackTrace();
        }
    }
}
