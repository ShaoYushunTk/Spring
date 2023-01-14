package factory;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    //代替原始实例工厂中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    //获取bean类型
    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    /**
     * 创建bean是否为单例
     * true为单例 false为非单例
     * @return
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
