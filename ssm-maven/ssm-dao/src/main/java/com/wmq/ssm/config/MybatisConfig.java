package com.wmq.ssm.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.logging.log4j2.Log4j2Impl;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import java.io.IOException;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月04日 19:22:00
 * @Description: TODO
 */
@Configuration
@PropertySource("classpath:db.properties")
@MapperScan(basePackages = "com.wmq.ssm.mapper",sqlSessionFactoryRef = "sqlSessionFactory")
public class MybatisConfig {

    @Value("${dataSource.driverClassName}")
    private String driverClassName;

    @Value("${dataSource.url}")
    private String url;

    @Value("${dataSource.username}")
    private String userName;

    @Value("${dataSource.password}")
    private String password;

    /**
     * 配置数据源
     *
     * @return
     */
    @Bean(value = "druidDataSource")
    public DruidDataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(userName);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }

    /**
     * 配置事务管理器
     *
     * @return
     */
    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager() {
        return new DataSourceTransactionManager(druidDataSource());
    }

    @Bean(value = "sqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactoryBean() {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        /**
         * 指定数据源
         */
        sqlSessionFactoryBean.setDataSource(druidDataSource());
        /**
         * 指定别名
         */
        sqlSessionFactoryBean.setTypeAliasesPackage("com.wmq.ssm.pojo");
        /**
         * 加载sqlMapper配置文件
         */
        try {
            sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().
                    getResources("sqlMapper/*Mapper.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        /**
         * 开启日志支持
         */
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setLogImpl(Log4j2Impl.class);
        sqlSessionFactoryBean.setConfiguration(configuration);
        return sqlSessionFactoryBean;
    }
}
