package com.demo.encapsulation.demo;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Chevrolet", "Camaro", 2021);

        //System.out.println( "The model is ", car.model );
        System.out.println( "The model is " + car.getModel() );
        System.out.println( "The make is " + car.getMake() );
        System.out.println( "The year is " + car.getYear() );

        System.out.println("Updating the values of our car");

        //car.year = 2021;
        car.setMake("VW");
        car.setModel("Bochito");
        car.setYear(2022);
        
        System.out.println( "The new model is " + car.getModel() );
        System.out.println( "The newmake is " + car.getMake() );
        System.out.println( "The new year is " + car.getYear() );
        
    }
    
}
