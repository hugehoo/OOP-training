package com.company.AirPurifier;

public class AirPurifier {

    private Boolean powerStatus = false;
    private int purifyLevel = 1;
    private int filterLevel = 1;

    public void powerOnOff() {
        powerStatus = !powerStatus;
    }

    public void purifyLevelUp() {
        if (powerStatus) {
            if (purifyLevel != 3) {
                ++purifyLevel;
            } else {
                purifyLevel = 1;
            }
        }
    }

    public void filterLevelUp() {
        if (powerStatus) {
            if (filterLevel != 3) {
                ++filterLevel;
            } else {
                filterLevel = 1;
            }
        }
    }
}
