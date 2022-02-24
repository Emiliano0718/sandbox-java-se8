package com.demo.polymorphism.dynamic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you whant ?");
        System.out.println(" 1) Dog");
        System.out.println(" 2) Cat");

        int choice  = scanner.nextInt();

        if( choice == 1 ){
            animal = new Dog();
        } else if (choice == 2) {
            animal = new Cat();
        } else {
            System.out.println("Wrong choise");
            animal = new Animal();
        }

        animal.speak();   
        
        scanner.close();
    }
    
}
