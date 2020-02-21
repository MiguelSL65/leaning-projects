package org.academiadecodigo.rhashtafaris.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {

        int portNumber = 9999;

        try {
            ServerSocket serverSocket = new ServerSocket(portNumber);
            System.out.println("Server ready to chat...");
                Socket client = serverSocket.accept();

                BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
                PrintWriter out = new PrintWriter(client.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

                String receiveMsg = in.readLine();
                String sendMsg;

                while (true) {
                    if(receiveMsg != null) {
                        System.out.println(receiveMsg);
                    }

                    sendMsg = keyRead.readLine();
                    out.println(sendMsg);
                    out.flush();
                }

            } catch(IOException e){
            e.printStackTrace();
        }
    }
}