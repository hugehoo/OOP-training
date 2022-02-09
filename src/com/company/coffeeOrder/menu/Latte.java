package com.company.coffeeOrder.menu;

public class Latte implements Menu{

    @Override
    public int orderMenu() {

        System.out.println("OrderLatte");
        return 5000;
    }
}
