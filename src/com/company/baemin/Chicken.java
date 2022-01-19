package com.company.baemin;

public class Chicken implements Order{

    String storeName;
    int totalAmount = 0;
    int orderCount;

    public Chicken(String storeName) {
        this.storeName = storeName;
    }

    @Override
    public void order(int orderCount) {
        ++ this.orderCount;
        this.totalAmount += 20000;
    }

    @Override
    public void info() {

    }

    public String getStoreName() {
        return storeName;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public int getOrderCount() {
        return orderCount;
    }
}
