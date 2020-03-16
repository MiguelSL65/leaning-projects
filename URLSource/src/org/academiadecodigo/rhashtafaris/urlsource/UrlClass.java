package org.academiadecodigo.rhashtafaris.urlsource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlClass {

    public static void main(String[] args) {

        try {

            String site = "http://www.google.pt";
            URL url = new URL(site);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;

            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }

            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
