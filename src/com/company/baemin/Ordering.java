package com.company.baemin;

public class Ordering {

    int orderId;
    int money;

    public Ordering(int orderId, int money) {
        this.orderId = orderId;
        this.money = money;
    }

    public void orderPizza(Pizza PizzaHut, int orderCount) {
        this.money -= 30000;
        PizzaHut.order(orderCount);
    }

    public void orderChicken(Chicken NeNeChicken, int orderCount) {
        this.money -= 20000;
        NeNeChicken.order(orderCount);
    }

    public int getOrderId() {
        return orderId;
    }

    public int getMoney() {
        return money;
    }

    public void info() {
        System.out.println( " Order Id " + getOrderId() + " left " + getMoney());
    }
}
