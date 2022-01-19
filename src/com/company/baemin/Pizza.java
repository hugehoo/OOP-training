package com.company.baemin;

public class Pizza implements Order{

    String storeName;
    int totalAmount = 0;
    int orderCount;

    public Pizza(String storeName) {
        this.storeName = storeName;
    }

    @Override
    public void order(int orderCount) {
        ++ this.orderCount;
        this.totalAmount += 30000;
    }

    @Override
    public void info() {
        System.out.println(getStoreName() + " got " + getOrderCount() + " order " + " and earned " + getTotalAmount());
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
