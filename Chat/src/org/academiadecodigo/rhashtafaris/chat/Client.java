package org.academiadecodigo.rhashtafaris.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
        // Read user input.

        try {

            System.out.println("Host name?");
            String hostName = keyReader.readLine();

            System.out.println("Port number:");
            int port = new Integer(keyReader.readLine());

            Socket client = new Socket(hostName, port);

            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

            while (!client.isClosed()) {

                String msgRcv = keyReader.readLine();

                if(msgRcv.equals("/quit")) {
                    System.out.println("Terminating chat. See ya later.");
                    client.close();
                    in.close();
                    out.close();
                    break;
                }

                out.println(msgRcv);
                out.flush();

                String sendMsg = in.readLine();
                System.out.println(sendMsg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
