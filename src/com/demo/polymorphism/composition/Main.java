package com.demo.polymorphism.composition;

public class Main {
    public static void main(String[] args) {

        Car car = new Car( "Red", 4  , "V8", "Chevy" , "320 BHP" );

        System.out.println( "The power of our car is " + car.getEnginePower()  );
        

        
    }

}
