package com.litchi.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author 林志贤
 * @version 1.0
 * UDP接收端
 */
public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        //1.创建一个 DatagramSocket 对象，准备在9999接收数据
        DatagramSocket socket = new DatagramSocket(9999);
        //2.构建一个 DatagramPacket 对象，准备接收数据
        //  在前面讲解UDP 协议时，老师说过一个数据包最大 64k
//        byte[] buf = new byte[64 * 1024];
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        //3.调用 接受方法，将通过网络传输的 DatagramPacket对象
        //  填充到 packet 对象
        //提示：当有数据包发送到 本机的 9999 端口时，就会接收到数据
        //      如果没有数据包发送到 本机的 9999 端口，就会阻塞等待
        System.out.println("接收端A 等待接收数据....");
        socket.receive(packet);

        //4.可以把 packet 进行拆包，取出数据，并显示
        int length = packet.getLength();//实际接收到的数据字节长度
        byte[] data = packet.getData();//接收到数据
        String s = new String(data, 0, length);
        System.out.println(s);

        //发送消息
        data = "收到收到，老板大方".getBytes();
        packet =
                new DatagramPacket(data, data.length, InetAddress.getByName("10.20.106.17"), 9998);
        socket.send(packet);

        //5.关闭资源
        socket.close();
        System.out.println("A exit");
    }

}
