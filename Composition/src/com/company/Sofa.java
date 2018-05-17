package com.company;

public class Sofa {

    private String manufacturer;
    private int legs;
    private Cushion cushionType;

    public Sofa(String manufacturer, int legs, Cushion cushionType) {
        this.manufacturer = manufacturer;
        this.legs = legs;
        this.cushionType = cushionType;
    }



    public String getManufacturer() {
        return manufacturer;
    }

    public int getLegs() {
        return legs;
    }

    public Cushion getCushionType() {
        return cushionType;
    }
}
