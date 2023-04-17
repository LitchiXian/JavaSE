package com.litchi.printstream;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @author 林志贤
 * @version 1.0
 * 演示 PrintStream (字节打印流/输出流)
 */
public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        //在默认情况下，PrintStream 输出数据的位置是 标准输出，即 显示器
        /*
            public void print(String s) {
                if (s == null) {
                    s = "null";
                }
                write(s);
            }
         */
        out.print("john, hello");
        //因为 print 底层使用 write, 所以我们也可以直接调用 write 进行打印/输出
        out.write("hello,lichi people".getBytes());
        out.close();

        //我们也可以修改打印流输出的位置/设备
        //1.输出修改成到 d:\workspace\txt.txt
        //2.打印的东西，就会打印到 d:\workspace\txt.txt
        System.setOut(new PrintStream("d:\\workspace\\txt.txt"));
        System.out.println("hello, it is sout print");
    }
}
