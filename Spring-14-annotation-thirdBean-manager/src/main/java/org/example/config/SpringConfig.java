package org.example.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;


/**
 * 配置第三方bean
 * 方法1.创建JdbcConfig 加上注解@Configuration 然后在SpringConfig包扫描 @ComponentScan("org.example.config")
 * （建议使用）方法2.在SpringConfig 使用@Import 导入JdbcConfig.class 如果有多个则使用数组
 */
@Configuration
//@ComponentScan("org.example.config")
@ComponentScan("org.example.dao")
@Import({JdbcConfig.class})
public class SpringConfig {


}
