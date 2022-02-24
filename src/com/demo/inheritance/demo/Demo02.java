package com.demo.inheritance.demo;

public class Demo02 {

    public static void main(String[] args) {
        Restricted restricted = new Restricted();
        restricted.sendPublicMessage("Hello");
        restricted.sendPublicMessage("  Hola  ");
        restricted.sendPublicMessage(null);
        restricted.sendPublicMessage("");

        restricted.sendProtectedSecret("abcd1234");

        restricted.sayDefaultHello("Chanchito Feliz");

        //String msg = restricted.onlyForInternalPurpose(" cha cha cha ");



    }
    
}
