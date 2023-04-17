package com.litchi.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 林志贤
 * @version 1.0
 * 客户端
 */
@SuppressWarnings("all")
public class SocketTC03Client {
    public static void main(String[] args) throws IOException {
        //思路
        //1. 连接服务端 (ip , 端口）
        //解读: 连接本机的 9999 端口, 如果连接成功，返回 Socket 对象
//        byte[] bytes = {(byte) 10, (byte) 20, (byte) 106, (byte) 17};
//        Socket socket = new Socket(InetAddress.getByAddress(bytes), 9999);
        Socket socket = new Socket(InetAddress.getLoopbackAddress(), 9999);
        System.out.println("客户端 socket返回 = " + socket.getClass());

        //2. 连接上后，生成 Socket, 通过 socket.getOutputStream()
        // 得到 和 socket 对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();

        //3. 通过输出流，写入数据到 数据通道
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        bw.write("Hello server 字符流");
        bw.newLine();//插入一个换行符，表示写入内容结束
        bw.flush();//如果使用字符流，需要手动刷新，这句话一定要有，不然写不进去
//        outputStream.write("Hello server".getBytes());

        //4. 获取和 socket 关联的输入流，读取数据(字节)，并显示
        InputStream inputStream = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

//        char[] chars = new char[1024];
////        byte[] buf = new byte[1024];
//        int readLen = 0;
//        while ((readLen = br.read(chars)) != -1){
//            System.out.println(new String(chars, 0, readLen));
//        }
        String s = br.readLine();
        System.out.println(s);

        //5. 关闭流对象和 socket, 必须关闭
        br.close();//关闭外层流
        bw.close();//关闭外层流
//        System.out.println("cclose");


        socket.close();
        System.out.println("客户端退出....");
    }
}
