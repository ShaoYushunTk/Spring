package org.example.dao.impl;

import org.example.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void update() {
        System.out.println("book dao update ...");
    }


    public int select(){
        System.out.println("book dao select ...");
        return 100;
    }


}
