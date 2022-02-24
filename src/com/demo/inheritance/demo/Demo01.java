package com.demo.inheritance.demo;

public class Demo01 {

    public static void main(String[] args) {

        System.out.println("### Testing a Car");
        Car car = new Car();
        car.go();
        System.out.println( "This car has door" + car.doors );

        System.out.println("### Testing a Bike");
        Bicycle bike = new Bicycle();
        bike.stop();


        
    }
    
}
