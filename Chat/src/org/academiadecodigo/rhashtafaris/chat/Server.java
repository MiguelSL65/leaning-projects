package org.academiadecodigo.rhashtafaris.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        int portNumber = 9999;

        try {
            ServerSocket serverSocket = new ServerSocket(portNumber);
            System.out.println("Server ready to chat...");
            Socket client = serverSocket.accept();

            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));

            while (!serverSocket.isClosed()) {

                System.out.println("Client message: ");
                String rcvMsg = in.readLine();
                System.out.println(rcvMsg);

                System.out.println("Server message: ");
                String sendMsg = keyRead.readLine();
                out.println(sendMsg);

                }

            } catch(IOException e){
            e.printStackTrace();
        }
    }
}