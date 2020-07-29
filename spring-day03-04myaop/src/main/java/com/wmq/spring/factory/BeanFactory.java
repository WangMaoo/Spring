package com.wmq.spring.factory;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @Description：bean的工厂
 */
public class BeanFactory {

    //【1】事先创建集合容器
    private static Map<String,Object> map = new HashMap<>();
	//【2】事先加载properties文件内容
    static {
        Properties properties = new Properties();
        try {
            properties.load(BeanFactory.class.getClassLoader().
                    getResourceAsStream("db.properties"));
            //拿到所有配置文件中的key
            Enumeration<?> enumeration = properties.propertyNames();
            while (enumeration.hasMoreElements()){
                String key = (String) enumeration.nextElement();
                String val = (String) properties.get(key);
                //【3】反射机制实例化bean对象，并且放入集合容器
                //做增强！！！
                Object bean = Class.forName(val).newInstance();
                //生成代理对象
                ProxyBeanFactory proxyBeanFactory = new ProxyBeanFactory(bean);
                map.put(key, proxyBeanFactory.getBeanProxy());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	//【4】公共的访问方法
    public static Object getBean(String className){
        return map.get(className);
    }
}
