package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("a");
        hash_Set.add("c");
        hash_Set.add("cat");
        hash_Set.add("beddek");
        hash_Set.add("d");
        System.out.print("Set output without the duplicates");

        System.out.println(hash_Set);
        //System.out.println(hash_Set.hashCode());

            for(String i: hash_Set)

            System.out.println((i.hashCode()));
        }
    }

