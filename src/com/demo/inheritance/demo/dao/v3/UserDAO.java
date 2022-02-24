package com.demo.inheritance.demo.dao.v3;

import java.util.List;



public class UserDAO extends MySqlDao {


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
