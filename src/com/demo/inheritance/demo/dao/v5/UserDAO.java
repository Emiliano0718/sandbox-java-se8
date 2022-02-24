package com.demo.inheritance.demo.dao.v5;

import java.util.List;



public class UserDAO extends MySqlDao implements CrudDao<User,Long>  {

    @Override
    public User save(User item) {
        connect();
        //List todos
        disconnect();
        
        return null;
    }

    @Override
    public List<User> selectAll() {
        connect();
        //List todos
        disconnect();
        
        return null;
    }

    @Override
    public User findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }
    


    
    
}
