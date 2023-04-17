package com.litchi.qqcommon;

import java.io.Serializable;

/**
 * @author 林志贤
 * @version 1.0
 * 表示客户端和服务端的消息对象
 */
public class Message implements Serializable {

    //增强序列化版本兼容性
    private static final long serialVersionUID = 1L;

    private String sender;//发送者
    private String getter;//接收者
    private String content;//消息内容
    private String sendTime;//发送时间//因为时间也要序列化，所以这里用String
    private String mesType;//消息类型[可以在接口定义消息类型]
    private byte[] data;//文件


    public String getMesType() {
        return mesType;
    }

    public void setMesType(String mesType) {
        this.mesType = mesType;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getGetter() {
        return getter;
    }

    public void setGetter(String getter) {
        this.getter = getter;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
