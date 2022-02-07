package com.company.movie;

public class Order {

    public Theater theaterCode;
    public String movieName;
    public int person;

    public String seatType;
    public String audience;
    private int plus; // 추가요금
    private int orderPrice;

    public Order(Theater theaterCode, String movieName, int person) {
        this.theaterCode = theaterCode;
        this.movieName = movieName;
        this.person = person;
    }

    public void option(String audience, String seatType) {
        this.audience = audience;
        this.seatType = seatType;

        if (seatType.equals("A")) {
            plus = 1000;
        } else {
            plus = 0;
        }
        if ("teenager".equals(audience)) {
            this.orderPrice = (5000 + plus) * this.person;
            return;
        }
        this.orderPrice =  (10000 + plus) * this.person;
    }

    @Override
    public String toString() {
        return "Order{" +
            "theater=" + theaterCode +
            ", movieName='" + movieName + '\'' +
            ", person=" + person +
            ", seatType='" + seatType + '\'' +
            ", audience='" + audience + '\'' +
            ", orderPrice='" + orderPrice + '\'' +
            '}';
    }
}
