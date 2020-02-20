package org.academiadecodigo.rhashtafaris.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats host?");
        String host = scanner.next();

        System.out.println("Whats port?");
        int portNumber = scanner.nextInt();

        System.out.println("Write a message:");
        String message = scanner.next();

        try {
            Socket client = new Socket(host, portNumber);
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

            String line = in.readLine();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
