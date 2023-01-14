package service.impl;

import dao.BookDao;
import dao.UserDao;
import service.BookService;

/**
 * 接口实现bean的init destroy
 * 不需要在xml配置init-method和destroy-method
 */
public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
        userDao.save();
    }


}
