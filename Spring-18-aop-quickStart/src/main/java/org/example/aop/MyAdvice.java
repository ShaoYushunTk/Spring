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
     */
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
