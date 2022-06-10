package com.weimin.net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端代码
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("127.0.0.1", 9000);
        System.out.println("与服务器连接成功....");

        // 向服务器发送数据
        OutputStream out = client.getOutputStream();
        // 问题：write不能写入字符串, 字节流不能写出字符串"Hello"
        // 方式一：
        //byte[] data = "Hello".getBytes();
        //outputStream.write(data);
        // 方式二：
        System.out.print("请输入需要发送的文字: ");
        String input = new Scanner(System.in).nextLine();
        out.write(input.getBytes());
        out.flush();    // 只管刷新数据


        // 从客户端接受数据
        InputStream in = client.getInputStream();
        for (int i = 0; i < 10; i++) {
            char data = (char) in.read();
            System.out.print(data + " ");
        }

        out.close();    // flush + close
        in.close();
    }
}
