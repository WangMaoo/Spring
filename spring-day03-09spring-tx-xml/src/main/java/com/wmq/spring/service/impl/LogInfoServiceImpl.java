package com.wmq.spring.service.impl;

import com.wmq.spring.service.LogInfoService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * @Description：通知处理服务实现
 */
public class LogInfoServiceImpl implements LogInfoService {

    @Override
    public void createLogInfo(JoinPoint joinPoint) {
        //获得目标方法封装对象，
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("执行了："+method.getName());
    }

}
