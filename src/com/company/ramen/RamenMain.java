package com.company.ramen;

public class RamenMain {

    public static void main(String[] args) {
        Ramen spicyRamen = new Ramen("신라면", "매운스프");
        String ramen = spicyRamen.getRamen();
        String soup = spicyRamen.getSoup();

        Ingredients ingredients = new Ingredients();
        Utils utils = new Utils();
        Cook cook = new Cook();

        cook.pourWaterInPot(utils.getPot(), ingredients.getWater());
        cook.boilWater();
        cook.putRamen(ramen);
        cook.putSoup(soup);
        cook.finish();
    }
}
