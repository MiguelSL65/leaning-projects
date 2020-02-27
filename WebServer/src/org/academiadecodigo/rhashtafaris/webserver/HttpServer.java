package org.academiadecodigo.rhashtafaris.webserver;

import java.io.*;
import java.net.Socket;

public class HttpServer implements Runnable {

    private Socket client;

    public HttpServer(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {

        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            DataOutputStream output = new DataOutputStream(client.getOutputStream());

            String line = reader.readLine();
            String[] split = line.split(" ");

            if (split[0].equals("GET") && split[1].equals("/")) {

                File file = new File("/Users/codecadet/Desktop/testfile.txt");
                FileInputStream fileInputStream = new FileInputStream(file);

                output.writeBytes("HTTP/1.0 200 Document Follows\r\n" +
                        "Content-Type: text/html; charset=UTF-8\r\n" +
                        "Content-Length: <file_byte_size> \r\n" +
                        "\r\n");
                output.write(fileInputStream.readAllBytes());
                output.flush();
                //output.close();
                //fileInputStream.close();
            }

            client.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
