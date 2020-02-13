package org.academiadecodigo.rhashtafaris.copyfile;

public class Main {

    public static void main(String[] args) {

        try {
            CopyFile copy = new CopyFile("/Users/codecadet/Desktop/copyfile.txt", "/Users/codecadet/Desktop/hackedfile.txt");
            copy.copyFile();
        } catch (java.io.IOException e) {
            System.out.println("File not found");
        }
    }
}
