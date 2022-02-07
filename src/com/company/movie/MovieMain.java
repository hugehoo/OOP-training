package com.company.movie;

public class MovieMain {

    public static Theater chooseTheater(Integer integer) {
        return new Theater(integer);
    }

    public static void main(String[] args) {
        Theater theater = chooseTheater(3);
        String movie = theater.chooseMovie(theater, "어바웃타임");
        Pay pay = new Pay();
        int amount = pay.order(2, "Adult", "A");
    }

}
