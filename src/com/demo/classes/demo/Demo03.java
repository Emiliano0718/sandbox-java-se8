package com.demo.classes.demo;

public class Demo03 {

    public static void main(String[] args) {
        Citizen c1 = new Citizen();
        c1.name = "John";
        c1.lastname = "Rambo";
        c1.greet();

        Citizen c2 = new Citizen( "Rocky","Balboa"  );
        c2.greet();
    }
    
}
