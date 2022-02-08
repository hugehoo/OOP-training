package com.company.order.discount;

import com.company.order.member.Grade;
import com.company.order.member.Member;

public class FixDiscount implements Discount {

    private int discountFixAmount = 1000;

    public int discount(Member member, int price) {
        return member.getGrade() == Grade.Premium ? discountFixAmount : 0;
    }

}
