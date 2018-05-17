package com.company;

public class Main {

    public static void main(String[] args) {
	int myIntValue = 50; // width is 32
        int mynewIntvalue = (myIntValue/2);
        System.out.println("The new Int value is = "+ mynewIntvalue);


	byte myBytevalue= 10; //width is 8
    byte myFinal = (byte)(myBytevalue/2);
        System.out.println("The byte final value is = "+ myFinal);



	short myShortvalue = 20; // width is 16
	long  myLongvalue = 10000L; // width is 64

        long finalLong =  (50000L+ 10L*(myIntValue+myBytevalue+myShortvalue));
        System.out.println("THE FINAL LONG VALUE IS = "+finalLong);

    }
}
