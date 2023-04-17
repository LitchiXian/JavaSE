package com.litchi.qqclient.service;

import com.litchi.qqclient.utils.Utility;
import com.litchi.qqcommon.Message;
import com.litchi.qqcommon.MessageType;

import java.io.*;
import java.net.Socket;

/**
 * @author 林志贤
 * @version 1.0
 */
public class ClientConnectServerThread extends Thread {
    //该线程需要持有 Socket
    private Socket socket;
    private boolean loop = true;

    //构造器可以接收一个 Socket 对象
    public ClientConnectServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //因为 Thread 需要在后台和服务器通信，因此我们 while 循环
        System.out.println("客户端线程，等待读取从服务端发送的消息");
        try {
            while (loop) {
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                //如果服务器没有发送Message对象，线程就会阻塞在这里
                Message message = (Message) ois.readObject();
                //注意，后面我们需要去使用 ms
                //判断这个message类型，然后做相应的业务处理
                //如果读取到的是 服务端返回的在线用户列表
                if (message.getMesType().equals(MessageType.MESSAGE_RET_ONLINE_FRIEND)) {
                    //取出在线列表信息，并显示
                    //规定
                    String[] onlineUsers = message.getContent().split(" ");
                    System.out.println("\n=======当前在线用户列表=======");
                    for (int i = 0; i < onlineUsers.length; i++) {
                        System.out.println("用户: " + onlineUsers[i]);
                    }
                } else if (message.getMesType().equals(MessageType.MESSAGE_COMM_MES)) {
                    //把从服务器转发的信息，显示到控制台，即可
                    System.out.println("\n" + message.getSender()
                            + " 对 你 说: " + message.getContent());
                } else if (message.getMesType().equals(MessageType.MESSAGE_ALL_MES)) {
                    System.out.println("\n" + message.getSender() + " 对大家(" + message.getGetter() + ") 说: " + message.getContent());
                } else if (message.getMesType().equals(MessageType.MESSAGE_FILL_MES)) {
                    System.out.println("\n" + message.getSender() + "给你发了个 " + message.getContent() + " 文件，是否接收(Y/y:确认接收): ");
//                    String s = Utility.readString(1);
//                    if (!(s.equals("y")||s.equals("Y"))){
//                        System.out.println("放弃接收");
//                        message.setData(null);
//                        continue;
//                    }
                    String fatherPath = "d:\\GoodQQ";
                    File file = new File(fatherPath);
                    if (!file.exists()) {
                        file.mkdir();
                    }

                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fatherPath + "\\" + message.getContent()));
                    bos.write(message.getData());
                    bos.close();
                    System.out.println("目前不知道怎么处理你同步同意的情况，所以给你强行接收了");
                    System.out.println("给你放在 " + fatherPath + "下了");
                    System.out.println("保存完毕");

                } else if (message.getMesType().equals(MessageType.MESSAGE_USER_NULL)) {
                    System.out.println("\n" + message.getGetter() + "用户以下线或不存在");

                } else {
                    System.out.println("是其他类型的message，暂时不处理....");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            socket.close();
            System.out.println("欢迎下次光临~~~");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //为了更方便的得到 Socket
    public Socket getSocket() {
        return socket;
    }
}
