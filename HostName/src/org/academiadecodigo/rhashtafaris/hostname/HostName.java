package org.academiadecodigo.rhashtafaris.hostname;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostName {

    public void getIpAddress(String host) {

        try {
            System.out.println(InetAddress.getByName(host).getHostAddress());
        } catch (UnknownHostException exception) {
            exception.printStackTrace();
        }
    }
}
