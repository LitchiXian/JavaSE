package com.litchi.map_;

import java.util.Properties;

/**
 * @author 林志贤
 * @version 1.0
 */
@SuppressWarnings("all")
public class Properties_ {
    public static void main(String[] args) {

        //1.Propertier 继承 Hashtable
        //2.可以通过 k-v 存放数据，当然 key 和 value 不能为null
        Properties properties = new Properties();
        //增
        properties.put("john", 100);//k-v
//        properties.put(null, 100);//抛出 空指针异常
//        properties.put("john", null);//抛出 空指针异常
        properties.put("lucy", 100);//k-v
        properties.put("lic", 100);//k-v
        properties.put("lic", 88);//替换v

        System.out.println("properties=" + properties);

        //查 通过 k 获取对应值
        System.out.println(properties.get("lic"));
        properties.getProperty("lic");//自己debug去
        System.out.println(properties.getProperty("lic"));

        //删除
        properties.remove("lic");
        System.out.println("properties=" + properties);

        //修改
        properties.put("john", "约翰");//就是替换v
        System.out.println("properties=" + properties);
    }
}
