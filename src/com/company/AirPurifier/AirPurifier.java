package com.company.AirPurifier;

public class AirPurifier {

    private Boolean powerStatus = false;
    private int purifyLevel = 1;
    private int filterLevel = 1;

    public AirPurifier(Boolean powerStatus, int purifyLevel, int filterLevel) {
        this.powerStatus = powerStatus;
        this.purifyLevel = purifyLevel;
        this.filterLevel = filterLevel;
    }

    public void powerOnOff() {
        powerStatus = !powerStatus;
        if (!powerStatus) {
            purifyLevel = 0;
            filterLevel = 0;
        }
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

    public void showStatus() {
        System.out.println(
            "전원 = " + powerStatus
                + " 필터 레벨 = " + filterLevel
                + " 청정 레벨 = " + purifyLevel
        );
    }
}
