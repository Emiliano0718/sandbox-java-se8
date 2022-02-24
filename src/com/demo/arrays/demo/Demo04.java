package com.demo.arrays.demo;

public class Demo04 {
    
    public static void main(String[] args) {

        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Sliverado";

        cars[1][0] = "Vocho";
        cars[1][1] = "Testla";
        cars[1][2] = "Tsuru";

        cars[2][0] = "Mustang";
        cars[2][1] = "Ferrari";
        cars[2][2] = "Honda";

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
