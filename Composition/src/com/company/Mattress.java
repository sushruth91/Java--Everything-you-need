package com.company;

public class Mattress {

    private String manufacturer;
    private String size;
    private Mattresstype type;

    public Mattress(String manufacturer, String size, Mattresstype type) {
        this.manufacturer = manufacturer;
        this.size = size;
        this.type = type;
    }

    public void make(){
        System.out.println("Making bed--> Mattress");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSize() {
        return size;
    }

    public Mattresstype getType() {
        return type;
    }
}
