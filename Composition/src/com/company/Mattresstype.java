package com.company;

public class Mattresstype {

    private int thickness;

    public Mattresstype(int thickness) {
        this.thickness = thickness;
        whatThickness();
    }

    public void whatThickness(){
        System.out.println("The thickness of the mattress is "+ this.thickness);
    }

    public int getThickness() {
        return thickness;
    }
}
