package com.wmq.spring.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Description：日志服务模块
 */
public interface LogInfoService {

    /**
     * @Description 前置通知
     */
    void beforeLogInfo(JoinPoint joinPoint);

    /**
     * @Description 后置正常返回通知
     */
    void afterReturningLogInfo(JoinPoint joinPoint);

    /**
     * @Description 异常通知
     */
    void afterThrowingLogInfo(JoinPoint joinPoint);

    /**
     * @Description 最终通知
     */
    void afterLogInfo(JoinPoint joinPoint);

    /**
     * @Description 环绕通知
     * @param  joinPoint 执行proceed方法的作用是让目标方法执行
     * @return
     */
    Object aroundLogInfo(ProceedingJoinPoint joinPoint);
}
