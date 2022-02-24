package com.demo.inheritance.demo.dao.v5;

import java.util.List;



public class TodoDAO extends MySqlDao  implements CrudDao<Todo,Long> {

    

    @Override
    public Todo save(Todo item) {
        connect();
        //List todos
        disconnect();
        
        return null;
    }

    @Override
    public List<Todo> selectAll() {
        connect();
        //List todos
        disconnect();
        
        return null;
    }

    @Override
    public Todo findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    
    
}
