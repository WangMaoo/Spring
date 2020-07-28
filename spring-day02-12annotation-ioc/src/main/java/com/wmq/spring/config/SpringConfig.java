package com.wmq.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月27日 08:30:00
 * @Description: TODO
 */
@Configuration
@ComponentScan("com.wmq.spring")
@Import(DbConfig.class)
public class SpringConfig {


}
