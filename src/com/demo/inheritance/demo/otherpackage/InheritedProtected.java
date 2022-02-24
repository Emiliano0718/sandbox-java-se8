package com.demo.inheritance.demo.otherpackage;

import com.demo.inheritance.demo.Restricted;

public class InheritedProtected  extends  Restricted {

    @Override
    protected void sendProtectedSecret(String secret) {        
        System.out.println("This is a protected secret.."  + secret );
    }

    
}
