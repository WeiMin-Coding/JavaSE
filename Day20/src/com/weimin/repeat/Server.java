package com.weimin.repeat;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerNet server = new ServerNet(9000);
        server.startServer();
        server.stopServer();
    }
}

class ServerNet {
    int port;
    ServerSocket server;

    public ServerNet() {
    }

    public ServerNet(int port) {
        this.port = port;
    }

    public void startServer() {
        try {
            this.server = new ServerSocket(this.port);
            System.out.println("INFO Start Server Success......waiting for a request");

            Socket socket = this.server.accept();
            InputStream in = socket.getInputStream();
            for (int i = 0; i < 67; i++) {
                char data = (char) in.read();
                System.out.println(data);
            }

        } catch (IOException e) {
            System.out.println("ERROR Start Server Failure......");
            e.printStackTrace();
        }
    }

    public void stopServer() {
        try {
            this.server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}