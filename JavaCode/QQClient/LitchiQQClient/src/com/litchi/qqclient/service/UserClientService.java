package com.litchi.qqclient.service;

import com.litchi.qqcommon.Message;
import com.litchi.qqcommon.MessageType;
import com.litchi.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 林志贤
 * @version 1.0
 */
public class UserClientService {

    //因为我们可能在其他地方用使用 user 信息，因此作成成员属性
    private User u;
    //因为socket在其他地方也可能使用，因此作为属性
    private Socket socket;

    //根据 username 和 password 到服务器验证该用户是否合法
    public boolean checkUser(String username, String password) {
        boolean key = false;

        //创建User对象
        u = new User();
        u.setUsername(username);
        u.setPassword(password);
        //连接到服务器，发送 u 对象

        try {
            socket = new Socket(InetAddress.getByName("LAPTOP-CCAB1SHP"), 9999);
            //得到 ObjectOutputStream 对象
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(u);//发送User对象

            //读取从服务器回复的Message对象
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message ms = (Message) ois.readObject();

            if (ms.getMesType().equals(MessageType.MESSAGE_LOGIN_SUCCESS)) {
                //登录成功
//                key = true;
                //创建一个和服务器短保持通信的线程 -> 创建一个线程类 ClientConnectServerThread
                ClientConnectServerThread ccst = new ClientConnectServerThread(socket);
                //启动客户端的线程
                ccst.start();
                //这里为了后面客户端的扩展，我们将线程放入到集合管理
                ManageClientConnectServerThread.addThreadHm(username, ccst);

                key = true;//等线程启动成功再返回true
            } else {
                //如果登录失败，我们就不能启动和服务器通信的线程
                socket.close();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return key;
    }

    //向服务器端请求在线用户列表
    public void onlineFriendList() {
        //发送一个Message，类型 MessAGE_GET_ONLINE_FRIEND
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
        message.setSender(u.getUsername());


        //发送给服务器
        //应该得到当前线程的Socket 对应的 ObjectOutputStream 对象
        try {
            ObjectOutputStream oos = new ObjectOutputStream
                    (ManageClientConnectServerThread.getCcts(u.getUsername()).getSocket().getOutputStream());
            oos.writeObject(message);//发送一个Message对象，向服务端要求在线用户列表
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //编写方法，退出客户端，并给服务端发送一个退出系统的message对象
    public void logout() {
        //发送一个Message，类型 MessAGE_GET_ONLINE_FRIEND
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_CLIENT_EXIT);
        message.setSender(u.getUsername());


        //发送给服务器
        //应该得到当前线程的Socket 对应的 ObjectOutputStream 对象
        try {
            ObjectOutputStream oos = new ObjectOutputStream
                    (ManageClientConnectServerThread.getCcts(u.getUsername()).getSocket().getOutputStream());
//            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(message);//发送一个Message对象，向服务端要求在线用户列表
            System.out.println(u.getUsername() + " 退出系统");
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
