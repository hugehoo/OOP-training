package com.company.friedRice;

public class Knife {

    public <T> T chop(T ingredient) {
        System.out.println("chopped" + ingredient);
        return ingredient;
    }

}
