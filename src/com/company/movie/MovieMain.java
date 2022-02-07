package com.company.movie;

public class MovieMain {

    public static void main(String[] args) {
        Theater theater = new Theater(3);
        String[] movieOnAir = theater.getMovieList(theater.getTheaterCode());
        String movie = theater.chooseMovie(movieOnAir, "어바웃타임");
        Pay pay = new Pay();
        int amount = pay.order(2, "Adult", "A");
    }

}
