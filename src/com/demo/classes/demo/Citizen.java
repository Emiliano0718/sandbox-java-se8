package com.demo.classes.demo;

public class Citizen {

    String name;
    String lastname;

    public Citizen(){        
    }

    public Citizen( String name, String lastname ){
        this.name = name;
        this.lastname = name;
    }

    public void greet(){
        System.out.println( "Hi I'm "  + name + " " + lastname  );
    }

    public void greetToFriend( String friendName ){
        System.out.println( "Greet to my friend " + friendName );
    }



    
}
