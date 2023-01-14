package org.example.dao.impl;


import org.example.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 控制bean是否为单例
 * @Scope singleton prototype
 * init方法和destroy方法的注解需要在pom.xml导入javax.annotation-api
 * @PostConstruct 控制init方法,构造方法后运行的方法为init
 * @PreDestroy 控制destroy方法，销毁前运行的方法为destroy
 */
@Repository
//@Scope("singleton")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }


    @PostConstruct
    public void init() {
        System.out.println("init ...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy ...");
    }


}
