package org.academiadecodigo.rhashtafaris.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        // Read user input.
        String hostName = args[0];
        int portNumber = Integer.parseInt(args[1]);

        try {
            Socket client = new Socket(hostName, portNumber);

            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));

            while(!client.isClosed()) {

                System.out.println("Client message: ");
                String sendMsg = keyReader.readLine();
                out.println(sendMsg);

                System.out.println("Server message: ");
                String rcvMesg = in.readLine();
                out.println(rcvMesg);

                if(rcvMesg.equals("quit")) {
                    System.out.println("Terminating chat. See ya later.");
                    client.close();
                    out.close();
                    in.close();
                    keyReader.close();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
