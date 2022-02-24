package com.demo.arrays.demo;

public class Demo01 {
    
    public static void main(String[] args) {

        String[] cars = { "Camaro", "Vochito", "Tesla", "BMW" };

        //Access by index
        System.out.println("First element in the car arary is " + cars[0]  );
        System.out.println("Second element in the car arary is " + cars[1]  );
        System.out.println( "The size of our array is " + cars.length );

        // Changing our Camaro :)
        cars[0] = "Mustang";
        System.out.println("Now our first element in the car arary is " + cars[0]  );

        for (String current : cars) {
            System.out.println( "The current car is "+ current );
        }

        
        System.out.println( "The full array is" + cars );

    }


}
