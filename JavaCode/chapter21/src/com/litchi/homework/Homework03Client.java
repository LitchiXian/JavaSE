package com.litchi.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework03Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getByName("10.20.106.17"), 8888);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String name = "hello server ,nihao";
        bw.write(name);
        bw.newLine();
        bw.flush();
        socket.shutdownOutput();


        byte[] bytes = StreamUtils.streamToByteArray(socket.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\receive.zip"));
        bos.write(bytes);
        bos.close();
        socket.close();
    }
}
