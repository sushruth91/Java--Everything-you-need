package com.company;

public class Room {
    private Mattress theMattressRoom;
    private AC theACRoom;
    private Sofa theSofa;
    private Lamp thelamp;

    public Room(Mattress theMattressRoom, AC theACRoom, Sofa theSofa, Lamp thelamp) {
        this.theMattressRoom = theMattressRoom;
        this.theACRoom = theACRoom;
        this.theSofa = theSofa;
        this.thelamp= thelamp;
    }

    public void makeBed(){
        System.out.println("Room--> Making Bed");
        theMattressRoom.make();
    }

    public void allmethodsPublic(){
        getThelamp().turnLamp();
        getTheMattressRoom().make();


    }


    private Lamp getThelamp() {
        return thelamp;
    }

    private Mattress getTheMattressRoom() {
        return theMattressRoom;
    }

    private AC getTheACRoom() {
        return theACRoom;
    }

    private Sofa getTheSofa() {
        return theSofa;
    }
}
