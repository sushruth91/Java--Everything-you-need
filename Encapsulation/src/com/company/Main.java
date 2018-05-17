package com.company;

public class Main {

    public static void main(String[] args) {

        Printer p1 = new Printer(50,true);
        System.out.println("Intitial page count = "+ p1.getNoofpagesprinted());
        System.out.println("New TonerLevel = "+ p1.addToner(10));
        p1.pagesNumber(4);
        System.out.println("New page count = "+ p1.getNoofpagesprinted());
        p1.pagesNumber(4);
        System.out.println("New page count = "+ p1.getNoofpagesprinted());

    }
}
