package org.example.dao.impl;


import org.example.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Value 简单类型注解
 */
@Repository("bookDao")
public class BookDaoImpl implements BookDao {

    @Value("${name}")
    private String name;

    @Override
    public void save() {
        System.out.println("book dao save ..." + name);
    }


}
