package com.company.ramen;

public class Ramen {

    public String ramen;
    public String soup;

    public Ramen(String ramen, String soup) {
        this.ramen = ramen;
        this.soup = soup;
    }

    public String getRamen() {
        return ramen;
    }

    public void setRamen(String ramen) {
        this.ramen = ramen;
    }

    public String getSoup() {
        return soup;
    }

    public void setSoup(String soup) {
        this.soup = soup;
    }
}
