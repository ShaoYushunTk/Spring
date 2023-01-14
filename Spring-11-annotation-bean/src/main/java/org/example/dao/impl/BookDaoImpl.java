package org.example.dao.impl;

import org.example.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * 注解开发bean @Component("bookDao")指定的名称为bean的id
 */
//@Component("bookDao")
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }


}
