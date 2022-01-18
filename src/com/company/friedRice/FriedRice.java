package com.company.friedRice;

public class FriedRice {

    public static void main(String[] args) {

        Oil oil = new Oil();
        Frypan frypan = new Frypan(oil);
        Meat meat = new Meat();
        Vegetable vegetable = new Vegetable();
        Rice rice = new Rice();
        Knife knife = new Knife();

        // 썰린 야채, 고기는 어디에 저장해야하지?
        // chopped 된 재료를 담당할 클래스가 있어야 하지 않을까?
        Vegetable choppedVegetable = knife.chop(vegetable);
        Meat choppedMeat = knife.chop(meat);

        Meat friedMeat = frypan.fry(choppedMeat);
        Vegetable friedVege = frypan.fry(choppedVegetable);

        Rice friedRice = frypan.fry(friedMeat, friedVege, rice);

    }
}
