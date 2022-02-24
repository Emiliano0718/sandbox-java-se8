package com.demo.arrays.demo;

public class Demo02 {
    
    public static void main(String[] args) {

        //{ "Camaro", "Vochito", "Tesla", "BMW" };
        String[] cars = new String[4];
        cars[0] = "Camaro";
        cars[1] = "Vochito";
        cars[2] = "Tesla";
        cars[3] = "BMW";

        //Access by index
        System.out.println("First element in the car arary is " + cars[0]  );
        System.out.println("Second element in the car arary is " + cars[1]  );
        System.out.println( "The size of our array is " + cars.length );

        // Changing our Camaro :)
        cars[0] = "Mustang";
        System.out.println("Now our first element in the car arary is " + cars[0]  );

        int size = cars.length;
        for( int index =0; index < size; index++ ){
            System.out.println( "The current value is " +  cars[ index] );
        }


    }


}
