package com.litchi.homework;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework03Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("正在等待接收");
        Socket socket = serverSocket.accept();

        String s = StreamUtils.streamToString(socket.getInputStream());
        System.out.println(s);
        String filePath = null;
        switch (s) {
            case "高山流水":
                filePath = "高山流水";
                break;
            case "123":
                filePath = "123";
                break;
            default:
                filePath = "default";
        }

        byte[] bytes = StreamUtils.streamToByteArray(new FileInputStream("d:\\workspace\\" + filePath + ".zip"));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        bos.flush();
        socket.shutdownOutput();


        //关闭流
        bos.close();
        socket.close();
        serverSocket.close();

    }
}
