package com.company;

public class Main {

    public static void main(String[] args) {

        for(int i=2; i<=8;i++){
            System.out.println("The interest for 10000 at "+ i +"% rate is "+ String.format("%.2f",calculateInterest(10000.0,i)));
        }
        for(int i=8; i>=2;i--){
            System.out.println("The interest for 10000 at "+ i +"% rate is "+ String.format("%.2f",calculateInterest(10000.0,i)));
        }
        int count=0;
        for (int i=10;i<50;i++){
            boolean res = isPrime(i);
            if (res){
                System.out.println(i + " is a prime number");
                count=count+1;
                if (count>=3){
                    break;

                }

            }

        }
        int startnumber =5;
        int endnumber = 20;
        int counteven=0;

        while(startnumber<= endnumber){
            if(!isEvenNumber(startnumber)){
                startnumber++;
                continue;
            }
            System.out.println(startnumber+ " is an even number");
            startnumber++;
            counteven++;
            if(counteven==5){
                break;
            }

        }
        System.out.println("Total even numbers found = "+ counteven);


    }

    public static double calculateInterest(double amount, double rate){
        return (amount * (rate/100));
    }

    public static boolean isPrime(int n){
        if (n==1){
            return false;

        }
        for (int i=2; i<=n/2;i++){

            if((n%i)==0){

                return false;
            }

        }
        return true;
    }
    public static boolean isEvenNumber(int a){
        if(a%2==0){
            return true;
        }
        return false;
    }
}
