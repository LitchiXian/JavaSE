package com.litchi.outputstream_;

import java.io.*;

/**
 * @author 林志贤
 * @version 1.0
 */
public class BufferedFileCopy {
    public static void main(String[] args) {

        String srcFilePath = "d:\\workspace\\a\\wife.png";
        String destFilePath = "d:\\workspace\\b\\abc3.png";

        BufferedInputStream bi = null;
        BufferedOutputStream bo = null;
        try {
            bi = new BufferedInputStream(new FileInputStream(srcFilePath));
            bo = new BufferedOutputStream(new FileOutputStream(destFilePath));

            int readLen = 0;
            byte[] bytes = new byte[1024];
            while ((readLen = bi.read(bytes)) != -1) {
                bo.write(bytes, 0, readLen);
            }
            System.out.println("success");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if (bi != null)
                    bi.close();
                if (bo != null)
                    bo.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
