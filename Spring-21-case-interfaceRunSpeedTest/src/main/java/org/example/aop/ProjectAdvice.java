package org.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {

    //匹配业务层所有方法
    @Pointcut("execution(* org.example.service.*Service.*(..))")
    private void servicePt(){}

    @Around("ProjectAdvice.servicePt()")
    public void runSpeed(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        /**
         * 一次执行的签名信息 proceedingJoinPoint.getSignature()
         * getDeclaringType() 类型
         * getName() 方法名
         */
        Signature signature = proceedingJoinPoint.getSignature();
        String className = signature.getDeclaringTypeName();
        String methodName = signature.getName();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++)
        {
            proceedingJoinPoint.proceed();
        }

        long end = System.currentTimeMillis();

        System.out.println("万次执行"+ className + "." + methodName + "------>" + (end - start) + "ms");
    }
}
