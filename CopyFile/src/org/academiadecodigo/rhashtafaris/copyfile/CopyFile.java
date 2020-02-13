package org.academiadecodigo.rhashtafaris.copyfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    private FileInputStream inputStream;
    private FileOutputStream outputStream;

    public CopyFile (String location, String destination) throws IOException{
        this.inputStream = new FileInputStream(location);
        this.outputStream = new FileOutputStream(destination);
    }

    public void copyFile() throws IOException {

        byte[] buffer = new byte[1024];
        int num = inputStream.read(buffer);

        while (num != -1) {

            outputStream.write(buffer, 0, num);
            System.out.println("I've read this " + num + " bytes");

            num = inputStream.read(buffer);
        }

        inputStream.close();
        outputStream.close();
    }
}
