package com.demo.inheritance.demo.dao.v1;

import java.util.List;

public class UserDAO {

    private static final String USER_NAME = "root";
    private static final String USER_PASSWORD = "abcd1234";
    private static final String DABASE_URL = "";
    private static final String DABASE = "";

    private void connect(){
        System.out.println( "### Connectiong to database " + DABASE  );
    }

    private void disconnect(){        
        System.out.println( "#### Releasing database connection" );
    }

    public List<User> selectAllUsers(){
        connect();
        //List users
        disconnect();
        return null;
    }

    public User createUser( User user ){
        connect();
        //Create some user
        disconnect();
        return null;
    }

    
    
}
