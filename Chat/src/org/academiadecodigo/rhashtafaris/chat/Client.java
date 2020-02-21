package org.academiadecodigo.rhashtafaris.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        // Read user input.

        try {
            Socket client = new Socket("127.0.0.1", 9999);

            BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

            System.out.println("Starting chat - Enter message:");

            String rcvdMessage = in.readLine();
            String sendMessage;

            while((sendMessage = keyReader.readLine()) != null) {
                out.println(sendMessage);
                out.flush();

                if(rcvdMessage != null) {
                    System.out.println(rcvdMessage);
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
