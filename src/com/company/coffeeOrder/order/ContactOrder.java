package com.company.coffeeOrder.order;

public class ContactOrder implements Order {

    @Override
    public void order() {
        System.out.println("[ -> ] ordering to clerk");
    }

    @Override
    public void orderNotify() {

        System.out.println("[ -> ] Clerk Shouts to Customers");
    }


}
