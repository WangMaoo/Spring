package com.wmq.spring.service.impl;

import com.wmq.spring.service.LogInfoService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Description：通知处理服务实现
 */
@Component
@Aspect
public class LogInfoServiceImpl implements LogInfoService {


    @Override
    @Before("execution(* com.wmq.spring.service.impl.AccountServiceImpl.findAll())")
    public void beforeLogInfo(JoinPoint joinPoint) {
        //获得目标方法封装对象，
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("执行了前置通知："+method.getName());
    }

    @Override
    @AfterReturning("execution(* com.wmq.spring.service.impl.AccountServiceImpl.findAll())")
    public void afterReturningLogInfo(JoinPoint joinPoint) {
        //获得目标方法封装对象，
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("执行了后置正常通知："+method.getName());
    }

    @Override
    @AfterThrowing("execution(* com.wmq.spring.service.impl.AccountServiceImpl.findAll())")
    public void afterThrowingLogInfo(JoinPoint joinPoint) {
        //获得目标方法封装对象，
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("执行了后置异常通知："+method.getName());
    }

    @Override
    @After("execution(* com.wmq.spring.service.impl.AccountServiceImpl.findAll())")
    public void afterLogInfo(JoinPoint joinPoint) {
        //获得目标方法封装对象，
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("执行了最终通知："+method.getName());
    }

    @Override
    @Around("execution(* com.wmq.spring.service.impl.AccountServiceImpl.findAll())")
    public Object aroundLogInfo(ProceedingJoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();

        //执行目标方法
        Object proceed = null;
        try {
            System.out.println("执行了环绕通知-前通知："+method.getName());
            proceed = joinPoint.proceed();
            System.out.println("执行了环绕通知-正常后通知："+method.getName());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("执行了环绕通知-异常后通知："+method.getName());
        }finally {
            System.out.println("执行了环绕通知-最终通知："+method.getName());
        }
        return proceed;
    }
}
