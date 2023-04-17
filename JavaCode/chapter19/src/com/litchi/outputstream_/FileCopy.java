package com.litchi.outputstream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 林志贤
 * @version 1.0
 */
public class FileCopy {
    public static void main(String[] args) {
        //完成 文件拷贝， 将 e:\\workspace\\a\\wife.png 拷贝到 e:\\workspace\\b\\
        //思路分析
        // 1.创建文件的输入流，将文件读入到程序
        // 2.创建文件的输出流，将读取到的文件数据，写入到指定的文件

        String srcFilePath = "d:\\workspace\\a\\wife.png";
        String destFilePath = "d:\\workspace\\b\\abc.png";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            //定义一个字节数组，提高读取效果
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = fileInputStream.read(buf)) != -1) {
                //读取到后，就写入文件 通过 fileOutputStream
                //即，是一边，一边写
                fileOutputStream.write(buf, 0, readLen);//一定要用这个方法
                //说明
                // 因为当你最后一次读的字节假如为 15字节
                // 那么它也给你存 1024 字节进去，那就麻烦了，会出现文件损失
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭输入流和输出流，释放资源
                if (fileInputStream != null)
                    fileInputStream.close();
                if (fileOutputStream != null)
                    fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
