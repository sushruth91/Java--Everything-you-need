package com.company;

public class AC {

    private String manufacturer;
    private int power;
    private int vents;
    private ACtype type;

    public AC(String manufacturer, int power, int vents, ACtype type) {
        this.manufacturer = manufacturer;
        this.power = power;
        this.vents = vents;
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPower() {
        return power;
    }

    public int getVents() {
        return vents;
    }

    public ACtype getType() {
        return type;
    }
}
