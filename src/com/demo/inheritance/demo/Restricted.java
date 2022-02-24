package com.demo.inheritance.demo;

public class Restricted {

    
    public void sendPublicMessage(String msg){
        msg = internalPrivatePurpose(msg);
        System.out.println("The message is " + msg );
    }

    protected void sendProtectedSecret( String secret ){
        secret = internalPrivatePurpose(secret);
        System.out.println("The secret is " + secret );

    }

    void sayDefaultHello( String msg ){
        msg = internalPrivatePurpose(msg);
        System.out.println( "You see only in the same package " + msg );    
    }

    private String internalPrivatePurpose( String msg ){
        if( msg == null  || msg.isEmpty() ){
            return "Empty message";
        }
        return msg.trim();

    }



    
}
