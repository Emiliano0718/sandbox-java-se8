package com.demo.classes.demo;

public class Demo02 {

    public static void main(String[] args) {
        
        System.out.println("#### Person 01 ");
        Person per01 = new Person();
        per01.sayHello();
        per01.writeMe();

        System.out.println("#### Person 02 ");
        Person per02 = new Person();
        per02.name = "Juan";
        per02.lastname = "Charrasqueado";
        per02.email = "juan.charrasqueado@mail.com";

        per02.sayHello();
        per02.writeMe();


    }
    
}
