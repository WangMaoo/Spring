package com.wmq.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月29日 21:20:00
 * @Description: TODO
 */
@Configuration
@ComponentScan("com.wmq.spring")
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class SpringConfig {
}
