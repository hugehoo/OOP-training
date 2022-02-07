package com.company.movie;

public class Pay {

    private String seatType; // 좌석 등급
    private int person; // 예매 인원
    private String type;  // 성인, 청소년

    private int price;
    private int plus; // 추가요금


    public int order(int person, String type, String seatType) {

        if (seatType.equals("A")) {
            plus = 1000;
        } else {
            plus = 0;
        }
        switch (type) {
            case "Adult":
                return (10000 + plus) * person;
            case "teenager":
                return (5000+ plus) * person;
        }
    }
}
