package com.company.coffeeOrder.order;

import com.company.coffeeOrder.Menu;

public class ContactOrder implements Order {

    @Override
    public void order() {
        System.out.println("ordering to clerk");
    }

    @Override
    public void chooseMenu(Menu menu) {
        System.out.println(menu);
    }
}
