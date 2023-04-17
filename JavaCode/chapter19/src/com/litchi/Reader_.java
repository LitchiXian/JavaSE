package com.litchi;

import org.junit.jupiter.api.Test;

/**
 * @author 林志贤
 * @version 1.0
 */
public abstract class Reader_ {//抽象类

    public void readFile() {
    }

    public void readString() {
    }
}

class Test_{

    @Test
    void test01(){
        BufferedReader_ bufferedReader = new BufferedReader_(new FileReader_());
        bufferedReader.readFile();
        System.out.println("=====");
        bufferedReader.readFiles(5);

        //这次希望通过 BufferedReader_ 多次读取字符串
        BufferedReader_ bufferedReader2 = new BufferedReader_(new StringReader_());
        bufferedReader2.readString();
        System.out.println("=====");
        bufferedReader2.readStrings(5);
        System.out.println("??");
    }
}


//把它当作处理流（包装流）
class BufferedReader_ extends Reader_ {
    private Reader_ reader;//属性是 Reader_ 类型

    public BufferedReader_(Reader_ reader) {
        this.reader = reader;
    }

    //让方法更加灵活，多次读取文件
    public void readFiles(int num){
        for (int i = 0; i < num; i++) {
            reader.readFile();
        }
    }

    //扩展 readString，批量处理字符串数组
    public void readStrings(int num){
        for (int i = 0; i < num; i++) {
            reader.readString();
        }
    }

}

//把它当作节点流
class FileReader_ extends Reader_ {
    @Override
    public void readFile() {
        System.out.println("对文件进行读取...");
    }
}

//把它当作节点流
class StringReader_ extends Reader_ {
    @Override
    public void readString() {
        System.out.println("读取字符串...");
    }
}