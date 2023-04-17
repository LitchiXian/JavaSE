package com.litchi.test01;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Test01Client {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\workspace\\12.zip";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        byte[] bytes = {(byte) 10, (byte) 20, (byte) 106, (byte) 17};
        Socket socket = new Socket(InetAddress.getByAddress(bytes), 9999);
        OutputStream outputStream = socket.getOutputStream();

        System.out.println("hello=" + socket.getClass());
        byte[] buf = new byte[10240];
        int readLen = 0;
        while ((readLen = bis.read(buf)) != -1) {
            outputStream.write(buf, 0, readLen);
        }

        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String s = br.readLine();
        System.out.println(s);


        br.close();
        bis.close();
        outputStream.close();
        socket.close();
        bis.close();
        System.out.println("by~~~");
    }
}
