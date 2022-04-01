package com.company.coffeeOrder.menu;

public class Americano implements Menu {

    @Override
    public int orderMenu() {
        System.out.println("OrderAmericano");
        return 4500;
    }
}
