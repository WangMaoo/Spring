package com.wmq.spring;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationTargetException;
import java.util.stream.Stream;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月29日 21:57:00
 * @Description: TODO
 */
public class DemoTest {
    @Test
    public void testField() throws Exception {
        UserController userController = new UserController();
        Class<? extends UserController> aClass = userController.getClass();

        UserService userService = new UserService();

        Stream.of(aClass.getDeclaredFields()).forEach(field -> {
            String name = field.getName();
            Autowired annotation = field.getAnnotation(Autowired.class);
            if (annotation != null) {
                Class<?> type = field.getType();
                try {
                    Object object = type.getConstructor().newInstance();
                    field.set(userService,object);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }

        });
    }
}
