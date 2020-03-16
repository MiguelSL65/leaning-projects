package org.academiadecodigo.rhashtafaris.webserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebServ {

    private int port;

    public WebServ(int port) {
        this.port = port;
    }

    public void init() {

        ExecutorService thread = Executors.newCachedThreadPool();
        thread.submit(new HttpServer());
        thread.shutdown();

        try {

            ServerSocket serverSocket = new ServerSocket(this.port);

            while (true) {
                    new Thread(new HttpServer(serverSocket.accept())).start();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}