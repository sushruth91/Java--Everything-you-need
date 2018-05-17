package com.company;

public class Lamp {
    private String style;
    private boolean battery;
    private int globalRatinng;


    public Lamp(String style, boolean battery, int globalRatinng) {
        this.style = style;
        this.battery = battery;
        this.globalRatinng = globalRatinng;
    }

    public void turnLamp(){
        System.out.println("Lamp-> Turning On");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobalRatinng() {
        return globalRatinng;
    }
}
