package com.weimin.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Socket服务端
 */
public class Server {
    public static void main(String[] args) {
        ServerSocket server = null;

        try {
            // 1.创建对象 ServerSocket
            server = new ServerSocket(9000);
            System.out.println("服务器已开启......");

            // 2.调用侦听方法
            Socket socket = server.accept();
            System.out.println("接收到了一个请求.....");

            // 3.接受来自客户端的数据,阻塞
            InputStream in = socket.getInputStream();

            // 千万注意，不能使用以下方法，因为网络编程里没有-1的概念
//            int data;
//            while ((data = in.read()) != -1) {
//                char c = (char) data;
//                System.out.print(c + " ");
//            }
            for (int i = 0 ;i < 10; i++) {
                // int in_data = in.read();    // 阻塞
                char data = (char) in.read();
                System.out.print(data + " ");
            }


            OutputStream out = socket.getOutputStream();
            System.out.print("请输入需要发送的文字: ");
            String input = new Scanner(System.in).nextLine();
            out.write(input.getBytes());
            out.flush();

            out.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
