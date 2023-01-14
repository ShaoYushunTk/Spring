package dao.impl;

import dao.BookDao;

/**
 * 类内部提供生命周期控制方法
 * 需要在xml配置init-method和destroy-method
 */
public class BookDaoImpl implements BookDao {

    private int connectionNum;
    private String databaseName;
    @Override
    public void save() {
        System.out.println("book dao save ..."+databaseName+","+connectionNum);
    }

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
}
