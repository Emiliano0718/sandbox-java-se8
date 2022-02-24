package com.demo.arrays.demo;

import java.util.Arrays;

public class Demo07 {
    
    public static void main(String[] args) {

        int[] originalArray = { 8, 55, 34, 90,73 };
        int size = originalArray.length;

        int[] newArray = Arrays.copyOf(originalArray,  size );

        for (int number : newArray) {
            System.out.print( " " + number );        
        }
        
    }
}
