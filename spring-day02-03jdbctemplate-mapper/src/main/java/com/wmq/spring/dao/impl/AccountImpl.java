package com.wmq.spring.dao.impl;

import com.wmq.spring.dao.AccountDao;
import com.wmq.spring.mapper.AccountMapper;
import com.wmq.spring.pojo.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月26日 19:15:00
 * @Description: TODO
 */
public class AccountImpl implements AccountDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Account> findAll() {
        String sql = "select * from account";
        return jdbcTemplate.query(sql, new AccountMapper());
    }

    @Override
    public int saveAccount(Account account) {
        String sql = "INSERT INTO `account` (`account_name`, `money`) VALUES (? , ?)";
        return jdbcTemplate.update(sql,account.getAccountName(),account.getMoney());
    }

    @Override
    public int deleteAccountById(int id) {
        String sql = "delete from account where id = ?";
        return jdbcTemplate.update(sql,id);
    }

    @Override
    public int updateAccountById(Account account) {
        String sql = "update account set account_name=?,money=? where id = ?";
        return jdbcTemplate.update(sql,account.getAccountName(),account.getMoney(),account.getId());
    }

    @Override
    public Account findAccountById(int id) {
        String sql = "select * from account where id = ?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Account.class));
    }

    @Override
    public Integer countAccount() {
        String sql = "select count(1) from account";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }
}
