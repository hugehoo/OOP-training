package com.company.baemin2;

import lombok.Getter;

@Getter
public class Store implements IStore {

    String storeName;
    int totalAmount;
    int orderCount;

    public Store(String storeName) {
        this.storeName = storeName;
    }

    @Override // 여기에 메뉴를 어떻게 넣지. // menu 가 friedChicken, spicyPizza 다
    public int ordering(String menu, int orderCount, int money) {

        int price = chooseMenu(menu);
        if (money < price * orderCount) {
            System.out.println("잔액 부족");
            return -1;
        }
        ++this.orderCount;
        this.totalAmount += (price * orderCount);

        return price;
    }

    private int chooseMenu(String menu) {
        int price;
        switch (menu) {
            case "friedChicken":
                price = 20000;
                break;
            case "barbequeChicken":
                price = 18000;
                break;
            case "spicyPizza":
                price = 30000;
                break;
            default:
                price = 0;
                break;
        }
        return price;
    }

    @Override
    public void info() {
        System.out.println(getStoreName() + " got " + getOrderCount() + " order" + " and earned "
            + getTotalAmount());
    }
}
