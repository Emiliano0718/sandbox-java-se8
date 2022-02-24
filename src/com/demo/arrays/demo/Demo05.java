package com.demo.arrays.demo;

/**
 * A wrong demo about to copy array elements
 * Because we are copying the memory location.
 */
public class Demo05 {
    
    public static void main(String[] args) {
        
        int[] numbers = { 22, 44, 55, 99, 88 };
        int[] numbersCopy = new int[5];

        // Each element is initialize with the default type
        System.out.println("The original copy values are");
        for (int current : numbersCopy) {
            System.out.print( " "+ current );
        }

        //But we are copying the direction memory...
        System.out.println("\n Coping the array");
        numbersCopy = numbers;
        for (int current : numbersCopy) {
            System.out.print( " "+ current );
        }


        numbers[0] = 500;
        numbers[1] = 0;
        numbers[2] = 44;

        System.out.println("\n Iterating again the 'copy' ");        
        for (int current : numbersCopy) {
            System.out.print( " "+ current );
        }


        System.out.println("\n Copy the values to numberCopy");
        numbersCopy = new int[5];

        int size = numbers.length;
        for (int index= 0; index < size; index++) {
            numbersCopy[index] = numbers[index];
        }

        System.out.println("\n Checking again the values");
        for (int copy : numbersCopy) {
            System.out.print( " " + copy );
        }

        numbers[0] = -1;
        numbers[1] = -1;
        numbers[2] = -1;
        numbers[3] = -1;
        numbers[4] = -1;

        System.out.println("\n Checking again the values");
        for (int copy : numbersCopy) {
            System.out.print( " " + copy );
        }






    }
}
