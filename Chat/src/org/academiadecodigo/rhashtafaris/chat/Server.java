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

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the host?");
        String host = scanner.next();

        System.out.println("What's port number?");
        int portNumber = scanner.nextInt();

        System.out.println("Send a message:");
        String message = scanner.next();

        try {

            ServerSocket serverSocket = new ServerSocket(portNumber);

            while (true) {
                Socket client = serverSocket.accept();

                PrintWriter out = new PrintWriter(client.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

                while (!client.isClosed()) {
                    String line = in.readLine();

                    out.println(line);

                    out.close();
                    in.close();
                    serverSocket.close();
                }
            }

            } catch(IOException e){
            e.printStackTrace();
        }
    }
}