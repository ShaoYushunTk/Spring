package service.impl;

import dao.BookDao;
import service.BookService;

/**
 * 接口实现bean的init destroy
 * 不需要在xml配置init-method和destroy-method
 */
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();

    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
