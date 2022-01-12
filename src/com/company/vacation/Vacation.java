package com.company.vacation;

public class Vacation {

    Person person;

    public Vacation(Person person) {
        this.person = person;
    }

    public boolean dayOff() {
        double leftDays = person.leftOffDays - 1;
        return checkLeftDays(leftDays);
    }

    public boolean halfOff() {
        double leftDays = person.leftOffDays - 0.5;
        return checkLeftDays(leftDays);
    }

    public void deductVacation() {
        person.leftOffDays -= 1;
    }

    public boolean checkLeftDays(double days) {
        return days > 0;
    }

}
