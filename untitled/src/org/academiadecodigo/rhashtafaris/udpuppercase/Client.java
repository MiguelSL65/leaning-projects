package org.academiadecodigo.rhashtafaris.udpuppercase;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        String hostName = args[0];
        int portNumber = Integer.parseInt(args[1]);

        byte[] sendBuffer = new byte[1024];
        byte[] rcvBuffer = new byte[1024];

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's Host");

        String answer = scanner.next();

        System.out.println("What's port number?");
        int port = scanner.nextInt();
        System.out.println("What's the word you want to CAPITALIZE?");
        String word = scanner.next();

        try {
            DatagramSocket socket = new DatagramSocket(port);
            sendBuffer = word.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, InetAddress.getByName(answer), port);
            socket.send(sendPacket);

            DatagramPacket rcvPacket = new DatagramPacket(rcvBuffer, rcvBuffer.length);
            socket.receive(rcvPacket);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
