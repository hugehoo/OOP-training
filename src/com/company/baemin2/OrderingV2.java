package com.company.baemin2;

import lombok.Getter;


@Getter
public class OrderingV2 {

    int orderId;
    int money;
    String menu;

    public OrderingV2(int orderId, int money) {
        this.orderId = orderId;
        this.money = money;
    }


    // orderPizza, orderChicken 이 아닌 그냥 order
    public void order(Store store, String menu, int orderCount) {
        int price = store.ordering(menu, orderCount, money);
        if (price == -1) {
            System.out.println("주문을 진행할 수 없습니다.");
            return;
        }
        this.money -= (orderCount * price);
    }

//      // 여기서 Pizza 는 인자로 받을 필요도 없었음. 치킨도 마찬가지
//    public void orderPizza(Pizza pizza, int orderCount) {
//        this.money -= (30000 * orderCount);
//        pizza.order(orderCount);
//    }

    public void info() {
        System.out.println( " Id " + getOrderId() + " 잔액 : " + getMoney());
    }
}
