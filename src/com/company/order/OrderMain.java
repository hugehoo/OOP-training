package com.company.order;

import com.company.order.discount.Discount;
import com.company.order.discount.FixDiscount;
import com.company.order.discount.RateDiscount;
import com.company.order.member.Grade;
import com.company.order.member.Member;
import java.util.HashMap;
import java.util.Map;

public class OrderMain {

    public Member findById(Long memberId) {
        Map<Long, Member> store = new HashMap<>(){{
            put(1L, new Member(1L, "A", Grade.Premium));
            put(2L, new Member(2L, "B", Grade.Basic));
        }};
        return store.get(memberId);
    }

    public Order createOrder(Long memberId, String itemName, int itemPrice, String discountType) {
        Member member = findById(memberId);
        Discount discount;
        if (discountType.equals("Fix")) {
            discount = new FixDiscount();
        } else {
            discount = new RateDiscount();
        }
        int discountPrice = discount.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    public static void main(String[] args) {
        OrderMain orderMain = new OrderMain();
        Order orderByPremiumMember = orderMain.createOrder(1L, "itemA", 2000, "Fix");
        System.out.println(orderByPremiumMember.toString());


        Order orderByBasicMember = orderMain.createOrder(2L, "itemB", 2000, "Rate");
        System.out.println(orderByBasicMember.toString());


    }

}
