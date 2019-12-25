package com.scheduler.demo.Classes;

public class slot {
    private String Day,slot;

    public slot(String day, String slot) {
        Day = day;
        this.slot = slot;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }
}
