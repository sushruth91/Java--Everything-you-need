package com.company;

import java.util.BitSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        int m;
        System.out.println("Enter N:");
        n = scanner.nextInt();
        System.out.println("Enter M:");
        m= scanner.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        for(int i =0;i<m;i++){

            scanner.nextLine();
            String op = scanner.next();


            int a= scanner.nextInt();

            int b = scanner.nextInt();
            if(op.toUpperCase().equals("AND")) {
                if (a == 1&& b==2) {
                    b1.and(b2);
                    System.out.println(b1.cardinality() + "  " + b2.cardinality());
                }
                if (a == 2 && b==1) {
                    b2.and(b1);
                    System.out.println(b1.cardinality() + "  " + b2.cardinality());
                }
            }
            if(op.toUpperCase().equals("OR") ){
                if (a == 1&& b==2) {
                    b1.or(b2);
                    System.out.println(b1.cardinality() + "  " + b2.cardinality());
                }
                if (a == 2&& b==1) {
                    b2.or(b1);
                    System.out.println(b1.cardinality() + "  " + b2.cardinality());
                }
            }
            if(op.toUpperCase().equals("XOR")) {

                if (a == 1&& b==2) {
                    b1.xor(b2);
                    System.out.println(b1.cardinality() + "  " + b2.cardinality());
                }
                if (a == 2 && b==1) {
                    b2.xor(b1);
                    System.out.println(b1.cardinality() + "  " + b2.cardinality());
                }
            }
            if(op.toUpperCase().equals("FLIP")) {

                if (a == 1) {
                    b1.flip(b);
                    System.out.println(b1.cardinality() + "  " + b2.cardinality());
                }
                if (a == 2) {
                    b2.flip(b);
                    System.out.println(b1.cardinality() + "  " + b2.cardinality());
                }


            }
            if(op.toUpperCase().equals("SET")) {
                if (a == 1) {
                    b1.set(b);
                    System.out.println(b1.cardinality() + "  " + b2.cardinality());
                }
                if (a == 2) {
                    b2.set(b);
                    System.out.println(b1.cardinality() + "  " + b2.cardinality());
                }


            }




        }





    }
}
