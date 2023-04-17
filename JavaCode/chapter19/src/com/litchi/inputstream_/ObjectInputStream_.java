package com.litchi.inputstream_;

import com.litchi.outputstream_.Dog;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author 林志贤
 * @version 1.0
 * 演示 ObjectInputStream 使用，将数据反序列化到程序
 */
public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception {
        //指定反序列化的文件
        String filePath = "d:\\workspace\\data.dat";

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        //读取
        // 解读
        // 1.读取(反序列化)的顺序需要和你保存数据(序列化)的顺序一致
        // 2.否则会出现异常
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
//        System.out.println(ois.readBoolean());//会将接下来读取到的，转成Boolean型，
//        // 然后，后面的就可能转换类型出错，所以必须要按照它的顺序来
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        //注意，保存的如果是对象，那就不要再去动那个对象的类了，因为反序列化后，会找到原来那个类，你有做改变，它们就转化不进去
        // 如果真要修改，那就得重新序列化一次，保存新的序列化文件
        Object o = ois.readObject();
        Dog dog = (Dog) o;
        System.out.println(dog.getName());
//        System.out.println(ois.readObject());// 底层 Object -> Dog
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
        //还是一样的，必须得关闭流，当然，只需要关闭外层流即可
        ois.close();

    }
}
