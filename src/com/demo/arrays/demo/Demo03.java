package com.demo.arrays.demo;

public class Demo03 {
    
    public static void main(String[] args) {

        String[][] cars = {
            { "Camaro", "Corvette", "Silverado" },
            { "Vocho", "Tesla", "Tsuru" },
            { "Mustang", "Ferrari", "Honda" }
        };

        int rowSize = cars.length;
        int colSize = 0;

        for( int row = 0; row < rowSize; row++  ){
            System.out.println();
            colSize = cars[row].length;

            for( int col= 0; col < colSize; col++ ){
                System.out.print(   cars[row][col] + " "  );
            }
        }
    }
}
