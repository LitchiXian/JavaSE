package com.litchi.writer_;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 林志贤
 * @version 1.0
 */
public class FileWriter_ {
    public static void main(String[] args) {

    }

    @Test
    public void writerFile01() {
        String filePath = "d:\\workspace\\a.txt";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath, true);
            //1. write(int) : 写入单个字符
            fileWriter.write('H');
//            fileWriter.flush();//不需要一直刷新，只要在最后关闭的时候close【追加模式】
            //2. write(char[]) : 写入指定数组
            char[] chars = {'a', 'b', 'c'};
            fileWriter.write(chars);
            //3. write(char[], off, len) : 写入指定数组的指定部分
            String str = "风雨之后，定见彩虹";
            fileWriter.write(str.toCharArray(), 2, 5);
            //4. write (string) : 写入整个字符串
            fileWriter.write(str);
            //5. write(string, off, len) : 写入字符串的指定部分
            fileWriter.write(str, 3, 5);
            //在数据量大的情况下，可以使用循环操作

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileWriter != null)
                    //fileWriter.flush();
                    //关闭文件流，等价 flush() + 关闭
                    fileWriter.close();
                /*
                private void writeBytes() throws IOException {
                    this.bb.flip();
                    int var1 = this.bb.limit();
                    int var2 = this.bb.position();

                    assert var2 <= var1;

                    int var3 = var2 <= var1 ? var1 - var2 : 0;
                    if (var3 > 0) {
                        if (this.ch != null) {
                            assert this.ch.write(this.bb) == var3 : var3;
                        } else {
                            this.out.write(this.bb.array(), this.bb.arrayOffset() + var2, var3);
                        }
                    }

                    this.bb.clear();
                }
                 */
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("程序结束");

    }
}
