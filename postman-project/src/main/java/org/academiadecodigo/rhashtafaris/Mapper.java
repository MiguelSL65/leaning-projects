package org.academiadecodigo.rhashtafaris;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Mapper {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            Postman postman = mapper.readValue(new URL("http://ipinfo.io/json"), Postman.class);
            System.out.println(postman);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
