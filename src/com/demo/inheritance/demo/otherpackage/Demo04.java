package com.demo.inheritance.demo.otherpackage;


public class Demo04 {

    public static void main(String[] args) {
        InheritedProtected item = new InheritedProtected();
        item.sendPublicMessage("hola");
        item.sendProtectedSecret("mundo");
    }
    
}
