package com.company;

public class Printer {
    private int tonerLevel=100;
    private int noofpagesprinted=0;
    private boolean duplex;


    public Printer(int tonerLevel,  boolean duplex) {

        if (tonerLevel>0 && tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        }
        else {
            this.tonerLevel=-1;
        }
        this.noofpagesprinted=0;
        this.duplex = duplex;
        System.out.println("Toner level is "+ this.tonerLevel);
    }

    public int addToner(int tonerAmount){
        if (tonerAmount>0 && tonerAmount<=100){
            if(this.tonerLevel+tonerAmount>100 ){
                return -1;
            }
            this.tonerLevel+= tonerAmount;
            return this.tonerLevel;

        } else
        return -1;

    }

    public int pagesNumber(int pages){
        int pagestoprint=pages;
        if (this.duplex){

            pagestoprint /= 2;


        }
        this.noofpagesprinted += pagestoprint;
        return pagestoprint;
    }


    public int getNoofpagesprinted() {
        return noofpagesprinted;
    }
}
