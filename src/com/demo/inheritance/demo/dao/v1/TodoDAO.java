package com.demo.inheritance.demo.dao.v1;

import java.util.List;


public class TodoDAO {

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
