package com.litchi.qqcommon;

import java.io.Serializable;

/**
 * @author 林志贤
 * @version 1.0
 * 表示一个用户 / 客户信息
 */
//序列化
public class User implements Serializable {

    //增强序列化版本兼容性
    private static final long serialVersionUID = 1L;

    private String username;//用户名、用户Id
    private String password;//用户密码

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
