package com.wmq.ssm.config;

import com.wmq.ssm.intercept.LoginIntercept;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月04日 19:04:00
 * @Description: TODO
 */
@Configuration
@ComponentScan(value = "com.wmq.ssm")
@EnableWebMvc
public class SpringMvcConfig extends WebMvcConfigurationSupport {

    /**
     * 配置视图解析器
     *
     * @return
     */
    @Bean(value = "internalResourceViewResolver")
    public InternalResourceViewResolver internalResourceViewResolver() {
        return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
    }

    /**
     * 放过静态资源
     */
    public void defaultServletHandle(DefaultServletHandlerConfigurer defaultServletHandlerConfigurer) {
        defaultServletHandlerConfigurer.enable();
    }

    /**
     * 没登录之前不能访问list界面
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginIntercept()).
                excludePathPatterns("/customer/list");
    }

}
