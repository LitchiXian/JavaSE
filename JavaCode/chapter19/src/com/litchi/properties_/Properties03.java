package com.litchi.properties_;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Properties03 {
    public static void main(String[] args) throws IOException {
        String filePath = "src\\mysql2.properties";

        //使用 Properties 类来创建 配置文件，修改配置文件内容
        Properties properties = new Properties();
        //创建
        //1.如果该文件没有key，就是创建
        //2.如果该文件有 key， 就是修改
        /*
        Properties 父类是 Hashtable，底层就是 Hashtable 核心方法

            public synchronized V put(K key, V value) {
                // Make sure the value is not null
                if (value == null) {
                    throw new NullPointerException();
                }

                // Makes sure the key is not already in the hashtable.
                Entry<?,?> tab[] = table;
                int hash = key.hashCode();
                int index = (hash & 0x7FFFFFFF) % tab.length;
                @SuppressWarnings("unchecked")
                Entry<K,V> entry = (Entry<K,V>)tab[index];
                for(; entry != null ; entry = entry.next) {
                    if ((entry.hash == hash) && entry.key.equals(key)) {
                        V old = entry.value;
                        entry.value = value;//如果key存在，就替换
                        return old;
                    }
                }

                addEntry(hash, key, value, index);//如果是新key，就addEntry
                return null;
            }
         */
        properties.setProperty("charset", "gbk");
        properties.setProperty("user", "root");
        properties.setProperty("pwd", "1236");
        //将 k-v 存储到文件中
        properties.store(new FileWriter(filePath), "hello world");//后面跟的是comments 注释，会放在首行

    }
}
