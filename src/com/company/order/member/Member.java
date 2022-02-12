package com.company.order.member;

public class Member {

    private Long id;
    private String name;
    private Grade grade;

    public Grade getGrade() {
        return grade;
    }

    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}
