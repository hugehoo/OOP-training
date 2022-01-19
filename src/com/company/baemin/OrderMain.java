package com.company.baemin;

public class OrderMain {

    public static void main(String[] args) {


        Ordering id1000 = new Ordering(1000, 100000);
        Ordering id2000 = new Ordering(2000, 100000);
        Ordering id3000 = new Ordering(3000, 100000);

        System.out.println("________Before Ordering________");

        id1000.info();
        id2000.info();
        id3000.info();

        Chicken NeNeChicken = new Chicken("NeNe");
        Chicken BBQ = new Chicken("BBQ");
        Pizza PizzaHut = new Pizza("PizzaHut");
        Pizza Domino = new Pizza("Domino");

        id1000.orderPizza(PizzaHut, 1);
        id1000.orderPizza(Domino, 2);
        id2000.orderChicken(BBQ, 1);
        id2000.orderPizza(PizzaHut, 2);
        id3000.orderChicken(NeNeChicken, 2);
        System.out.println("\n ________After Ordering________");

        id1000.info();
        id2000.info();
        id3000.info();

        System.out.println("\n ________Store________");

        NeNeChicken.info();
        BBQ.info();
        PizzaHut.info();
        Domino.info();


    }



}
