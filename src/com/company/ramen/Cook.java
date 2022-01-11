package com.company.ramen;

public class Cook {

    public Utils pot;
    public Ingredients water;

    public void pourWaterInPot(Utils utils, Ingredients ingredients) {
        this.pot = utils.getPot();
        this.water = ingredients.getWater();
    }

    public void boilWater() {
        System.out.println("물을 끓입니다.");
    }

    public void putRamen(String ramen) {
        System.out.println(ramen + "을 넣습니다.");
    }

    public void putSoup(String soup) {
        System.out.println(soup + "를 넣습니다.");
   }

    public void finish() {
        System.out.println("조리가 완료됐습니다.");
    }
}
