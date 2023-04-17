package com.litchi.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 林志贤
 * @version 1.0
 * 演示 InetAddress 类的使用
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {

        //1.获取本机的 InetAddress 对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//LAPTOP-CCAB1SHP/10.20.106.17//设备名称 + ip地址

        //2.根据指定的主机名 获取 InetAddress 对象
        InetAddress host1 = InetAddress.getByName("LAPTOP-CCAB1SHP");//我的电脑
//        InetAddress host2 = InetAddress.getByName("LAPTOP-GH0BURI8");//邹邹的电脑
        System.out.println(host1);
//        System.out.println(host2);

        //3.根据域名返回 InetAddress 对象，比如 www.baidu.com
        InetAddress host3 = InetAddress.getByName("www.baidu.com");
        System.out.println(host3);

        //4.通过 InetAddress 对象，获取对应的地址
        String hostAddress = host3.getHostAddress();
        System.out.println("host3 对应的ip = " + hostAddress);

        //5.通过 InetAddress 对象，获取对应的 主机名/域名
        String hostName = host3.getHostName();
        System.out.println("host3 对应的主机与/域名 = " + hostName);

        byte[] bytes = {(byte) 10, (byte) 20, (byte) 106, (byte) 17};
        InetAddress host4 = InetAddress.getByAddress(bytes);
        System.out.println(host4);

    }
}
