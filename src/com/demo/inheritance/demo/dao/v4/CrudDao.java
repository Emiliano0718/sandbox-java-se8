package com.demo.inheritance.demo.dao.v4;

import java.util.List;

public interface CrudDao {

    //public abstract Object save( Object item );
    Object save( Object item );

    //public abstract List<Object> selectAll();
    List<Object> selectAll();

    Object findById( Object id );

    
    
}
