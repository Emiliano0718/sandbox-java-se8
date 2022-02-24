package com.demo.arrays.demo;


public class Demo06 {
    
    public static void main(String[] args) {
        
        int[] numbers = { 22, 44, 55, 99, 88 };
        int numbersSize = numbers.length;

        int[] numberCopies = new int[5];

        // src: array with the values. 
        // srcPos: starting position 
        // dest:  target array 
        // destPos: the starting index to copy the new values 
        // length: How many values you want to copy
        System.arraycopy( numbers, 0, numberCopies, 0, numbersSize );

        System.out.println("\n Printing the values of number copies");
        for (int copy : numberCopies) {
            System.out.print( " " + copy );
        }

        numbers[0] = 90;
        numbers[1] = 80;
        numbers[2] = 70;
        numbers[3] = 60;
        numbers[4] = 50;


        System.out.println("\n Printing again the values of number copies");
        for (int copy : numberCopies) {
            System.out.print( " " + copy );
        }




    }
}
