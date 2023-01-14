package org.example.service.impl;

import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 自动装配
 * @Autowired 可以不提供setter方法，底层原理为反射获取私有属性
 * 如果有多个实现类，使用@Qualifier规定要装配哪一个实现类
 * @Qualifier 不能单独使用 必须配合@Autowired 使用
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    @Qualifier("bookDao")
    private BookDao bookDao;


    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }


}
