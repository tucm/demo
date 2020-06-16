package com.test.tucm.netty.base.server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName Server1
 * @Description TODO
 * @Author owl
 * @Date 2020-05-31 16:03
 * @Version 1.0
 **/
public class Server1 {
    public static void main(String[] args) throws IOException {
        int prot=9999;
        ServerSocket serverSocket  =new ServerSocket(prot);
        while (true){
            Socket socket = serverSocket.accept();
            BufferedWriter bufferedWriter =new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String str="port:"+prot;
            bufferedWriter.write(str);
            //刷新输入流
            bufferedWriter.flush();
            //关闭socket的输出流
           // socket.shutdownOutput();
        }

    }
}
