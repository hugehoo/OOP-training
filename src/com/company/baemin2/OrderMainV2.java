package com.company.baemin2;

public class OrderMainV2 {

    public static void main(String[] args) {

        Store NeneChicken = new Store("NeNe");
        Store BBQ = new Store("BBQ");
        Store PizzaHut = new Store("PizzaHut");

        OrderingV2 id10001 = new OrderingV2(10001, 100000);
        OrderingV2 id10002 = new OrderingV2(10002, 100000);
        OrderingV2 id10003 = new OrderingV2(10003, 100000);

        System.out.println("________Before Ordering________");

        id10001.info();
        id10002.info();
        id10003.info();

        id10001.order(NeneChicken, "friedChicken", 20);
        id10002.order(BBQ, "barbequeChicken", 1);
        id10003.order(PizzaHut, "spicyPizza", 3);

        System.out.println("\n ________After Ordering________");
        id10001.info();
        id10002.info();
        id10003.info();

        System.out.println("\n ________Store________");
        NeneChicken.info();
        BBQ.info();
        PizzaHut.info();

    }


}
