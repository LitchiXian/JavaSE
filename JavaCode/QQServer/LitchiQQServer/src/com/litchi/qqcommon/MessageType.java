package com.litchi.qqcommon;

/**
 * @author 林志贤
 * @version 1.0
 */
public interface MessageType {
    //解读
    //1. 在接口中定义一些常量
    //2. 不同的常量的值，表示不同的消息类型
    String MESSAGE_LOGIN_SUCCESS = "1";// 表示登录成功
    String MESSAGE_LOGIN_FAIL = "2";// 表示登录失败
//    String MESSAGE_LOGIN_FAIL2 = "3";// 用户不存在
//    String MESSAGE_LOGIN_FAIL3 = "4";// 密码错误
    //还可能有服务器出错，或本地网络有问题等等

    String MESSAGE_COMM_MES = "5";//普通信息包
    String MESSAGE_GET_ONLINE_FRIEND = "6";//要求返回在线用户列表
    String MESSAGE_RET_ONLINE_FRIEND = "7";//返回用户列表
    String MESSAGE_CLIENT_EXIT = "8";//客户端请求退出
    String MESSAGE_USER_NULL = "9";//用户不存在/或已下线
    String MESSAGE_ALL_MES = "10";//群发信息包
    String MESSAGE_FILL_MES = "11";//文件信息包
}
