package com.litchi.qqserver.server;

import com.litchi.qqcommon.Message;
import com.litchi.qqcommon.MessageType;
import com.litchi.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 林志贤
 * @version 1.0
 * 这是服务器，在监听 9999 等待客户端的连接，并保持通信
 */
public class QQServer {

    private ServerSocket ss = null;
    //创建一个集合，存放多个用户，如果是这些用户登录，就认为是合法的
    //这里我们也可以使用 ConcurrentHashMap，可以处理并发的集合，线程安全
    //HashMap 没有处理线程安全，因此在多线程情况下是不安全的
    //ConcurrentHashMap 处理的线程安全，即线程同步处理，在多线程情况下是安全的

//    private static HashMap<String, User> validUsers = new HashMap<>();
    private static ConcurrentHashMap<String, User> validUsers = new ConcurrentHashMap<>();

    static {
        //静态代码块，初始化 validUsers
        validUsers.put("100", new User("100", "123456"));
        validUsers.put("200", new User("200", "123456"));
        validUsers.put("300", new User("300", "123456"));
        validUsers.put("litchi", new User("litchi", "123456"));
        validUsers.put("tom", new User("tom", "123456"));
        validUsers.put("jack", new User("jack", "123456"));
    }

    //验证用户是否有效的方法
    private boolean  checkUser(String username, String password){

        //TODO 可以扩展，返回的类型可以是用户存不存在，用户是否已经登录(单点登录)

        User user = validUsers.get(username);
        if (user == null){
            //说明 username 没有存在 validUsers 的 key 中
            return false;
        }

        if (!user.getPassword().equals(password)){
            //说明 密码不对
            return false;
        }

        return true;
    }

    public QQServer() {
        //注意：端口可以写在配置文件
        try {
            System.out.println("服务端在 9999 端口监听...");
            ss = new ServerSocket(9999);
            while (true) {//当和某个客户端连接后，会继续监听，因此while
                Socket socket = ss.accept();//如果没有客户端连接，就会阻塞在这
                //得到 socket 关联的对象输入流
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                User u = (User) ois.readObject();//读取客户端发送的User对象


                //得到 socket 关联的对象输出流
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                //创建一个 Message 对象，准备回复客户端
                Message message = new Message();
                //验证
                if (checkUser(u.getUsername(), u.getPassword())) {
                    //登录成功
                    message.setMesType(MessageType.MESSAGE_LOGIN_SUCCESS);
                    //将 message 对象回复客户端
                    oos.writeObject(message);

                    //创建一个线程，和客户端保持通信，该线程保持需要持有 socket 对象
                    ServerConnectClientThread scct = new ServerConnectClientThread(socket, u.getUsername());
                    //启动线程
                    scct.start();
                    //把该线程对象，放入到一个集合中，进行管理
                    ManageClientThreads.addThreadHm(u.getUsername(), scct);
                } else {
                    System.out.println("用户名 = " + u.getUsername() + " 密码 = " + u.getPassword() + " 验证失败");

                    message.setMesType(MessageType.MESSAGE_LOGIN_FAIL);
                    oos.writeObject(message);
                    //关闭socket
                    socket.close();
                }


            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //如果服务器退出了 while 说明服务端不在监听，因此关闭 ServerSocket
            try {
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
