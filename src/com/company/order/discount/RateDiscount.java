package com.company.order.discount;

import com.company.order.member.Grade;
import com.company.order.member.Member;

public class RateDiscount implements Discount {

    private int discountRate = 10;

    public int discount(Member member, int price) {
        int rate =  member.getGrade() == Grade.Premium ? discountRate : 0;
        return price * (rate) / 100;
    }

}
