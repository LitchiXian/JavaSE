package com.litchi.homework;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework02 {

    public static boolean reg(String username, String password, String email) {
        //数据校验非空
        if (username == null || password == null || email == null) {
            System.out.println("注册信息不能为空");
            return false;
        }
        //用户名格式校验
//        if (username.length() > 4 || username.length() < 2) {
        if (!(username.length() <= 4 && username.length() >= 2)) {
            System.out.println("请输入正确名字长度(2 - 4).");
            return false;
        }
        //用户密码校验
        else if (password.length() != 6) {
            System.out.println("请输入正确密码格式(密码的长度为6，要求全是数字).");
            return false;
        }
        try {
            Integer.parseInt(password);
        } catch (NumberFormatException e) {
            System.out.println("请输入正确密码格式(密码的长度为6，要求全是数字).");
            return false;
        }
        //邮箱格式校验
        int i1 = email.lastIndexOf('@');
        int i2 = email.lastIndexOf('.');
//        if (i1 < 0 || i2 < 0 || i1 > i2) {
        if (!(i1 > 0 && i2 > i1)) {
            System.out.println("请输入正确邮箱格式(邮箱中包含@和.,并且@在.的前面)");
            return false;
        }

        User user = new User(username, password, email);
        return true;

    }

    public static void main(String[] args) {
        String name = "jack";
        String password = "123256";
        String email = "424242@qq.com";
        boolean reg = reg(name, password, email);
        if (reg)
            System.out.println("success");
        else
            System.out.println("sorry");
    }
}

class User {
    private String username;
    private String password;
    private String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
