package com.company.coffeeOrder.order;

public class SirenOrder implements Order {

    @Override
    public void order() {
        System.out.println("[ -> ] ordering with App");
    }

    @Override
    public void orderNotify() {
        System.out.println("[ -> ] App notifies you");
    }


}
