package com.litchi.homework;

import java.io.IOException;
import java.net.*;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework02Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9998);

        String s = "四大名著有哪些";
        byte[] data = s.getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("10.20.106.17"), 9999);
        socket.send(packet);

        //等待回复
        //接收数据
        data = new byte[1024];
        packet = new DatagramPacket(data, data.length);
        System.out.println("端口 9998 正在等待接收");
        socket.receive(packet);
        //拆包
        int length = packet.getLength();
        data = packet.getData();
        s = new String(data, 0, length);
        System.out.println(s);


    }
}
