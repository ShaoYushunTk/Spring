package service.impl;

import dao.BookDao;
import service.BookService;

public class BookServiceImpl implements BookService {

    //5.根据IoC思想，由主动new产生对象转换为由外部提供对象，因此删除业务层中使用new的方式创建的dao对象
    //private BookDao bookDao = new BookDaoImpl();
    private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();

    }

    //6.提供对应set方法 在applicationContext.xml配置service和dao的关系
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
