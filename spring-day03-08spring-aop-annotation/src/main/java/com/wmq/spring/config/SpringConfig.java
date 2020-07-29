package com.wmq.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月29日 07:26:00
 * @Description: TODO
 */
@Configuration
@ComponentScan("com.wmq.spring")
@EnableAspectJAutoProxy
public class SpringConfig {

}
