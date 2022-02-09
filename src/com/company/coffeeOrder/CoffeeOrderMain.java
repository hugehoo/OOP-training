package com.company.coffeeOrder;

import com.company.coffeeOrder.menu.Americano;
import com.company.coffeeOrder.order.ContactOrder;
import com.company.coffeeOrder.order.Order;
import com.company.coffeeOrder.menu.Menu;
import com.company.coffeeOrder.size.GrandeSize;
import com.company.coffeeOrder.size.Size;

public class CoffeeOrderMain {

    public void order(Order ordering, Menu menu, Size size) {

        ordering.order();
        menu.orderMenu();
        size.chooseSize();

    }

    public void notifyToCustomer(Order ordering) {
        ordering.orderNotify();
    }


    public static void main(String[] args) {
        CoffeeOrderMain ordering1 = new CoffeeOrderMain();
        Order contactOrder = new ContactOrder();
        Menu orderAmericano = new Americano();
        Size size = new GrandeSize();
        ordering1.order(contactOrder, orderAmericano, size);
        ordering1.notifyToCustomer(contactOrder);


//        Menu latte = ContactOrder.orderLatte();

//        ContactOrder contactOrder = new ContactOrder();
//        contactOrder.order();
//        contactOrder.chooseMenu(Menu.AMERICANO);
//        contactOrder.chooseGrandeSize();
    }

}
