package com.wmq.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description：用JDK的动态代理方式生成代理类
 */
public class JdkProxy implements InvocationHandler {

    //为谁干活（被代理对象）
    private Object targetObject;

    //构造的时候传入被代理对象
    public JdkProxy(Object targetObject) {
        this.targetObject = targetObject;
    }

    //到底干什么样的活（切点）
    private String pointString = "saveAccount";

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //做增强
        //拿到你执行的目标方法名
        String methodName = method.getName();
        if (pointString.equals(methodName)){
            System.out.println("执行了JDK增强："+methodName);
        }
        return method.invoke(targetObject, args);
    }
}
