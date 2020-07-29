package com.wmq.spring.factory;

import com.wmq.spring.proxy.CglibProxy;
import com.wmq.spring.proxy.JdkProxy;
import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

/**
 * @Description：代理工厂
 */
public class ProxyBeanFactory {

    //我为谁干活(被代理类)
    private Object targetObject;

    //构建时候传递被代理对象
    public ProxyBeanFactory(Object targetObject) {
        this.targetObject = targetObject;
    }

    /**
     * @Description 创建代理类
     */
    public Object getBeanProxy() {
        Class<?>[] interfaces = targetObject.getClass().getInterfaces();

        //走的是cglib代理
        if (interfaces.length == 0){
            return Enhancer.create(
                    targetObject.getClass(),
                    new CglibProxy(targetObject));
        }
        //走JDK动态代理
        if (interfaces.length > 0) {
            //返回的才是代理对象
            return Proxy.newProxyInstance(
                    targetObject.getClass().getClassLoader(),
                    interfaces,
                    new JdkProxy(targetObject));
        }

        return null;
    }
}
