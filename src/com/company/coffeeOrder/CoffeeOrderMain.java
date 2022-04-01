package com.company.coffeeOrder;

import com.company.coffeeOrder.menu.Americano;
import com.company.coffeeOrder.menu.Latte;
import com.company.coffeeOrder.order.ContactOrder;
import com.company.coffeeOrder.order.Order;
import com.company.coffeeOrder.menu.Menu;
import com.company.coffeeOrder.order.SirenOrder;
import com.company.coffeeOrder.size.GrandeSize;
import com.company.coffeeOrder.size.Size;
import com.company.coffeeOrder.size.TallSize;

public class CoffeeOrderMain {

    public int price;

    public CoffeeOrderMain(int price) {
        this.price = price;
    }

    public void order(Order ordering, Menu menu, Size size) {
        ordering.order();
        price = menu.orderMenu();
        price += size.chooseSize();

        System.out.println("Total Amount is " + price);
    }

    public void notifyToCustomer(Order ordering) {
        ordering.orderNotify();
    }


    public static void main(String[] args) {

        System.out.println("========== Order1 ==========");

        CoffeeOrderMain order1 = new CoffeeOrderMain(0);
        Order contactOrder = new ContactOrder();
        Menu orderAmericano = new Americano();
        Size grandeSize = new GrandeSize();
        order1.order(contactOrder, orderAmericano, grandeSize);
        order1.notifyToCustomer(contactOrder);

        System.out.println("========== Order2 ==========");

        CoffeeOrderMain order2 = new CoffeeOrderMain(0);
        Order sirenOrder = new SirenOrder();
        Menu orderLatte = new Latte();
        Size tallSize = new TallSize();
        order2.order(sirenOrder, orderLatte, tallSize);
        order2.notifyToCustomer(sirenOrder);
    }

}
