package service.impl;

import dao.BookDao;
import dao.UserDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import service.BookService;

/**
 * 接口实现bean的init destroy
 * 不需要在xml配置init-method和destroy-method
 */
public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;
    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
        userDao.save();

    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
