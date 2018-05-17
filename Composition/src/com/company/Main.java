package com.company;

public class Main {

    public static void main(String[] args) {
	Mattress theMatteress = new Mattress("Bedsy","Queen XL", new Mattresstype(7));
    AC theAC  = new AC("Hitachi",240, 2, new ACtype("Split AC"));
    Sofa theSofa = new Sofa("Kings",4,new Cushion("Ultra Soft"));
    Lamp lamp = new Lamp("Classic",true,5);

    Room room1 = new Room(theMatteress,theAC,theSofa,lamp);
    room1.makeBed();
    room1.allmethodsPublic();


    }
}
