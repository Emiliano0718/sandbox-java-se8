package com.demo.inheritance.demo.dao.v4;

public abstract class AbstractDao {

    private static final String USER_NAME = "root";
    private static final String USER_PASSWORD = "abcd1234";
    private static final String DABASE_URL = "";
    private static final String DABASE = "";


    protected abstract void connect();

    protected abstract void disconnect();

    protected void showDabaseName(){
        System.out.println( "We are connecting to " + DABASE );
    }

    
}
