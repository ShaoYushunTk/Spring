package org.example.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.example.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//@Configuration
public class JdbcConfig {

    //1.定义一个方法 获得要管理的对象
    //2.将方法的返回值定义为bean

    /**
     * 简单类型注入 定义成员变量
     */
    @Value("com.mysql.cj.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://127.0.0.1:3306/db1?useServerPrepStmts=true")
    private String url;
    @Value("root")
    private String username;
    @Value("")
    private String password;

    @Bean
    /**
     * 引用类型bean需要在方法的形参上加上 自动装配
     */
    public DataSource dataSource(BookDao bookDao){
        System.out.println(bookDao);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
}
