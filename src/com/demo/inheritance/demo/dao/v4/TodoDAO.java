package com.demo.inheritance.demo.dao.v4;

import java.util.List;



public class TodoDAO extends MySqlDao  implements CrudDao {

    

    @Override
    public Object save(Object item) {
        connect();
        //List todos
        disconnect();
        
        return null;
    }

    @Override
    public List<Object> selectAll() {
        connect();
        //List todos
        disconnect();
        
        return null;
    }

    @Override
    public Object findById(Object id) {
        // TODO Auto-generated method stub
        return null;
    }

    
    
}
