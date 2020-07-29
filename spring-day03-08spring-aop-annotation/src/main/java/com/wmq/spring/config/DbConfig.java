package com.wmq.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月29日 07:19:00
 * @Description: TODO
 */
@Configuration
@PropertySource("db.properties")
public class DbConfig {

    @Value("${dataSource.driverClassName}")
    public String driverClassName;

    @Value("${dataSource.url}")
    public String url;

    @Value("${dataSource.username}")
    public String username;

    @Value("${dataSource.password}")
    public String password;

    @Bean("druidDatasource")
    public DataSource createDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate createJdbcTemplate(@Qualifier("druidDatasource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
