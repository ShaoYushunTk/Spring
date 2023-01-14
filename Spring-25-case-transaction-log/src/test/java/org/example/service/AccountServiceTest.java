package org.example.service;

import org.example.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

/**
 * 需求: 实现任意两个账户间转账操作
 * 需求微缩: A账户减钱，B账户加钱
 * 为了实现上述的业务需求，我们可以按照下面步骤来实现下:
 * ①：数据层提供基础操作，指定账户减钱（outMoney），指定账户加钱（inMoney）
 * ②：业务层提供转账操作（transfer），调用减钱与加钱的操作
 * ③：提供2个账号和操作金额执行转账操作
 * ④：基于Spring整合MyBatis环境搭建上述操作
 *
 *
 * 实现：
 * 1.Service接口需要配置事务的方法上加上Spring事务管理注解 @Transactional 这个注解也可以写在业务层接口上 表示这一个类所有方法都需要事务管理
 * 2.JdbcConfig实现事务管理方法
 * 3.SpringConfig开启事务管理注解开发
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testTransfer(){
        accountService.transfer("Tom","Jerry", 50.0);
    }
}
