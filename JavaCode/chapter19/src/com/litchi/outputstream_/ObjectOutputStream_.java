package com.litchi.outputstream_;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author 林志贤
 * @version 1.0
 * 演示 ObjectOutputStream 的使用，完成数据的序列化
 */
public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception {
        //序列化后，保存的文件格式，不是纯文本，而是按照他的格式来保存的
        String filePath = "d:\\workspace\\data.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        //序列化数据到 d:\workspace\data.dat
        oos.writeInt(100);//int -> Integer (实现了 Serializable)
        oos.writeBoolean(true);// boolean -> Boolean (实现了 Serializable)
        oos.writeChar('a');// char -> Character (实现了 Serializable)
        oos.writeDouble(33.6); // double -> Double (实现了 Serializable)
        oos.writeUTF("老荔枝驾到，统统闪开");// String

        //保存3个Dog对象
        //NotSerializableException
        //Dog 类得序列化
        oos.writeObject(new Dog("波奇塔", 5, 5000, new Master()));
        oos.writeObject(new Dog("小白", 3, 3000, new Master()));
        oos.writeObject(new Dog("小黑", 4, 4000, new Master()));

        oos.close();
        System.out.println("数据保存完毕(序列化形式)");
    }
}

