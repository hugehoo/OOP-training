package com.company.proxy.code;

public class ProxyConnection implements IConnection {

    private final IConnection realConnection;
    String cacheValue;

    public ProxyConnection(IConnection realConnection) {
        this.realConnection = realConnection;
    }

    @Override
    public String connect() {
        System.out.println("Proxy Connection");
        if (cacheValue == null) {
            cacheValue = realConnection.connect();
        }
        return cacheValue;
    }
}
