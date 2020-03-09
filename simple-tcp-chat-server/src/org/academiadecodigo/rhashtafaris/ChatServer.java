package org.academiadecodigo.rhashtafaris;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Server-side class implementation
 */
public class ChatServer {

    private Socket clientSocket;
    private ServerSocket serverSocket;


    /**
     * The stream which receives terminal input
     */
    private BufferedReader inputReader;

    /**
     * The input stream connected to client socket
     */
    private BufferedReader socketReader;

    /**
     * The output stream connected to client socket
     */
    private BufferedWriter socketWriter;

    /**
     * Creates a new instance of a chat server and initiates the input stream
     */
    private ChatServer() {
        inputReader = new BufferedReader(new InputStreamReader(System.in));
    }

    /**
     * Chat server entry point
     */
    public static void main(String[] args) {

        ChatServer chatServer = new ChatServer();
        chatServer.init();

    }

    /**
     * Gets the server port and starts communication with a client
     */
    private void init() {

        try {

            int port = getPortFromUser();
            System.out.println("Server is starting on port: " + port);
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

    /**
     * Gets the port where server will be listening on
     *
     * @return  the port
     */
    private int getPortFromUser() throws IOException {
        System.out.print("Port? ");
        return Integer.parseInt(inputReader.readLine());
    }

    /**
     * Starts the server, waiting for a client connection;
     * When a client connects streams are set up;
     * Afterwards, communication is ensured and information is exchanged between sockets
     */
    private void start() throws IOException {

        // block while waiting for a client to connect
        System.out.println("Waiting for a client connection");
        clientSocket = serverSocket.accept();

        // handle client connection and setup the necessary streams
        System.out.println("Client accepted: " + clientSocket);
        setupSocketStreams();

        String line;

        while (clientSocket.isConnected()) {

            line = socketReader.readLine();

            if (line == null){
                break;
            }

            // show the received line to the console
            System.out.println("Client says: " + line);

            System.out.print("Server: ");
            String message = inputReader.readLine();

            socketWriter.write(message);
            socketWriter.newLine();
            socketWriter.flush();

        }

        clientSocket.close();

    }

    /**
     * Instantiate a buffered reader from the input stream of the client socket
     */
    private void setupSocketStreams() throws IOException {
        socketReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        socketWriter = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
    }

    /**
     * Closes the client and server sockets
     */
    private void close() {

        try {

            if (clientSocket != null) {
                System.out.println("Closing client connection");
                clientSocket.close();
            }

            if (serverSocket != null) {
                System.out.println("Closing server socket");
                serverSocket.close();
            }

        } catch (IOException ex) {
            System.out.println("Error closing connection: " + ex.getMessage());
        }

    }

}
