package com.wmq.ssm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月04日 20:17:00
 * @Description: TODO
 */
@Configuration
public class ProjectInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 配置字符乱码
     * @param servletContext
     * @throws ServletException
     */
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
        FilterRegistration.Dynamic encodingFilter = servletContext.addFilter("encodingFilter", CharacterEncodingFilter.class);
        encodingFilter.setInitParameter("encoding", "utf-8");
        encodingFilter.addMappingForUrlPatterns(null, false, "/*");
    }

    /**
     *  监听方法的配置
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class,MybatisConfig.class};
    }

    /**
     *  声明servlet的配置
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
