package com.company.movie;

public class Theater {

    private final Integer theaterCode;

    public Integer getTheaterCode() {
        return theaterCode;
    }

    public Theater(Integer theaterCode) {
        this.theaterCode = theaterCode;
    }

    public static String chooseMovie(Theater theater, String movieName) {
        String[] movieOnAir = theater.getMovieList(theater.getTheaterCode());
        String movie = null;
        for (String onAir : movieOnAir) {
            if (onAir.equals(movieName)) {
                movie = movieName;
                break;
            }
        }
        return movie;
    }


    public String[] getMovieList(Integer theaterCode) {
        switch (theaterCode) {
            case 1:
                return new String[]{"괴물", "어벤져스"};
            case 2:
                return new String[]{"괴물", "자바의 신"};
            case 3:
                return new String[]{"어바웃타임", "제임스고슬링"};
            default:
                return new String[]{"토르", "아이언맨", "전설의 레게노"};
        }
    }
}
