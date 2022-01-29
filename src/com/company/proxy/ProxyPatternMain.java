package com.company.proxy;

import com.company.proxy.code.DBConnection;
import com.company.proxy.code.MockClient;
import com.company.proxy.code.ProxyConnection;

public class ProxyPatternMain {

    DBConnection connection = new DBConnection();
    MockClient client;

    void noProxy() {
        client = new MockClient(connection);

        int connectionPool = 10;
        while (connectionPool > 0){
            client.execute();
            connectionPool -= 1;
        }
    }

    void withProxy() {
        ProxyConnection proxyConnection = new ProxyConnection(connection);
        client = new MockClient(proxyConnection);
        int connectionPool = 10;
        while (connectionPool > 0){
            client.execute();
            connectionPool -= 1;
        }
    }

    public static void main(String[] args) {
        ProxyPatternMain proxyMain = new ProxyPatternMain();
        System.out.println(" === No Proxy === ");
        proxyMain.noProxy();

        System.out.println(" ===  with Proxy === ");
        proxyMain.withProxy();

    }

}
