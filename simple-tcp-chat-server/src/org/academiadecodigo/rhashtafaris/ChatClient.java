package org.academiadecodigo.rhashtafaris;

import java.io.*;
import java.net.Socket;

/**
 * Client-side server connection class implementation
 */
public class ChatClient {

    /**
     * The client socket
     */
    private Socket socket;

    /**
     * The stream which receives terminal input
     */
    private BufferedReader inputReader;

    /**
     * The input stream connected to the server socket
     */
    private BufferedReader socketReader;

    /**
     * The output stream connected to the server socket
     */
    private BufferedWriter socketWriter;

    /**
     * Creates a new instance of a chat client and initiates the input stream
     */
    private ChatClient() {
        inputReader = new BufferedReader(new InputStreamReader(System.in));
    }

    /**
     * ChatServer entry point
     */
    public static void main(String[] args) {

        try {

            ChatClient chatClient = new ChatClient();
            chatClient.init();

        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }

    }

    /**
     * Gets server info, sets up the socket and its streams and initiates client-server communication
     */
    private void init() {

        try {

            String host = getInfoFromUser("Host? ");
            int port = Integer.parseInt(getInfoFromUser("Port? "));

            // connect to the specified host name and port
            socket = new Socket(host, port);
            System.out.println("Connected to: " + socket);

            // setup the necessary streams
            setupSocketStreams();

            // start communication
            start();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * Gets info from user input
     *
     * @param msg   the prompt that gives the user context
     * @return      the answer
     */
    private String getInfoFromUser(String msg) throws IOException {
        System.out.print(msg);
        return inputReader.readLine();
    }

    /**
     * Instantiate the buffered readers and writers from the standard input and output socket stream
     */
    private void setupSocketStreams() throws IOException {
        socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        socketWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
    }

    private void start() {

        String line = "";

        // while the client doesn't signal to quit
        while (!line.equals("/quit")) {

            try {

                // read the pretended message from the console
                line = inputReader.readLine();

                // write the pretended message to the output buffer
                socketWriter.write(line);
                socketWriter.newLine();
                socketWriter.flush();

                // receive the message from the server
                String m = socketReader.readLine();
                System.out.println(m);

            } catch (IOException ex) {
                System.out.println("Sending error: " + ex.getMessage() + ", closing client...");
                break;
            }

        }

        // close the client socket and buffers
        stop();

    }

    /**
     * Close the buffers and the socket
     */
    private void stop() {

        try {

            if (socket != null) {
                System.out.println("Closing the socket");
                socket.close();
            }

        } catch (IOException ex) {
            System.out.println("Error closing connection: " + ex.getMessage());
        }

    }

}
