package com.wmq.spring.service;

import org.aspectj.lang.JoinPoint;

/**
 * @Description：日志服务模块
 */
public interface LogInfoService {

    /**
     * @Description 记录日志
     * @param  joinPoint 参数信息对象：执行目标方法的参数、值
     */
    void createLogInfo(JoinPoint joinPoint);
}
