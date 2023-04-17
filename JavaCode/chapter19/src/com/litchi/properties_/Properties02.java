package com.litchi.properties_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Properties02 {
    public static void main(String[] args) throws IOException {
        String filePath = "src\\mysql.properties";
        //使用 Properties 类来读取 mysql.properties 文件

        //1.创建 Properties 对象
        Properties properties = new Properties();
        //2.加载指定配置文件
        properties.load(new FileReader(filePath));
        //3.把k-v显示到控制台
        properties.list(System.out);
        //4.根据key，获取对应值
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println("user：" + user + "\npwd：" + pwd);
    }
}
