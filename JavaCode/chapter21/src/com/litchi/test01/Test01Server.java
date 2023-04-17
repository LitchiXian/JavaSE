package com.litchi.test01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Test01Server {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\workspace\\huangge3.rar";
        BufferedOutputStream bos = null;
        bos = new BufferedOutputStream(new FileOutputStream(filePath));

        //思路
        //1. 在本机 的 9999 端口监听, 等待连接
        // 细节: 要求在本机没有其它服务在监听 9999
        // 细节：这个 ServerSocket 可以通过 accept() 返回多个 Socket[多个客户端连接服务器的并发]
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在9999端口监听，等待连接");
        //2. 当没有客户端连接 9999 端口时，程序会 阻塞, 等待连接
        // 如果有客户端连接，则会返回 Socket 对象，程序继续
        Socket socket = serverSocket.accept();

//        System.out.println("服务端 socket = " + socket.getClass());
        //3. 通过 socket.getInputStream() 读取客户端写入到数据通道的数据, 显示
        InputStream inputStream = socket.getInputStream();
        //4. IO 读取
        byte[] buf = new byte[10240];
        int readLen = 0;
//        int t = 1;
        while ((readLen = inputStream.read(buf)) != -1) {
//            if (t-- == 1){
//                String s = new String(buf, 0, readLen);
//                bos = new BufferedOutputStream(new FileOutputStream(filePath + s));
//                continue;
//            }
//            System.out.println(new String(buf, 0, readLen));
            bos.write(buf, 0, readLen);
        }
        bos.flush();

        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        bw.write("thank you ，图片收到啦");
        bw.newLine();
        bw.flush();

        //5.关闭流和 socket 以及 serverSocket
        bw.close();
        bos.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
