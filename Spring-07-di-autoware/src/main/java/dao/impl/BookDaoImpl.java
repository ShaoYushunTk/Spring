package dao.impl;

import dao.BookDao;

/**
 * 类内部提供生命周期控制方法
 * 需要在xml配置init-method和destroy-method
 */
public class BookDaoImpl implements BookDao {

    private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
