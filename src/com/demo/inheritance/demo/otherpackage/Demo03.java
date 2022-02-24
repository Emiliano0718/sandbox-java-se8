package com.demo.inheritance.demo.otherpackage;

import com.demo.inheritance.demo.Restricted;

public class Demo03 {

    public static void main(String[] args) {
        Restricted restricted = new Restricted();
        restricted.sendPublicMessage("Hello");
        restricted.sendPublicMessage("  Hola  ");
        restricted.sendPublicMessage(null);
        restricted.sendPublicMessage("");

        //restricted.sendProtectedSecret("abcd1234");
        //restricted.sayDefaultHello("Chanchito Feliz");
        //String msg = restricted.internalPrivatePurpose(" cha cha cha ");



    }
    
}
