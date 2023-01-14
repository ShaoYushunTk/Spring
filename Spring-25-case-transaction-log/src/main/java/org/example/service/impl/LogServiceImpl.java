package org.example.service.impl;

import org.example.dao.LogDao;
import org.example.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 需求：实现任意两个账户间转账操作，并对每次转账操作在数据库进行留痕
 * 需求微缩：A账户减钱，B账户加钱，数据库记录日志
 * 基于上述的业务需求，我们来分析下该如何实现:
 * ①：基于转账操作案例添加日志模块，实现数据库中记录日志
 * ②：业务层转账操作（transfer），调用减钱、加钱与记录日志功能
 * 需要注意一点就是，我们这个案例的预期效果为:
 * 无论转账操作是否成功，均进行转账操作的日志留痕
 *
 * 存在问题：日志的记录和转账操作隶属于同一个事务，同成功同失败
 * 改进：无论转账操作是否成功，均保留日志
 */
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogDao logDao;

    public void log(String out,String in,Double money ) {
        logDao.log("转账操作由"+out+"到"+in+",金额："+money);
    }
}