package org.example.dao.impl;

import org.example.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    public String findName(int id, String password) {
        System.out.println("id:"+id);
        if(true)throw new NullPointerException();
        return "hello aop";
    }


}
