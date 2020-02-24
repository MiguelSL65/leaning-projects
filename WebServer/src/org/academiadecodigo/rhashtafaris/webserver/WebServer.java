package org.academiadecodigo.rhashtafaris.webserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

    private Socket clientSocket;
    private ServerSocket serverSocket;

    // The input stream connected to client socket.
    private BufferedReader socketReader;

    // The output stream connected to client socket.
    private BufferedWriter socketWriter;

    public static void main(String[] args) {

        WebServer myServer = new WebServer();
        myServer.init();
    }

    private void init() {

        try {

            int port = 7896;
            serverSocket = new ServerSocket(port);

            while (serverSocket.isBound()) {
                start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    private void start() throws IOException {

        clientSocket = serverSocket.accept();
        System.out.println("Client accepted: " + clientSocket);

        socketReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        socketWriter = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

        while (clientSocket.isConnected()) {

            String line;

            if ((line = socketReader.readLine()) != null) {
                System.out.println(line);
                break;
            }

            String message = "HTTP/1.0 200 Document Follows\\r\\n\n" +
                    "Content-Type: text/html; charset=UTF-8\\r\\n\n" +
                    "Content-Length: <file_byte_size> \\r\\n\n" +
                    "\\r\\n";

            socketWriter.write(message);

            socketWriter.newLine();
            socketWriter.flush();
        }

        clientSocket.close();
    }

    private void close() {

        try {

            if (clientSocket != null) {
                System.out.println("Closing client connection.");
                clientSocket.close();
            }

            if (serverSocket != null) {
                System.out.println("Closing server socket.");
                serverSocket.close();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
