package service.impl;

import dao.BookDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import service.BookService;

/**
 * 接口实现bean的init destroy
 * 不需要在xml配置init-method和destroy-method
 */
public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();

    }

    public void setBookDao(BookDao bookDao) {
        System.out.println("set...");
        this.bookDao = bookDao;
    }

    /**
     * spring提供的bean 销毁方法
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy...");
    }

    /**
     * spring提供的bean init方法， 在属性设置完后调用
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init...");
    }
}
