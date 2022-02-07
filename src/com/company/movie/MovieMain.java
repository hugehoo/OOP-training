package com.company.movie;

public class MovieMain {

    public static void main(String[] args) {
        Theater theater = new Theater(3);
        String[] movieOnAir = theater.getMovieList(theater.getTheaterCode());
        String movie = theater.chooseMovie(movieOnAir, "어바웃타임");

        Order order = new Order(theater, movie, 2);
        order.option("teenager", "A");
        System.out.println(order.toString());
    }

}
