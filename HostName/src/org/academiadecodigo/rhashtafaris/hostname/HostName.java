package org.academiadecodigo.rhashtafaris.hostname;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostName {

    private InetAddress address;

    public void getIpAddress(String host) {

        try {
            this.address = InetAddress.getByName(host);
            //boolean reachable = address.isReachable(10000);
            System.out.println(InetAddress.getByName(host));
        } catch (UnknownHostException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
