package com.demo.inheritance.demo.dao.v2;

public class Dao {

    private static final String USER_NAME = "root";
    private static final String USER_PASSWORD = "abcd1234";
    private static final String DABASE_URL = "";
    private static final String DABASE = "";


    protected void connect(){
        System.out.println( "### Connectiong to database " + DABASE  );
    }

    protected void disconnect(){
        System.out.println( "#### Releasing database connection" );
    }



    
    
}
