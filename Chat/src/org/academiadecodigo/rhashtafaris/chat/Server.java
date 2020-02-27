package org.academiadecodigo.rhashtafaris.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        int portNumber = 7878;

        try {

            ServerSocket serverSocket = new ServerSocket(portNumber);
            System.out.println("Server ready to chat...");
            Socket client = serverSocket.accept();

            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            BufferedReader inClient = new BufferedReader(new InputStreamReader(client.getInputStream()));
            BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));

            while (true) {

                System.out.println("Client message: ");
                String rcvMsg = inClient.readLine();
                System.out.println(rcvMsg);

                System.out.println("Server message: ");
                String sendMsg = keyRead.readLine();
                out.println(sendMsg);
                out.flush();
                }
            } catch(IOException e){
            e.printStackTrace();
        }
    }
}