package org.academiadecodigo.rhashtafaris.webserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServ {

    private int port;

    public WebServ(int port) {
        this.port = port;
    }

    public void init() {

        try {

            ServerSocket serverSocket = new ServerSocket(this.port);

            while (true) {

                new Thread(new HttpServer(serverSocket.accept())).start();
               /* Socket clientSocket = serverSocket.accept();

                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                DataOutputStream output = new DataOutputStream(clientSocket.getOutputStream());

                String line = reader.readLine();
                String[] split = line.split("");

                System.out.println(line);
                System.out.println(split[0]);
                System.out.println(split[1]);

                if (split[0].equals("GET") && split[1].equals("/")) {

                    File file = new File("/Users/codecadet/Desktop/testfile.txt");
                    FileInputStream fileInputStream = new FileInputStream(file);

                    output.writeBytes("HTTP/1.0 200 Document Follows\\r\\n\n" +
                            "Content-Type: text/html; charset=UTF-8\\r\\n\n" +
                            "Content-Length: <file_byte_size> \\r\\n\n" +
                            "\\r\\n");
                    output.write(fileInputStream.readAllBytes());
                    output.flush();
                    //output.close();
                    //fileInputStream.close();
                }

                clientSocket.close();
            } */

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}