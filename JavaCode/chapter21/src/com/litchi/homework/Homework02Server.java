package com.litchi.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework02Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9999);

        //接收数据
        byte[] data = new byte[1024];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        System.out.println("端口 9999 正在等待接收");
        socket.receive(packet);
        //拆包
        int length = packet.getLength();
        data = packet.getData();
        String s = new String(data, 0, length);
        System.out.print("有人问我\t");
        System.out.println(s);

        //回复
        String buf = null;
        switch (s) {
            case "四大名著有哪些":
                buf = "四大名著是《红楼梦》...";
                break;
            default:
                buf = "你说啥？";
        }
        data = buf.getBytes();
        packet = new DatagramPacket(data, data.length, InetAddress.getByName("10.20.106.17"), 9998);
        socket.send(packet);

        socket.close();


    }
}
