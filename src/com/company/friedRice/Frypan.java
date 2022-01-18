package com.company.friedRice;

public class Frypan {

    Oil oil;

    public Frypan(Oil oil) {
        this.oil = oil;
    }

    public <V> V fry(V v) {
        System.out.println("fried " + v);
        return v;
    }

    public <V, R> R fry(V v, R r) {
        System.out.println("fried both rice and ingredients");
        return r;
    }
}
