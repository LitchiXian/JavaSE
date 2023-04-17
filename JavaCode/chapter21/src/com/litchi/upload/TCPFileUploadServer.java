package com.litchi.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 林志贤
 * @version 1.0
 * 文件上传的 服务端
 */
public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {

        //1.服务端在本机监听 8888 端口
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端在 8888 端口监听....");
        //2.等待连接
        Socket socket = serverSocket.accept();

        //3.读取客户端发送的数据
        //  通过 socket 得到输入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //4.将得到 bytes 数组，写入到指定的路径，就得到一个文件了
        String destFilePath = "d:\\workspace\\TCPFileUpload.rar";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
        bos.write(bytes);
        bos.close();

        //向客户端回复 “收到文件”
        //通过 socket 获取到输出流(字符)
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("收到文件");
        bw.flush();//设置写入结束标记
        socket.shutdownOutput();


        //关闭其他资源
        bw.close();
        bis.close();
        socket.close();
        serverSocket.close();


    }
}
