package org.example;

import org.example.config.SpringConfig;
import org.example.dao.BookDao;
import org.example.service.BookService;
import org.example.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();

        BookService bookService = ctx.getBean(BookServiceImpl.class);
        bookService.save();
    }
}
