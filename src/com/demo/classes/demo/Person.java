package com.demo.classes.demo;

public class Person {

    String name;
    String lastname;
    String email;

    void sayHello(){
        System.out.println( "Hello my name is " + name + " " + lastname  );
    }

    void writeMe(){
        System.out.println("Please mail me to "+ email  );
    }
    
}
