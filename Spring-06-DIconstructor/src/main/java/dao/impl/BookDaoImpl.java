package dao.impl;

import dao.BookDao;

/**
 * 类内部提供生命周期控制方法
 * 需要在xml配置init-method和destroy-method
 */
public class BookDaoImpl implements BookDao {
    private String databaseName;
    private int connectionNum;


    public BookDaoImpl(String databaseName, int connectionNum) {
        this.databaseName = databaseName;
        this.connectionNum = connectionNum;
    }

    @Override
    public void save() {
        System.out.println("book dao save ..."+databaseName+","+connectionNum);
    }

}
