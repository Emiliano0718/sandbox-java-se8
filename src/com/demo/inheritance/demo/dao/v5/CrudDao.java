package com.demo.inheritance.demo.dao.v5;

import java.util.List;

public interface CrudDao<E,K> {

    
    E save( E item );

    
    List<E> selectAll();

    E findById( K id );

    
    
}
