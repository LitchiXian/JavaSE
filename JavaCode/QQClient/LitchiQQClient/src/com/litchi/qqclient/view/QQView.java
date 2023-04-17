package com.litchi.qqclient.view;

import com.litchi.qqclient.service.MessageClientService;
import com.litchi.qqclient.service.UserClientService;
import com.litchi.qqclient.utils.Utility;
import com.litchi.qqcommon.MessageType;

/**
 * @author 林志贤
 * @version 1.0
 * 客户端的菜单界面
 */
public class QQView {
    private boolean loop = true;// 控制是否显示菜单
    private String key = "";// 接收用户的键盘输入
    private UserClientService userClientService = new UserClientService();//对象是用于用户登录服务器
    private MessageClientService messageClientService = new MessageClientService();//对象是用户私聊/群聊

    public void start() {
        mainMenu();
    }

    //显示主菜单
    private void mainMenu() {
        System.out.println("山寨版最强QQ欢迎您");

        while (loop) {
            System.out.println("===============欢迎登录网络通信系统===============");
            System.out.println("\t\t 1 登录系统");
            System.out.println("\t\t 9 退出系统");
            System.out.println("请输入你的选择: ");
            key = Utility.readString(1);

            //根据用户的输入，来处理不同的逻辑
            switch (key) {
                case "1":
                    System.out.println("请输入用户号: ");
                    String username = Utility.readString(50);
                    System.out.println("请输入密 码: ");
                    String password = Utility.readString(50);
                    //TODO 需要到服务端去验证该用户是否合法
                    //这个有很多代码，我们这里编写一个类， UserClientService [用户登录/注册]
                    if (userClientService.checkUser(username, password)) {//还没有写完，先把整个逻辑打通....
                        System.out.println("===============欢迎 (用户 " + username + " 登录成功) ===============");
                        while (loop) {//进入二级菜单
                            System.out.println("\n========显示通信系统二级菜单(用户 " + username + " )========");
                            System.out.println("\t\t 1 显示在线用户列表");
                            System.out.println("\t\t 2 群发消息");
                            System.out.println("\t\t 3 私聊消息");
                            System.out.println("\t\t 4 发送文件");
                            System.out.println("\t\t 9 退出系统");
                            key = Utility.readString(1);
                            String content = null;
                            String getterName = null;
                            switch (key) {
                                case "1":
                                    userClientService.onlineFriendList();
                                    break;
                                case "2":
                                    System.out.println("请输入发送信息:");
                                    content = Utility.readString(100);
                                    //TODO 编写一个方法，将信息发送给服务端
                                    messageClientService.sendMessageToAll(content, username);
                                    break;
                                case "3":
                                    userClientService.onlineFriendList();
                                    System.out.println("选择聊天用户(在线):");
                                    getterName = Utility.readString(50);
                                    System.out.println("请输入发送信息:");
                                    content = Utility.readString(100);
                                    //TODO 编写一个方法，将信息发送给服务端
                                    messageClientService.sendMessageToOne(content, username, getterName);
                                    break;
                                case "4":
                                    userClientService.onlineFriendList();
                                    System.out.println("选择发送对象(在线用户):");
                                    getterName = Utility.readString(50);
                                    System.out.println("请输入发送文件的完整路径:");
                                    System.out.println("注意呦，java的\\是要输入\\\\");
                                    content = Utility.readString(50);
                                    messageClientService.sendFileToOne(content, username, getterName);
                                    break;
                                case "9":
                                    //TODO 安全退出
                                    userClientService.logout();
                                    loop = false;
                                    break;
                            }
                        }

                    } else {//登录失败服务器
                        System.out.println("========登录失败=========");
                    }
                    break;
                case "9":
                    loop = false;
                    break;
                default:
            }
        }


    }
}
