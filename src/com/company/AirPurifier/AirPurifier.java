package com.company.AirPurifier;

public class AirPurifier {

    private Boolean powerStatus = false;

    public void powerOnOff() {
        powerStatus = !powerStatus;
    }
}
