package org.academiadecodigo.rhashtafaris.webserver;

public class Main {

    public static void main(String[] args) {

        WebServ server = new WebServ(7878);

        server.init();
    }
}
