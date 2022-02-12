package com.company.AirPurifier;

public class AirPurifyMain {


    public static void main(String[] args) {
        AirPurifier airPurifier = new AirPurifier();
        airPurifier.powerOn(); // airPurifier 의 상태(power) 변경
        airPurifier.purifyLevelUp();
        airPurifier.filterLevelUp();
        airPurifier.powerOff();
    }
}
