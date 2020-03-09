package org.academiadecodigo.rhashtafaris.mapeditor;

import java.io.*;

public class FileHandler {

    private String file;

    public FileHandler(String file) {
        this.file = file;
    }

    public void save(String text) {
        PrintWriter writer = null;

        try {
            writer = new PrintWriter(new FileWriter(file), true);
            writer.println(text);

        } catch (IOException e) {
            System.err.println("FileHandler#save(String)");
            System.err.println(e.getMessage());
        } finally {
            close(writer);
        }
    }

    public String read() {
        String text = "";
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            text = reader.readLine();

        } catch (IOException e) {
            System.err.println("FileHandler#read()");
            System.err.println(e.getMessage());
        }

        finally {
            close(reader);
        }

        return text;
    }

    private void close(Closeable stream) {
        if (stream == null) {
            return;
        }

        try {
            stream.close();

        } catch (IOException e) {
            System.err.println("FileHandler#close(Closeable)");
            System.err.println(e.getMessage());
        }
    }

}
