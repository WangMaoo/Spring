package com.wmq.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月04日 18:54:00
 * @Description: TODO
 */
@Configuration
@EnableTransactionManagement
@EnableAspectJAutoProxy
@ComponentScan(value = "com.wmq.ssm",
        excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,
                classes = {Controller.class, ControllerAdvice.class})
})
public class SpringConfig {
}
