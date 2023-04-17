package com.litchi.qqclient.service;

import java.util.HashMap;

/**
 * @author 林志贤
 * @version 1.0
 * 该类管理客户端连接到服务器端的线程的类
 */
public class ManageClientConnectServerThread {
    //我们把多个线程放入一个 HashMap 集合，key 就是用户id，value 就是线程
    private static HashMap<String, ClientConnectServerThread> hm = new HashMap<>();

    //将某个线程加入到集合
    public static void addThreadHm(String username, ClientConnectServerThread ccts){
        hm.put(username, ccts);
    }

    //通过 username 可以得到对应线程
    public static ClientConnectServerThread getCcts(String username){
        return hm.get(username);
    }

    public static void exitUser(String username){
        hm.remove(username);
    }
}
