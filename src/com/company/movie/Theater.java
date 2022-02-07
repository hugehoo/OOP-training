package com.company.movie;

public class Theater {

    private final Integer theaterCode;

    public Integer getTheaterCode() {
        return theaterCode;
    }

    public Theater(Integer theaterCode) {
        this.theaterCode = theaterCode;
    }

    // movieOnAir 와 movieName 을 인자로 받는 것이 더 나을 것 같다.
    public String chooseMovie(String[] movieOnAir, String movieName) {
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
