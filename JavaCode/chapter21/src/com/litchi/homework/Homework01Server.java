package com.litchi.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("8888服务端 正在等待接收");
        Socket socket = serverSocket.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = br.readLine();
        System.out.println("有人问我 " + s);
        String data = null;
        switch (s){
            case "name":
                data = "我是litchi。";
                break;
            case "hobby":
                data = "编写java程序。";
                break;
            default:
                data = "你说啥呢？";
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(data);
        bw.newLine();
        bw.close();

        br.close();
        socket.close();
        serverSocket.close();

    }
}
