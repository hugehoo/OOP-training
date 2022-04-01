package com.company.coffeeOrder.size;

public class TallSize implements Size {

    @Override
    public int chooseSize() {
        System.out.println("TallSize");
        return 1000;
    }
}
