package com.litchi.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 林志贤
 * @version 1.0
 * 服务端
 */
@SuppressWarnings("all")
public class SocketTC03Server {
    public static void main(String[] args) throws IOException {
        //思路
        //1. 在本机 的 9999 端口监听, 等待连接
        // 细节: 要求在本机没有其它服务在监听 9999
        // 细节：这个 ServerSocket 可以通过 accept() 返回多个 Socket[多个客户端连接服务器的并发]
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在9999端口监听，等待连接");
        //2. 当没有客户端连接 9999 端口时，程序会 阻塞, 等待连接
        // 如果有客户端连接，则会返回 Socket 对象，程序继续
        Socket socket = serverSocket.accept();

        System.out.println("服务端 socket = " + socket.getClass());
        //3. 通过 socket.getInputStream() 读取客户端写入到数据通道的数据, 显示
        InputStream inputStream = socket.getInputStream();
        
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        //4. IO 读取  使用转换流讲 字节流 转成 字符流
        BufferedReader br = new BufferedReader(inputStreamReader);

        String s = br.readLine();
        System.out.println(s);//输出
////        byte[] buf = new byte[1024];
//        char[] chars = new char[1024];
//        int readLen = 0;
////        String readLen = "";
//        while ((readLen = br.read()) != -1) {
//            System.out.println(new String(chars, 0, readLen));
//        }

        //5.获取 socket 相关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        bw.write("thank you thank you , i am server 9999 字符流");
        bw.newLine();//插入一个换行符，表示回复内容的结束
        bw.flush();//注意需要手动的 flush
        //6.关闭流和 socket 以及 serverSocket

        bw.close();//关闭外层流
        br.close();//关闭外层流

        socket.close();
        serverSocket.close();
    }
}
