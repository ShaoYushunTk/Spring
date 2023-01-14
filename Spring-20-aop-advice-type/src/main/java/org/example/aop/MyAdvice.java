package org.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Component 组件，让其作为bean被spring管理
 * @Aspect aop开发
 */
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void org.example.dao.BookDao.update())")
    private void pt(){}

    @Pointcut("execution(int org.example.dao.BookDao.select())")
    private void pt2(){}



    //@Before：前置通知，在原始方法运行之前执行
    //@Before("pt()")
    public void before() {
        System.out.println("before advice ...");
    }

    //@After：最后通知，在原始方法运行之后执行
    //@After("pt2()")
    public void after() {
        System.out.println("after advice ...");
    }

    //@Around：环绕通知，在原始方法运行的前后执行
    @Around("pt()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before advice ...");
        //表示对原始操作的调用
        Object ret = proceedingJoinPoint.proceed();
        System.out.println("around after advice ...");
    }

    /**
     * 环绕通知对原始方法的返回值可以接出来
     * 以下为使用环绕通知的标准格式 需要返回Object
     * @param proceedingJoinPoint
     * @return
     * @throws Throwable
     */
    //@Around("pt2()")
    public Object aroundSelect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before advice ...");
        //表示对原始操作的调用
        Object ret = proceedingJoinPoint.proceed();
        System.out.println("around after advice ...");

        //保证原始方法有返回值
        return ret;

    }


    //@AfterReturning：返回后通知，在原始方法执行完毕后运行，且原始方法执行过程中未出现异常现象

    //@AfterReturning("pt2()")
    public void afterReturning() {
        System.out.println("afterReturning advice ...");
    }

    //@AfterThrowing：抛出异常后通知，在原始方法执行过程中出现异常后运行

    @AfterThrowing("pt2()")
    public void afterThrowing() {
        System.out.println("afterThrowing advice ...");
    }
}
