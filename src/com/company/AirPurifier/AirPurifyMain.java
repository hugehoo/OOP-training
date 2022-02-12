package com.company.AirPurifier;

public class AirPurifyMain {


    public static void main(String[] args) {
        AirPurifier airPurifier = new AirPurifier(false, 1, 1);

        airPurifier.powerOnOff();
        airPurifier.purifyLevelUp();
        airPurifier.filterLevelUp();
        airPurifier.showStatus();

        airPurifier.purifyLevelUp();
        airPurifier.filterLevelUp();
        airPurifier.showStatus();

        airPurifier.filterLevelUp();
        airPurifier.showStatus();

        airPurifier.powerOnOff();
        airPurifier.showStatus();
    }
}
