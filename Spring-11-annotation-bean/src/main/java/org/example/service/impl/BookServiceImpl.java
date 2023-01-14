package org.example.service.impl;

import org.example.dao.BookDao;
import org.springframework.stereotype.Component;
import org.example.service.BookService;
import org.springframework.stereotype.Service;

/**
 * 不加名称也可以，但是需要按类型寻找bean而不是按名称寻找
 */
@Service
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book service save...");

    }


}
