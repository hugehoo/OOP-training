package com.company.coffeeOrder.size;

public class GrandeSize implements Size {

    @Override
    public int chooseSize() {

        System.out.println("GrandeSize");
        return 2000;
    }
}
