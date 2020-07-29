package com.wmq.spring.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description：
 */
public class CglibProxy implements MethodInterceptor {

    //为谁干活（被代理对象）
    private Object targetObject;

    //构造的时候传入被代理对象
    public CglibProxy(Object targetObject) {
        this.targetObject = targetObject;
    }

    //到底干什么样的活（切点）
    private String pointString = "saveAccount";

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //做增强
        //拿到你执行的目标方法名
                String methodName = method.getName();

                Object object = null;
                boolean flag = pointString.equals(methodName);
                try {
                    //前置增强
                    if (flag){
                System.out.println("执行了CGLIB前置增强："+methodName);
            }
            object = method.invoke(targetObject, objects);
            //后置正常
            if (flag){
                System.out.println("执行了CGLIB后置正常增强："+methodName);
            }
        }catch (Exception e){
            //后置异常
            if (flag){
                System.out.println("执行了CGLIB后置异常增强："+methodName);
            }
        }finally {
            //最终
            if (flag){
                System.out.println("执行了CGLIB最终增强："+methodName);
            }
        }
        return object;
    }
}
