package com.weimin.repeat;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        ClientNet client = new ClientNet("127.0.0.1", 9000);
        client.connectServer();
    }
}

class ClientNet {
    String host;
    int port;

    public ClientNet() {}

    public ClientNet(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void connectServer() {
        try {
            Socket socket = new Socket(this.host, this.port);
            System.out.println("连接服务端成功....");
            OutputStream out = socket.getOutputStream();

            byte[] data = this.sendMessage();
            out.write(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public byte[] sendMessage() {
        System.out.print("请输入要发送的消息(仅限英文): ");
//        String message = new Scanner(System.in).nextLine();

        return "hello1".getBytes();
    }
}
