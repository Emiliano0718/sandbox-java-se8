package com.demo.inheritance.demo.dao.v3;

public class MySqlDao extends AbstractDao {

    @Override
    protected void connect() {
        System.out.println("Connecting to MySQL ");
    }

    @Override
    protected void disconnect() {
        System.out.println("Release connection to MySQL ");
        
    }
    
}
