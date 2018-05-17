package com.company;

public class Cushion {
    private String cushionType;




    public Cushion(String cushionType) {
        this.cushionType = cushionType;
        whatCushion();
    }

    public void whatCushion(){
        System.out.println("The cushion type is "+ this.cushionType);
    }

    public String getCushionType() {
        return cushionType;
    }
}
