package com.company.baemin;

public class Ordering {

    int orderId;
    int money;

    public Ordering(int orderId, int money) {
        this.orderId = orderId;
        this.money = money;
    }

    public void orderPizza(Pizza pizza, int orderCount) {
        this.money -= (30000 * orderCount);
        pizza.order(orderCount);
    }

    public void orderChicken(Chicken chicken, int orderCount) {
        this.money -= (20000 * orderCount);
        chicken.order(orderCount);
    }

    public int getOrderId() {
        return orderId;
    }

    public int getMoney() {
        return money;
    }

    public void info() {
        System.out.println( " Id " + getOrderId() + " 잔액 : " + getMoney());
    }
}
