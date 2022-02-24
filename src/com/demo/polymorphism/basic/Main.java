package com.demo.polymorphism.basic;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();
        Bicycle bike = new Bicycle();

        //Car[] racers = { car, bike, boat };
        //Bicycle[] racers = { car, bike, boat };
        //Boat[] racers = { car, bike, boat };

        //Using Polymorphism we solve this issue
        Vehicle[] racers = { car, bike, boat };

        for (Vehicle current : racers) {
            current.go();
        }


    }
    
}
