package com.demo.inheritance.demo.dao.v2;

import java.util.List;


public class TodoDAO extends Dao  {
    

    public List<Todo> selectAllTodos(){
        connect();
        //List todos
        disconnect();


        return null;
    }

    public Todo createTodo( Todo todo ){
        connect();
        //List todos
        disconnect();
        
        return null;
    }

    
    
}
