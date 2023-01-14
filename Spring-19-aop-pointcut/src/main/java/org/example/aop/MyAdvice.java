package org.example.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Component 组件，让其作为bean被spring管理
 * @Aspect aop开发
 */
@Component
@Aspect
public class MyAdvice {
    /**
     * @Pointcut 描述切入点
     * 切入点定义依托一个不具有实际意义的方法进行，即无参数，无返回值，方法体无实际逻辑
     * 可以使用通配符
     * 1. * 单个独立任意符号
     * 2. .. 多个连续任意符号
     * 3. + 专用于匹配子类类型
     */
    //@Pointcut("execution(void org.example.dao.BookDao.update())")
    //@Pointcut("execution(void org.example.dao.impl.BookDaoImpl.update())")
    //@Pointcut("execution(* org.example.dao.impl.BookDaoImpl.update())")
    //@Pointcut("execution(* org.example.dao.impl.BookDaoImpl.update(*))")     no
    //@Pointcut("execution(* org.*.*.impl.BookDaoImpl.update())")
    //@Pointcut("execution(* *..update())")
    //@Pointcut("execution(* *..u*(..))")   //u开头的任意包下的任意接口或实现类的方法 返回值任意
    //@Pointcut("execution(* *..*e(..))")     //以e结尾
    //@Pointcut("execution(* org.example.*.*Service.find*(..))") //业务层查询方法加上aop
    @Pointcut("execution(void org.example.dao.BookDao.update())")
    private void pt(){}

    /**
     * 共性功能抽象出通知方法
     * @Before 规定在update方法前面执行，传递切入点，绑定切入点和通知
     */
    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
