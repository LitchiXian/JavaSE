package com.litchi.qqclient.service;

import com.litchi.qqclient.utils.StreamUtils;
import com.litchi.qqcommon.Message;
import com.litchi.qqcommon.MessageType;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * @author 林志贤
 * @version 1.0
 * 该类/对象，提供和消息相关的服务方法
 */
public class MessageClientService {

    /**
     * @param content    内容
     * @param senderName 发送的用户名
     * @param getterName 接收的用户名
     */
    public void sendMessageToOne(String content, String senderName, String getterName) {
        //构建message
        Message message = new Message();
        message.setSender(senderName);
        message.setGetter(getterName);
        message.setContent(content);
        message.setMesType(MessageType.MESSAGE_COMM_MES);
        message.setSendTime(new Date().toString());//发送时间设置到 message 对象
        System.out.println("你 对 " + getterName + " 说 " + content);

        //发送给服务端
        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(ManageClientConnectServerThread.getCcts(senderName).getSocket().getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param content    内容
     * @param senderName 发送的用户名
     */
    public void sendMessageToAll(String content, String senderName) {
        //构建message
        Message message = new Message();
        message.setSender(senderName);
        message.setContent(content);
        message.setMesType(MessageType.MESSAGE_ALL_MES);
        message.setSendTime(new Date().toString());//发送时间设置到 message 对象
        //发送给服务端
        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(ManageClientConnectServerThread.getCcts(senderName).getSocket().getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param content    文件地址
     * @param senderName 发送的用户名
     * @param getterName 接收的用户名
     */
    public void sendFileToOne(String content, String senderName, String getterName) {

        if (senderName.equals(getterName)){
            System.out.println("发给自己？自己去拷贝呀");
            return;
        }

        File file = new File(content);
        if (!file.exists()) {
            System.out.println("没有找到相关文件");
            return;
        }
        byte[] bytes = null;
        try {
            bytes = StreamUtils.streamToByteArray(new FileInputStream(content));
        } catch (Exception e) {
            System.out.println("传输文件时出错");
            return;
        }

        int i = content.lastIndexOf("\\");
        String suffix = content.substring(i + 1);

        //构建message
        Message message = new Message();
        message.setSender(senderName);
        message.setGetter(getterName);
        message.setContent(suffix);
        message.setData(bytes);
        message.setMesType(MessageType.MESSAGE_FILL_MES);
        message.setSendTime(new Date().toString());//发送时间设置到 message 对象
        System.out.println("你 对 " + getterName + " 发送了个 " + suffix + " 文件");

        //发送给服务端
        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(ManageClientConnectServerThread.getCcts(senderName).getSocket().getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
