package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of the array:");
        int arrsize = scanner.nextInt();
        int array[] = getIntegers(arrsize);
        int sortedArray[] = sortIntegers(array);

        printArray(sortedArray);




    }

    public static int[] getIntegers(int arraySize){

        int[] array = new int[arraySize];
        for (int i=0;i<array.length;i++){
            System.out.println("Enter "+ i+ " element of the array: \r");
            array[i]=scanner.nextInt();

        }

    return array;

    }

    public static void printArray(int[] a){
        System.out.println("The sorted array is ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
    public static int[] sortIntegers(int unsortedArray[]){
        for(int i=0;i<unsortedArray.length-1;i++) {
            int max;
            max = i;
            for(int j=i+1;j<unsortedArray.length;j++){
                if (unsortedArray[j]>unsortedArray[max]){
                    max = j;
                }
            }
            if (max!=i){
                int temp;
                temp = unsortedArray[i];
                unsortedArray[i] = unsortedArray[max];
                unsortedArray[max]=temp;
            }


            }
            return unsortedArray;

        }




    }



