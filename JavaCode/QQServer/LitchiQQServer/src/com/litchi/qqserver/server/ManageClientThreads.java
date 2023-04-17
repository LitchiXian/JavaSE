package com.litchi.qqserver.server;

import java.util.HashMap;
import java.util.Set;

/**
 * @author 林志贤
 * @version 1.0
 * 该类用于管理和客户端通信的线程
 */
public class ManageClientThreads {
    private static HashMap<String, ServerConnectClientThread> hm = new HashMap<>();

    //添加线程对象到 hm 集合
    public static void addThreadHm(String username, ServerConnectClientThread scct) {
        hm.put(username, scct);
    }

    //根据username 返回 ServerConnectClientThread线程
    public static ServerConnectClientThread getScct(String username) {
        return hm.get(username);
    }

    //获取在线用户列表
    public static String getOnlineUser() {
        Set<String> strings = hm.keySet();
        String onlineUserList = "";
        for (String string : strings) {
            onlineUserList += string + " ";
        }
        return onlineUserList;
    }

    //增加一个方法，从集合中，移除某个给线程
    public static void removeScct(String username){
        hm.remove(username);
    }


}
