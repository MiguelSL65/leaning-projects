package org.academiadecodigo.rhashtafaris.udpuppercase;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {

    public static void main(String[] args) {

        int portNumber = Integer.parseInt(args[0]);
        byte[] sendMsg = new byte[1024];
        byte[] receiveMsg = new byte[1024];

        try {
        DatagramSocket server = new DatagramSocket(portNumber);

        while (true) {
            System.out.println("Waiting ...");
            DatagramPacket receivePacket = new DatagramPacket(receiveMsg, receiveMsg.length);
            server.receive(receivePacket);

            System.out.println("chegou???");
            String sentence = new String(receivePacket.getData());
            System.out.println(sentence);

            InetAddress ipAdress = receivePacket.getAddress();
            int port = receivePacket.getPort();
            String capitalized = sentence.toUpperCase();
            sendMsg = capitalized.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendMsg, sendMsg.length, ipAdress, port);
            server.send(sendPacket);

        }
        } catch (IOException e) {
        e.printStackTrace();
    }
}
}