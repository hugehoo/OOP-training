package com.company.proxy.code;

public class MockClient {

    IConnection iConnection;

    public MockClient(IConnection iConnection) {
        this.iConnection = iConnection;
    }

    public void execute() {
        iConnection.connect();
    }
}
