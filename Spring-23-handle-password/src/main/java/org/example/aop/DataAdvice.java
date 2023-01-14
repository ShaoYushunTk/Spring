package org.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DataAdvice {

    @Pointcut("execution(boolean org.example.service.*Service.*(..))")
    private void servicePt(){}

    @Around("DataAdvice.servicePt()")
    public Object trimStr(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //1.获取方法参数
        Object[] args = proceedingJoinPoint.getArgs();
        for (int i = 0; i < args.length; i++){
            //2.判断参数是否为字符串
            if(args[i].getClass().equals(String.class)){
                args[i] =  args[i].toString().trim(); //去掉空格
            }

        }

        //3.处理后的参数传递给原有方法
        Object ret = proceedingJoinPoint.proceed(args);
        return ret;
    }
}
