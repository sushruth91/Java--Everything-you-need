package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer,String> myMap = new HashMap<>();
        myMap.put(1,"Sushruth");
        myMap.put(2,"Santu");
        myMap.put(3,"Ronnie");
        myMap.put(4,"Ronaldo");
        System.out.println(myMap);

        HashMap<String ,HashMap<Integer,String>> nestedHash = new HashMap<String,HashMap<Integer, String>>();
        nestedHash.put("Asteroid",myMap);

        System.out.println(nestedHash.get("Asteroid").get(4));







        System.out.println(myMap.get(1));

	// write your code here
    }
}
