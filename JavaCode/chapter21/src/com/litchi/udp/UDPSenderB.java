package com.litchi.udp;

import java.io.IOException;
import java.net.*;

/**
 * @author 林志贤
 * @version 1.0
 * 发送端 B
 */
public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        //1.创建 DatagramSocket 对象，准备在 9998 接收数据
        DatagramSocket socket = new DatagramSocket(9998);

        //2.将需要发送的数据，封装到 DatagramPacket 对象
        byte[] data = "hello, 明天吃火锅".getBytes();

        //说明：封装到 DatagramPacket 对象 data 内容字节数组，data.length 主机(IP) 端口
        DatagramPacket packet =
                new DatagramPacket(data, data.length, InetAddress.getByName("10.20.106.17"), 9999);

        socket.send(packet);

        //接收资源
        data = new byte[1024];
        packet = new DatagramPacket(data, data.length);
        System.out.println("B 正在等待");
        socket.receive(packet);
        //拆包
        int length = packet.getLength();//实际接收到的数据字节长度
        data = packet.getData();//接收到数据
        String s = new String(data, 0, length);
        System.out.println(s);
        //关闭资源
        socket.close();
        System.out.println("B exit");
    }
}
