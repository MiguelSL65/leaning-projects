package org.academiadecodigo.rhashtafaris.webserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServ {

    public static void main(String[] args) {

        try {

            int port = 7897;

            ServerSocket serverSocket = new ServerSocket(port);

            while (true) {

                Socket clientSocket = serverSocket.accept();

                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());

                String line;

                while ((line = in.readLine()) != null) {
                    System.out.println(line);
                    if (line.isEmpty()) {
                        break;
                    }
                }

                String html = "HTTP/1.0 200 Document Follows\\r\\n\n" +
                        "Content-Type: text/html; charset=UTF-8\\r\\n\n" +
                        "Content-Length: <file_byte_size> \\r\\n\n" +
                        "\\r\\n";
                out.write(html);



                out.close();
                in.close();
                clientSocket.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}