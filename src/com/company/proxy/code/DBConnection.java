package com.company.proxy.code;


public class DBConnection implements IConnection {


    @Override
    public String connect() {
        System.out.println(" DB Connection");
        sleep(500);
        return "DB Connect";
    }

    private void sleep(int millis) {

        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
