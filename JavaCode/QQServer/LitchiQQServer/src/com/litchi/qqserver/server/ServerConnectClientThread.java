package com.litchi.qqserver.server;

import com.litchi.qqcommon.Message;
import com.litchi.qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @author 林志贤
 * @version 1.0
 * 该类的一个对象和某个客户端保持通信
 */
public class ServerConnectClientThread extends Thread {

    private Socket socket;
    private String username;//连接到服务端的用户id
    private boolean loop;
    private String address;

    {
        loop = true;
    }

    public ServerConnectClientThread(Socket socket, String username) {
        this.socket = socket;
        this.username = username;
        address = socket.getInetAddress().getHostAddress();
    }

    @Override
    public void run() {//这里线程处于run的状态, 可以发送/接收消息
        System.out.println("服务端和 " + address + " 客户端 用户名 " + username + " 保持通信，读取数据..");
        try {
            while (loop) {

                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();
                //后面会使用 message
                if (message.getMesType().equals(MessageType.MESSAGE_GET_ONLINE_FRIEND)) {
                    //TODO 遍历在线用户并组个，返回
                    String onlineUser = ManageClientThreads.getOnlineUser();

                    //构建一个 Message 对象，返回给客户端
                    Message message2 = new Message();
                    message2.setMesType(MessageType.MESSAGE_RET_ONLINE_FRIEND);
                    message2.setContent(onlineUser);
                    message2.setGetter(message.getSender());

                    //返回给客户端
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject(message2);

                    System.out.println(address + " " + message.getSender() + " 要求在线用户列表");
                } else if (message.getMesType().equals(MessageType.MESSAGE_COMM_MES)) {
                    //根据 message 获取getterName ，然后在得到对应线程
                    ServerConnectClientThread getterScct = ManageClientThreads.getScct(message.getGetter());
                    if (getterScct == null) {
                        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                        message.setContent(null);
                        message.setMesType(MessageType.MESSAGE_USER_NULL);
                        oos.writeObject(message);
                        continue;
                    }
                    //得到对应 socket 对象的输出流，将message对象转发给指定的客户端
                    ObjectOutputStream oos = new ObjectOutputStream(getterScct.getSocket().getOutputStream());

                    //TODO 如果用户不在线，可以做成离线的聊天
                    oos.writeObject(message);//转发
                } else if (message.getMesType().equals(MessageType.MESSAGE_ALL_MES)) {

                    String[] onlineUser = ManageClientThreads.getOnlineUser().split(" ");
                    String getterAllName = "";
                    for (int i = 0; i < onlineUser.length; i++) {
                        if (i == onlineUser.length - 1){
                            getterAllName += onlineUser[i];
                            continue;
                        }
                        getterAllName += onlineUser[i] + "、";
                    }
                    message.setGetter(getterAllName);

                    for (int i = 0; i < onlineUser.length; i++) {
                        ObjectOutputStream oos = new ObjectOutputStream(ManageClientThreads.getScct(onlineUser[i]).getSocket().getOutputStream());
                        oos.writeObject(message);
                    }


                }  else if (message.getMesType().equals(MessageType.MESSAGE_FILL_MES)) {
                    //根据 message 获取getterName ，然后在得到对应线程
                    ServerConnectClientThread getterScct = ManageClientThreads.getScct(message.getGetter());
                    if (getterScct == null) {
                        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                        message.setContent(null);
                        message.setData(null);
                        message.setMesType(MessageType.MESSAGE_USER_NULL);
                        oos.writeObject(message);
                        continue;
                    }
                    //得到对应 socket 对象的输出流，将message对象转发给指定的客户端
                    ObjectOutputStream oos = new ObjectOutputStream(getterScct.getSocket().getOutputStream());

                    //TODO 如果用户不在线，可以做成离线的聊天
                    oos.writeObject(message);//转发
                }else if (message.getMesType().equals(MessageType.MESSAGE_CLIENT_EXIT)) {
                    loop = false;

                    ManageClientThreads.removeScct(message.getSender());
                }
            }
        } catch (Exception e) {
            ManageClientThreads.removeScct(username);
            try {
                socket.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println(address + " " + username + " 出现异常，退出了系统");
        }
        try {
            socket.close();
            System.out.println(address + " " + username + " 退出系统");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Socket getSocket() {
        return socket;
    }
}
