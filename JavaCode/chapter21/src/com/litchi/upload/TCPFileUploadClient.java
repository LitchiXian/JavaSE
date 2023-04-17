package com.litchi.upload;


import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 林志贤
 * @version 1.0
 * 文件上传的 客户端
 */
public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {


        //客服端连接服务端 8888，得到 Socket 对象
        byte[] addressBytes = {(byte) 10, (byte) 20, (byte) 106, (byte) 17};
        Socket socket = new Socket(InetAddress.getByAddress(addressBytes), 8888);
        //创建读取磁盘文件的输入流
        String filePath = "d:\\workspace\\12.zip";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));

        //bytes 就是 filePath 对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //通过 socket 获取到输出流，将 bytes 数据发送给服务端
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);//将文件对应的字节数组的内容，写入到数据通道
        bis.close();
        socket.shutdownOutput();//设置写入数据的结束标记

        //=======接收从服务端收到的回复
        InputStream inputStream = socket.getInputStream();
        //使用 StreamUtils 的方法，直接将 inputStream 读取到的内容转成 字符串
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);


        //关闭相关的流
        inputStream.close();
        bos.close();
        socket.close();

    }
}
